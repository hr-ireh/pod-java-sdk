package com.fanap.podNeshan.data.modelSrv;

import com.fanap.podNeshan.util.JsonUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class MapMatchingSrv {


    private String result;
    private int statusCode;
    private JSONObject jsonObject;


    public MapMatchingContentSrv getResult() {
        jsonObject = JsonUtil.getJsonObject(result);
        Gson gson = new GsonBuilder().create();
        MapMatchingContentSrv mapMatchingContentSrv = gson.fromJson(jsonObject.toString(), MapMatchingContentSrv.class);
        return mapMatchingContentSrv;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;

    }
}
