package com.fanap.podVirtualAccount.data.modelSrv;

import java.io.Serializable;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class WithdrawRuleForBizSrv extends WithdrawRuleSrv implements Serializable {
    private UserSrv user;

    public UserSrv getUser() {
        return user;
    }

    public void setUser(UserSrv user) {
        this.user = user;
    }
}
