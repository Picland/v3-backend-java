package com.earth.comment.bean;

import java.time.ZonedDateTime;

public class CommentBean {
  private String commentId;

  private String repliedCommentId;

  /**
   * The id for article, artwork, image etc.
   */
  private String parentId;

  private String ownerUserId;

  private String repliedUserId;

  private String content;

  private ZonedDateTime createdDateTime;

  private ZonedDateTime lastModifiedDateTime;

  private boolean edited;

  private boolean deleted;

  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }

  public String getRepliedCommentId() {
    return repliedCommentId;
  }

  public void setRepliedCommentId(String repliedCommentId) {
    this.repliedCommentId = repliedCommentId;
  }

  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public String getRepliedUserId() {
    return repliedUserId;
  }

  public void setRepliedUserId(String repliedUserId) {
    this.repliedUserId = repliedUserId;
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

  public boolean isEdited() {
    return edited;
  }

  public void setEdited(boolean edited) {
    this.edited = edited;
  }

  public boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(boolean deleted) {
    this.deleted = deleted;
  }
}
