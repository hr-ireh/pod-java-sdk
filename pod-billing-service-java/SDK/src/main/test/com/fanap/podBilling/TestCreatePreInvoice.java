//package com.fanap.podBilling;
//
//import com.fanap.billingService.controller.BillingService;
//import com.fanap.billingService.data.modelSrv.LinkSrv;
//import com.fanap.billingService.data.modelVo.BaseInfoVo;
//import com.fanap.billingService.data.modelVo.CreatePreInvoiceVo;
//import com.fanap.billingService.data.modelVo.ProductInfo;
//import com.fanap.billingService.data.modelVo.ResultVo;
//import com.fanap.billingService.enums.Enum_Server_type;
//import com.fanap.billingService.exception.PodException;
//import com.fanap.billingService.util.OnGetResponseListener;
//import org.junit.jupiter.api.Test;
//import org.opentest4j.AssertionFailedError;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static com.fanap.podBaseService.util.MyOptional.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.fail;
//
//
///**
// * Created by Z.gholinia on 9/2/2019.
// */
//public class TestCreatePreInvoice {
//    private final String TOKEN = "9dfc30b213f74c82b2e03053c338d58e";
//    private static String RIDERECT_URI = "https://www.google.com/";
//    private static String SAMPLE_GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";
//
//    @Test
////    @DisplayName("")
//    public void createPreInvoice() {
//        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
//                .setToken(TOKEN)
//                .setToken_issuer(1)
//                .setOtt("df4e8ee063c209cc")
//                .setServerType(Enum_Server_type.PRODUCTION)
//                .build();
//
//        BillingService billingService = new BillingService();
//        List<ProductInfo> productInfos = new ArrayList<>();
//        ProductInfo productInfo = new ProductInfo();
//        productInfo
//                .setProductId(0L)
//                .setPrice(new BigDecimal(1200))
//                .setQuantity(new BigDecimal(3))
//                .setProductDescription("test");
//        productInfos.add(productInfo);
//
//        try {
//            CreatePreInvoiceVo createPreInvoiceVo = new CreatePreInvoiceVo.Builder(baseInfoVo)
//                    .setRedirectURL(RIDERECT_URI)
//                    .setProductInfos(productInfos)
//                    .setGuildCode("TOILETRIES_GUILD")
//                    .build();
//
//            billingService.createPreInvoice(createPreInvoiceVo, new OnGetResponseListener<String>() {
//                @Override
//                public void onResponse(ResultVo<String> result) {
//
//                    LinkSrv linkSrv = new LinkSrv();
//                    try {
//                        linkSrv = createPreInvoiceVo.getLink(result.getResult());
//                        LinkSrv finalLinkSrv = linkSrv;
//                        new Thread(() -> {
//                            try {
//                                assertEquals("https://pay.pod.ir/v1/pbc/preinvoice/" + result.getResult(), finalLinkSrv.getRedirectUrl());
//                            } catch (AssertionFailedError el) {
//                                optionalThrowable[0] = Optional.of(el);
//                            }
//                            cdl.countDown();
//                        }).start();
//                    } catch (PodException e) {
//                        try {
//                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
//                        } catch (AssertionFailedError el) {
//                            optionalThrowable[0] = Optional.of(el);
//                        }
//                        cdl.countDown();
//                    }
//                    System.out.println(linkSrv.getRedirectUrl());
//                }
//
//                @Override
//                public void onFailed(PodException e) {
//                    new Thread(() -> {
//                        try {
//                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
//                        } catch (AssertionFailedError el) {
//                            optionalThrowable[0] = Optional.of(el);
//                        }
//                        cdl.countDown();
//                    }).start();
//                }
//            });
//            optional(countDownLatch());
//        } catch (PodException e) {
//            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
//        }
//
//    }
//
//
//}
