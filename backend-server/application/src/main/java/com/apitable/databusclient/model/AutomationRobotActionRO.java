/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.apitable.databusclient.JSON;

/**
 * AutomationRobotActionRO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutomationRobotActionRO {
  public static final String SERIALIZED_NAME_ACTION_ID = "action_id";
  @SerializedName(SERIALIZED_NAME_ACTION_ID)
  private String actionId;

  public static final String SERIALIZED_NAME_ACTION_TYPE_ID = "action_type_id";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE_ID)
  private String actionTypeId;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  public static final String SERIALIZED_NAME_IS_DELETED = "is_deleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_LIMIT_COUNT = "limit_count";
  @SerializedName(SERIALIZED_NAME_LIMIT_COUNT)
  private Long limitCount;

  public static final String SERIALIZED_NAME_PREV_ACTION_ID = "prev_action_id";
  @SerializedName(SERIALIZED_NAME_PREV_ACTION_ID)
  private String prevActionId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public AutomationRobotActionRO() {
  }

  public AutomationRobotActionRO actionId(String actionId) {
    
    this.actionId = actionId;
    return this;
  }

   /**
   * Get actionId
   * @return actionId
  **/
  @javax.annotation.Nullable
  public String getActionId() {
    return actionId;
  }


  public void setActionId(String actionId) {
    this.actionId = actionId;
  }


  public AutomationRobotActionRO actionTypeId(String actionTypeId) {
    
    this.actionTypeId = actionTypeId;
    return this;
  }

   /**
   * Get actionTypeId
   * @return actionTypeId
  **/
  @javax.annotation.Nullable
  public String getActionTypeId() {
    return actionTypeId;
  }


  public void setActionTypeId(String actionTypeId) {
    this.actionTypeId = actionTypeId;
  }


  public AutomationRobotActionRO input(String input) {
    
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @javax.annotation.Nullable
  public String getInput() {
    return input;
  }


  public void setInput(String input) {
    this.input = input;
  }


  public AutomationRobotActionRO isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public AutomationRobotActionRO limitCount(Long limitCount) {
    
    this.limitCount = limitCount;
    return this;
  }

   /**
   * Get limitCount
   * @return limitCount
  **/
  @javax.annotation.Nullable
  public Long getLimitCount() {
    return limitCount;
  }


  public void setLimitCount(Long limitCount) {
    this.limitCount = limitCount;
  }


  public AutomationRobotActionRO prevActionId(String prevActionId) {
    
    this.prevActionId = prevActionId;
    return this;
  }

   /**
   * Get prevActionId
   * @return prevActionId
  **/
  @javax.annotation.Nullable
  public String getPrevActionId() {
    return prevActionId;
  }


  public void setPrevActionId(String prevActionId) {
    this.prevActionId = prevActionId;
  }


  public AutomationRobotActionRO userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * minimum: 0
   * @return userId
  **/
  @javax.annotation.Nonnull
  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationRobotActionRO automationRobotActionRO = (AutomationRobotActionRO) o;
    return Objects.equals(this.actionId, automationRobotActionRO.actionId) &&
        Objects.equals(this.actionTypeId, automationRobotActionRO.actionTypeId) &&
        Objects.equals(this.input, automationRobotActionRO.input) &&
        Objects.equals(this.isDeleted, automationRobotActionRO.isDeleted) &&
        Objects.equals(this.limitCount, automationRobotActionRO.limitCount) &&
        Objects.equals(this.prevActionId, automationRobotActionRO.prevActionId) &&
        Objects.equals(this.userId, automationRobotActionRO.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, actionTypeId, input, isDeleted, limitCount, prevActionId, userId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationRobotActionRO {\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionTypeId: ").append(toIndentedString(actionTypeId)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    limitCount: ").append(toIndentedString(limitCount)).append("\n");
    sb.append("    prevActionId: ").append(toIndentedString(prevActionId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("action_id");
    openapiFields.add("action_type_id");
    openapiFields.add("input");
    openapiFields.add("is_deleted");
    openapiFields.add("limit_count");
    openapiFields.add("prev_action_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AutomationRobotActionRO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutomationRobotActionRO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutomationRobotActionRO is not found in the empty JSON string", AutomationRobotActionRO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutomationRobotActionRO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutomationRobotActionRO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutomationRobotActionRO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action_id") != null && !jsonObj.get("action_id").isJsonNull()) && !jsonObj.get("action_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_id").toString()));
      }
      if ((jsonObj.get("action_type_id") != null && !jsonObj.get("action_type_id").isJsonNull()) && !jsonObj.get("action_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_type_id").toString()));
      }
      if ((jsonObj.get("input") != null && !jsonObj.get("input").isJsonNull()) && !jsonObj.get("input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input").toString()));
      }
      if ((jsonObj.get("prev_action_id") != null && !jsonObj.get("prev_action_id").isJsonNull()) && !jsonObj.get("prev_action_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prev_action_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prev_action_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutomationRobotActionRO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutomationRobotActionRO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutomationRobotActionRO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutomationRobotActionRO.class));

       return (TypeAdapter<T>) new TypeAdapter<AutomationRobotActionRO>() {
           @Override
           public void write(JsonWriter out, AutomationRobotActionRO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutomationRobotActionRO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutomationRobotActionRO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutomationRobotActionRO
  * @throws IOException if the JSON string is invalid with respect to AutomationRobotActionRO
  */
  public static AutomationRobotActionRO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutomationRobotActionRO.class);
  }

 /**
  * Convert an instance of AutomationRobotActionRO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

