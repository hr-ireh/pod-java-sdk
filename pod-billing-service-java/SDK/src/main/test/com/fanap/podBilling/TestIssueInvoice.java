package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.opentest4j.AssertionFailedError;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class TestIssueInvoice {
    private final String TOKEN = "";
    @Rule
    public final TestRule globalTimeout = Timeout.millis(20000);

    @Test
    @Order(1)
//    @DisplayName("")
    public void issueInvoice_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt("")
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

        List<String> voucherHashs = new ArrayList<>();
        voucherHashs.add("7TOMG1VAFNUW");
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
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .setEventReminders(reminders)
                    .setAddressId(10838L)
                    .setBillNumber("01")
                    .setCellphoneNumber("09375334941")
                    .setCurrencyCode("USD")
                    .setDeadline("1399/06/10")
                    .setDescription("تست")
                    .setEventDescription("hi")
                    .setEventTitle("قلی نیا هستم")
                    .setHasEvent(true)
                    .setMetadata("{\"title\":\"فاکتور تستی\",\"price\":145.2}")
                    .setPreview(true)
                    .setRedirectURL("http://localhost/test.php")
                    .setSafe(true)
                    .setVerificationNeeded(true)
//                    .setEventMetadata("{name:'test'}")
                    .setEventTimeZone("Asia/Tehran")
                    .setPostVoucherEnabled(true)
                    .setPreferredTaxRate(1D)
                    .setVoucherHash(voucherHashs)
                    .setVerifyAfterTimeout(true)
                    .build();
            billingService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {

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
                            assertEquals(39, e.getCode());
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
    @Order(1)
//    @DisplayName("")
    public void issueInvoice_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");

        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .build();
            billingService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getUserSrv().getId());
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
    public void issueInvoice_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9dfc30b213f74c82b2e03053c338d58e")
                .setToken_issuer(1)
                .setOtt("3f4b492d7e9a2f8")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        List<ProductInfo> productInfos = new ArrayList<>();
        ProductInfo productInfo = new ProductInfo();
        productInfo
                .setProductId(0L)
                .setPrice(new BigDecimal(1))
                .setQuantity(new BigDecimal(1))
                .setProductDescription("test");
        productInfos.add(productInfo);

        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .setProductInfos(productInfos)
                    .setUserId(16849L)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .build();
            billingService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
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
                            assertEquals(39, e.getCode());
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
    public void issueInvoice_SomeRequiredParameters_GuildCode() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9dfc30b213f74c82b2e03053c338d58e")
                .setToken_issuer(1)
                .setOtt("d70d615c10633d63")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        List<ProductInfo> productInfos = new ArrayList<>();
        ProductInfo productInfo = new ProductInfo();
        productInfo
                .setProductId(0L)
                .setPrice(new BigDecimal(1))
                .setQuantity(new BigDecimal(1))
                .setProductDescription("test");
        productInfos.add(productInfo);

        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .setProductInfos(productInfos)
                    .setUserId(16849L)
                    .build();
            billingService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
    public void issueInvoice_SomeRequiredParameters_ProductInfos() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9dfc30b213f74c82b2e03053c338d58e")
                .setToken_issuer(1)
                .setOtt("436dd429dc22979f")
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
//        List<String> voucherHashs = new ArrayList<>();
//        voucherHashs.add("RFSFGDYEDYGS");
        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .setUserId(16849L)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .build();
            billingService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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