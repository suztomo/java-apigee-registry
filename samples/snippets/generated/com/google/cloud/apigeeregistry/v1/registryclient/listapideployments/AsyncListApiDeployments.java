/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.apigeeregistry.v1.samples;

// [START apigeeregistry_v1_generated_registryclient_listapideployments_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.apigeeregistry.v1.ApiDeployment;
import com.google.cloud.apigeeregistry.v1.ApiName;
import com.google.cloud.apigeeregistry.v1.ListApiDeploymentsRequest;
import com.google.cloud.apigeeregistry.v1.RegistryClient;

public class AsyncListApiDeployments {

  public static void main(String[] args) throws Exception {
    asyncListApiDeployments();
  }

  public static void asyncListApiDeployments() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RegistryClient registryClient = RegistryClient.create()) {
      ListApiDeploymentsRequest request =
          ListApiDeploymentsRequest.newBuilder()
              .setParent(ApiName.of("[PROJECT]", "[LOCATION]", "[API]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .build();
      ApiFuture<ApiDeployment> future =
          registryClient.listApiDeploymentsPagedCallable().futureCall(request);
      // Do something.
      for (ApiDeployment element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END apigeeregistry_v1_generated_registryclient_listapideployments_async]
