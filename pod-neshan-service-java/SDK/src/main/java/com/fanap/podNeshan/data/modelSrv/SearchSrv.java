package com.fanap.podNeshan.data.modelSrv;

import com.fanap.podNeshan.util.JsonUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

public class SearchSrv {
    private String result;
    private int statusCode;
    private JSONObject jsonObject;

    public SearchContentSrv getResult() {
        jsonObject = JsonUtil.getJsonObject(result);
        Gson gson = new GsonBuilder().create();
        SearchContentSrv searchContentSrv = gson.fromJson(jsonObject.toString(), SearchContentSrv.class);
        return searchContentSrv;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;

    }

    public void setResult(String result) {
        this.result = result;
    }
}