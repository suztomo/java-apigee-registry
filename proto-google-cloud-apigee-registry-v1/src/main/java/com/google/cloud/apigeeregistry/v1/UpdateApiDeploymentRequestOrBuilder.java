/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigeeregistry/v1/registry_service.proto

package com.google.cloud.apigeeregistry.v1;

public interface UpdateApiDeploymentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeregistry.v1.UpdateApiDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The deployment to update.
   * The `name` field is used to identify the deployment to update.
   * Format: projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the apiDeployment field is set.
   */
  boolean hasApiDeployment();
  /**
   *
   *
   * <pre>
   * Required. The deployment to update.
   * The `name` field is used to identify the deployment to update.
   * Format: projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The apiDeployment.
   */
  com.google.cloud.apigeeregistry.v1.ApiDeployment getApiDeployment();
  /**
   *
   *
   * <pre>
   * Required. The deployment to update.
   * The `name` field is used to identify the deployment to update.
   * Format: projects/&#42;&#47;locations/&#42;&#47;apis/&#42;&#47;deployments/&#42;
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiDeployment api_deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.apigeeregistry.v1.ApiDeploymentOrBuilder getApiDeploymentOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to be updated. If omitted, all fields are updated that
   * are set in the request message (fields set to default values are ignored).
   * If a "*" is specified, all fields are updated, including fields that are
   * unspecified/default in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated. If omitted, all fields are updated that
   * are set in the request message (fields set to default values are ignored).
   * If a "*" is specified, all fields are updated, including fields that are
   * unspecified/default in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated. If omitted, all fields are updated that
   * are set in the request message (fields set to default values are ignored).
   * If a "*" is specified, all fields are updated, including fields that are
   * unspecified/default in the request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, and the deployment is not found, a new deployment will be
   * created. In this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
