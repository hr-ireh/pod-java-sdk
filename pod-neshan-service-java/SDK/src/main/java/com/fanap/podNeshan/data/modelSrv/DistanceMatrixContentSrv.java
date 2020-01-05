package com.fanap.podNeshan.data.modelSrv;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class DistanceMatrixContentSrv {


    private String status;
    private List<RowSrv> rows = null;
    private List<String> origin_addresses = null;
    private List<String> destination_addresses = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<RowSrv> getRows() {
        return rows;
    }

    public void setRows(List<RowSrv> rows) {
        this.rows = rows;
    }

    public List<String> getOriginAddresses() {
        return origin_addresses;
    }

    public void setOriginAddresses(List<String> originAddresses) {
        this.origin_addresses = originAddresses;
    }

    public List<String> getDestinationAddresses() {
        return destination_addresses;
    }

    public void setDestinationAddresses(List<String> destinationAddresses) {
        this.destination_addresses = destinationAddresses;
    }


}
