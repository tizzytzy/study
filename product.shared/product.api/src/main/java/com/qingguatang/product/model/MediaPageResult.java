package com.qingguatang.product.model;

public class MediaPageResult {

    private int totalItems;
    private int totalPages;
    private int pageSize;
    private int currentPage;

    public MediaPageResult(int totalItems,int totalPages,int pageSize,int currentPage){

        this.totalItems = totalItems;
        this.totalPages = totalPages;
        this.pageSize = pageSize;
        this.currentPage = currentPage;

    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
