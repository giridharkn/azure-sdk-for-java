/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.implementation;


/**
 * SSO URI required to login to the supplemental portal.
 */
public class SsoUriInner {
    /**
     * The URI used to login to the supplemental portal.
     */
    private String ssoUriValue;

    /**
     * Get the ssoUriValue value.
     *
     * @return the ssoUriValue value
     */
    public String ssoUriValue() {
        return this.ssoUriValue;
    }

    /**
     * Set the ssoUriValue value.
     *
     * @param ssoUriValue the ssoUriValue value to set
     * @return the SsoUriInner object itself.
     */
    public SsoUriInner withSsoUriValue(String ssoUriValue) {
        this.ssoUriValue = ssoUriValue;
        return this;
    }

}