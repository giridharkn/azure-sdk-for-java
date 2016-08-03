/**
 * Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import com.microsoft.rest.Base64Url;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key operations parameters.
 */
public class KeySignParameters {
    /**
     * The signing/verification algorithm identifier. For more information on
     * possible algorithm types, see JsonWebKeySignatureAlgorithm. Possible
     * values include: 'RS256', 'RS384', 'RS512', 'RSNULL'.
     */
    @JsonProperty(value = "alg", required = true)
    private String algorithm;

    /**
     * The value property.
     */
    @JsonProperty(required = true)
    private Base64Url value;

    /**
     * Get the algorithm value.
     *
     * @return the algorithm value
     */
    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm value.
     *
     * @param algorithm the algorithm value to set
     * @return the KeySignParameters object itself.
     */
    public KeySignParameters withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public byte[] value() {
        if (this.value == null) {
            return null;
        }
        return this.value.getDecodedBytes();
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the KeySignParameters object itself.
     */
    public KeySignParameters withValue(byte[] value) {
        if (value == null) {
            this.value = null;
        } else {
            this.value = Base64Url.encode(value);
        }
        return this;
    }

}
