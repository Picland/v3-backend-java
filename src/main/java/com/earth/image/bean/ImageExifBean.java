package com.earth.image.bean;

import java.time.ZonedDateTime;

public class ImageExifBean {
  private String imageId;

  private String cameraMaker;

  private ZonedDateTime imageDateTime;

  /**
   * Unit: mm
   */
  private float focalLength;

  private String aperture;

  private String whiteBalance;

  private String location;

  private String colorSpace;

  private String caption;

  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public String getCameraMaker() {
    return cameraMaker;
  }

  public void setCameraMaker(String cameraMaker) {
    this.cameraMaker = cameraMaker;
  }

  public ZonedDateTime getImageDateTime() {
    return imageDateTime;
  }

  public void setImageDateTime(ZonedDateTime imageDateTime) {
    this.imageDateTime = imageDateTime;
  }

  public float getFocalLength() {
    return focalLength;
  }

  public void setFocalLength(float focalLength) {
    this.focalLength = focalLength;
  }

  public String getAperture() {
    return aperture;
  }

  public void setAperture(String aperture) {
    this.aperture = aperture;
  }

  public String getWhiteBalance() {
    return whiteBalance;
  }

  public void setWhiteBalance(String whiteBalance) {
    this.whiteBalance = whiteBalance;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getColorSpace() {
    return colorSpace;
  }

  public void setColorSpace(String colorSpace) {
    this.colorSpace = colorSpace;
  }

  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }
}
