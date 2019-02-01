package com.earth.image.bean;

public class PictureBean {
  private String pictureId;

  /**
   * Unit: pixel (px)
   */
  private int height;

  /**
   * Unit: pixel (px)
   */
  private int width;

  /**
   * Unit: byte
   */
  private int size;

  private byte[] content;

  public String getPictureId() {
    return pictureId;
  }

  public void setPictureId(String pictureId) {
    this.pictureId = pictureId;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }
}
