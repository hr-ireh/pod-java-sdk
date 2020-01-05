package com.fanap.podBilling;

import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.PayInvoiceByUniqueNumberVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class TestGetPayInvoiceByUniqueNumberLink {
    private static final String TOKEN = "";

    @Test
//    @DisplayName("")
    public void payInvoiceByUniqueNumber_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        try {
            PayInvoiceByUniqueNumberVo payInvoiceByUniqueNumberVo = new PayInvoiceByUniqueNumberVo.Builder(baseInfoVo)
                    .setUniqueNumber("3dc9575c7f860ab4")
                    .setGateway("PEP")
                    .setRedirectUri("https://www.google.com/")
                    .setCallUri("https://www.google.com/")
                    .build();
            assertNotEquals(null, payInvoiceByUniqueNumberVo.getLink());
            System.out.println(payInvoiceByUniqueNumberVo.getLink());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    @Test
//    @DisplayName("")
    public void payInvoiceByUniqueNumber_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        try {
            PayInvoiceByUniqueNumberVo payInvoiceByUniqueNumberVo = new PayInvoiceByUniqueNumberVo.Builder(baseInfoVo)
                    .setUniqueNumber("3dc9575c7f860ab4")
                    .build();
            assertNotEquals(null, payInvoiceByUniqueNumberVo.getLink());
            System.out.println(payInvoiceByUniqueNumberVo.getLink());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


}
