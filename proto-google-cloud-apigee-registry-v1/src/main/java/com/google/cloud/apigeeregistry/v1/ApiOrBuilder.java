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
// source: google/cloud/apigeeregistry/v1/registry_models.proto

package com.google.cloud.apigeeregistry.v1;

public interface ApiOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeregistry.v1.Api)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name.
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
   * Resource name.
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
   * Human-meaningful name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Human-meaningful name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * A detailed description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A detailed description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * A user-definable description of the availability of this service.
   * Format: free-form, but we expect single words that describe availability,
   * e.g. "NONE", "TESTING", "PREVIEW", "GENERAL", "DEPRECATED", "SHUTDOWN".
   * </pre>
   *
   * <code>string availability = 6;</code>
   *
   * @return The availability.
   */
  java.lang.String getAvailability();
  /**
   *
   *
   * <pre>
   * A user-definable description of the availability of this service.
   * Format: free-form, but we expect single words that describe availability,
   * e.g. "NONE", "TESTING", "PREVIEW", "GENERAL", "DEPRECATED", "SHUTDOWN".
   * </pre>
   *
   * <code>string availability = 6;</code>
   *
   * @return The bytes for availability.
   */
  com.google.protobuf.ByteString getAvailabilityBytes();

  /**
   *
   *
   * <pre>
   * The recommended version of the API.
   * Format: apis/{api}/versions/{version}
   * </pre>
   *
   * <code>string recommended_version = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The recommendedVersion.
   */
  java.lang.String getRecommendedVersion();
  /**
   *
   *
   * <pre>
   * The recommended version of the API.
   * Format: apis/{api}/versions/{version}
   * </pre>
   *
   * <code>string recommended_version = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for recommendedVersion.
   */
  com.google.protobuf.ByteString getRecommendedVersionBytes();

  /**
   *
   *
   * <pre>
   * The recommended deployment of the API.
   * Format: apis/{api}/deployments/{deployment}
   * </pre>
   *
   * <code>string recommended_deployment = 8 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The recommendedDeployment.
   */
  java.lang.String getRecommendedDeployment();
  /**
   *
   *
   * <pre>
   * The recommended deployment of the API.
   * Format: apis/{api}/deployments/{deployment}
   * </pre>
   *
   * <code>string recommended_deployment = 8 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for recommendedDeployment.
   */
  com.google.protobuf.ByteString getRecommendedDeploymentBytes();

  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * "apigeeregistry.googleapis.com/" and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * "apigeeregistry.googleapis.com/" and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * "apigeeregistry.googleapis.com/" and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * "apigeeregistry.googleapis.com/" and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * "apigeeregistry.googleapis.com/" and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 10;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 10;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 10;</code>
   */

  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 10;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);
}
