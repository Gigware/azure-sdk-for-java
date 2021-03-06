/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.implementation;

import com.google.common.io.BaseEncoding;
import com.microsoft.azure.management.resources.fluentcore.arm.models.implementation.GroupableResourceImpl;
import com.microsoft.azure.management.resources.fluentcore.utils.Utils;
import com.microsoft.azure.management.website.AppServiceCertificate;
import com.microsoft.azure.management.website.AppServicePlan;
import com.microsoft.azure.management.website.HostingEnvironmentProfile;
import org.joda.time.DateTime;
import rx.Observable;
import rx.functions.Func1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;

/**
 * The implementation for {@link AppServicePlan}.
 */
class AppServiceCertificateImpl
        extends
        GroupableResourceImpl<
                AppServiceCertificate,
                CertificateInner,
                AppServiceCertificateImpl,
                AppServiceManager>
        implements
        AppServiceCertificate,
        AppServiceCertificate.Definition {

    private final CertificatesInner client;
    private String pfxFileUrl;

    AppServiceCertificateImpl(String name, CertificateInner innerObject, final CertificatesInner client, AppServiceManager manager) {
        super(name, innerObject, manager);
        this.client = client;
    }

    @Override
    public String friendlyName() {
        return inner().friendlyName();
    }

    @Override
    public String subjectName() {
        return inner().subjectName();
    }

    @Override
    public List<String> hostNames() {
        return Collections.unmodifiableList(inner().hostNames());
    }

    @Override
    public String pfxBlob() {
        return inner().pfxBlob();
    }

    @Override
    public String siteName() {
        return inner().siteName();
    }

    @Override
    public String selfLink() {
        return inner().selfLink();
    }

    @Override
    public String issuer() {
        return inner().issuer();
    }

    @Override
    public DateTime issueDate() {
        return inner().issueDate();
    }

    @Override
    public DateTime expirationDate() {
        return inner().expirationDate();
    }

    @Override
    public String password() {
        return inner().password();
    }

    @Override
    public String thumbprint() {
        return inner().thumbprint();
    }

    @Override
    public Boolean valid() {
        return inner().valid();
    }

    @Override
    public String certificateBlob() {
        return inner().cerBlob();
    }

    @Override
    public String publicKeyHash() {
        return inner().publicKeyHash();
    }

    @Override
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return inner().hostingEnvironmentProfile();
    }

    @Override
    public AppServiceCertificate refresh() {
        this.setInner(client.get(resourceGroupName(), name()));
        return this;
    }

    @Override
    public Observable<AppServiceCertificate> createResourceAsync() {
        Observable<String> pfxString = Observable.just(pfxBlob());
        if (pfxFileUrl != null) {
            pfxString = Utils.downloadFileAsync(pfxFileUrl, myManager.restClient().retrofit())
                    .map(new Func1<byte[], String>() {
                        @Override
                        public String call(byte[] bytes) {
                            return BaseEncoding.base64().encode(bytes);
                        }
                    });
        }
        return pfxString.flatMap(new Func1<String, Observable<CertificateInner>>() {
            @Override
            public Observable<CertificateInner> call(String s) {
                inner().withPfxBlob(s);
                return client.createOrUpdateAsync(resourceGroupName(), name(), inner());
            }
        }).map(innerToFluentMap(this));
    }

    @Override
    public AppServiceCertificateImpl withPfxFile(File file) {
        try {
            byte[] fileContent = Files.readAllBytes(file.toPath());
            return withPfxByteArray(fileContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public AppServiceCertificateImpl withPfxByteArray(byte[] pfxByteArray) {
        String base64String = BaseEncoding.base64().encode(pfxByteArray);
        inner().withPfxBlob(base64String);
        return this;
    }

    @Override
    public AppServiceCertificateImpl withPfxFileFromUrl(String url) {
        this.pfxFileUrl = url;
        return this;
    }

    @Override
    public AppServiceCertificateImpl withCertificateOrderKeyVaultBinding(String vaultId, String secretName) {
        inner().withKeyVaultId(vaultId).withKeyVaultSecretName(secretName);
        return this;
    }

    @Override
    public AppServiceCertificate.DefinitionStages.WithCreate withPfxPassword(String password) {
        inner().withPassword(password);
        return this;
    }
}