import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.WebhookSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.data.modelVo.UpdateAppWebHookByIdVo;
import com.fanap.podSakku.data.modelVo.WebhookContentVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestUpdateAppWebHookById {
    private static String TOKEN = "";

    @Test
    public void updateAppWebHookById_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookContentVo webhookContentVo = new WebhookContentVo();
        webhookContentVo.setApplicationId(2338L);
        webhookContentVo.setSecured(true);
        webhookContentVo.setTopics("delete");
        webhookContentVo.setUrl("192.168.6.22:8088");
        try {
            UpdateAppWebHookByIdVo updateAppWebHookByIdVo = new UpdateAppWebHookByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setVo(webhookContentVo)
                    .setWid(10L)
                    .build();
            podSakku.updateAppWebHookById(updateAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult().getId());
                    try {
                        assertEquals(10, result.getResult().getId());
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
    public void updateAppWebHookById_RequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookContentVo webhookContentVo = new WebhookContentVo();
        webhookContentVo.setApplicationId(2338L);
        webhookContentVo.setSecured(true);
        webhookContentVo.setTopics("delete");
        webhookContentVo.setUrl("192.168.6.22:8088");
        try {
            UpdateAppWebHookByIdVo updateAppWebHookByIdVo = new UpdateAppWebHookByIdVo.Builder(baseInfoVo)
                    .setVo(webhookContentVo)
                    .setWid(10L)
                    .build();
            podSakku.updateAppWebHookById(updateAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateAppWebHookById_RequiredParameters_Wid() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookContentVo webhookContentVo = new WebhookContentVo();
        webhookContentVo.setApplicationId(2338L);
        webhookContentVo.setSecured(true);
        webhookContentVo.setTopics("delete");
        webhookContentVo.setUrl("192.168.6.22:8088");
        try {
            UpdateAppWebHookByIdVo updateAppWebHookByIdVo = new UpdateAppWebHookByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setVo(webhookContentVo)
                    .build();
            podSakku.updateAppWebHookById(updateAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateAppWebHookById_RequiredParameters_Vo() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookContentVo webhookContentVo = new WebhookContentVo();
        webhookContentVo.setApplicationId(2338L);
        webhookContentVo.setSecured(true);
        webhookContentVo.setTopics("delete");
        webhookContentVo.setUrl("192.168.6.22:8088");
        try {
            UpdateAppWebHookByIdVo updateAppWebHookByIdVo = new UpdateAppWebHookByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setWid(10L)
                    .build();
            podSakku.updateAppWebHookById(updateAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult().getId());
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
    public void updateAppWebHookById_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            UpdateAppWebHookByIdVo updateAppWebHookByIdVo = new UpdateAppWebHookByIdVo.Builder(baseInfoVo)
                    .build();
            podSakku.updateAppWebHookById(updateAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult().getId());
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
