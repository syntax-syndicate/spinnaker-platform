/*
 * Copyright 2018 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.kayenta.judge.service;

import com.netflix.kayenta.canary.results.CanaryJudgeResult;
import com.netflix.kayenta.judge.model.RemoteJudgeRequest;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RemoteJudgeService {

  @POST("judge")
  CanaryJudgeResult judge(@Body RemoteJudgeRequest body);
}
