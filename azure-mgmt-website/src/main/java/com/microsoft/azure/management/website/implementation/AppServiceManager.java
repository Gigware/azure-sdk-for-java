/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.RestClient;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.keyvault.implementation.KeyVaultManager;
import com.microsoft.azure.management.resources.fluentcore.arm.AzureConfigurable;
import com.microsoft.azure.management.resources.fluentcore.arm.implementation.AzureConfigurableImpl;
import com.microsoft.azure.management.resources.fluentcore.arm.implementation.Manager;
import com.microsoft.azure.management.website.AppServiceCertificates;
import com.microsoft.azure.management.website.AppServiceDomains;
import com.microsoft.azure.management.website.AppServicePlans;
import com.microsoft.azure.management.website.AppServiceCertificateOrders;
import com.microsoft.azure.management.website.WebApps;

/**
 * Entry point to Azure storage resource management.
 */
public final class AppServiceManager extends Manager<AppServiceManager, WebSiteManagementClientImpl> {
    // Managers
    private KeyVaultManager keyVaultManager;
    // Collections
    private WebApps webApps;
    private AppServicePlans appServicePlans;
    private AppServiceCertificateOrders appServiceCertificateOrders;
    private AppServiceCertificates appServiceCertificates;
    private AppServiceDomains appServiceDomains;
    private RestClient restClient;

    /**
     * Get a Configurable instance that can be used to create StorageManager with optional configuration.
     *
     * @return the instance allowing configurations
     */
    public static Configurable configure() {
        return new AppServiceManager.ConfigurableImpl();
    }

    /**
     * Creates an instance of StorageManager that exposes storage resource management API entry points.
     *
     * @param credentials the credentials to use
     * @param subscriptionId the subscription UUID
     * @return the StorageManager
     */
    public static AppServiceManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new AppServiceManager(AzureEnvironment.AZURE.newRestClientBuilder()
                .withCredentials(credentials)
                .build(), credentials.getDomain(), subscriptionId);
    }

    /**
     * Creates an instance of StorageManager that exposes storage resource management API entry points.
     *
     * @param restClient the RestClient to be used for API calls.
     * @param tenantId the tenant UUID
     * @param subscriptionId the subscription UUID
     * @return the StorageManager
     */
    public static AppServiceManager authenticate(RestClient restClient, String tenantId, String subscriptionId) {
        return new AppServiceManager(restClient, tenantId, subscriptionId);
    }

    /**
     * The interface allowing configurations to be set.
     */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
         * Creates an instance of StorageManager that exposes storage management API entry points.
         *
         * @param credentials the credentials to use
         * @param subscriptionId the subscription UUID
         * @return the interface exposing storage management API entry points that work across subscriptions
         */
        AppServiceManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * The implementation for Configurable interface.
     */
    private static final class ConfigurableImpl extends AzureConfigurableImpl<Configurable> implements Configurable {
        public AppServiceManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
            return AppServiceManager.authenticate(buildRestClient(credentials), credentials.getDomain(), subscriptionId);
        }
    }

    private AppServiceManager(RestClient restClient, String tenantId, String subscriptionId) {
        super(
                restClient,
                subscriptionId,
                new WebSiteManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
        keyVaultManager = KeyVaultManager.authenticate(restClient, tenantId, subscriptionId);
        this.restClient = restClient;
    }

    /**
     * @return the key vault manager instance.
     */
    KeyVaultManager keyVaultManager() {
        return keyVaultManager;
    }

    RestClient restClient() {
        return restClient;
    }


    /**
     * @return the web app management API entry point
     */
    public WebApps webApps() {
        if (webApps == null) {
            webApps = new WebAppsImpl(innerManagementClient.webApps(), this);
        }
        return webApps;
    }

    /**
     * @return the app service plan management API entry point
     */
    public AppServicePlans appServicePlans() {
        if (appServicePlans == null) {
            appServicePlans = new AppServicePlansImpl(innerManagementClient.appServicePlans(), this);
        }
        return appServicePlans;
    }

    /**
     * @return the certificate order management API entry point
     */
    public AppServiceCertificateOrders certificateOrders() {
        if (appServiceCertificateOrders == null) {
            appServiceCertificateOrders = new AppServiceCertificateOrdersImpl(innerManagementClient.appServiceCertificateOrders(), this);
        }
        return appServiceCertificateOrders;
    }

    /**
     * @return the certificate management API entry point
     */
    public AppServiceCertificates certificates() {
        if (appServiceCertificates == null) {
            appServiceCertificates = new AppServiceCertificatesImpl(innerManagementClient.certificates(), this);
        }
        return appServiceCertificates;
    }

    /**
     * @return the app service plan management API entry point
     */
    public AppServiceDomains domains() {
        if (appServiceDomains == null) {
            appServiceDomains = new AppServiceDomainsImpl(innerManagementClient.domains(), innerManagementClient.topLevelDomains(), this);
        }
        return appServiceDomains;
    }
}