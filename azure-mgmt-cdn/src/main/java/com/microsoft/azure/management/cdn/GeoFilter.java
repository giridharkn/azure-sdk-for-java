/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Rules defining user geo access within a CDN endpoint.
 */
public class GeoFilter {
    /**
     * Relative path applicable to geo filter. (e.g. '/mypictures',
     * '/mypicture/kitty.jpg', and etc.).
     */
    @JsonProperty(required = true)
    private String relativePath;

    /**
     * Action of the geo filter, i.e. allow or block access. Possible values
     * include: 'Block', 'Allow'.
     */
    @JsonProperty(required = true)
    private GeoFilterActions action;

    /**
     * Two letter country codes defining user country access in a geo filter,
     * e.g. AU, MX, US.
     */
    @JsonProperty(required = true)
    private List<String> countryCodes;

    /**
     * Get the relativePath value.
     *
     * @return the relativePath value
     */
    public String relativePath() {
        return this.relativePath;
    }

    /**
     * Set the relativePath value.
     *
     * @param relativePath the relativePath value to set
     * @return the GeoFilter object itself.
     */
    public GeoFilter withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * Get the action value.
     *
     * @return the action value
     */
    public GeoFilterActions action() {
        return this.action;
    }

    /**
     * Set the action value.
     *
     * @param action the action value to set
     * @return the GeoFilter object itself.
     */
    public GeoFilter withAction(GeoFilterActions action) {
        this.action = action;
        return this;
    }

    /**
     * Get the countryCodes value.
     *
     * @return the countryCodes value
     */
    public List<String> countryCodes() {
        return this.countryCodes;
    }

    /**
     * Set the countryCodes value.
     *
     * @param countryCodes the countryCodes value to set
     * @return the GeoFilter object itself.
     */
    public GeoFilter withCountryCodes(List<String> countryCodes) {
        this.countryCodes = countryCodes;
        return this;
    }

}