/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-02-18 22:11:37 UTC)
 * on 2016-03-26 at 18:50:26 UTC 
 * Modify at your own risk.
 */

package com.adonisarifi.jokebackend.jokeApi.model;

/**
 * Model definition for ListResponsJoks.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the jokeApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListResponsJoks extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MyJokeModel> myJokeModel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean statusi;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<MyJokeModel> getMyJokeModel() {
    return myJokeModel;
  }

  /**
   * @param myJokeModel myJokeModel or {@code null} for none
   */
  public ListResponsJoks setMyJokeModel(java.util.List<MyJokeModel> myJokeModel) {
    this.myJokeModel = myJokeModel;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStatusi() {
    return statusi;
  }

  /**
   * @param statusi statusi or {@code null} for none
   */
  public ListResponsJoks setStatusi(java.lang.Boolean statusi) {
    this.statusi = statusi;
    return this;
  }

  @Override
  public ListResponsJoks set(String fieldName, Object value) {
    return (ListResponsJoks) super.set(fieldName, value);
  }

  @Override
  public ListResponsJoks clone() {
    return (ListResponsJoks) super.clone();
  }

}
