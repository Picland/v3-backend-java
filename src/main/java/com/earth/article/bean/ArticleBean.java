package com.earth.article.bean;

import java.time.ZonedDateTime;
import java.util.List;

public class ArticleBean {
  private String id;

  private String title;

  private String author;

  private ZonedDateTime createdDateTime;

  private ZonedDateTime lastModifiedDateTime;

  private List<String> tags;

  private List<String> commentIds;

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

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
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

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public List<String> getCommentIds() {
    return commentIds;
  }

  public void setCommentIds(List<String> commentIds) {
    this.commentIds = commentIds;
  }
}
