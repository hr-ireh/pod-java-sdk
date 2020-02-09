import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.WithdrawRuleSrv;
import com.fanap.podVirtualAccount.data.modelVo.AddWithdrawRulePlanVo;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.enums.EnumTypeCode;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class TestAddWithdrawRulePlan {
    private static String TOKEN = "";

    @Test
    public void addWithdrawRulePlan_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            AddWithdrawRulePlanVo addWithdrawRulePlanVo = new AddWithdrawRulePlanVo.Builder(baseInfoVo)
                    .setMaxAmount(1L)
                    .setMaxCount(1L)
                    .setSubscriptionDays(1)
                    .setTypeCode(EnumTypeCode.WITHDRAW_RULE_TYPE_AMOUNT)
                    .build();
            podVirtualAccount.addWithdrawRulePlan(addWithdrawRulePlanVo, new OnGetResponseListener<WithdrawRuleSrv>() {
                @Override
                public void onResponse(ResultVo<WithdrawRuleSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void addWithdrawRulePlan_RequiredParameters_MaxAmount() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            AddWithdrawRulePlanVo addWithdrawRulePlanVo = new AddWithdrawRulePlanVo.Builder(baseInfoVo)
                    .setMaxCount(1L)
                    .setSubscriptionDays(1)
                    .setTypeCode(EnumTypeCode.WITHDRAW_RULE_TYPE_AMOUNT)
                    .build();
            podVirtualAccount.addWithdrawRulePlan(addWithdrawRulePlanVo, new OnGetResponseListener<WithdrawRuleSrv>() {
                @Override
                public void onResponse(ResultVo<WithdrawRuleSrv> result) {
                    System.out.println(result.getResult().getId());
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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
    @Test
    public void addWithdrawRulePlan_RequiredParameters_MaxCount() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            AddWithdrawRulePlanVo addWithdrawRulePlanVo = new AddWithdrawRulePlanVo.Builder(baseInfoVo)
                    .setMaxAmount(1L)
                    .setSubscriptionDays(1)
                    .setTypeCode(EnumTypeCode.WITHDRAW_RULE_TYPE_AMOUNT)
                    .build();
            podVirtualAccount.addWithdrawRulePlan(addWithdrawRulePlanVo, new OnGetResponseListener<WithdrawRuleSrv>() {
                @Override
                public void onResponse(ResultVo<WithdrawRuleSrv> result) {
                    System.out.println(result.getResult().getId());
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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
    @Test
    public void addWithdrawRulePlan_RequiredParameters_SubscriptionDays() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            AddWithdrawRulePlanVo addWithdrawRulePlanVo = new AddWithdrawRulePlanVo.Builder(baseInfoVo)
                    .setMaxAmount(1L)
                    .setMaxCount(1L)
                    .setTypeCode(EnumTypeCode.WITHDRAW_RULE_TYPE_AMOUNT)
                    .build();
            podVirtualAccount.addWithdrawRulePlan(addWithdrawRulePlanVo, new OnGetResponseListener<WithdrawRuleSrv>() {
                @Override
                public void onResponse(ResultVo<WithdrawRuleSrv> result) {
                    System.out.println(result.getResult().getId());
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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void addWithdrawRulePlan_RequiredParameters_TypeCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            AddWithdrawRulePlanVo addWithdrawRulePlanVo = new AddWithdrawRulePlanVo.Builder(baseInfoVo)
                    .setMaxAmount(1L)
                    .setMaxCount(1L)
                    .setSubscriptionDays(1)
                    .build();
            podVirtualAccount.addWithdrawRulePlan(addWithdrawRulePlanVo, new OnGetResponseListener<WithdrawRuleSrv>() {
                @Override
                public void onResponse(ResultVo<WithdrawRuleSrv> result) {
                    System.out.println(result.getResult().getId());
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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
    @Test
    public void addWithdrawRulePlan_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            AddWithdrawRulePlanVo addWithdrawRulePlanVo = new AddWithdrawRulePlanVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.addWithdrawRulePlan(addWithdrawRulePlanVo, new OnGetResponseListener<WithdrawRuleSrv>() {
                @Override
                public void onResponse(ResultVo<WithdrawRuleSrv> result) {
                    System.out.println(result.getResult().getId());
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
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
