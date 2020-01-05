package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelVo.AddAutoSettlementVo;
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


/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class TestAddAutoSettlement {

    @Test
//    @DisplayName("")
    public void addAutoSettlement_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            AddAutoSettlementVo addAutoSettlementVo = new AddAutoSettlementVo.Builder(baseInfoVo)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .build();
            billingService.addAutoSettlement(addAutoSettlementVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                    new Thread(() -> {
                        try {
                            fail();
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
                            assertEquals(155, e.getCode());
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
    //    @DisplayName("")
    public void addAutoSettlement_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("d23eeafbb48949e8944e94576ff78d83")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            AddAutoSettlementVo addAutoSettlementVo = new AddAutoSettlementVo.Builder(baseInfoVo)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setCurrencyCode("USA")
                    .setFirstName("zahra")
                    .setInstant(false)
                    .setLastName("gholi")
                    .setSheba("510570100180013692932101")
                    .build();
            billingService.addAutoSettlement(addAutoSettlementVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                    new Thread(() -> {
                        try {
                            fail();
                            System.out.println(result.getResult());
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
                            assertEquals(222, e.getCode());
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
    //    @DisplayName("")
    public void addAutoSettlement_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            AddAutoSettlementVo addAutoSettlementVo = new AddAutoSettlementVo.Builder(baseInfoVo)
                    .build();
            billingService.addAutoSettlement(addAutoSettlementVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                    new Thread(() -> {
                        try {
                            assertEquals(16849, result.getResult());
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
