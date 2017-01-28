/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.implementation;


/**
 * Output of check name availability API.
 */
public class CheckNameAvailabilityOutputInner {
    /**
     * Indicates whether the name is available.
     */
    private Boolean nameAvailable;

    /**
     * The reason why the name is not available.
     */
    private String reason;

    /**
     * The detailed error message describing why the name is not available.
     */
    private String message;

    /**
     * Get the nameAvailable value.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable value.
     *
     * @param nameAvailable the nameAvailable value to set
     * @return the CheckNameAvailabilityOutputInner object itself.
     */
    public CheckNameAvailabilityOutputInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the CheckNameAvailabilityOutputInner object itself.
     */
    public CheckNameAvailabilityOutputInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the CheckNameAvailabilityOutputInner object itself.
     */
    public CheckNameAvailabilityOutputInner withMessage(String message) {
        this.message = message;
        return this;
    }

}