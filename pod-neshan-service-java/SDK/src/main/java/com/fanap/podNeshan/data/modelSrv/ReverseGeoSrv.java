package com.fanap.podNeshan.data.modelSrv;

import com.fanap.podNeshan.util.JsonUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class ReverseGeoSrv {

    private String result;
    private JSONObject jsonObject;

    public ReverseContentSrv getResult() {
        jsonObject = JsonUtil.getJsonObject(result);
        Gson gson = new GsonBuilder().create();
        ReverseContentSrv reverseContentSrv = gson.fromJson(jsonObject.toString(), ReverseContentSrv.class);
        return reverseContentSrv;
    }

    public void setResult(String result) {
        this.result = result;
    }


}
