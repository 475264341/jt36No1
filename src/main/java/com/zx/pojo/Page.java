package com.zx.pojo;

import java.util.List;

//分页查询
public class Page<T> {
    //当前页
    private int currentPage;
    //页容量
    private int pageSaze;
    //总记录数
    private int pageConut;
    //总页数
    private int pageSum;
    //页内数据
    private List<T> pageList;

    public Page(int currentPage, int pageSaze, int pageConut, int pageSum, List<T> pageList) {
        this.currentPage = currentPage;
        this.pageSaze = pageSaze;
        this.pageConut = pageConut;
        this.pageSum = pageSum;
        this.pageList = pageList;
    }

    public Page() {
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSaze() {
        return pageSaze;
    }

    public void setPageSaze(int pageSaze) {
        this.pageSaze = pageSaze;
    }

    public int getPageConut() {
        return pageConut;
    }

    public void setPageConut(int pageConut) {
        this.pageConut = pageConut;
    }

    public int getPageSum() {
        return pageSum;
    }

    public void setPageSum(int pageSum) {
        this.pageSum = pageSum;
    }

    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }
}
