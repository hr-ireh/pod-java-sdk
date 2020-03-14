import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.WebhookSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.CreateApplicationWebhooksVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.data.modelVo.WebhookContentVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestCreateApplicationWebhooks {
    private static String TOKEN = "";

    @Test
    public void createApplicationWebhooks_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookContentVo webhookContentVo = new WebhookContentVo();
        webhookContentVo.setApplicationId(2306L);
        webhookContentVo.setSecured(true);
        webhookContentVo.setTopics("delete");
        webhookContentVo.setUrl("192.168.6.22:8088");
        try {
            CreateApplicationWebhooksVo createApplicationWebhooksVo = new CreateApplicationWebhooksVo.Builder(baseInfoVo)
                    .setAppId(2420L)
                    .setWebhookVO(webhookContentVo)
                    .build();
            podSakku.createApplicationWebhooks(createApplicationWebhooksVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals("DELETE", result.getResult().getTopics());
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
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
    public void createApplicationWebhooks_RequiredParameters_AppId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookContentVo webhookContentVo = new WebhookContentVo();
        webhookContentVo.setApplicationId(2306L);
        webhookContentVo.setSecured(true);
        webhookContentVo.setTopics("delete");
        webhookContentVo.setUrl("192.168.6.22:8088");
        try {
            CreateApplicationWebhooksVo createApplicationWebhooksVo = new CreateApplicationWebhooksVo.Builder(baseInfoVo)
                    .setWebhookVO(webhookContentVo)
                    .build();
            podSakku.createApplicationWebhooks(createApplicationWebhooksVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult());
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
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
    public void createApplicationWebhooks_RequiredParameters_WebHookVo() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookContentVo webhookContentVo = new WebhookContentVo();
        webhookContentVo.setApplicationId(2306L);
        webhookContentVo.setSecured(true);
        webhookContentVo.setTopics("delete");
        webhookContentVo.setUrl("192.168.6.22:8088");
        try {
            CreateApplicationWebhooksVo createApplicationWebhooksVo = new CreateApplicationWebhooksVo.Builder(baseInfoVo)
                    .setAppId(2306L)
                    .build();
            podSakku.createApplicationWebhooks(createApplicationWebhooksVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult());
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
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void createApplicationWebhooks_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            CreateApplicationWebhooksVo createApplicationWebhooksVo = new CreateApplicationWebhooksVo.Builder(baseInfoVo)
                    .build();
            podSakku.createApplicationWebhooks(createApplicationWebhooksVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult());
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
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }
}
