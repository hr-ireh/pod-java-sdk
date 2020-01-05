package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestReduceMultiInvoiceAndCashOut {
@Test
    public void reduceMultiInvoiceAndCashout_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        ReduceInvoiceSubItemVo mainReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35105L)
                .setDescription("MJH")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> mainReduceInvoiceSubItemVol = new ArrayList<>();
        mainReduceInvoiceSubItemVol.add(mainReduceInvoiceSubItemVo);
    ReduceInvoiceItemVO mainInvoiceVos = null;
    try {
        mainInvoiceVos = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32734L)
                .setReduceInvoiceItemVOs(mainReduceInvoiceSubItemVol)
                .build();
    } catch (PodException e) {
      fail();
    }


    ReduceInvoiceSubItemVo subReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35106L)
                .setDescription("HFHF")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> subReduceInvoiceSubItemVoList = new ArrayList<>();
        subReduceInvoiceSubItemVoList.add(subReduceInvoiceSubItemVo);


    ReduceInvoiceItemVO subReduceInvoiceItemVo = null;
    try {
        subReduceInvoiceItemVo = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32735L)
                .setReduceInvoiceItemVOs(subReduceInvoiceSubItemVoList)
                .build();
    } catch (PodException e) {
        fail();
    }
    List<ReduceInvoiceItemVO> subInvoiceVos = new ArrayList<>();
        subInvoiceVos.add(subReduceInvoiceItemVo);

        ReduceInvoiceSubItemVo customerReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35103L)
                .setDescription("fjhg")
                .setPrice(100L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> customerInvoiceItems = new ArrayList<>();
        customerInvoiceItems.add(customerReduceInvoiceSubItemVo);

        ReduceMultiInvoiceDataVo reduceMultiInvoiceDataVo = new ReduceMultiInvoiceDataVo()
                .setMainInvoice(mainInvoiceVos)
                .setCustomerInvoiceItemVOs(customerInvoiceItems)
                .setSubInvoices(subInvoiceVos);


        try {
            ReduceMultiInvoiceAndCashoutVo reduceMultiInvoiceAndCashoutVo = new ReduceMultiInvoiceAndCashoutVo.Builder(baseInfoVo)
                    .setData(reduceMultiInvoiceDataVo)
                    .setToolCode("SETTLEMENT_TOOL_CARD")
                    .build();
            billingService.reduceMultiInvoiceAndCashout(reduceMultiInvoiceAndCashoutVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
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
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                            assertEquals(32, e.getCode());

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
    public void reduceMultiInvoiceAndCashout_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        ReduceInvoiceSubItemVo mainReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35105L)
                .setDescription("MJH")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> mainReduceInvoiceSubItemVol = new ArrayList<>();
        mainReduceInvoiceSubItemVol.add(mainReduceInvoiceSubItemVo);
        ReduceInvoiceItemVO mainInvoiceVos = null;
        try {
            mainInvoiceVos = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                    .setId(32734L)
                    .setReduceInvoiceItemVOs(mainReduceInvoiceSubItemVol)
                    .build();
        } catch (PodException e) {
            fail();
        }


        ReduceInvoiceSubItemVo subReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35106L)
                .setDescription("HFHF")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> subReduceInvoiceSubItemVoList = new ArrayList<>();
        subReduceInvoiceSubItemVoList.add(subReduceInvoiceSubItemVo);


        ReduceInvoiceItemVO subReduceInvoiceItemVo = null;
        try {
            subReduceInvoiceItemVo = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                    .setId(32735L)
                    .setReduceInvoiceItemVOs(subReduceInvoiceSubItemVoList)
                    .build();
        } catch (PodException e) {
            fail();
        }
        List<ReduceInvoiceItemVO> subInvoiceVos = new ArrayList<>();
        subInvoiceVos.add(subReduceInvoiceItemVo);

        ReduceInvoiceSubItemVo customerReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35103L)
                .setDescription("fjhg")
                .setPrice(100L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> customerInvoiceItems = new ArrayList<>();
        customerInvoiceItems.add(customerReduceInvoiceSubItemVo);

        ReduceMultiInvoiceDataVo reduceMultiInvoiceDataVo = new ReduceMultiInvoiceDataVo()
                .setMainInvoice(mainInvoiceVos)
                .setCustomerInvoiceItemVOs(customerInvoiceItems)
                .setSubInvoices(subInvoiceVos);


        try {
            ReduceMultiInvoiceAndCashoutVo reduceMultiInvoiceAndCashoutVo = new ReduceMultiInvoiceAndCashoutVo.Builder(baseInfoVo)
                    .setData(reduceMultiInvoiceDataVo)
                    .build();
            billingService.reduceMultiInvoiceAndCashout(reduceMultiInvoiceAndCashoutVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
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
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                            assertEquals(32, e.getCode());

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
    public void reduceMultiInvoiceAndCashout_RequiredParameters_Data() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        ReduceInvoiceSubItemVo mainReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35105L)
                .setDescription("MJH")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> mainReduceInvoiceSubItemVol = new ArrayList<>();
        mainReduceInvoiceSubItemVol.add(mainReduceInvoiceSubItemVo);
        ReduceInvoiceItemVO mainInvoiceVos = null;
        try {
            mainInvoiceVos = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                    .setId(32734L)
                    .setReduceInvoiceItemVOs(mainReduceInvoiceSubItemVol)
                    .build();
        } catch (PodException e) {
            fail();
        }


        ReduceInvoiceSubItemVo subReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35106L)
                .setDescription("HFHF")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> subReduceInvoiceSubItemVoList = new ArrayList<>();
        subReduceInvoiceSubItemVoList.add(subReduceInvoiceSubItemVo);


        ReduceInvoiceItemVO subReduceInvoiceItemVo = null;
        try {
            subReduceInvoiceItemVo = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                    .setId(32735L)
                    .setReduceInvoiceItemVOs(subReduceInvoiceSubItemVoList)
                    .build();
        } catch (PodException e) {
            fail();
        }
        List<ReduceInvoiceItemVO> subInvoiceVos = new ArrayList<>();
        subInvoiceVos.add(subReduceInvoiceItemVo);

        ReduceInvoiceSubItemVo customerReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35103L)
                .setDescription("fjhg")
                .setPrice(100L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> customerInvoiceItems = new ArrayList<>();
        customerInvoiceItems.add(customerReduceInvoiceSubItemVo);

        ReduceMultiInvoiceDataVo reduceMultiInvoiceDataVo = new ReduceMultiInvoiceDataVo()
                .setMainInvoice(mainInvoiceVos)
                .setCustomerInvoiceItemVOs(customerInvoiceItems)
                .setSubInvoices(subInvoiceVos);


        try {
            ReduceMultiInvoiceAndCashoutVo reduceMultiInvoiceAndCashoutVo = new ReduceMultiInvoiceAndCashoutVo.Builder(baseInfoVo)
                    .setToolCode("SETTLEMENT_TOOL_CARD")
                    .build();
            billingService.reduceMultiInvoiceAndCashout(reduceMultiInvoiceAndCashoutVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
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
    public void reduceMultiInvoiceAndCashout_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
        try {
            ReduceMultiInvoiceAndCashoutVo reduceMultiInvoiceAndCashoutVo = new ReduceMultiInvoiceAndCashoutVo.Builder(baseInfoVo)
                    .build();
            billingService.reduceMultiInvoiceAndCashout(reduceMultiInvoiceAndCashoutVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
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
