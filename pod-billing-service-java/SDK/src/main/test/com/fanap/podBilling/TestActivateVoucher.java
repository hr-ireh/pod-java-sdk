package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.VoucherSrv;
import com.fanap.billingService.data.modelVo.ActivateVoucherVo;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestActivateVoucher {
    private final String TOKEN = "";
@Test
    public void activateVoucher_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            ActivateVoucherVo activateVoucherVo = new ActivateVoucherVo.Builder(baseInfoVo)
                    .setVoucherId(87606L)
                    .build();
            billingService.activateVoucher(activateVoucherVo, new OnGetResponseListener<VoucherSrv>() {
                @Override
                public void onResponse(ResultVo<VoucherSrv> result) {
                    System.out.println(result.getResult().isActive());
                    new Thread(() -> {
                        try {
                            assertEquals(true, result.getResult().isActive());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
           fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }


    }


    @Test
    public void activateVoucher_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        BillingService billingService = new BillingService();
        try {
            ActivateVoucherVo activateVoucherVo = new ActivateVoucherVo.Builder(baseInfoVo)
                    .build();
            billingService.activateVoucher(activateVoucherVo, new OnGetResponseListener<VoucherSrv>() {
                @Override
                public void onResponse(ResultVo<VoucherSrv> result) {
                    System.out.println(result.getResult().isActive());
                    new Thread(() -> {
                        try {
                            assertEquals("بن شارژ اعتبار - لیست محصولات", result.getResult().getName());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }


    }


}
