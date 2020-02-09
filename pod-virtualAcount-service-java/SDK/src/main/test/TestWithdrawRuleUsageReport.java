import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.WithdrawRuleUsageReportSrv;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.data.modelVo.WithdrawRuleUsageReportVo;
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

public class TestWithdrawRuleUsageReport {

    @Test
    public void withdrawRuleUsageReport_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            WithdrawRuleUsageReportVo withdrawRuleUsageReportVo = new WithdrawRuleUsageReportVo.Builder(baseInfoVo)
                    .setRuleId(2874L)
                    .build();
            podVirtualAccount.withdrawRuleUsageReport(withdrawRuleUsageReportVo, new OnGetResponseListener<WithdrawRuleUsageReportSrv>() {
                @Override
                public void onResponse(ResultVo<WithdrawRuleUsageReportSrv> result) {
                    System.out.println(result.getResult().getRule().getId());
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
    public void withdrawRuleUsageReport_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            WithdrawRuleUsageReportVo withdrawRuleUsageReportVo = new WithdrawRuleUsageReportVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.withdrawRuleUsageReport(withdrawRuleUsageReportVo, new OnGetResponseListener<WithdrawRuleUsageReportSrv>() {
                @Override
                public void onResponse(ResultVo<WithdrawRuleUsageReportSrv> result) {
                    System.out.println(result.getResult().getRule().getId());
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
