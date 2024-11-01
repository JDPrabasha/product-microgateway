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

package org.wso2.apimgt.gateway.cli.model.template.service;

import io.swagger.v3.oas.models.parameters.Parameter;
import org.apache.commons.lang3.StringUtils;
import org.wso2.apimgt.gateway.cli.exception.BallerinaServiceGenException;
import org.wso2.apimgt.gateway.cli.model.rest.ext.ExtendedAPIWrapper;

/**
 * Wraps the {@link Parameter} from swagger models for easier templating.
 */
public class BallerinaParameter implements BallerinaOpenAPIObject<BallerinaParameter, Parameter> {

    private String name;
    private String in;
    private String description;
    private Boolean required;
    private Boolean allowEmptyValue;
    private String escapedName;

    @Override
    public BallerinaParameter buildContext(Parameter parameter) throws BallerinaServiceGenException {
        return buildContext(parameter, null);
    }

    @Override
    public BallerinaParameter buildContext(Parameter parameter, ExtendedAPIWrapper api)
            throws BallerinaServiceGenException {
        String parameterName = parameter.getName();
        this.name = parameterName;
        this.in = parameter.getIn();
        this.description = parameter.getDescription();
        this.required = parameter.getRequired();
        this.allowEmptyValue = parameter.getAllowEmptyValue();
        this.escapedName = "'" + parameterName;
        if (!StringUtils.isAlphanumeric(parameterName)) {
            this.escapedName = parameterName;
        }
        return this;
    }

    @Override
    public BallerinaParameter getDefaultValue() {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getIn() {
        return in;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getRequired() {
        return required;
    }

    public Boolean getAllowEmptyValue() {
        return allowEmptyValue;
    }

    public void setAllowEmptyValue(Boolean allowEmptyValue) {
        this.allowEmptyValue = allowEmptyValue;
    }

    public String getEscapedName() {
        return escapedName;
    }

    public void setEscapedName(String escapedName) {
        this.escapedName = escapedName;
    }
}
