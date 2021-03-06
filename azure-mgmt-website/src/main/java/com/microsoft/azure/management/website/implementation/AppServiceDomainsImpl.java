/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.implementation;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.GroupableResourcesImpl;
import com.microsoft.azure.management.resources.fluentcore.utils.PagedListConverter;
import com.microsoft.azure.management.website.AppServiceDomain;
import com.microsoft.azure.management.website.AppServiceDomains;
import com.microsoft.azure.management.website.DomainLegalAgreement;
import rx.Observable;
import rx.functions.Func1;

/**
 * The implementation for {@link AppServiceDomains}.
 */
class AppServiceDomainsImpl
        extends GroupableResourcesImpl<
        AppServiceDomain,
        AppServiceDomainImpl,
        DomainInner,
        DomainsInner,
        AppServiceManager>
        implements AppServiceDomains {
    TopLevelDomainsInner topLevelDomainsInner;

    AppServiceDomainsImpl(DomainsInner innerCollection, TopLevelDomainsInner topLevelDomainsInner, AppServiceManager manager) {
        super(innerCollection, manager);
        this.topLevelDomainsInner = topLevelDomainsInner;
    }

    @Override
    public AppServiceDomainImpl getByGroup(String groupName, String name) {
        return wrapModel(innerCollection.get(groupName, name));
    }

    @Override
    public Observable<Void> deleteByGroupAsync(String groupName, String name) {
        return innerCollection.deleteAsync(groupName, name)
                .map(new Func1<Object, Void>() {
                    @Override
                    public Void call(Object o) {
                        return null;
                    }
                });
    }

    @Override
    protected AppServiceDomainImpl wrapModel(String name) {
        return new AppServiceDomainImpl(name, new DomainInner(), innerCollection, topLevelDomainsInner, myManager);
    }

    @Override
    protected AppServiceDomainImpl wrapModel(DomainInner inner) {
        if (inner == null) {
            return null;
        }
        return new AppServiceDomainImpl(inner.name(), inner, innerCollection, topLevelDomainsInner, myManager);
    }

    @Override
    public AppServiceDomainImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public PagedList<AppServiceDomain> list() {
        return wrapList(innerCollection.list());
    }

    @Override
    public PagedList<AppServiceDomain> listByGroup(String resourceGroupName) {
        return wrapList(innerCollection.listByResourceGroup(resourceGroupName));
    }

    @Override
    public PagedList<DomainLegalAgreement> listAgreements(String topLevelExtension) {
        return new PagedListConverter<TldLegalAgreementInner, DomainLegalAgreement>() {
            @Override
            public DomainLegalAgreement typeConvert(TldLegalAgreementInner tldLegalAgreementInner) {
                return new DomainLegalAgreementImpl(tldLegalAgreementInner);
            }
        }.convert(topLevelDomainsInner.listAgreements(topLevelExtension));
    }
}