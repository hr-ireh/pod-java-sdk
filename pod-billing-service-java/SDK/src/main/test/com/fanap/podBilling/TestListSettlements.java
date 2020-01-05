package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.SettlementRequestSrv;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.ListSettlementsVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.enums.EnumToolCode;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class TestListSettlements {
    private static final String TOKEN = "";

    @Test
//    @DisplayName("")
    public void listSettlements_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            ListSettlementsVo listSettlementsVo = new ListSettlementsVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .build();
            billingService.listSettlements(listSettlementsVo, new OnGetResponseListener<List<SettlementRequestSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SettlementRequestSrv>> result) {
                    new Thread(() -> {
                        try {
                            assertEquals(0, result.getResult().size());
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
//    @DisplayName("")
    public void listSettlements_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
        LocalDate fromDate = LocalDate.of(1398, 01, 01);
        LocalDate toDate = LocalDate.of(1399, 01, 01);
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            ListSettlementsVo listSettlementsVo = new ListSettlementsVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .setCurrencyCode("IRR")
                    .setFirstName("zahra")
                    .setFromAmount(1.1)
                    .setFromDate(fromDate)
//                    .setId(456L)
                    .setLastName("gholi")
                    .setStatusCode("200")
                    .setToAmount(10000.0)
                    .setToDate(toDate)
                    .setToolCode(enumToolCode.getValue())
                    .setToolId("930570100480014027212101")
                    .setUniqueId("789456")
                    .build();
            billingService.listSettlements(listSettlementsVo, new OnGetResponseListener<List<SettlementRequestSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SettlementRequestSrv>> result) {
                    new Thread(() -> {
                        try {
                            assertEquals(0, result.getResult().size());
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
//    @DisplayName("")
    public void listSettlements_SomeRequiredParameters_Size() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            ListSettlementsVo listSettlementsVo = new ListSettlementsVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .build();
            billingService.listSettlements(listSettlementsVo, new OnGetResponseListener<List<SettlementRequestSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SettlementRequestSrv>> result) {
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
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
//    @DisplayName("")
    public void listSettlements_SomeRequiredParameters_Offset() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            ListSettlementsVo listSettlementsVo = new ListSettlementsVo.Builder(baseInfoVo)
                    .setSize(50)
                    .build();
            billingService.listSettlements(listSettlementsVo, new OnGetResponseListener<List<SettlementRequestSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SettlementRequestSrv>> result) {
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
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
//    @DisplayName("")
    public void listSettlements_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            ListSettlementsVo listSettlementsVo = new ListSettlementsVo.Builder(baseInfoVo)
                    .build();
            billingService.listSettlements(listSettlementsVo, new OnGetResponseListener<List<SettlementRequestSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SettlementRequestSrv>> result) {
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
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


}
