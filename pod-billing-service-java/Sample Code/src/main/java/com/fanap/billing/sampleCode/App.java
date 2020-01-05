package com.fanap.billing.sampleCode;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.*;
import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.enums.EnumFileStatusCode;
import com.fanap.billingService.enums.EnumToolCode;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.enums.Enum_Server_type_Percent;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.DelegationInfo;
import com.fanap.billingService.util.OnGetResponseListener;
import com.fanap.billingService.util.Voucher;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zahra Gholinia on 10/9/2019.
 */

public class
App {

    private static final String TOKEN = "";
    private static String OTT = "a0e025eebe2e658c";
    private static String RIDERECT_URI = "https://www.google.com/";
    private static String SAMPLE_GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    public static void main(String[] args) throws PodException, IOException {
        ott();
//        issueInvoice();
//        createPreInvoice();
//        getInvoiceList();
//        getInvoiceListByMetadata();
//        getInvoiceListAsFile();
//        cancelInvoice();
//        verifyAndCloseInvoice();
//        closeInvoice();
//        getInvoicePaymentLink();
//        payInvoice();
//        payInvoiceByCredit();
//        sendInvoicePaymentSMS();
//        payInvoiceInFuture();
//        payInvoiceByInvoice();
//        payAnyInvoiceByCredit();
//        payInvoiceByUniqueNumber();
//        issueMultiInvoice();
//        reduceMultiInvoice();
        reduceMultiInvoiceAndCashout();
//        defineCreditVoucher();
//        defineDiscountAmountVoucher();
//        defineDiscountPercentageVoucher();
//        deactivateVoucher();
//        activateVoucher();
//        getVoucherList();
        defineDirectWithdraw();
//        updateDirectWithdraw();
        directWithdrawList();
//        revokeDirectWithdraw();
//        getExportList();
//        requestGuildSettlement();
//        requestWalletSettlement();
//        requestSettlementByTool();
//        listSettlements();
//        addAutoSettlement();
//        removeAutoSettlement();
//        verifyInvoice();
//       getPayInvoiceByWalletLink();
//        reduceInvoice();
    }

    private static void sendInvoicePaymentSMS() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            SendInvoicePaymentSmsVo sendInvoicePaymentSMSVo = new SendInvoicePaymentSmsVo.Builder(baseInfoVo)
                    .setInvoiceId(31596L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            billingService.sendInvoicePaymentSMS(sendInvoicePaymentSMSVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void payInvoiceByCredit() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("93bd0bf8e31144cb")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");
//        DelegationInfo[] delegationInfo ={new DelegationInfo(1234L,"bb")};

        try {
            PayInvoiceByCreditVo payInvoiceByCreditVo = new PayInvoiceByCreditVo.Builder(baseInfoVo)
                    .setInvoiceId(6901422L)
//                    .setDelegationInfos(delegationInfo)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            billingService.payInvoiceByCredit(payInvoiceByCreditVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void payAnyInvoiceByCredit() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("b7ada5e256d1b9d7")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        DelegationInfo[] delegationInfo ={new DelegationInfo(1234L,"bb")};
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            PayAnyInvoiceByCreditVo payAnyInvoiceByCreditVo = new PayAnyInvoiceByCreditVo.Builder(baseInfoVo)
                    .setInvoiceId(31580L)
                    .setWallet("PODLAND_WALLET")
//                    .setDelegationInfos(delegationInfo)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            billingService.payAnyInvoiceByCredit(payAnyInvoiceByCreditVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void payInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            PayInvoiceVo payInvoiceVo = new PayInvoiceVo.Builder(baseInfoVo)
                    .setInvoiceId(5007913L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            billingService.payInvoice(payInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getInvoicePaymentLink() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoicePaymentLinkVo getInvoicePaymentLinkVo = new GetInvoicePaymentLinkVo.Builder(baseInfoVo)
                    .setInvoiceId(3581653L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            billingService.getInvoicePaymentLink(getInvoicePaymentLinkVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void closeInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            CloseInvoiceVo closeInvoiceVo = new CloseInvoiceVo.Builder(baseInfoVo)
                    .setId(38255L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            billingService.closeInvoice(closeInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void cancelInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            CancelInvoiceVo cancelInvoiceVo = new CancelInvoiceVo.Builder(baseInfoVo)
                    .setId(3581653L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            billingService.cancelInvoice(cancelInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void verifyAndCloseInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            VerifyAndCloseInvoiceVo verifyAndCloseInvoiceVo = new VerifyAndCloseInvoiceVo.Builder(baseInfoVo)
                    .setId(38255L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            billingService.verifyAndCloseInvoice(verifyAndCloseInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void getInvoiceListAsFile() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoiceListAsFileVo getInvoiceListAsFileVo = new GetInvoiceListAsFileVo.Builder(baseInfoVo)
                    .setLastNRows(10L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            billingService.getInvoiceListAsFile(getInvoiceListAsFileVo, new OnGetResponseListener<ExportServiceSrv>() {
                @Override
                public void onResponse(ResultVo<ExportServiceSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void getInvoiceListByMetadata() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoiceListByMetadataVo getInvoiceListByMetadataVo = new GetInvoiceListByMetadataVo.Builder(baseInfoVo)
//                   .setScVoucherHash(scVoucherHashs)
                    .setMetaQuery("{\n" +
                            "  \"field\":\"name\",\n" +
                            "  \"is\":\"ali\"}")
                    .build();
            billingService.getInvoiceListByMetadata(getInvoiceListByMetadataVo,
                    new OnGetResponseListener<List<InvoiceSrv>>() {
                        @Override
                        public void onResponse(ResultVo<List<InvoiceSrv>> result) {
                            System.out.println(result.getResult());
                        }
                        @Override
                        public void onFailed(PodException e) {
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        }
                    });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void getInvoiceList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            GetInvoiceListVo getInvoiceListVo = new GetInvoiceListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(10)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.getInvoiceList(getInvoiceListVo, new OnGetResponseListener<List<InvoiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<InvoiceSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void createPreInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("df4e8ee063c209cc")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
        List<ProductInfo> productInfos = new ArrayList<>();
        ProductInfo productInfo = new ProductInfo();
        productInfo
                .setProductId(0L)
                .setPrice(new BigDecimal(1200))
                .setQuantity(new BigDecimal(3))
                .setProductDescription("test");
        productInfos.add(productInfo);

        try {
            final CreatePreInvoiceVo createPreInvoiceVo = new CreatePreInvoiceVo.Builder(baseInfoVo)
                    .setRedirectURL(RIDERECT_URI)
                    .setUserId(1468849L)
                    .setProductInfos(productInfos)
                    .setGuildCode("TOILETRIES_GUILD")
                    .setToken("e801898dced840248b0325facb863d8b")
                    .build();

            billingService.createPreInvoice(createPreInvoiceVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    LinkSrv linkSrv = new LinkSrv();
                    try {
                        linkSrv = createPreInvoiceVo.getLink(result.getResult());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
                    System.out.println(linkSrv.getRedirectUrl());

                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void ott() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            OttVo ottVo = new OttVo.Builder(baseInfoVo)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.ott(ottVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getOtt());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void issueInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("3841063b35143d82")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        List<EventRemindersContent> eventRemindersContentList = new ArrayList<>();
        EventRemindersContent eventRemindersContent = new EventRemindersContent();
        eventRemindersContent.setId(1L);
        eventRemindersContent.setAlarmTime(1564554212000L);
        eventRemindersContent.setAlarmType("Email");
        eventRemindersContentList.add(eventRemindersContent);
        List<ProductInfo> productInfos = new ArrayList<>();
        ProductInfo productInfo = new ProductInfo();
        productInfo
                .setProductId(0L)
                .setPrice(new BigDecimal(1))
                .setQuantity(new BigDecimal(1))
                .setProductDescription("test");
        productInfos.add(productInfo);
        List<String> reminders = new ArrayList<>();
        reminders.add("{\"id\":1,\"alarmTime\":1564554212000,\"alarmType\":\"Email\"}");
        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .setProductInfos(productInfos)
                    .setUserId(16849L)
                    .setGuildCode("ENGINEERING_GUILD")
                    .setEventTitle("قلی نیا")
                    .setHasEvent(true)
//                    .setBillNumber("12")
                    .setEventReminders(reminders)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void payInvoiceInFuture() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt(OTT)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");


        try {
            PayInvoiceInFutureVo payInvoiceInFutureVo = new PayInvoiceInFutureVo.Builder(baseInfoVo)
                    .setDate("1398/07/05")
                    .setInvoiceId(31607L)
                    .setGuildCode("ENGINEERING_GUILD")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.payInvoiceInFuture(payInvoiceInFutureVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void payInvoiceByInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            PayInvoiceByInvoiceVo payInvoiceByInvoiceVo = new PayInvoiceByInvoiceVo.Builder(baseInfoVo)
                    .setCreditorInvoiceId(32476L)
                    .setDebtorInvoiceId(32479L)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.payInvoiceByInvoice(payInvoiceByInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }


                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static String payInvoiceByUniqueNumber() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        try {
            PayInvoiceByUniqueNumberVo payInvoiceByUniqueNumberVo = new PayInvoiceByUniqueNumberVo.Builder(baseInfoVo)
                    .setUniqueNumber("3dc9575c7f860ab4")
                    .setGateway("PEP")
                    .setRedirectUri("https://www.google.com/")
                    .build();
            return payInvoiceByUniqueNumberVo.getLink();

        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        return null;

    }

    private static void issueMultiInvoice() throws PodException {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
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
        InvoiceItemVO mainInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                .setProductId(0L)
                .setDescription("p1")
                .setQuantity(new BigDecimal(2))
                .setPrice(100L)
                .build();
        List<InvoiceItemVO> mainInvoiceItemVOList = new ArrayList<>();
        mainInvoiceItemVOList.add(mainInvoiceItemVo);
        MainInvoiceVo mainInvoiceVo = new MainInvoiceVo()
                .setGuildCode("TOILETRIES_GUILD")
                .setDescription("hi")
                .setInvoiceItemVOs(mainInvoiceItemVOList);


        InvoiceItemVO subInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                .setProductId(0L)
                .setDescription("TEST")
                .setQuantity(new BigDecimal(2))
                .setPrice(100L)
                .build();
        List<InvoiceItemVO> SUBInvoiceItemVoList = new ArrayList<>();
        SUBInvoiceItemVoList.add(subInvoiceItemVo);

        SubInvoiceVO subInvoiceVO = new SubInvoiceVO.Builder(baseInfoVo)
                .setBusinessId(3612L)
                .setGuildCode("TOILETRIES_GUILD")
                .setInvoiceItemVOs(SUBInvoiceItemVoList)
                .setDescription("ZIR")
                .build();

        List<SubInvoiceVO> subInvoiceVOS = new ArrayList<>();
        subInvoiceVOS.add(subInvoiceVO);

        InvoiceItemVO customerInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                .setProductId(0L)
                .setDescription("CO")
                .setQuantity(new BigDecimal(2))
                .setPrice(200L)
                .build();
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
                .setUserId(1468849L);
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
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void reduceMultiInvoice() throws PodException {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        ReduceInvoiceSubItemVo mainReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(34881L)
                .setDescription("JJ")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> mainReduceInvoiceSubItemVos = new ArrayList<>();
        mainReduceInvoiceSubItemVos.add(mainReduceInvoiceSubItemVo);

        ReduceInvoiceItemVO mainInvoiceVos = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32514L)
                .setReduceInvoiceItemVOs(mainReduceInvoiceSubItemVos)
                .build();

        ReduceInvoiceSubItemVo subReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(32515L)
                .setDescription("jioj")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> subrReduceInvoiceSubItemVos = new ArrayList<>();
        subrReduceInvoiceSubItemVos.add(subReduceInvoiceSubItemVo);


        ReduceInvoiceItemVO subReduceInvoiceItemVo = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32515L)
                .setReduceInvoiceItemVOs(subrReduceInvoiceSubItemVos)
                .build();

        List<ReduceInvoiceItemVO> subReduceInvoiceItemVos = new ArrayList<>();
        subReduceInvoiceItemVos.add(subReduceInvoiceItemVo);

        ReduceInvoiceSubItemVo customerreduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(34879L)
                .setDescription("DFDF")
                .setPrice(100L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> customerInvoiceItems = new ArrayList<>();
        customerInvoiceItems.add(customerreduceInvoiceSubItemVo);


        ReduceMultiInvoiceDataVo reduceMultiInvoiceDataVo = new ReduceMultiInvoiceDataVo()
                .setMainInvoice(mainInvoiceVos)
                .setSubInvoices(subReduceInvoiceItemVos)
                .setCustomerInvoiceItemVOs(customerInvoiceItems);
        try {
            ReduceMultiInvoiceVo reduceMultiInvoiceVo = new ReduceMultiInvoiceVo.Builder(baseInfoVo)
                    .setData(reduceMultiInvoiceDataVo)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.reduceMultiInvoice(reduceMultiInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }


    private static void reduceMultiInvoiceAndCashout() throws PodException {
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
        ReduceInvoiceItemVO mainInvoiceVos = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32734L)
                .setReduceInvoiceItemVOs(mainReduceInvoiceSubItemVol)
                .build();


        ReduceInvoiceSubItemVo subReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35106L)
                .setDescription("HFHF")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> subReduceInvoiceSubItemVoList = new ArrayList<>();
        subReduceInvoiceSubItemVoList.add(subReduceInvoiceSubItemVo);


        ReduceInvoiceItemVO subReduceInvoiceItemVo = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32735L)
                .setReduceInvoiceItemVOs(subReduceInvoiceSubItemVoList)
                .build();
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
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.reduceMultiInvoiceAndCashout(reduceMultiInvoiceAndCashoutVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void defineCreditVoucher() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");
        try {
            DefineCreditVoucherVo defineCreditVoucherVo = new DefineCreditVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setExpireDate("1400/12/01")
                    .setVouchers(vouchers)
//                    .setLimitedConsumerId(16849L)
//                    .setCurrencyCode("IIR")
//                    .setHashCode(hashs)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineCreditVoucher(defineCreditVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0));
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void defineDiscountAmountVoucher() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        List<Long> entityIds = new ArrayList<>();
        entityIds.add(29990L);
        entityIds.add(29989L);
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");


        try {
            DefineDiscountAmountVoucherVo defineDiscountAmountVoucherVo = new DefineDiscountAmountVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("GAME_OWNER_GUILD")
                    .setExpireDate("1400/12/01")
                    .setVouchers(vouchers)
//                    .setEntityId(entityIds)
//                    .setLimitedConsumerId(16849L)
//                    .setCurrencyCode("IIR")
//                    .setHashCode(hashs)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDiscountAmountVoucher(defineDiscountAmountVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void defineDiscountPercentageVoucher() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        List<Long> entityIds = new ArrayList<>();
        entityIds.add(29990L);
        entityIds.add(29989L);
        List<Integer> discountPercentages = new ArrayList<>();
        discountPercentages.add(35);
        Voucher[] vouchers = {new Voucher(2, 100L, "بن شارژ اعتبار - لیست محصولات", "توضیحات")};
        Enum_Server_type_Percent typePercent = Enum_Server_type_Percent.eight;
        List<String> hashs = new ArrayList<>();
        hashs.add("pod_land");


        try {
            DefineDiscountPercentageVoucherVo defineDiscountPercentageVoucherVo = new DefineDiscountPercentageVoucherVo.Builder(baseInfoVo)
                    .setGuildCode("GAME_OWNER_GUILD")
                    .setExpireDate("1400/12/01")
                    .setVouchers(vouchers)
                    .setType(typePercent)
                    .setDiscountPercentage(discountPercentages)
//                    .setEntityId(entityIds)
//                    .setLimitedConsumerId(16849L)
//                    .setCurrencyCode("IIR")
//                    .setHashCode(hashs)
//                   .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDiscountPercentageVoucher(defineDiscountPercentageVoucherVo, new OnGetResponseListener<List<VoucherSrv>>() {
                @Override
                public void onResponse(ResultVo<List<VoucherSrv>> result) {
                    System.out.println(result.getResult().get(0).getHash());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void applyVoucher() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("745ca2da8203263b")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");

        List<String> voucherHashs = new ArrayList<>();
        voucherHashs.add("YELZF7WUHRLD");


        try {
            ApplyVoucherVo applyVoucherVo = new ApplyVoucherVo.Builder(baseInfoVo)
                    .setInvoiceId(37445L)
                    .setVoucherHash(voucherHashs)
//                    .setPreview()
//                    .setScVoucherHash(scVoucherHashs)

                    .build();
            billingService.applyVoucher(applyVoucherVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getDescription());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void deactivateVoucher() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();

//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");


        try {
            DeactivateVoucherVo deactivateVoucherVo = new DeactivateVoucherVo.Builder(baseInfoVo)
                    .setVoucherId(87606L)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.deactivateVoucher(deactivateVoucherVo, new OnGetResponseListener<VoucherSrv>() {
                @Override
                public void onResponse(ResultVo<VoucherSrv> result) {
                    System.out.println(result.getResult().isActive());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void activateVoucher() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");

        try {
            ActivateVoucherVo activateVoucherVo = new ActivateVoucherVo.Builder(baseInfoVo)
                    .setVoucherId(87606L)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.activateVoucher(activateVoucherVo, new OnGetResponseListener<VoucherSrv>() {
                @Override
                public void onResponse(ResultVo<VoucherSrv> result) {
                    System.out.println(result.getResult().isActive());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }


    }

    private static void getVoucherList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
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
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void defineDirectWithdraw() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");


        try {
            DefineDirectWithdrawVo defineDirectWithdrawVo = new DefineDirectWithdrawVo.Builder(baseInfoVo)
                    .setUsername("zahra")
                    .setPrivateKey("")
                    .setDepositNumber("13692932")
                    .setOnDemand(true)
                    .setMinAmount(10000L)
                    .setMaxAmount(10000000L)
                    .setWallet("PODLAND_WALLET")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.defineDirectWithdraw(defineDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void updateDirectWithdraw() throws IOException {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        File xmlFile = new File("info.xml");

        try {
            UpdateDirectWithdrawVo updateDirectWithdrawVo = new UpdateDirectWithdrawVo.Builder(baseInfoVo)
                    .setId(21L)
                    .setUsername("zahraz")
                    .setPrivateKey(xmlFile)
//                    .setPrivateKey("<RSAKeyValue><Modulus>p432JnQ+HxV2jzFv+i1bG3mEBoCrca0BcRiPBIjKJ+ay3IVVEx71C9IhTdIm1vnzzxufmpU5HA3IzUuo+YfVjybn6aZp78AjH2BInQyl43NNVGZyLBJ0YXnHKaZuWBlxnW25tzUshlJtphDHuHxaXDkuccKc0ze0BQjQ98/bBL0=</Modulus><Exponent>AQAB</Exponent><P>18o6JZPz6ftCukdjfYUfAlr5kUQuGE6aYVF7md493vbyx30FF5Js/8EstoHVXyI82BLm8UkSG0C8PMPKNIRJzw==</P><Q>xsbF16w14Foff1MXcuVW8jfZKbMKTdDpMEfzK8jQNROND1B3uLfxmFCLI3/SVuRYfPd65psxIxYn3V5Imq1Hsw==</Q><DP>cl0F9hZ0hcQZODpPex2LMqdebuOwfkdiQEN7+y8yoTFFt/4FLdn3lJAfj1Y97B5sGqPh62yrgPANEzM8vhqCNw==</DP><DQ>JzCfZwMr6By8owTF1cBDoSPDrAYBnQ/4Oa2l0tcXva8qG3/Y6tFRT59pn0kfNkR08cZ1M6wbRviiSXHCTMSnIw==</DQ><InverseQ>KXUY0Rtae0YgJ/QdZ6+AkvzuyYDohzRmrzY8AHgDUnNbYN5kzdsEAPC1fhkScPAA7MH420Fl2FH9V4f9I04yFg==</InverseQ><D>H2c4+i4RMow4Q1A1t4Lmr3iP6RQWjeCqA4Nh0qy8jsvrO+91aXcE4GlKuqYnh2Ujb+6ydCuBn6NpvihvDA2MVdF20KZW4PZX0Bq+yj/WV4hH9mOoUKE86rZIU90rHNF0aRRPRAaCaIXCExyK9LvnGcDKjX0liD5pWPHDL8J2/9U=</D></RSAKeyValue>")
                    .setDepositNumber("13692932")
                    .setOnDemand(true)
                    .setMinAmount(10000L)
                    .setMaxAmount(10000000L)
                    .setWallet("PODLAND_WALLET")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.updateDirectWithdraw(updateDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
                    System.out.println(result.getResult().getUsername());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void directWithdrawList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");


        try {
            DirectWithdrawListVo directWithdrawListVo = new DirectWithdrawListVo.Builder(baseInfoVo)
                    .setWallet("PODLAND_WALLET")
                    .setOffset(0)
                    .setSize(50)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.directWithdrawList(directWithdrawListVo, new OnGetResponseListener<List<DirectWithdrawSrv>>() {
                @Override
                public void onResponse(ResultVo<List<DirectWithdrawSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

//


    private static void revokeDirectWithdraw() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            RevokeDirectWithdrawVo revokeDirectWithdrawVo = new RevokeDirectWithdrawVo.Builder(baseInfoVo)
                    .setId(21L)
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.revokeDirectWithdraw(revokeDirectWithdrawVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void getExportList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
        EnumFileStatusCode enumFileStatusCode = EnumFileStatusCode.EXPORT_SERVICE_STATUS_SUCCESSFUL;

//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            final GetExportListVo getExportListVo = new GetExportListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(50)
                    .setStatusCode(enumFileStatusCode.getValue())
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.getExportList(getExportListVo, new OnGetResponseListener<List<ExportServiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ExportServiceSrv>> result) {
                    LinkSrv linkSrv = new LinkSrv();
                    linkSrv = getExportListVo.getLink(result.getResult().get(0).getResultFile().getId(), result.getResult().get(0).getResultFile().getHashCode());
                    System.out.println(linkSrv.getRedirectUrl());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void requestGuildSettlement() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("87e476936558924d")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            RequestGuildSettlementVo requestGuildSettlementVo = new RequestGuildSettlementVo.Builder(baseInfoVo)
                    .setAmount(10L)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.requestGuildSettlement(requestGuildSettlementVo, new OnGetResponseListener<SettlementRequestSrv>() {
                @Override
                public void onResponse(ResultVo<SettlementRequestSrv> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void requestWalletSettlement() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setOtt("fec3970c1eb5a102")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            RequestWalletSettlementVo requestWalletSettlementVo = new RequestWalletSettlementVo.Builder(baseInfoVo)
                    .setAmount(10L)
//                    .setWallet("")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.requestWalletSettlement(requestWalletSettlementVo, new OnGetResponseListener<SettlementRequestSrv>() {
                @Override
                public void onResponse(ResultVo<SettlementRequestSrv> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void requestSettlementByTool() {
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
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void listSettlements() {
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
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.listSettlements(listSettlementsVo, new OnGetResponseListener<List<SettlementRequestSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SettlementRequestSrv>> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void addAutoSettlement() {
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
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.addAutoSettlement(addAutoSettlementVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void removeAutoSettlement() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        try {
            RemoveAutoSettlementVo removeAutoSettlementVo = new RemoveAutoSettlementVo.Builder(baseInfoVo)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.removeAutoSettlement(removeAutoSettlementVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void verifyInvoice() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");


        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScVoucherHash("")
//                .setScApiKey("")
                .build();

        BillingService billingService = new BillingService();


        try {
            VerifyInvoiceVo verifyInvoiceVo = new VerifyInvoiceVo.Builder(baseInfoVo)
                    .setId(38255L)
//                    .setBillNumber("hjgfj")
                    .build();
            billingService.verifyInvoice(verifyInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (
                PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void reduceInvoice() {
        //        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("RFSFGDYEDYGS");


        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScVoucherHash("")
//                .setScApiKey("")
                .build();

        BillingService billingService = new BillingService();
        List<InvoiceItemInfoVo> invoiceItemInfoVos = new ArrayList<>();
        InvoiceItemInfoVo invoiceItemInfoVo = new InvoiceItemInfoVo();
        invoiceItemInfoVo.setInvoiceItemId(7070162L)
                .setPrice(new BigDecimal(2))
                .setItemDescription("ete")
                .setQuantity(new BigDecimal(2));
        invoiceItemInfoVos.add(invoiceItemInfoVo);


        try {
            ReduceInvoiceVo reduceInvoiceVo = new ReduceInvoiceVo.Builder(baseInfoVo)
                    .setId(38255L)
                    .setInvoiceItemsInfo(invoiceItemInfoVos)
                    .build();
            billingService.reduceInvoice(reduceInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (
                PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static String getPayInvoiceByWalletLink() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        try {
            PayInvoiceByWalletVo payInvoiceByWalletVo = new PayInvoiceByWalletVo.Builder(baseInfoVo)
                    .setInvoiceId(0L)
                    .setCallUri("")
                    .setRedirectUri("")
                    .build();
            return payInvoiceByWalletVo.getLink();
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        return null;
    }
}



