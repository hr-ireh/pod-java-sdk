import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.WithdrawRuleForBizSrv;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.data.modelVo.WithdrawRuleListVo;
import com.fanap.podVirtualAccount.enums.EnumTypeCode;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class TestWithdrawRuleList {
    private static String TOKEN = "";

    @Test
    public void withdrawRuleList_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            WithdrawRuleListVo withdrawRuleListVo = new WithdrawRuleListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(10)
                    .build();
            podVirtualAccount.withdrawRuleList(withdrawRuleListVo, new OnGetResponseListener<List<WithdrawRuleForBizSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRuleForBizSrv>> result) {
                    try {
                        assertEquals(false, result.isHasError());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void withdrawRuleList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        EnumTypeCode enumTypeCode = EnumTypeCode.WITHDRAW_RULE_TYPE_AMOUNT;
        try {
            WithdrawRuleListVo withdrawRuleListVo = new WithdrawRuleListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(10)
                    .setTypeCode(enumTypeCode.getValue())
                    .setUserId(7001L)
                    .build();
            podVirtualAccount.withdrawRuleList(withdrawRuleListVo, new OnGetResponseListener<List<WithdrawRuleForBizSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRuleForBizSrv>> result) {
                    try {
                        assertEquals(false, result.isHasError());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
    public void withdrawRuleList_RequiredParameters_Size() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        EnumTypeCode enumTypeCode = EnumTypeCode.WITHDRAW_RULE_TYPE_AMOUNT;
        try {
            WithdrawRuleListVo withdrawRuleListVo = new WithdrawRuleListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setTypeCode(enumTypeCode.getValue())
                    .setUserId(7001L)
                    .build();
            podVirtualAccount.withdrawRuleList(withdrawRuleListVo, new OnGetResponseListener<List<WithdrawRuleForBizSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRuleForBizSrv>> result) {
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void withdrawRuleList_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        EnumTypeCode enumTypeCode = EnumTypeCode.WITHDRAW_RULE_TYPE_AMOUNT;
        try {
            WithdrawRuleListVo withdrawRuleListVo = new WithdrawRuleListVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.withdrawRuleList(withdrawRuleListVo, new OnGetResponseListener<List<WithdrawRuleForBizSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRuleForBizSrv>> result) {
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
}
