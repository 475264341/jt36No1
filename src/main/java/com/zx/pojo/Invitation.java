package com.zx.pojo;

import java.util.Date;
import java.util.List;

public class Invitation {

  private int id;
  private String title;
  private String summary;
  private String author;
  private Date createDate;

  private List<Detail> detailList;

  public List<Detail> getDetailList() {
    return detailList;
  }

  public void setDetailList(List<Detail> detailList) {
    this.detailList = detailList;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
}
