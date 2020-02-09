package com.fanap.podVirtualAccount.data.modelSrv;

import java.io.Serializable;

/**
 * Created by Zahra Golinia on 2/4/2020.
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
