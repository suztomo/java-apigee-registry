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

public interface CreateApiVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeregistry.v1.CreateApiVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of versions.
   * Format: projects/&#42;&#47;locations/&#42;&#47;apis/&#42;
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of versions.
   * Format: projects/&#42;&#47;locations/&#42;&#47;apis/&#42;
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the apiVersion field is set.
   */
  boolean hasApiVersion();
  /**
   *
   *
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The apiVersion.
   */
  com.google.cloud.apigeeregistry.v1.ApiVersion getApiVersion();
  /**
   *
   *
   * <pre>
   * Required. The version to create.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.ApiVersion api_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.apigeeregistry.v1.ApiVersionOrBuilder getApiVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the version, which will become the final component of
   * the version's resource name.
   * This value should be 1-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string api_version_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The apiVersionId.
   */
  java.lang.String getApiVersionId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the version, which will become the final component of
   * the version's resource name.
   * This value should be 1-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * Following AIP-162, IDs must not have the form of a UUID.
   * </pre>
   *
   * <code>string api_version_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for apiVersionId.
   */
  com.google.protobuf.ByteString getApiVersionIdBytes();
}
