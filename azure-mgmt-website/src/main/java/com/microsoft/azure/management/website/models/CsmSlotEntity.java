/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website.models;


/**
 * Class containing deployment slot parameters.
 */
public class CsmSlotEntity {
    /**
     * Set the destination deployment slot during swap operation.
     */
    private String targetSlot;

    /**
     * Get or set the flag indicating it should preserve VNet to the slot
     * during swap.
     */
    private Boolean preserveVnet;

    /**
     * Get the targetSlot value.
     *
     * @return the targetSlot value
     */
    public String getTargetSlot() {
        return this.targetSlot;
    }

    /**
     * Set the targetSlot value.
     *
     * @param targetSlot the targetSlot value to set
     */
    public void setTargetSlot(String targetSlot) {
        this.targetSlot = targetSlot;
    }

    /**
     * Get the preserveVnet value.
     *
     * @return the preserveVnet value
     */
    public Boolean getPreserveVnet() {
        return this.preserveVnet;
    }

    /**
     * Set the preserveVnet value.
     *
     * @param preserveVnet the preserveVnet value to set
     */
    public void setPreserveVnet(Boolean preserveVnet) {
        this.preserveVnet = preserveVnet;
    }

}
