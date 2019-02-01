package com.earth.artwork.bean;

import com.earth.image.bean.ImageMetaBean;

import java.time.ZonedDateTime;
import java.util.List;

public class ArtworkBean {
  private String id;

  private String title;

  private String description;

  private boolean isFavourite;

  private String authorId;

  private PrivilegeBean privilege;

  private ZonedDateTime createdDateTime;

  private ZonedDateTime lastModifiedDateTime;

  private List<ImageMetaBean> images;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isFavourite() {
    return isFavourite;
  }

  public void setFavourite(boolean favourite) {
    isFavourite = favourite;
  }

  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

  public ZonedDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(ZonedDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public ZonedDateTime getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(ZonedDateTime lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public PrivilegeBean getPrivilege() {
    return privilege;
  }

  public void setPrivilege(PrivilegeBean privilege) {
    this.privilege = privilege;
  }

  public List<ImageMetaBean> getImages() {
    return images;
  }

  public void setImages(List<ImageMetaBean> images) {
    this.images = images;
  }
}
