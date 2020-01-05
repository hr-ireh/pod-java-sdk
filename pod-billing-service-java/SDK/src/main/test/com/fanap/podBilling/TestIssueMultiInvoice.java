package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.DelegationInfo;
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

public class TestIssueMultiInvoice {
    private static final String TOKEN = "";
@Test
    public void issueMultiInvoice_AllParameters()  {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("6eb0b95e072e81e5")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        DelegationInfo[] delegationInfo = {new DelegationInfo(1234L, "bb")};
        List<String> voucherHash = new ArrayList<>();
        voucherHash.add("sgdhjddu");
       InvoiceItemVO mainInvoiceItemVo = null;
    try {
        mainInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                .setProductId(0L)
                .setDescription("p1")
                .setQuantity(new BigDecimal(2))
                .setPrice(100L)
                .build();
    } catch (PodException e) {
        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
    }
    List<InvoiceItemVO> mainInvoiceItemVOList = new ArrayList<>();
        mainInvoiceItemVOList.add(mainInvoiceItemVo);
        MainInvoiceVo mainInvoiceVo = new MainInvoiceVo()
                .setGuildCode("ENGINEERING_GUILD")
                .setDescription("hi")
                .setInvoiceItemVOs(mainInvoiceItemVOList);


    InvoiceItemVO subInvoiceItemVo = null;
    try {
        subInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                .setProductId(0L)
                .setDescription("TEST")
                .setQuantity(new BigDecimal(2))
                .setPrice(100L)
                .build();
    } catch (PodException e) {
        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
    }
    List<InvoiceItemVO> SUBInvoiceItemVoList = new ArrayList<>();
        SUBInvoiceItemVoList.add(subInvoiceItemVo);

    SubInvoiceVO subInvoiceVO = null;
    try {
        subInvoiceVO = new SubInvoiceVO.Builder(baseInfoVo)
                .setBusinessId(3123L)
                .setGuildCode("ENGINEERING_GUILD")
                .setInvoiceItemVOs(SUBInvoiceItemVoList)
                .setDescription("ZIR")
                .build();
    } catch (PodException e) {
        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
    }

    List<SubInvoiceVO> subInvoiceVOS = new ArrayList<>();
        subInvoiceVOS.add(subInvoiceVO);

    InvoiceItemVO customerInvoiceItemVo = null;
    try {
        customerInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                .setProductId(0L)
                .setDescription("CO")
                .setQuantity(new BigDecimal(2))
                .setPrice(200L)
                .build();
    } catch (PodException e) {
        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
    }
    List<InvoiceItemVO> customerInvoiceItems = new ArrayList<>();
        customerInvoiceItems.add(customerInvoiceItemVo);
        List<String> hash = new ArrayList<>();
        hash.add("bb");
        List<Long> a = new ArrayList<>();
        a.add(1234L);

        MultiInvoiceDataVo multiInvoiceDataVo = new MultiInvoiceDataVo()
                .setMainInvoice(mainInvoiceVo)
                .setSubInvoices(subInvoiceVOS)
                .setCustomerInvoiceItemVOs(customerInvoiceItems)
//                .setVoucherHashs(voucherHash)
                .setUserId(16849L);
        try {
            IssueMultiInvoiceVo issueMultiInvoiceVo = new IssueMultiInvoiceVo.Builder(baseInfoVo)
                    .setData(multiInvoiceDataVo)
                    .setDelegationInfos(delegationInfo)
//                    .setDelegationHash(hash)
//                    .setDelegatorId(a)
//                    .setScVoucherHash(voucherHash)
                    .build();
            billingService.issueMultiInvoice(issueMultiInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            assertEquals(16849, result.getResult().getUserSrv().getId());
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
    public void issueMultiInvoice_RequiredParameters()  {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("6eb0b95e072e81e5")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        DelegationInfo[] delegationInfo = {new DelegationInfo(1234L, "bb")};
        List<String> voucherHash = new ArrayList<>();
        voucherHash.add("sgdhjddu");
        InvoiceItemVO mainInvoiceItemVo = null;
        try {
            mainInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                    .setProductId(0L)
                    .setDescription("p1")
                    .setQuantity(new BigDecimal(2))
                    .setPrice(100L)
                    .build();
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        List<InvoiceItemVO> mainInvoiceItemVOList = new ArrayList<>();
        mainInvoiceItemVOList.add(mainInvoiceItemVo);
        MainInvoiceVo mainInvoiceVo = new MainInvoiceVo()
                .setGuildCode("ENGINEERING_GUILD")
                .setDescription("hi")
                .setInvoiceItemVOs(mainInvoiceItemVOList);


        InvoiceItemVO subInvoiceItemVo = null;
        try {
            subInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                    .setProductId(0L)
                    .setDescription("TEST")
                    .setQuantity(new BigDecimal(2))
                    .setPrice(100L)
                    .build();
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        List<InvoiceItemVO> SUBInvoiceItemVoList = new ArrayList<>();
        SUBInvoiceItemVoList.add(subInvoiceItemVo);

        SubInvoiceVO subInvoiceVO = null;
        try {
            subInvoiceVO = new SubInvoiceVO.Builder(baseInfoVo)
                    .setBusinessId(3123L)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setInvoiceItemVOs(SUBInvoiceItemVoList)
                    .setDescription("ZIR")
                    .build();
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

        List<SubInvoiceVO> subInvoiceVOS = new ArrayList<>();
        subInvoiceVOS.add(subInvoiceVO);

        InvoiceItemVO customerInvoiceItemVo = null;
        try {
            customerInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                    .setProductId(0L)
                    .setDescription("CO")
                    .setQuantity(new BigDecimal(2))
                    .setPrice(200L)
                    .build();
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        List<InvoiceItemVO> customerInvoiceItems = new ArrayList<>();
        customerInvoiceItems.add(customerInvoiceItemVo);
        List<String> hash = new ArrayList<>();
        hash.add("bb");
        List<Long> a = new ArrayList<>();
        a.add(1234L);

        MultiInvoiceDataVo multiInvoiceDataVo = new MultiInvoiceDataVo()
                .setMainInvoice(mainInvoiceVo)
                .setSubInvoices(subInvoiceVOS)
                .setCustomerInvoiceItemVOs(customerInvoiceItems)
//                .setVoucherHashs(voucherHash)
                .setUserId(16849L);
        try {
            IssueMultiInvoiceVo issueMultiInvoiceVo = new IssueMultiInvoiceVo.Builder(baseInfoVo)
                    .setData(multiInvoiceDataVo)
//                    .setDelegationInfos(delegationInfo)
//                    .setDelegationHash(hash)
//                    .setDelegatorId(a)
//                    .setScVoucherHash(voucherHash)
                    .build();
            billingService.issueMultiInvoice(issueMultiInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            assertEquals(16849, result.getResult().getUserSrv().getId());
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
    public void issueMultiInvoice_NoParameters()  {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()

                .build();

        BillingService billingService = new BillingService();
        try {
            IssueMultiInvoiceVo issueMultiInvoiceVo = new IssueMultiInvoiceVo.Builder(baseInfoVo)
                    .build();
            billingService.issueMultiInvoice(issueMultiInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void issueMultiInvoice_RequiredParameters_Data()  {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("6eb0b95e072e81e5")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        DelegationInfo[] delegationInfo = {new DelegationInfo(1234L, "bb")};
        List<String> voucherHash = new ArrayList<>();
        voucherHash.add("sgdhjddu");
        InvoiceItemVO mainInvoiceItemVo = null;
        try {
            mainInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                    .setProductId(0L)
                    .setDescription("p1")
                    .setQuantity(new BigDecimal(2))
                    .setPrice(100L)
                    .build();
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        List<InvoiceItemVO> mainInvoiceItemVOList = new ArrayList<>();
        mainInvoiceItemVOList.add(mainInvoiceItemVo);
        MainInvoiceVo mainInvoiceVo = new MainInvoiceVo()
                .setGuildCode("ENGINEERING_GUILD")
                .setDescription("hi")
                .setInvoiceItemVOs(mainInvoiceItemVOList);


        InvoiceItemVO subInvoiceItemVo = null;
        try {
            subInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                    .setProductId(0L)
                    .setDescription("TEST")
                    .setQuantity(new BigDecimal(2))
                    .setPrice(100L)
                    .build();
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        List<InvoiceItemVO> SUBInvoiceItemVoList = new ArrayList<>();
        SUBInvoiceItemVoList.add(subInvoiceItemVo);

        SubInvoiceVO subInvoiceVO = null;
        try {
            subInvoiceVO = new SubInvoiceVO.Builder(baseInfoVo)
                    .setBusinessId(3123L)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setInvoiceItemVOs(SUBInvoiceItemVoList)
                    .setDescription("ZIR")
                    .build();
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

        List<SubInvoiceVO> subInvoiceVOS = new ArrayList<>();
        subInvoiceVOS.add(subInvoiceVO);

        InvoiceItemVO customerInvoiceItemVo = null;
        try {
            customerInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                    .setProductId(0L)
                    .setDescription("CO")
                    .setQuantity(new BigDecimal(2))
                    .setPrice(200L)
                    .build();
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        List<InvoiceItemVO> customerInvoiceItems = new ArrayList<>();
        customerInvoiceItems.add(customerInvoiceItemVo);
        List<String> hash = new ArrayList<>();
        hash.add("bb");
        List<Long> a = new ArrayList<>();
        a.add(1234L);

        MultiInvoiceDataVo multiInvoiceDataVo = new MultiInvoiceDataVo()
                .setMainInvoice(mainInvoiceVo)
                .setSubInvoices(subInvoiceVOS)
                .setCustomerInvoiceItemVOs(customerInvoiceItems)
//                .setVoucherHashs(voucherHash)
                .setUserId(16849L);
        try {
            IssueMultiInvoiceVo issueMultiInvoiceVo = new IssueMultiInvoiceVo.Builder(baseInfoVo)
                    .setDelegationInfos(delegationInfo)
                    .build();
            billingService.issueMultiInvoice(issueMultiInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
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
