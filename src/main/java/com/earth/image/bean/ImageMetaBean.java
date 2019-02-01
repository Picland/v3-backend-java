package com.earth.image.bean;

import java.time.ZonedDateTime;

public class ImageMetaBean {
  private String imageId;

  private ZonedDateTime dateTime;

  private String thumbnailPicId;

  private String originalPicId;

  private String compressedPicId;

  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public ZonedDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(ZonedDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public String getThumbnailPicId() {
    return thumbnailPicId;
  }

  public void setThumbnailPicId(String thumbnailPicId) {
    this.thumbnailPicId = thumbnailPicId;
  }

  public String getOriginalPicId() {
    return originalPicId;
  }

  public void setOriginalPicId(String originalPicId) {
    this.originalPicId = originalPicId;
  }

  public String getCompressedPicId() {
    return compressedPicId;
  }

  public void setCompressedPicId(String compressedPicId) {
    this.compressedPicId = compressedPicId;
  }
}
