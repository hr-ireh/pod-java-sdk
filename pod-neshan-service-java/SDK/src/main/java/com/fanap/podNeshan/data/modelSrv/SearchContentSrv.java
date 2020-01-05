package com.fanap.podNeshan.data.modelSrv;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */

public class SearchContentSrv {


    private long count;

    private List<ItemSrv> items = null;


    public long getCount() {
        return count;
    }


    public void setCount(long count) {
        this.count = count;
    }


    public List<ItemSrv> getItems() {
        return items;
    }


    public void setItems(List<ItemSrv> items) {
        this.items = items;
    }


}