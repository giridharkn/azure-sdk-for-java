/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The contact information for the vault certificates.
 */
public class Contact {
    /**
     * Email addresss.
     */
    @JsonProperty(value = "email")
    private String emailAddress;

    /**
     * Name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Phone number.
     */
    @JsonProperty(value = "phone")
    private String phone;

    /**
     * Get the emailAddress value.
     *
     * @return the emailAddress value
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress value.
     *
     * @param emailAddress the emailAddress value to set
     * @return the Contact object itself.
     */
    public Contact withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Contact object itself.
     */
    public Contact withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the phone value.
     *
     * @return the phone value
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone value.
     *
     * @param phone the phone value to set
     * @return the Contact object itself.
     */
    public Contact withPhone(String phone) {
        this.phone = phone;
        return this;
    }

}
