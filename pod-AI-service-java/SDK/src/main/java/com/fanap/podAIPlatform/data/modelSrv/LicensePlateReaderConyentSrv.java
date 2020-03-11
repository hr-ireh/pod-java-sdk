package com.fanap.podAIPlatform.data.modelSrv;

import java.util.List;

public class LicensePlateReaderConyentSrv {

    private boolean hasError;
    private int statusCode;
    private List<ResultPlateReader> result;

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public List<ResultPlateReader> getResult() {
        return result;
    }

    public void setResult(List<ResultPlateReader> result) {
        this.result = result;
    }
}
