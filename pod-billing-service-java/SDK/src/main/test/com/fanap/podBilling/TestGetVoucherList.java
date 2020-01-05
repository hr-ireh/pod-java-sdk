package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.VoucherSrv;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.GetVoucherListVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestGetVoucherList {
    private final String TOKEN = "";

    @Test
    public void getVoucherList_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            GetVoucherListVo getVoucherListVo = new GetVoucherListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
//                    .setActive(true)
//                    .setAmountFrom(0L)
//                    .setType(8)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.getVoucherList(getVoucherListVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    new Thread(() -> {
                        try {
                            assertEquals("بن شارژ اعتبار - لیست محصولات", result.getResult().get(0).getName());
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
    public void getVoucherList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        LocalDate consumDateFrom=LocalDate.of(1398,01,01);
        LocalDate consumDateTo=LocalDate.of(1399,01,01);
        LocalDate expireDateFrom=LocalDate.of(1398,03,03);
        LocalDate expireDateTo=LocalDate.of(1399,01,01);
        List<Long> entityId=new ArrayList<>();
        entityId.add(29989L);
        List<String> guildCodes=new ArrayList<>();
        guildCodes.add("FOOD_GUILD");
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            GetVoucherListVo getVoucherListVo = new GetVoucherListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .setActive(true)
                    .setAmountFrom(0L)
                    .setType(8)
                    .setHashCode("djjdh")
                    .setConsumDateFrom(consumDateFrom)
                    .setAmountTo(1000L)
                    .setConsumDateTo(consumDateTo)
                    .setConsumerId(16849L)
                    .setCurrencyCode("IRR")
                    .setDiscountPercentageFrom(1L)
                    .setDiscountPercentageTo(100L)
                    .setEntityId(entityId)
                    .setExpireDateFrom(expireDateFrom)
                    .setExpireDateTo(expireDateTo)
                    .setGuildCode(guildCodes)
                    .setName("hi")
                    .setUsed(false)
                    .build();
            billingService.getVoucherList(getVoucherListVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    new Thread(() -> {
                        try {
                            assertEquals(0, result.getResult().size());
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
    public void getVoucherList_RequiredParameters_Size() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            GetVoucherListVo getVoucherListVo = new GetVoucherListVo.Builder(baseInfoVo)
                    .setOffset(0)
//                    .setActive(true)
//                    .setAmountFrom(0L)
//                    .setType(8)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.getVoucherList(getVoucherListVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
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
    public void getVoucherList_RequiredParameters_Offset() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            GetVoucherListVo getVoucherListVo = new GetVoucherListVo.Builder(baseInfoVo)
                    .setSize(50)
//                    .setActive(true)
//                    .setAmountFrom(0L)
//                    .setType(8)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.getVoucherList(getVoucherListVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
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
    public void getVoucherList_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        BillingService billingService = new BillingService();
        try {
            GetVoucherListVo getVoucherListVo = new GetVoucherListVo.Builder(baseInfoVo)
                    .build();
            billingService.getVoucherList(getVoucherListVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
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
