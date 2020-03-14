import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.ApplicationAccessSrv;
import com.fanap.podSakku.data.modelVo.AccessRequestContentVo;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.data.modelVo.UpdateAppCollaboratorVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestUpdateAppCollaboratorVo {
    private static String TOKEN = "";

    @Test
    public void updateAppCollaborator_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AccessRequestContentVo accessRequestContentVo = new AccessRequestContentVo();
        accessRequestContentVo.setAccessLevel("VIEW");
        accessRequestContentVo.setEmail("zmazloom@pod.ir");
        accessRequestContentVo.setImageRegistry("");
        try {
            UpdateAppCollaboratorVo updateAppCollaboratorVo = new UpdateAppCollaboratorVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setAccessRequestVO(accessRequestContentVo)
                    .setCid(135L)
                    .build();
            podSakku.updateAppCollaborator(updateAppCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
                    System.out.println(result.getResult().getId());
                    try {
                        assertEquals("زهرا", result.getResult().getPerson().getFirstName());
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
    public void updateAppCollaborator_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AccessRequestContentVo accessRequestContentVo = new AccessRequestContentVo();
        accessRequestContentVo.setAccessLevel("VIEW");
        accessRequestContentVo.setEmail("zmazloom@pod.ir");
        accessRequestContentVo.setImageRegistry("");
        try {
            UpdateAppCollaboratorVo updateAppCollaboratorVo = new UpdateAppCollaboratorVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setAccessRequestVO(accessRequestContentVo)
                    .setCid(135L)
                    .setLevel(1)
                    .build();
            podSakku.updateAppCollaborator(updateAppCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
                    System.out.println(result.getResult().getId());
                    try {
                        assertEquals("زهرا", result.getResult().getPerson().getFirstName());
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
    public void updateAppCollaborator_RequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AccessRequestContentVo accessRequestContentVo = new AccessRequestContentVo();
        accessRequestContentVo.setAccessLevel("VIEW");
        accessRequestContentVo.setEmail("zmazloom@pod.ir");
        accessRequestContentVo.setImageRegistry("");
        try {
            UpdateAppCollaboratorVo updateAppCollaboratorVo = new UpdateAppCollaboratorVo.Builder(baseInfoVo)
                    .setAccessRequestVO(accessRequestContentVo)
                    .setCid(135L)
                    .build();
            podSakku.updateAppCollaborator(updateAppCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
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
    public void updateAppCollaborator_RequiredParameters_Cid() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AccessRequestContentVo accessRequestContentVo = new AccessRequestContentVo();
        accessRequestContentVo.setAccessLevel("VIEW");
        accessRequestContentVo.setEmail("zmazloom@pod.ir");
        accessRequestContentVo.setImageRegistry("");
        try {
            UpdateAppCollaboratorVo updateAppCollaboratorVo = new UpdateAppCollaboratorVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setAccessRequestVO(accessRequestContentVo)
                    .build();
            podSakku.updateAppCollaborator(updateAppCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
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
    public void updateAppCollaborator_RequiredParameters_AccessRequestVO() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AccessRequestContentVo accessRequestContentVo = new AccessRequestContentVo();
        accessRequestContentVo.setAccessLevel("VIEW");
        accessRequestContentVo.setEmail("zmazloom@pod.ir");
        accessRequestContentVo.setImageRegistry("");
        try {
            UpdateAppCollaboratorVo updateAppCollaboratorVo = new UpdateAppCollaboratorVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setCid(135L)
                    .build();
            podSakku.updateAppCollaborator(updateAppCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
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
    public void updateAppCollaborator_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            UpdateAppCollaboratorVo updateAppCollaboratorVo = new UpdateAppCollaboratorVo.Builder(baseInfoVo)
                    .build();
            podSakku.updateAppCollaborator(updateAppCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
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
