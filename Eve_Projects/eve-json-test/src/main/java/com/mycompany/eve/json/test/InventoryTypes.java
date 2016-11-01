
package com.mycompany.eve.json.test;

import java.util.List;

public class InventoryTypes {
    
    private String totalCount_str;
    private int pageCount;
    private List<Item> items;
    private Href next;
    private Href previous;
    private int totalCount;
    private String pageCount_str;

    public String getTotalCount_str() {
        return totalCount_str;
    }

    public void setTotalCount_str(String totalCount_str) {
        this.totalCount_str = totalCount_str;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Href getNext() {
        return next;
    }

    public void setNext(Href next) {
        this.next = next;
    }

    public Href getPrevious() {
        return previous;
    }

    public void setPrevious(Href previous) {
        this.previous = previous;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getPageCount_str() {
        return pageCount_str;
    }

    public void setPageCount_str(String pageCount_str) {
        this.pageCount_str = pageCount_str;
    }

    @Override
    public String toString() {
        return "InventoryTypes{" + "totalCount_str=" + totalCount_str + ", pageCount=" + pageCount + ", items=" + items + ", next=" + next + ", previous=" + previous + ", totalCount=" + totalCount + ", pageCount_str=" + pageCount_str + '}';
    }
    
}
