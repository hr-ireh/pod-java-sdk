import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.UserDomainSrv;
import com.fanap.podSakku.data.modelVo.AddDomainVo;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
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

public class TestAddDomain {
    private static String TOKEN = "";

    @Test
    public void addDomain_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            AddDomainVo addDomainVo = new AddDomainVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .setCertId(1L)
                    .setDomain("testSDK.com")
                    .build();
            podSakku.addDomain(addDomainVo, new OnGetResponseListener<List<UserDomainSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserDomainSrv>> result) {
                    System.out.println(result.getResult().get(0).getDomain());
                    try {
                        assertEquals(true, result.getResult());
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
    public void addDomain_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            AddDomainVo addDomainVo = new AddDomainVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .setDomain("testSDK4.com")
                    .build();
            podSakku.addDomain(addDomainVo, new OnGetResponseListener<List<UserDomainSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserDomainSrv>> result) {
                    System.out.println(result.getResult().get(0).getDomain());
                    try {
                        assertEquals("testSDK4.com", result.getResult().get(0).getDomain());
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
    public void addDomain_RequiredParameters_AppId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            AddDomainVo addDomainVo = new AddDomainVo.Builder(baseInfoVo)
                    .setDomain("testSDK.com")
                    .build();
            podSakku.addDomain(addDomainVo, new OnGetResponseListener<List<UserDomainSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserDomainSrv>> result) {
                    System.out.println(result.getResult().get(0).getDomain());
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
    public void addDomain_RequiredParameters_Domain() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            AddDomainVo addDomainVo = new AddDomainVo.Builder(baseInfoVo)
                    .setAppId(2338L)
                    .build();
            podSakku.addDomain(addDomainVo, new OnGetResponseListener<List<UserDomainSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserDomainSrv>> result) {
                    System.out.println(result.getResult().get(0).getDomain());
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
    public void addDomain_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            AddDomainVo addDomainVo = new AddDomainVo.Builder(baseInfoVo)
                    .build();
            podSakku.addDomain(addDomainVo, new OnGetResponseListener<List<UserDomainSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserDomainSrv>> result) {
                    System.out.println(result.getResult().get(0).getDomain());
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
