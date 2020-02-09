import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.WithdrawRulePlanSrv;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.data.modelVo.WithdrawRulePlanListVo;
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
public class TestwWithdrawRulePlanList {
    private static String TOKEN = "";

    @Test
    public void withdrawRulePlanList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            WithdrawRulePlanListVo withdrawRulePlanListVo = new WithdrawRulePlanListVo.Builder(baseInfoVo)
                    .setBusinessId(9371L)
                    .setId(4161L)
                    .setOffset(0)
                    .setSize(10)
                    .build();
            podVirtualAccount.withdrawRulePlanList(withdrawRulePlanListVo, new OnGetResponseListener<List<WithdrawRulePlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRulePlanSrv>> result) {
                    System.out.println(result.getResult().size());
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
    public void withdrawRulePlanList_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            WithdrawRulePlanListVo withdrawRulePlanListVo = new WithdrawRulePlanListVo.Builder(baseInfoVo)
                    .setBusinessId(9371L)
                    .setOffset(0)
                    .setSize(10)
                    .build();
            podVirtualAccount.withdrawRulePlanList(withdrawRulePlanListVo, new OnGetResponseListener<List<WithdrawRulePlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRulePlanSrv>> result) {
                    System.out.println(result.getResult().size());
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
    public void withdrawRulePlanList_RequireParameters_BusinessId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            WithdrawRulePlanListVo withdrawRulePlanListVo = new WithdrawRulePlanListVo.Builder(baseInfoVo)
                    .setId(4161L)
                    .setOffset(0)
                    .setSize(10)
                    .build();
            podVirtualAccount.withdrawRulePlanList(withdrawRulePlanListVo, new OnGetResponseListener<List<WithdrawRulePlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRulePlanSrv>> result) {
                    System.out.println(result.getResult().size());
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
    public void withdrawRulePlanList_RequireParameters_Offset() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            WithdrawRulePlanListVo withdrawRulePlanListVo = new WithdrawRulePlanListVo.Builder(baseInfoVo)
                    .setBusinessId(9371L)
                    .setId(4161L)
                    .setSize(10)
                    .build();
            podVirtualAccount.withdrawRulePlanList(withdrawRulePlanListVo, new OnGetResponseListener<List<WithdrawRulePlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRulePlanSrv>> result) {
                    System.out.println(result.getResult().size());
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
    public void withdrawRulePlanList_RequireParameters_Size() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            WithdrawRulePlanListVo withdrawRulePlanListVo = new WithdrawRulePlanListVo.Builder(baseInfoVo)
                    .setBusinessId(9371L)
                    .setId(4161L)
                    .setOffset(0)
                    .build();
            podVirtualAccount.withdrawRulePlanList(withdrawRulePlanListVo, new OnGetResponseListener<List<WithdrawRulePlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRulePlanSrv>> result) {
                    System.out.println(result.getResult().size());
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
    public void withdrawRulePlanList_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();

        try {
            WithdrawRulePlanListVo withdrawRulePlanListVo = new WithdrawRulePlanListVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.withdrawRulePlanList(withdrawRulePlanListVo, new OnGetResponseListener<List<WithdrawRulePlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<WithdrawRulePlanSrv>> result) {
                    System.out.println(result.getResult().size());
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
