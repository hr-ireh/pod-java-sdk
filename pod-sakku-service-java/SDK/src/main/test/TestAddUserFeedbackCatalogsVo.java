import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelVo.AddUserFeedbackCatalogsVo;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.CatalogFeedbackVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.enums.EnumCatalogFeedbackType;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestAddUserFeedbackCatalogsVo {
    private static String TOKEN = "";

    @Test
    public void addUserFeedbackCatalogs_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        CatalogFeedbackVo catalogFeedbackVo = new CatalogFeedbackVo();
        catalogFeedbackVo.setType(EnumCatalogFeedbackType.PROBLEM);
        catalogFeedbackVo.setId(63L);
        catalogFeedbackVo.setSubject("problem");
        catalogFeedbackVo.setDescription("test SDK");
        catalogFeedbackVo.setChecked(false);
        catalogFeedbackVo.setMinCpu(1.0);
        catalogFeedbackVo.setMinDisk(1.0);
        catalogFeedbackVo.setPrice(0);
        try {
            AddUserFeedbackCatalogsVo addUserFeedbackCatalogsVo = new AddUserFeedbackCatalogsVo.Builder(baseInfoVo)
                    .setCatalogFeedbackVo(catalogFeedbackVo)
                    .build();
            podSakku.addUserFeedbackCatalogs(addUserFeedbackCatalogsVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
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
    public void addUserFeedbackCatalogs_RequiredParameters_Type() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        CatalogFeedbackVo catalogFeedbackVo = new CatalogFeedbackVo();
        catalogFeedbackVo.setSubject("problem");
        catalogFeedbackVo.setDescription("test SDK");
        try {
            AddUserFeedbackCatalogsVo addUserFeedbackCatalogsVo = new AddUserFeedbackCatalogsVo.Builder(baseInfoVo)
                    .setCatalogFeedbackVo(catalogFeedbackVo)
                    .build();
            podSakku.addUserFeedbackCatalogs(addUserFeedbackCatalogsVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
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
            assertEquals(887., e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
    public void addUserFeedbackCatalogs_RequiredParameters_Subject() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        CatalogFeedbackVo catalogFeedbackVo = new CatalogFeedbackVo();
        catalogFeedbackVo.setType(EnumCatalogFeedbackType.PROBLEM);
        catalogFeedbackVo.setDescription("test SDK");
        try {
            AddUserFeedbackCatalogsVo addUserFeedbackCatalogsVo = new AddUserFeedbackCatalogsVo.Builder(baseInfoVo)
                    .setCatalogFeedbackVo(catalogFeedbackVo)
                    .build();
            podSakku.addUserFeedbackCatalogs(addUserFeedbackCatalogsVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
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
    public void addUserFeedbackCatalogs_RequiredParameters_Description() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        CatalogFeedbackVo catalogFeedbackVo = new CatalogFeedbackVo();
        catalogFeedbackVo.setType(EnumCatalogFeedbackType.PROBLEM);
        catalogFeedbackVo.setSubject("problem");
        try {
            AddUserFeedbackCatalogsVo addUserFeedbackCatalogsVo = new AddUserFeedbackCatalogsVo.Builder(baseInfoVo)
                    .setCatalogFeedbackVo(catalogFeedbackVo)
                    .build();
            podSakku.addUserFeedbackCatalogs(addUserFeedbackCatalogsVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
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
    public void addUserFeedbackCatalogs_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            AddUserFeedbackCatalogsVo addUserFeedbackCatalogsVo = new AddUserFeedbackCatalogsVo.Builder(baseInfoVo)
                    .build();
            podSakku.addUserFeedbackCatalogs(addUserFeedbackCatalogsVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
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
