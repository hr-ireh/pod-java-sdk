package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.SettlementRequestSrv;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.RequestSettlementByToolVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.enums.EnumToolCode;
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
public class TestRequestSettlementByTool {
    private static final String TOKEN = "";

    @Test
//    @DisplayName("")
    public void requestSettlementByTool_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("fec3970c1eb5a102")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            RequestSettlementByToolVo requestSettlementByToolVo = new RequestSettlementByToolVo.Builder(baseInfoVo)
                    .setAmount(10L)
                    .setToolCode(enumToolCode.getValue())
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setToolId("5022291073725036")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.requestSettlementByTool(requestSettlementByToolVo, new OnGetResponseListener<SettlementRequestSrv>() {
                @Override
                public void onResponse(ResultVo<SettlementRequestSrv> result) {
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
                            assertEquals(56, e.getCode());
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
    public void requestSettlementByTool_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("fec3970c1eb5a102")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            RequestSettlementByToolVo requestSettlementByToolVo = new RequestSettlementByToolVo.Builder(baseInfoVo)
                    .setAmount(10L)
                    .setToolCode(enumToolCode.getValue())
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setToolId("5022291073725036")
                    .setCurrenncyCode("IRR")
                    .setDescription("hi")
                    .setFirstName("zah")
                    .setLastName("gho")
                    .setUniqueId("789")
                    .build();
            billingService.requestSettlementByTool(requestSettlementByToolVo, new OnGetResponseListener<SettlementRequestSrv>() {
                @Override
                public void onResponse(ResultVo<SettlementRequestSrv> result) {
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
                            assertEquals(56, e.getCode());
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
    public void requestSettlementByTool_SomeRequiredParameters_Amount() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("fec3970c1eb5a102")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            RequestSettlementByToolVo requestSettlementByToolVo = new RequestSettlementByToolVo.Builder(baseInfoVo)
                    .setToolCode(enumToolCode.getValue())
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setToolId("5022291073725036")
                    .build();
            billingService.requestSettlementByTool(requestSettlementByToolVo, new OnGetResponseListener<SettlementRequestSrv>() {
                @Override
                public void onResponse(ResultVo<SettlementRequestSrv> result) {
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


    @Test
    //    @DisplayName("")
    public void requestSettlementByTool_SomeRequiredParameters_TooolCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("fec3970c1eb5a102")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            RequestSettlementByToolVo requestSettlementByToolVo = new RequestSettlementByToolVo.Builder(baseInfoVo)
                    .setAmount(10L)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setToolId("5022291073725036")
                    .build();
            billingService.requestSettlementByTool(requestSettlementByToolVo, new OnGetResponseListener<SettlementRequestSrv>() {
                @Override
                public void onResponse(ResultVo<SettlementRequestSrv> result) {
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

    @Test
//    @DisplayName("")
    public void requestSettlementByTool_SomeRequiredParameters_GuildCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("fec3970c1eb5a102")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            RequestSettlementByToolVo requestSettlementByToolVo = new RequestSettlementByToolVo.Builder(baseInfoVo)
                    .setAmount(10L)
                    .setToolCode(enumToolCode.getValue())
                    .setToolId("5022291073725036")
                    .build();
            billingService.requestSettlementByTool(requestSettlementByToolVo, new OnGetResponseListener<SettlementRequestSrv>() {
                @Override
                public void onResponse(ResultVo<SettlementRequestSrv> result) {
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


    @Test
    //    @DisplayName("")
    public void requestSettlementByTool_SomeRequiredParameters_ToolId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("fec3970c1eb5a102")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            RequestSettlementByToolVo requestSettlementByToolVo = new RequestSettlementByToolVo.Builder(baseInfoVo)
                    .setAmount(10L)
                    .setToolCode(enumToolCode.getValue())
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .build();
            billingService.requestSettlementByTool(requestSettlementByToolVo, new OnGetResponseListener<SettlementRequestSrv>() {
                @Override
                public void onResponse(ResultVo<SettlementRequestSrv> result) {
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

    @Test
    //    @DisplayName("")
    public void requestSettlementByTool_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        BillingService billingService = new BillingService();
        EnumToolCode enumToolCode = EnumToolCode.SETTLEMENT_TOOL_CARD;
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            RequestSettlementByToolVo requestSettlementByToolVo = new RequestSettlementByToolVo.Builder(baseInfoVo)
                    .build();
            billingService.requestSettlementByTool(requestSettlementByToolVo, new OnGetResponseListener<SettlementRequestSrv>() {
                @Override
                public void onResponse(ResultVo<SettlementRequestSrv> result) {
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
