package com.fanap.podBaseService;

import com.fanap.podBaseService.controller.PodBaseService;
import com.fanap.podBaseService.data.modelSrv.GuildSrv;
import com.fanap.podBaseService.data.modelVo.BaseInfoVo;
import com.fanap.podBaseService.data.modelVo.CurrencyListVo;
import com.fanap.podBaseService.data.modelVo.ResultVo;
import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.OnGetResponseListener;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestGetCurrencyList {

    private final String TOKEN = "2b02de2188a149bfa74b7760d4a64c85";
    @Rule
    public final TestRule globalTimeout = Timeout.millis(20000);

    @Test
    @Order(1)
//    @DisplayName("")
    public void getCurrencyList_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken_issuer(1)
                .setToken(TOKEN)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();
        try {
            CurrencyListVo currencyListVo = new CurrencyListVo.Builder(baseInfoVo)
                    .build();
            podBaseService.getCurrencyList(currencyListVo, new OnGetResponseListener<List<GuildSrv>>() {
                @Override
                public void onResponse(ResultVo<List<GuildSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                    try {
                        Assertions.assertEquals(0, result.getResult().get(0).getId());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();

                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });

            optional(countDownLatch());
        } catch (PodException e) {
           Assertions.fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    @Order(2)
//    @DisplayName("")
    public void getCurrencyList_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        PodBaseService podBaseService = new PodBaseService();
        try {
            CurrencyListVo currencyListVo = new CurrencyListVo.Builder(baseInfoVo)
                    .build();
            podBaseService.getCurrencyList(currencyListVo, new OnGetResponseListener<List<GuildSrv>>() {
                @Override
                public void onResponse(ResultVo<List<GuildSrv>> result) {
                    System.out.println(result.getResult().get(0).getCode());
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();

                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
            assertEquals(887, e.getCode());
        }
    }
}
