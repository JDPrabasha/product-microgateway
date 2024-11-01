/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.apimgt.gateway.cli.model.rest.ext;

import org.wso2.apimgt.gateway.cli.model.config.ApplicationSecurity;
import org.wso2.apimgt.gateway.cli.model.mgwcodegen.MgwEndpointConfigDTO;
import org.wso2.apimgt.gateway.cli.model.rest.APIInfoBaseDTO;

/**
 * Data mapper object defining a MGW API using OpenApi definition.
 */
public class ExtendedAPI {
    //API DTO information
    private APIInfoBaseDTO apiInfo;
    //API Level endpoint configuration
    private MgwEndpointConfigDTO endpointConfigRepresentation = null;
    //Basepath
    private String specificBasepath = null;
    //Security
    private String mgwApiSecurity = null;
    //Scopes
    private String mgwApiScope = null;
    //isGrpc
    private boolean isGrpc = false;

    //support apim application level security
    private ApplicationSecurity applicationSecurity = null;
    //support apim transport level security
    private String mutualSSL = null;

    public ExtendedAPI(APIInfoBaseDTO apiInfo) {
        this.apiInfo = apiInfo;
    }

    public APIInfoBaseDTO getApiInfo() {
        return apiInfo;
    }

    public void setApiInfo(APIInfoBaseDTO apiInfo) {
        this.apiInfo = apiInfo;
    }

    public MgwEndpointConfigDTO getEndpointConfigRepresentation() {
        return endpointConfigRepresentation;
    }

    public void setEndpointConfigRepresentation(MgwEndpointConfigDTO endpointConfigRepresentation) {
        this.endpointConfigRepresentation = endpointConfigRepresentation;
    }

    public String getSpecificBasepath() {
        return specificBasepath;
    }

    public void setSpecificBasepath(String specificBasepath) {
        this.specificBasepath = specificBasepath;
    }

    public String getMgwApiSecurity() {
        return mgwApiSecurity;
    }

    public void setMgwApiSecurity(String mgwApiSecurity) {
        this.mgwApiSecurity = mgwApiSecurity;
    }

    public void setMgwApiScope(String mgwApiScope) {
        this.mgwApiScope = mgwApiScope;
    }

    public String getMgwApiScope() {
        return mgwApiScope;
    }

    public boolean isGrpc() {
        return isGrpc;
    }

    public void setGrpc(boolean grpc) {
        isGrpc = grpc;
    }

    public void setApplicationSecurity(ApplicationSecurity applicationSecurity) {
        this.applicationSecurity = applicationSecurity;
    }

    public ApplicationSecurity getApplicationSecurity() {
        return applicationSecurity;
    }

    public String getMutualSSL() {
        return mutualSSL;
    }

    public void setMutualSSL(String mutualSSL) {
        this.mutualSSL = mutualSSL;
    }

}
