package com.fanap.podAIPlatform.data.modelSrv;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

import java.io.IOException;

public class NLUGetBalanceSrv {

    private String result;
    private Header header;
    private long statusCode;
    private JSONObject jsonObject;


    public AIPlatformResult<NLUGetBalanceContentSrv> getResult() throws PodException {
        jsonObject = JsonUtil.getJsonObject(result);
        ObjectMapper mapper = new ObjectMapper();
        AIPlatformResult<NLUGetBalanceContentSrv> platformResult = null;
        try {
            platformResult = mapper.readValue(result, new TypeReference<AIPlatformResult<NLUGetBalanceContentSrv>>() {
            });
            if (platformResult.getHasError())
                throw PodException.developerException(platformResult.getStatusCode(), platformResult.getStatusMessage());
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


    public long getStatusCode() {
        return statusCode;
    }


    public void setStatusCode(long statusCode) {
        this.statusCode = statusCode;
    }


}
