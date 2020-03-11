package com.fanap.podAIPlatform.data.modelSrv;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.IOException;

public class LicensePlateReaderSrv {
    private String result;
    private Header header;
    private int statusCode;
    private JSONObject jsonObject;


    public LicensePlateReaderConyentSrv getResult() throws PodException {
        jsonObject = JsonUtil.getJsonObject(result);
        if (jsonObject.getBoolean("hasError") == true) {
            if (jsonObject.has("statusCode") == true) {
                throw PodException.developerException(jsonObject.getInt("statusCode"), jsonObject.getString("status"));
            } else throw PodException.developerException(statusCode, jsonObject.getString("status"));
        }


        ObjectMapper mapper = new ObjectMapper();
        LicensePlateReaderConyentSrv platformResult = null;
        try {
            platformResult = mapper.readValue(result, new TypeReference<LicensePlateReaderConyentSrv>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return platformResult;
    }


    public void setResult(String result) {
        this.result = result;
    }


    public Header getHeader() {
        return header;
    }


    public void setHeader(Header header) {
        this.header = header;
    }


    public int getStatusCode() {
        return statusCode;
    }


    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


}


