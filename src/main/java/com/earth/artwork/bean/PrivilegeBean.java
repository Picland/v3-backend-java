package com.earth.artwork.bean;

public class PrivilegeBean {
  private boolean editable;

  private boolean deletable;

  private boolean addable;

  private boolean isAdmin;

  public boolean isEditable() {
    return editable;
  }

  public void setEditable(boolean editable) {
    this.editable = editable;
  }

  public boolean isDeletable() {
    return deletable;
  }

  public void setDeletable(boolean deletable) {
    this.deletable = deletable;
  }

  public boolean isAddable() {
    return addable;
  }

  public void setAddable(boolean addable) {
    this.addable = addable;
  }

  public boolean isAdmin() {
    return isAdmin;
  }

  public void setAdmin(boolean admin) {
    this.isAdmin = admin;
  }
}
