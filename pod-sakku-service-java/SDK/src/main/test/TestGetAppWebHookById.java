import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.WebhookSrv;
import com.fanap.podSakku.data.modelVo.WebhookVo;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.GetAppWebHookByIdVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestGetAppWebHookById {
    private static String TOKEN = "";

    @Test
    public void getAppWebHookById_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookVo webhookVo = new WebhookVo();
        webhookVo.setSecured(false);
        webhookVo.setUrl("192.168.6.22:8088");
        webhookVo.setApplicationId(2338L);
        try {
            GetAppWebHookByIdVo getAppWebHookByIdVo = new GetAppWebHookByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setWid(11L)
                    .setVo(webhookVo)
                    .build();
            podSakku.getAppWebHookById(getAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
                @Override
                public void onResponse(ResultVo<WebhookSrv> result) {
                    System.out.println(result.getResult().getId());
                    try {
                        assertEquals(11, result.getResult().getId());
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
                    cdl.countDown();  }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
    public void getAppWebHookById_RequiredParameters_Vo() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookVo webhookVo = new WebhookVo();
        webhookVo.setSecured(false);
        webhookVo.setUrl("192.168.6.22:8088");
        webhookVo.setApplicationId(2338L);
        try {
            GetAppWebHookByIdVo getAppWebHookByIdVo = new GetAppWebHookByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setWid(11L)
                    .build();
            podSakku.getAppWebHookById(getAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
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
                    cdl.countDown();  }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
    public void getAppWebHookById_RequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookVo webhookVo = new WebhookVo();
        webhookVo.setSecured(false);
        webhookVo.setUrl("192.168.6.22:8088");
        webhookVo.setApplicationId(2338L);
        try {
            GetAppWebHookByIdVo getAppWebHookByIdVo = new GetAppWebHookByIdVo.Builder(baseInfoVo)
                    .setWid(11L)
                    .setVo(webhookVo)
                    .build();
            podSakku.getAppWebHookById(getAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
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
                    cdl.countDown();  }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void getAppWebHookById_RequiredParameters_Wid() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        WebhookVo webhookVo = new WebhookVo();
        webhookVo.setSecured(false);
        webhookVo.setUrl("192.168.6.22:8088");
        webhookVo.setApplicationId(2338L);
        try {
            GetAppWebHookByIdVo getAppWebHookByIdVo = new GetAppWebHookByIdVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setVo(webhookVo)
                    .build();
            podSakku.getAppWebHookById(getAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
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
                    cdl.countDown();  }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
    public void getAppWebHookById_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            GetAppWebHookByIdVo getAppWebHookByIdVo = new GetAppWebHookByIdVo.Builder(baseInfoVo)
                    .build();
            podSakku.getAppWebHookById(getAppWebHookByIdVo, new OnGetResponseListener<WebhookSrv>() {
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
                    cdl.countDown();  }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
