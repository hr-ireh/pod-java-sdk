package com.fanap.podVirtualAcount.data.modelSrv;

import java.io.Serializable;

/**
 * Created by M.Vahedi on 5/29/2018.
 */
public class TransferToFollowerSrv extends TransferCreditSrv implements Serializable {
    private UserSrv destUser;

    public UserSrv getDestUser() {
        return destUser;
    }

    public void setDestUser(UserSrv destUser) {
        this.destUser = destUser;
    }
}
