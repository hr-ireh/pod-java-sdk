package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.PayInvoiceByWalletVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class TestGetPayInvoiceByWalletLink {
    private static final String TOKEN = "";

    @Test
//    @DisplayName("")
    public void getPayInvoiceByWalletLink_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9dfc30b213f74c82b2e03053c338d58e")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        try {
            PayInvoiceByWalletVo payInvoiceByWalletVo = new PayInvoiceByWalletVo.Builder(baseInfoVo)
                    .setInvoiceId(0L)
                    .setCallUri("https://www.google.com/")
                    .setRedirectUri("https://www.google.com/")
                    .build();
            assertNotEquals(null, payInvoiceByWalletVo.getLink());
            System.out.println(payInvoiceByWalletVo.getLink());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
//    @DisplayName("")
    public void getPayInvoiceByWalletLink_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9dfc30b213f74c82b2e03053c338d58e")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        BillingService billingService = new BillingService();
        try {
            PayInvoiceByWalletVo payInvoiceByWalletVo = new PayInvoiceByWalletVo.Builder(baseInfoVo)
                    .setInvoiceId(0L)
                    .build();
            assertNotEquals(null, payInvoiceByWalletVo.getLink());
            System.out.println(payInvoiceByWalletVo.getLink());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
