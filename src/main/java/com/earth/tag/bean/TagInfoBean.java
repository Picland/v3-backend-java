package com.earth.tag.bean;

public class TagInfoBean {
  private String tagId;

  private String tagContent;

  private int tagReferenceCount;

  public String getTagId() {
    return tagId;
  }

  public void setTagId(String tagId) {
    this.tagId = tagId;
  }

  public String getTagContent() {
    return tagContent;
  }

  public void setTagContent(String tagContent) {
    this.tagContent = tagContent;
  }

  public int getTagReferenceCount() {
    return tagReferenceCount;
  }

  public void setTagReferenceCount(int tagReferenceCount) {
    this.tagReferenceCount = tagReferenceCount;
  }
}
