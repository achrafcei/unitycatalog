/*
 * Unity Catalog API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.unitycatalog.server.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.unitycatalog.server.model.VolumeType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VolumeInfo
 */
@JsonPropertyOrder({
  VolumeInfo.JSON_PROPERTY_CATALOG_NAME,
  VolumeInfo.JSON_PROPERTY_SCHEMA_NAME,
  VolumeInfo.JSON_PROPERTY_NAME,
  VolumeInfo.JSON_PROPERTY_COMMENT,
  VolumeInfo.JSON_PROPERTY_CREATED_AT,
  VolumeInfo.JSON_PROPERTY_UPDATED_AT,
  VolumeInfo.JSON_PROPERTY_VOLUME_ID,
  VolumeInfo.JSON_PROPERTY_VOLUME_TYPE,
  VolumeInfo.JSON_PROPERTY_STORAGE_LOCATION,
  VolumeInfo.JSON_PROPERTY_FULL_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class VolumeInfo {
  public static final String JSON_PROPERTY_CATALOG_NAME = "catalog_name";
  private String catalogName;

  public static final String JSON_PROPERTY_SCHEMA_NAME = "schema_name";
  private String schemaName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Long updatedAt;

  public static final String JSON_PROPERTY_VOLUME_ID = "volume_id";
  private String volumeId;

  public static final String JSON_PROPERTY_VOLUME_TYPE = "volume_type";
  private VolumeType volumeType;

  public static final String JSON_PROPERTY_STORAGE_LOCATION = "storage_location";
  private String storageLocation;

  public static final String JSON_PROPERTY_FULL_NAME = "full_name";
  private String fullName;

  public VolumeInfo() {
  }

  public VolumeInfo catalogName(String catalogName) {
    
    this.catalogName = catalogName;
    return this;
  }

   /**
   * The name of the catalog where the schema and the volume are
   * @return catalogName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATALOG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCatalogName() {
    return catalogName;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }


  public VolumeInfo schemaName(String schemaName) {
    
    this.schemaName = schemaName;
    return this;
  }

   /**
   * The name of the schema where the volume is
   * @return schemaName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemaName() {
    return schemaName;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  public VolumeInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the volume
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public VolumeInfo comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * The comment attached to the volume
   * @return comment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public VolumeInfo createdAt(Long createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time at which this volume was created, in epoch milliseconds.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public VolumeInfo updatedAt(Long updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time at which this volume was last modified, in epoch milliseconds.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  public VolumeInfo volumeId(String volumeId) {
    
    this.volumeId = volumeId;
    return this;
  }

   /**
   * Unique identifier for the volume
   * @return volumeId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOLUME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVolumeId() {
    return volumeId;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }


  public VolumeInfo volumeType(VolumeType volumeType) {
    
    this.volumeType = volumeType;
    return this;
  }

   /**
   * Get volumeType
   * @return volumeType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOLUME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VolumeType getVolumeType() {
    return volumeType;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeType(VolumeType volumeType) {
    this.volumeType = volumeType;
  }


  public VolumeInfo storageLocation(String storageLocation) {
    
    this.storageLocation = storageLocation;
    return this;
  }

   /**
   * The storage location of the volume
   * @return storageLocation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStorageLocation() {
    return storageLocation;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
  }


  public VolumeInfo fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of volume, in form of __catalog_name__.__schema_name__.__volume_name__.
   * @return fullName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeInfo volumeInfo = (VolumeInfo) o;
    return Objects.equals(this.catalogName, volumeInfo.catalogName) &&
        Objects.equals(this.schemaName, volumeInfo.schemaName) &&
        Objects.equals(this.name, volumeInfo.name) &&
        Objects.equals(this.comment, volumeInfo.comment) &&
        Objects.equals(this.createdAt, volumeInfo.createdAt) &&
        Objects.equals(this.updatedAt, volumeInfo.updatedAt) &&
        Objects.equals(this.volumeId, volumeInfo.volumeId) &&
        Objects.equals(this.volumeType, volumeInfo.volumeType) &&
        Objects.equals(this.storageLocation, volumeInfo.storageLocation) &&
        Objects.equals(this.fullName, volumeInfo.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, schemaName, name, comment, createdAt, updatedAt, volumeId, volumeType, storageLocation, fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeInfo {\n");
    sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    storageLocation: ").append(toIndentedString(storageLocation)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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

}

