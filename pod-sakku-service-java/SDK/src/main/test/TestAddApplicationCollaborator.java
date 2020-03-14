import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.ApplicationAccessSrv;
import com.fanap.podSakku.data.modelVo.AccessRequestContentVo;
import com.fanap.podSakku.data.modelVo.AddApplicationCollaboratorVo;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestAddApplicationCollaborator {
    private static String TOKEN = "";

    @Test
    public void addApplicationCollaborator_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AccessRequestContentVo accessRequestContentVo = new AccessRequestContentVo();
        accessRequestContentVo.setAccessLevel("VIEW");
        accessRequestContentVo.setEmail("zmazloom@pod.ir");
        accessRequestContentVo.setImageRegistry("");
        try {
            AddApplicationCollaboratorVo addApplicationCollaboratorVo = new AddApplicationCollaboratorVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setAccessRequestVO(accessRequestContentVo)
                    .build();
            podSakku.addApplicationCollaborator(addApplicationCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
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
                        assertEquals(409, e.getCode());
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
    public void addApplicationCollaborator_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AccessRequestContentVo accessRequestContentVo = new AccessRequestContentVo();
        accessRequestContentVo.setAccessLevel("VIEW");
        accessRequestContentVo.setEmail("zmazloom@pod.ir");
        accessRequestContentVo.setImageRegistry("");
        try {
            AddApplicationCollaboratorVo addApplicationCollaboratorVo = new AddApplicationCollaboratorVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .setAccessRequestVO(accessRequestContentVo)
                    .setLevel(1)
                    .build();
            podSakku.addApplicationCollaborator(addApplicationCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
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
                        assertEquals(409, e.getCode());
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
    public void addApplicationCollaborator_RequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AccessRequestContentVo accessRequestContentVo = new AccessRequestContentVo();
        accessRequestContentVo.setAccessLevel("VIEW");
        accessRequestContentVo.setEmail("zmazloom@pod.ir");
        accessRequestContentVo.setImageRegistry("");
        try {
            AddApplicationCollaboratorVo addApplicationCollaboratorVo = new AddApplicationCollaboratorVo.Builder(baseInfoVo)
                    .setAccessRequestVO(accessRequestContentVo)
                    .build();
            podSakku.addApplicationCollaborator(addApplicationCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
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
    public void addApplicationCollaborator_RequiredParameters_AccessRequestVO() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        AccessRequestContentVo accessRequestContentVo = new AccessRequestContentVo();
        accessRequestContentVo.setAccessLevel("VIEW");
        accessRequestContentVo.setEmail("zmazloom@pod.ir");
        accessRequestContentVo.setImageRegistry("");
        try {
            AddApplicationCollaboratorVo addApplicationCollaboratorVo = new AddApplicationCollaboratorVo.Builder(baseInfoVo)
                    .setId(2338L)
                    .build();
            podSakku.addApplicationCollaborator(addApplicationCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
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
    public void addApplicationCollaborator_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            AddApplicationCollaboratorVo addApplicationCollaboratorVo = new AddApplicationCollaboratorVo.Builder(baseInfoVo)
                    .build();
            podSakku.addApplicationCollaborator(addApplicationCollaboratorVo, new OnGetResponseListener<ApplicationAccessSrv>() {
                @Override
                public void onResponse(ResultVo<ApplicationAccessSrv> result) {
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
