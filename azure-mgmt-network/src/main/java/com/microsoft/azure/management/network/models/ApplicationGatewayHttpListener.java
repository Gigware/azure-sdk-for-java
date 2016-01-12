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

/**
 * Http listener of application gateway.
 */
public class ApplicationGatewayHttpListener extends SubResource {
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
     * Gets or sets frontend IP configuration resource of application gateway.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /**
     * Gets or sets frontend port resource of application gateway.
     */
    @JsonProperty(value = "properties.frontendPort")
    private SubResource frontendPort;

    /**
     * Gets or sets the protocol. Possible values for this property include:
     * 'Http', 'Https'.
     */
    @JsonProperty(value = "properties.protocol")
    private String protocol;

    /**
     * Gets or sets the host name of http listener.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostName;

    /**
     * Gets or sets ssl certificate resource of application gateway.
     */
    @JsonProperty(value = "properties.sslCertificate")
    private SubResource sslCertificate;

    /**
     * Gets or sets the requireServerNameIndication of http listener.
     */
    @JsonProperty(value = "properties.requireServerNameIndication")
    private String requireServerNameIndication;

    /**
     * Gets or sets Provisioning state of the http listener resource
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
     * Get the frontendIPConfiguration value.
     *
     * @return the frontendIPConfiguration value
     */
    public SubResource getFrontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }

    /**
     * Set the frontendIPConfiguration value.
     *
     * @param frontendIPConfiguration the frontendIPConfiguration value to set
     */
    public void setFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.frontendIPConfiguration = frontendIPConfiguration;
    }

    /**
     * Get the frontendPort value.
     *
     * @return the frontendPort value
     */
    public SubResource getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort value.
     *
     * @param frontendPort the frontendPort value to set
     */
    public void setFrontendPort(SubResource frontendPort) {
        this.frontendPort = frontendPort;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Get the hostName value.
     *
     * @return the hostName value
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * Set the hostName value.
     *
     * @param hostName the hostName value to set
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * Get the sslCertificate value.
     *
     * @return the sslCertificate value
     */
    public SubResource getSslCertificate() {
        return this.sslCertificate;
    }

    /**
     * Set the sslCertificate value.
     *
     * @param sslCertificate the sslCertificate value to set
     */
    public void setSslCertificate(SubResource sslCertificate) {
        this.sslCertificate = sslCertificate;
    }

    /**
     * Get the requireServerNameIndication value.
     *
     * @return the requireServerNameIndication value
     */
    public String getRequireServerNameIndication() {
        return this.requireServerNameIndication;
    }

    /**
     * Set the requireServerNameIndication value.
     *
     * @param requireServerNameIndication the requireServerNameIndication value to set
     */
    public void setRequireServerNameIndication(String requireServerNameIndication) {
        this.requireServerNameIndication = requireServerNameIndication;
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
