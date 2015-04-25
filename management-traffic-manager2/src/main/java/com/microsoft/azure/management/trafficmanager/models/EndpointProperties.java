/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.trafficmanager.models;

/**
* Properties of an endpoint.
*/
public class EndpointProperties {
    private String endpointLocation;
    
    /**
    * Optional. Gets or sets the location of the endpoint.
    * @return The EndpointLocation value.
    */
    public String getEndpointLocation() {
        return this.endpointLocation;
    }
    
    /**
    * Optional. Gets or sets the location of the endpoint.
    * @param endpointLocationValue The EndpointLocation value.
    */
    public void setEndpointLocation(final String endpointLocationValue) {
        this.endpointLocation = endpointLocationValue;
    }
    
    private String endpointMonitorStatus;
    
    /**
    * Optional. Gets or sets the monitor status of the endpoint.
    * @return The EndpointMonitorStatus value.
    */
    public String getEndpointMonitorStatus() {
        return this.endpointMonitorStatus;
    }
    
    /**
    * Optional. Gets or sets the monitor status of the endpoint.
    * @param endpointMonitorStatusValue The EndpointMonitorStatus value.
    */
    public void setEndpointMonitorStatus(final String endpointMonitorStatusValue) {
        this.endpointMonitorStatus = endpointMonitorStatusValue;
    }
    
    private String endpointStatus;
    
    /**
    * Required. Gets or sets the status of the endpoint.
    * @return The EndpointStatus value.
    */
    public String getEndpointStatus() {
        return this.endpointStatus;
    }
    
    /**
    * Required. Gets or sets the status of the endpoint.
    * @param endpointStatusValue The EndpointStatus value.
    */
    public void setEndpointStatus(final String endpointStatusValue) {
        this.endpointStatus = endpointStatusValue;
    }
    
    private Long priority;
    
    /**
    * Optional. Gets or sets the priority of the endpoint.
    * @return The Priority value.
    */
    public Long getPriority() {
        return this.priority;
    }
    
    /**
    * Optional. Gets or sets the priority of the endpoint.
    * @param priorityValue The Priority value.
    */
    public void setPriority(final Long priorityValue) {
        this.priority = priorityValue;
    }
    
    private String target;
    
    /**
    * Required. Gets or sets the target of the endpoint.
    * @return The Target value.
    */
    public String getTarget() {
        return this.target;
    }
    
    /**
    * Required. Gets or sets the target of the endpoint.
    * @param targetValue The Target value.
    */
    public void setTarget(final String targetValue) {
        this.target = targetValue;
    }
    
    private String targetResourceId;
    
    /**
    * Optional. Gets or sets the targetResourceId of the endpoint.
    * @return The TargetResourceId value.
    */
    public String getTargetResourceId() {
        return this.targetResourceId;
    }
    
    /**
    * Optional. Gets or sets the targetResourceId of the endpoint.
    * @param targetResourceIdValue The TargetResourceId value.
    */
    public void setTargetResourceId(final String targetResourceIdValue) {
        this.targetResourceId = targetResourceIdValue;
    }
    
    private Long weight;
    
    /**
    * Optional. Gets or sets the weight of the endpoint.
    * @return The Weight value.
    */
    public Long getWeight() {
        return this.weight;
    }
    
    /**
    * Optional. Gets or sets the weight of the endpoint.
    * @param weightValue The Weight value.
    */
    public void setWeight(final Long weightValue) {
        this.weight = weightValue;
    }
    
    /**
    * Initializes a new instance of the EndpointProperties class.
    *
    */
    public EndpointProperties() {
    }
    
    /**
    * Initializes a new instance of the EndpointProperties class with required
    * arguments.
    *
    * @param target Gets or sets the target of the endpoint.
    * @param endpointStatus Gets or sets the status of the endpoint.
    */
    public EndpointProperties(String target, String endpointStatus) {
        if (target == null) {
            throw new NullPointerException("target");
        }
        if (endpointStatus == null) {
            throw new NullPointerException("endpointStatus");
        }
        this.setTarget(target);
        this.setEndpointStatus(endpointStatus);
    }
}
