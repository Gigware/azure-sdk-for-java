/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.website.implementation;

import com.microsoft.azure.management.website.ProvisioningState;
import com.microsoft.azure.management.website.HostingEnvironmentStatus;
import com.microsoft.azure.management.website.VirtualNetworkProfile;
import com.microsoft.azure.management.website.InternalLoadBalancingMode;
import java.util.List;
import com.microsoft.azure.management.website.VirtualIPMapping;
import com.microsoft.azure.management.website.NetworkAccessControlEntry;
import com.microsoft.azure.management.website.NameValuePair;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Description of an hostingEnvironment (App Service Environment).
 */
@JsonFlatten
public class AppServiceEnvironmentInner extends Resource {
    /**
     * Name of the hostingEnvironment (App Service Environment).
     */
    @JsonProperty(value = "properties.name")
    private String appServiceEnvironmentName;

    /**
     * Location of the hostingEnvironment (App Service Environment), e.g.
     * "West US".
     */
    @JsonProperty(value = "properties.location")
    private String appServiceEnvironmentLocation;

    /**
     * Provisioning state of the hostingEnvironment (App Service Environment).
     * Possible values include: 'Succeeded', 'Failed', 'Canceled',
     * 'InProgress', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Current status of the hostingEnvironment (App Service Environment).
     * Possible values include: 'Preparing', 'Ready', 'Scaling', 'Deleting'.
     */
    @JsonProperty(value = "properties.status")
    private HostingEnvironmentStatus status;

    /**
     * Name of the hostingEnvironment's (App Service Environment) virtual
     * network.
     */
    @JsonProperty(value = "properties.vnetName")
    private String vnetName;

    /**
     * Resource group of the hostingEnvironment's (App Service Environment)
     * virtual network.
     */
    @JsonProperty(value = "properties.vnetResourceGroupName")
    private String vnetResourceGroupName;

    /**
     * Subnet of the hostingEnvironment's (App Service Environment) virtual
     * network.
     */
    @JsonProperty(value = "properties.vnetSubnetName")
    private String vnetSubnetName;

    /**
     * Description of the hostingEnvironment's (App Service Environment)
     * virtual network.
     */
    @JsonProperty(value = "properties.virtualNetwork")
    private VirtualNetworkProfile virtualNetwork;

    /**
     * Specifies which endpoints to serve internally in the
     * hostingEnvironment's (App Service Environment) VNET. Possible values
     * include: 'None', 'Web', 'Publishing'.
     */
    @JsonProperty(value = "properties.internalLoadBalancingMode")
    private InternalLoadBalancingMode internalLoadBalancingMode;

    /**
     * Front-end VM size, e.g. "Medium", "Large".
     */
    @JsonProperty(value = "properties.multiSize")
    private String multiSize;

    /**
     * Number of front-end instances.
     */
    @JsonProperty(value = "properties.multiRoleCount")
    private Integer multiRoleCount;

    /**
     * Description of worker pools with worker size ids, VM sizes, and number
     * of workers in each pool.
     */
    @JsonProperty(value = "properties.workerPools")
    private List<WorkerPoolInner> workerPools;

    /**
     * Number of IP SSL addresses reserved for this hostingEnvironment (App
     * Service Environment).
     */
    @JsonProperty(value = "properties.ipsslAddressCount")
    private Integer ipsslAddressCount;

    /**
     * Edition of the metadata database for the hostingEnvironment (App
     * Service Environment) e.g. "Standard".
     */
    @JsonProperty(value = "properties.databaseEdition")
    private String databaseEdition;

    /**
     * Service objective of the metadata database for the hostingEnvironment
     * (App Service Environment) e.g. "S0".
     */
    @JsonProperty(value = "properties.databaseServiceObjective")
    private String databaseServiceObjective;

    /**
     * Number of upgrade domains of this hostingEnvironment (App Service
     * Environment).
     */
    @JsonProperty(value = "properties.upgradeDomains")
    private Integer upgradeDomains;

    /**
     * Subscription of the hostingEnvironment (App Service Environment).
     */
    @JsonProperty(value = "properties.subscriptionId")
    private String subscriptionId;

    /**
     * DNS suffix of the hostingEnvironment (App Service Environment).
     */
    @JsonProperty(value = "properties.dnsSuffix")
    private String dnsSuffix;

    /**
     * Last deployment action on this hostingEnvironment (App Service
     * Environment).
     */
    @JsonProperty(value = "properties.lastAction")
    private String lastAction;

    /**
     * Result of the last deployment action on this hostingEnvironment (App
     * Service Environment).
     */
    @JsonProperty(value = "properties.lastActionResult")
    private String lastActionResult;

    /**
     * List of comma separated strings describing which VM sizes are allowed
     * for front-ends.
     */
    @JsonProperty(value = "properties.allowedMultiSizes")
    private String allowedMultiSizes;

    /**
     * List of comma separated strings describing which VM sizes are allowed
     * for workers.
     */
    @JsonProperty(value = "properties.allowedWorkerSizes")
    private String allowedWorkerSizes;

    /**
     * Maximum number of VMs in this hostingEnvironment (App Service
     * Environment).
     */
    @JsonProperty(value = "properties.maximumNumberOfMachines")
    private Integer maximumNumberOfMachines;

    /**
     * Description of IP SSL mapping for this hostingEnvironment (App Service
     * Environment).
     */
    @JsonProperty(value = "properties.vipMappings")
    private List<VirtualIPMapping> vipMappings;

    /**
     * Current total, used, and available worker capacities.
     */
    @JsonProperty(value = "properties.environmentCapacities")
    private List<StampCapacityInner> environmentCapacities;

    /**
     * Access control list for controlling traffic to the hostingEnvironment
     * (App Service Environment).
     */
    @JsonProperty(value = "properties.networkAccessControlList")
    private List<NetworkAccessControlEntry> networkAccessControlList;

    /**
     * True/false indicating whether the hostingEnvironment (App Service
     * Environment) is healthy.
     */
    @JsonProperty(value = "properties.environmentIsHealthy")
    private Boolean environmentIsHealthy;

    /**
     * Detailed message about with results of the last check of the
     * hostingEnvironment (App Service Environment).
     */
    @JsonProperty(value = "properties.environmentStatus")
    private String environmentStatus;

    /**
     * Resource group of the hostingEnvironment (App Service Environment).
     */
    @JsonProperty(value = "properties.resourceGroup")
    private String resourceGroup;

    /**
     * Scale Factor for FrontEnds.
     */
    @JsonProperty(value = "properties.frontEndScaleFactor")
    private Integer frontEndScaleFactor;

    /**
     * The apiManagementAccountId property.
     */
    @JsonProperty(value = "properties.apiManagementAccountId")
    private String apiManagementAccountId;

    /**
     * True/false indicating whether the hostingEnvironment is suspended. The
     * environment can be suspended e.g. when the management endpoint is no
     * longer available
     * (most likely because NSG blocked the incoming traffic).
     */
    @JsonProperty(value = "properties.suspended")
    private Boolean suspended;

    /**
     * True/false indicating whether the hostingEnvironment is suspended. The
     * environment can be suspended e.g. when the management endpoint is no
     * longer available
     * (most likely because NSG blocked the incoming traffic).
     */
    @JsonProperty(value = "properties.dynamicCacheEnabled")
    private Boolean dynamicCacheEnabled;

    /**
     * Custom settings for changing the behavior of the hosting environment.
     */
    @JsonProperty(value = "properties.clusterSettings")
    private List<NameValuePair> clusterSettings;

    /**
     * Get the appServiceEnvironmentName value.
     *
     * @return the appServiceEnvironmentName value
     */
    public String appServiceEnvironmentName() {
        return this.appServiceEnvironmentName;
    }

    /**
     * Set the appServiceEnvironmentName value.
     *
     * @param appServiceEnvironmentName the appServiceEnvironmentName value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withAppServiceEnvironmentName(String appServiceEnvironmentName) {
        this.appServiceEnvironmentName = appServiceEnvironmentName;
        return this;
    }

    /**
     * Get the appServiceEnvironmentLocation value.
     *
     * @return the appServiceEnvironmentLocation value
     */
    public String appServiceEnvironmentLocation() {
        return this.appServiceEnvironmentLocation;
    }

    /**
     * Set the appServiceEnvironmentLocation value.
     *
     * @param appServiceEnvironmentLocation the appServiceEnvironmentLocation value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withAppServiceEnvironmentLocation(String appServiceEnvironmentLocation) {
        this.appServiceEnvironmentLocation = appServiceEnvironmentLocation;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public HostingEnvironmentStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withStatus(HostingEnvironmentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the vnetName value.
     *
     * @return the vnetName value
     */
    public String vnetName() {
        return this.vnetName;
    }

    /**
     * Set the vnetName value.
     *
     * @param vnetName the vnetName value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withVnetName(String vnetName) {
        this.vnetName = vnetName;
        return this;
    }

    /**
     * Get the vnetResourceGroupName value.
     *
     * @return the vnetResourceGroupName value
     */
    public String vnetResourceGroupName() {
        return this.vnetResourceGroupName;
    }

    /**
     * Set the vnetResourceGroupName value.
     *
     * @param vnetResourceGroupName the vnetResourceGroupName value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withVnetResourceGroupName(String vnetResourceGroupName) {
        this.vnetResourceGroupName = vnetResourceGroupName;
        return this;
    }

    /**
     * Get the vnetSubnetName value.
     *
     * @return the vnetSubnetName value
     */
    public String vnetSubnetName() {
        return this.vnetSubnetName;
    }

    /**
     * Set the vnetSubnetName value.
     *
     * @param vnetSubnetName the vnetSubnetName value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withVnetSubnetName(String vnetSubnetName) {
        this.vnetSubnetName = vnetSubnetName;
        return this;
    }

    /**
     * Get the virtualNetwork value.
     *
     * @return the virtualNetwork value
     */
    public VirtualNetworkProfile virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set the virtualNetwork value.
     *
     * @param virtualNetwork the virtualNetwork value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withVirtualNetwork(VirtualNetworkProfile virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
        return this;
    }

    /**
     * Get the internalLoadBalancingMode value.
     *
     * @return the internalLoadBalancingMode value
     */
    public InternalLoadBalancingMode internalLoadBalancingMode() {
        return this.internalLoadBalancingMode;
    }

    /**
     * Set the internalLoadBalancingMode value.
     *
     * @param internalLoadBalancingMode the internalLoadBalancingMode value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withInternalLoadBalancingMode(InternalLoadBalancingMode internalLoadBalancingMode) {
        this.internalLoadBalancingMode = internalLoadBalancingMode;
        return this;
    }

    /**
     * Get the multiSize value.
     *
     * @return the multiSize value
     */
    public String multiSize() {
        return this.multiSize;
    }

    /**
     * Set the multiSize value.
     *
     * @param multiSize the multiSize value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withMultiSize(String multiSize) {
        this.multiSize = multiSize;
        return this;
    }

    /**
     * Get the multiRoleCount value.
     *
     * @return the multiRoleCount value
     */
    public Integer multiRoleCount() {
        return this.multiRoleCount;
    }

    /**
     * Set the multiRoleCount value.
     *
     * @param multiRoleCount the multiRoleCount value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withMultiRoleCount(Integer multiRoleCount) {
        this.multiRoleCount = multiRoleCount;
        return this;
    }

    /**
     * Get the workerPools value.
     *
     * @return the workerPools value
     */
    public List<WorkerPoolInner> workerPools() {
        return this.workerPools;
    }

    /**
     * Set the workerPools value.
     *
     * @param workerPools the workerPools value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withWorkerPools(List<WorkerPoolInner> workerPools) {
        this.workerPools = workerPools;
        return this;
    }

    /**
     * Get the ipsslAddressCount value.
     *
     * @return the ipsslAddressCount value
     */
    public Integer ipsslAddressCount() {
        return this.ipsslAddressCount;
    }

    /**
     * Set the ipsslAddressCount value.
     *
     * @param ipsslAddressCount the ipsslAddressCount value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withIpsslAddressCount(Integer ipsslAddressCount) {
        this.ipsslAddressCount = ipsslAddressCount;
        return this;
    }

    /**
     * Get the databaseEdition value.
     *
     * @return the databaseEdition value
     */
    public String databaseEdition() {
        return this.databaseEdition;
    }

    /**
     * Set the databaseEdition value.
     *
     * @param databaseEdition the databaseEdition value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withDatabaseEdition(String databaseEdition) {
        this.databaseEdition = databaseEdition;
        return this;
    }

    /**
     * Get the databaseServiceObjective value.
     *
     * @return the databaseServiceObjective value
     */
    public String databaseServiceObjective() {
        return this.databaseServiceObjective;
    }

    /**
     * Set the databaseServiceObjective value.
     *
     * @param databaseServiceObjective the databaseServiceObjective value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withDatabaseServiceObjective(String databaseServiceObjective) {
        this.databaseServiceObjective = databaseServiceObjective;
        return this;
    }

    /**
     * Get the upgradeDomains value.
     *
     * @return the upgradeDomains value
     */
    public Integer upgradeDomains() {
        return this.upgradeDomains;
    }

    /**
     * Set the upgradeDomains value.
     *
     * @param upgradeDomains the upgradeDomains value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withUpgradeDomains(Integer upgradeDomains) {
        this.upgradeDomains = upgradeDomains;
        return this;
    }

    /**
     * Get the subscriptionId value.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId value.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the dnsSuffix value.
     *
     * @return the dnsSuffix value
     */
    public String dnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Set the dnsSuffix value.
     *
     * @param dnsSuffix the dnsSuffix value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withDnsSuffix(String dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
        return this;
    }

    /**
     * Get the lastAction value.
     *
     * @return the lastAction value
     */
    public String lastAction() {
        return this.lastAction;
    }

    /**
     * Set the lastAction value.
     *
     * @param lastAction the lastAction value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withLastAction(String lastAction) {
        this.lastAction = lastAction;
        return this;
    }

    /**
     * Get the lastActionResult value.
     *
     * @return the lastActionResult value
     */
    public String lastActionResult() {
        return this.lastActionResult;
    }

    /**
     * Set the lastActionResult value.
     *
     * @param lastActionResult the lastActionResult value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withLastActionResult(String lastActionResult) {
        this.lastActionResult = lastActionResult;
        return this;
    }

    /**
     * Get the allowedMultiSizes value.
     *
     * @return the allowedMultiSizes value
     */
    public String allowedMultiSizes() {
        return this.allowedMultiSizes;
    }

    /**
     * Set the allowedMultiSizes value.
     *
     * @param allowedMultiSizes the allowedMultiSizes value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withAllowedMultiSizes(String allowedMultiSizes) {
        this.allowedMultiSizes = allowedMultiSizes;
        return this;
    }

    /**
     * Get the allowedWorkerSizes value.
     *
     * @return the allowedWorkerSizes value
     */
    public String allowedWorkerSizes() {
        return this.allowedWorkerSizes;
    }

    /**
     * Set the allowedWorkerSizes value.
     *
     * @param allowedWorkerSizes the allowedWorkerSizes value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withAllowedWorkerSizes(String allowedWorkerSizes) {
        this.allowedWorkerSizes = allowedWorkerSizes;
        return this;
    }

    /**
     * Get the maximumNumberOfMachines value.
     *
     * @return the maximumNumberOfMachines value
     */
    public Integer maximumNumberOfMachines() {
        return this.maximumNumberOfMachines;
    }

    /**
     * Set the maximumNumberOfMachines value.
     *
     * @param maximumNumberOfMachines the maximumNumberOfMachines value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withMaximumNumberOfMachines(Integer maximumNumberOfMachines) {
        this.maximumNumberOfMachines = maximumNumberOfMachines;
        return this;
    }

    /**
     * Get the vipMappings value.
     *
     * @return the vipMappings value
     */
    public List<VirtualIPMapping> vipMappings() {
        return this.vipMappings;
    }

    /**
     * Set the vipMappings value.
     *
     * @param vipMappings the vipMappings value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withVipMappings(List<VirtualIPMapping> vipMappings) {
        this.vipMappings = vipMappings;
        return this;
    }

    /**
     * Get the environmentCapacities value.
     *
     * @return the environmentCapacities value
     */
    public List<StampCapacityInner> environmentCapacities() {
        return this.environmentCapacities;
    }

    /**
     * Set the environmentCapacities value.
     *
     * @param environmentCapacities the environmentCapacities value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withEnvironmentCapacities(List<StampCapacityInner> environmentCapacities) {
        this.environmentCapacities = environmentCapacities;
        return this;
    }

    /**
     * Get the networkAccessControlList value.
     *
     * @return the networkAccessControlList value
     */
    public List<NetworkAccessControlEntry> networkAccessControlList() {
        return this.networkAccessControlList;
    }

    /**
     * Set the networkAccessControlList value.
     *
     * @param networkAccessControlList the networkAccessControlList value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withNetworkAccessControlList(List<NetworkAccessControlEntry> networkAccessControlList) {
        this.networkAccessControlList = networkAccessControlList;
        return this;
    }

    /**
     * Get the environmentIsHealthy value.
     *
     * @return the environmentIsHealthy value
     */
    public Boolean environmentIsHealthy() {
        return this.environmentIsHealthy;
    }

    /**
     * Set the environmentIsHealthy value.
     *
     * @param environmentIsHealthy the environmentIsHealthy value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withEnvironmentIsHealthy(Boolean environmentIsHealthy) {
        this.environmentIsHealthy = environmentIsHealthy;
        return this;
    }

    /**
     * Get the environmentStatus value.
     *
     * @return the environmentStatus value
     */
    public String environmentStatus() {
        return this.environmentStatus;
    }

    /**
     * Set the environmentStatus value.
     *
     * @param environmentStatus the environmentStatus value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withEnvironmentStatus(String environmentStatus) {
        this.environmentStatus = environmentStatus;
        return this;
    }

    /**
     * Get the resourceGroup value.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup value.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the frontEndScaleFactor value.
     *
     * @return the frontEndScaleFactor value
     */
    public Integer frontEndScaleFactor() {
        return this.frontEndScaleFactor;
    }

    /**
     * Set the frontEndScaleFactor value.
     *
     * @param frontEndScaleFactor the frontEndScaleFactor value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withFrontEndScaleFactor(Integer frontEndScaleFactor) {
        this.frontEndScaleFactor = frontEndScaleFactor;
        return this;
    }

    /**
     * Get the apiManagementAccountId value.
     *
     * @return the apiManagementAccountId value
     */
    public String apiManagementAccountId() {
        return this.apiManagementAccountId;
    }

    /**
     * Set the apiManagementAccountId value.
     *
     * @param apiManagementAccountId the apiManagementAccountId value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withApiManagementAccountId(String apiManagementAccountId) {
        this.apiManagementAccountId = apiManagementAccountId;
        return this;
    }

    /**
     * Get the suspended value.
     *
     * @return the suspended value
     */
    public Boolean suspended() {
        return this.suspended;
    }

    /**
     * Set the suspended value.
     *
     * @param suspended the suspended value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withSuspended(Boolean suspended) {
        this.suspended = suspended;
        return this;
    }

    /**
     * Get the dynamicCacheEnabled value.
     *
     * @return the dynamicCacheEnabled value
     */
    public Boolean dynamicCacheEnabled() {
        return this.dynamicCacheEnabled;
    }

    /**
     * Set the dynamicCacheEnabled value.
     *
     * @param dynamicCacheEnabled the dynamicCacheEnabled value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withDynamicCacheEnabled(Boolean dynamicCacheEnabled) {
        this.dynamicCacheEnabled = dynamicCacheEnabled;
        return this;
    }

    /**
     * Get the clusterSettings value.
     *
     * @return the clusterSettings value
     */
    public List<NameValuePair> clusterSettings() {
        return this.clusterSettings;
    }

    /**
     * Set the clusterSettings value.
     *
     * @param clusterSettings the clusterSettings value to set
     * @return the AppServiceEnvironmentInner object itself.
     */
    public AppServiceEnvironmentInner withClusterSettings(List<NameValuePair> clusterSettings) {
        this.clusterSettings = clusterSettings;
        return this;
    }

}
