package com.qingguatang.product.param;



public class MediaSearchParam {

    private String accountId;
    private int pageSize;
    private int currentPage;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
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

   private List<Media> list = new ArrayList<Media>();

    public List<Media> getList() {
        return list;
    }

    public void setList(List<Media> list) {
        this.list = list;
    }
}
