import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.BasicAuthenticationSrv;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.DeleteBasicAuthUsersVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestDeleteBasicAuthUsers {

    private static String TOKEN = "";

    @Test
    public void deleteBasicAuthUsers_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteBasicAuthUsersVo deleteBasicAuthUsersVo = new DeleteBasicAuthUsersVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .setBasicAuthId(42L)
                    .build();
            podSakku.deleteBasicAuthUsers(deleteBasicAuthUsersVo, new OnGetResponseListener<List<BasicAuthenticationSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BasicAuthenticationSrv>> result) {
                    System.out.println(result.getResult().size());
                    try {
                        assertEquals(42, result.getResult().get(0).getId());
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
    public void deleteBasicAuthUsers_RequiredParameters_AppId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteBasicAuthUsersVo deleteBasicAuthUsersVo = new DeleteBasicAuthUsersVo.Builder(baseInfoVo)
                    .setBasicAuthId(42L)
                    .build();
            podSakku.deleteBasicAuthUsers(deleteBasicAuthUsersVo, new OnGetResponseListener<List<BasicAuthenticationSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BasicAuthenticationSrv>> result) {
                    System.out.println(result.getResult().size());
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
    public void deleteBasicAuthUsers_RequiredParameters_BasicAuthId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteBasicAuthUsersVo deleteBasicAuthUsersVo = new DeleteBasicAuthUsersVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.deleteBasicAuthUsers(deleteBasicAuthUsersVo, new OnGetResponseListener<List<BasicAuthenticationSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BasicAuthenticationSrv>> result) {
                    System.out.println(result.getResult().size());
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
    public void deleteBasicAuthUsers_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            DeleteBasicAuthUsersVo deleteBasicAuthUsersVo = new DeleteBasicAuthUsersVo.Builder(baseInfoVo)
                    .build();
            podSakku.deleteBasicAuthUsers(deleteBasicAuthUsersVo, new OnGetResponseListener<List<BasicAuthenticationSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BasicAuthenticationSrv>> result) {
                    System.out.println(result.getResult().size());
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
