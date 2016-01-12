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


/**
 * Response for CheckDnsNameAvailability Api servive call.
 */
public class DnsNameAvailabilityResult {
    /**
     * Domain availability (True/False).
     */
    private Boolean available;

    /**
     * Get the available value.
     *
     * @return the available value
     */
    public Boolean getAvailable() {
        return this.available;
    }

    /**
     * Set the available value.
     *
     * @param available the available value to set
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

}
