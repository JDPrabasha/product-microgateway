// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/security.proto

package org.wso2.gateway.discovery.config.enforcer;

public interface SecurityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.config.enforcer.Security)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .wso2.discovery.config.enforcer.Issuer tokenService = 1;</code>
   */
  java.util.List<org.wso2.gateway.discovery.config.enforcer.Issuer> 
      getTokenServiceList();
  /**
   * <code>repeated .wso2.discovery.config.enforcer.Issuer tokenService = 1;</code>
   */
  org.wso2.gateway.discovery.config.enforcer.Issuer getTokenService(int index);
  /**
   * <code>repeated .wso2.discovery.config.enforcer.Issuer tokenService = 1;</code>
   */
  int getTokenServiceCount();
  /**
   * <code>repeated .wso2.discovery.config.enforcer.Issuer tokenService = 1;</code>
   */
  java.util.List<? extends org.wso2.gateway.discovery.config.enforcer.IssuerOrBuilder> 
      getTokenServiceOrBuilderList();
  /**
   * <code>repeated .wso2.discovery.config.enforcer.Issuer tokenService = 1;</code>
   */
  org.wso2.gateway.discovery.config.enforcer.IssuerOrBuilder getTokenServiceOrBuilder(
      int index);
}