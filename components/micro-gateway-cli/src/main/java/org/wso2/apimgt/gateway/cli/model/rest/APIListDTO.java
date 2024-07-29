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
package org.wso2.apimgt.gateway.cli.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.wso2.apimgt.gateway.cli.model.rest.apim3x.Apim3xApiDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Data holder for {@link Apim3xApiDto} type API list definition.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class APIListDTO  {

  private Integer count = null;
  private String next = null;
  private String previous = null;
  private List<Apim3xApiDto> list = new ArrayList<Apim3xApiDto>();
  private APIListPaginationDTO pagination = null;

  
  /**
   * Number of APIs returned.
   **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }
  
  /**
   * Link to the next subset of resources qualified.\nEmpty if no more resources are to be returned.
   **/
  @JsonProperty("next")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }
  
  /**
   * Link to the previous subset of resources qualified.\nEmpty if current subset is the first subset returned.
   **/
  @JsonProperty("previous")
  public String getPrevious() {
    return previous;
  }
  public void setPrevious(String previous) {
    this.previous = previous;
  }

  @JsonProperty("list")
  public List<Apim3xApiDto> getList() {
    return list;
  }
  public void setList(List<Apim3xApiDto> list) {
    this.list = list;
  }

  @JsonProperty("pagination")
  public APIListPaginationDTO getPagination() {
    return pagination;
  }
  public void setPagination(APIListPaginationDTO pagination) {
    this.pagination = pagination;
  }

}
