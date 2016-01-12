/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Outbound NAT pool of the loadbalancer.
 */
public class OutboundNatRule extends SubResource {
    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Gets or sets the number of outbound ports to be used for SNAT.
     */
    @JsonProperty(value = "properties.allocatedOutboundPorts")
    private Integer allocatedOutboundPorts;

    /**
     * Gets or sets Frontend IP addresses of the load balancer.
     */
    @JsonProperty(value = "properties.frontendIPConfigurations")
    private List<SubResource> frontendIPConfigurations;

    /**
     * Gets or sets a reference to a pool of DIPs. Outbound traffic is
     * randomly load balanced across IPs in the backend IPs.
     */
    @JsonProperty(value = "properties.backendAddressPool", required = true)
    private SubResource backendAddressPool;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * Get the allocatedOutboundPorts value.
     *
     * @return the allocatedOutboundPorts value
     */
    public Integer getAllocatedOutboundPorts() {
        return this.allocatedOutboundPorts;
    }

    /**
     * Set the allocatedOutboundPorts value.
     *
     * @param allocatedOutboundPorts the allocatedOutboundPorts value to set
     */
    public void setAllocatedOutboundPorts(Integer allocatedOutboundPorts) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
    }

    /**
     * Get the frontendIPConfigurations value.
     *
     * @return the frontendIPConfigurations value
     */
    public List<SubResource> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    /**
     * Set the frontendIPConfigurations value.
     *
     * @param frontendIPConfigurations the frontendIPConfigurations value to set
     */
    public void setFrontendIPConfigurations(List<SubResource> frontendIPConfigurations) {
        this.frontendIPConfigurations = frontendIPConfigurations;
    }

    /**
     * Get the backendAddressPool value.
     *
     * @return the backendAddressPool value
     */
    public SubResource getBackendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool value.
     *
     * @param backendAddressPool the backendAddressPool value to set
     */
    public void setBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

}
