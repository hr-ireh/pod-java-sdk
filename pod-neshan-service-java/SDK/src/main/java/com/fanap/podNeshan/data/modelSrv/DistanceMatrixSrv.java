package com.fanap.podNeshan.data.modelSrv;

import com.fanap.podNeshan.util.JsonUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class DistanceMatrixSrv {


    private String result;
    private JSONObject jsonObject;

    public DistanceMatrixContentSrv getResult() {
        jsonObject = JsonUtil.getJsonObject(result);
        Gson gson = new GsonBuilder().create();
        DistanceMatrixContentSrv distanceMatrixContentSrv = gson.fromJson(jsonObject.toString(), DistanceMatrixContentSrv.class);
        return distanceMatrixContentSrv;
    }

    public void setResult(String result) {
        this.result = result;
    }


}
