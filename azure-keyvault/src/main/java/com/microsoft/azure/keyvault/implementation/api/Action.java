/**
 * Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.implementation.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Action model.
 */
public class Action {
    /**
     * The type of the action.
     */
    @JsonProperty(value = "action_type")
    private String actionType;

    /**
     * Get the actionType value.
     *
     * @return the actionType value
     */
    public String actionType() {
        return this.actionType;
    }

    /**
     * Set the actionType value.
     *
     * @param actionType the actionType value to set
     * @return the Action object itself.
     */
    public Action setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

}
