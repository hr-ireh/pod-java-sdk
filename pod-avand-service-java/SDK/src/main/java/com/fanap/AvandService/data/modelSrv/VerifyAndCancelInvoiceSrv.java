package com.fanap.AvandService.data.modelSrv;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by Zahra.Gholinia on 2/4/2020.
 */
public class VerifyAndCancelInvoiceSrv {
    private String result;
    private Header header;
    private long statusCode;
    private JSONObject jsonObject;

    public AvandResult getResult() throws PodException {
        jsonObject = JsonUtil.getJsonObject(result);
        System.out.println(jsonObject.toString());
        ObjectMapper mapper = new ObjectMapper();
        AvandResult avandResult = null;
        try {
            avandResult = mapper.readValue(result, new TypeReference<AvandResult>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (avandResult.getErrorCode() != 0)
            throw PodException.developerException(avandResult.getErrorCode(),
                    avandResult.getMessage());
        return avandResult;
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
