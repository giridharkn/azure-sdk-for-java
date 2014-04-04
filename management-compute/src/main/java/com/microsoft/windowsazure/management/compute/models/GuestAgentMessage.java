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

package com.microsoft.windowsazure.management.compute.models;

import java.util.ArrayList;

/**
* The guest agent message.
*/
public class GuestAgentMessage {
    private String messageResourceId;
    
    /**
    * Optional. The message resource Id.
    * @return The MessageResourceId value.
    */
    public String getMessageResourceId() {
        return this.messageResourceId;
    }
    
    /**
    * Optional. The message resource Id.
    * @param messageResourceIdValue The MessageResourceId value.
    */
    public void setMessageResourceId(final String messageResourceIdValue) {
        this.messageResourceId = messageResourceIdValue;
    }
    
    private ArrayList<String> paramList;
    
    /**
    * Optional. The guest agent message parameter list.
    * @return The ParamList value.
    */
    public ArrayList<String> getParamList() {
        return this.paramList;
    }
    
    /**
    * Optional. The guest agent message parameter list.
    * @param paramListValue The ParamList value.
    */
    public void setParamList(final ArrayList<String> paramListValue) {
        this.paramList = paramListValue;
    }
    
    /**
    * Initializes a new instance of the GuestAgentMessage class.
    *
    */
    public GuestAgentMessage() {
        this.paramList = new ArrayList<String>();
    }
}