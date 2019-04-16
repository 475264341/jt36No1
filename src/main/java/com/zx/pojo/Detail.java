package com.zx.pojo;

import java.util.Date;

public class Detail {

  private int id;
  private int invid;
  private String content;
  private String autor;
  private Date createDate;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getInvid() {
    return invid;
  }

  public void setInvid(int invid) {
    this.invid = invid;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
}
