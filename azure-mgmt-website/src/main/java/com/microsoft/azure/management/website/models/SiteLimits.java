/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website.models;


/**
 * Represents metric limits set on a web app.
 */
public class SiteLimits {
    /**
     * Maximum allowed CPU usage percentage.
     */
    private Double maxPercentageCpu;

    /**
     * Maximum allowed memory usage in MB.
     */
    private Long maxMemoryInMb;

    /**
     * Maximum allowed disk size usage in MB.
     */
    private Long maxDiskSizeInMb;

    /**
     * Get the maxPercentageCpu value.
     *
     * @return the maxPercentageCpu value
     */
    public Double getMaxPercentageCpu() {
        return this.maxPercentageCpu;
    }

    /**
     * Set the maxPercentageCpu value.
     *
     * @param maxPercentageCpu the maxPercentageCpu value to set
     */
    public void setMaxPercentageCpu(Double maxPercentageCpu) {
        this.maxPercentageCpu = maxPercentageCpu;
    }

    /**
     * Get the maxMemoryInMb value.
     *
     * @return the maxMemoryInMb value
     */
    public Long getMaxMemoryInMb() {
        return this.maxMemoryInMb;
    }

    /**
     * Set the maxMemoryInMb value.
     *
     * @param maxMemoryInMb the maxMemoryInMb value to set
     */
    public void setMaxMemoryInMb(Long maxMemoryInMb) {
        this.maxMemoryInMb = maxMemoryInMb;
    }

    /**
     * Get the maxDiskSizeInMb value.
     *
     * @return the maxDiskSizeInMb value
     */
    public Long getMaxDiskSizeInMb() {
        return this.maxDiskSizeInMb;
    }

    /**
     * Set the maxDiskSizeInMb value.
     *
     * @param maxDiskSizeInMb the maxDiskSizeInMb value to set
     */
    public void setMaxDiskSizeInMb(Long maxDiskSizeInMb) {
        this.maxDiskSizeInMb = maxDiskSizeInMb;
    }

}