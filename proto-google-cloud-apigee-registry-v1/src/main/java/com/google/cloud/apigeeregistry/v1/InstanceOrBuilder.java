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
// source: google/cloud/apigeeregistry/v1/provisioning_service.proto

package com.google.cloud.apigeeregistry.v1;

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeregistry.v1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Format: `projects/&#42;&#47;locations/&#42;&#47;instance`.
   * Currently only locations/global is supported.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Format: `projects/&#42;&#47;locations/&#42;&#47;instance`.
   * Currently only locations/global is supported.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the Instance.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.Instance.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the Instance.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.Instance.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.apigeeregistry.v1.Instance.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Extra information of Instance.State if the state is `FAILED`.
   * </pre>
   *
   * <code>string state_message = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateMessage.
   */
  java.lang.String getStateMessage();
  /**
   *
   *
   * <pre>
   * Output only. Extra information of Instance.State if the state is `FAILED`.
   * </pre>
   *
   * <code>string state_message = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateMessage.
   */
  com.google.protobuf.ByteString getStateMessageBytes();

  /**
   *
   *
   * <pre>
   * Required. Config of the Instance.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.Instance.Config config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Required. Config of the Instance.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.Instance.Config config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The config.
   */
  com.google.cloud.apigeeregistry.v1.Instance.Config getConfig();
  /**
   *
   *
   * <pre>
   * Required. Config of the Instance.
   * </pre>
   *
   * <code>
   * .google.cloud.apigeeregistry.v1.Instance.Config config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.apigeeregistry.v1.Instance.ConfigOrBuilder getConfigOrBuilder();
}
