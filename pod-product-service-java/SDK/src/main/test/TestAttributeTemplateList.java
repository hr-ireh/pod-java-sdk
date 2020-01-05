import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.controller.PodProduct;
import com.fanap.podProduct.data.modelSrv.AttributeTemplateSrv;
import com.fanap.podProduct.data.modelVo.AttributeTemplateListVo;
import com.fanap.podProduct.data.modelVo.BaseInfoVo;
import com.fanap.podProduct.data.modelVo.ResultVo;
import com.fanap.podProduct.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 11/19/2019.
 */

public class TestAttributeTemplateList {
    @Test
    public void getAttributeTemplateList_RequiredParameters1() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("FOOD_GUILD");
        guildCodes.add("CLOTHING_GUILD");

        PodProduct podProduct = new PodProduct();

        try {
            AttributeTemplateListVo attributeTemplateListVo = new AttributeTemplateListVo.Builder(baseInfoVo)
                    .setFirstId(0L)
                    .build();
            podProduct.getAttributeTemplateList(attributeTemplateListVo, new OnGetResponseListener<List<AttributeTemplateSrv>>() {

                @Override
                public void onResponse(ResultVo<List<AttributeTemplateSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    new Thread(() -> {
                        try {
                            assertEquals("PIRAHAn", result.getResult().get(0).getName());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void getAttributeTemplateList_RequiredParameters2() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("FOOD_GUILD");
        guildCodes.add("CLOTHING_GUILD");
        PodProduct podProduct = new PodProduct();

        try {
            AttributeTemplateListVo attributeTemplateListVo = new AttributeTemplateListVo.Builder(baseInfoVo)
                    .setLastId(5895L)
                    .build();
            podProduct.getAttributeTemplateList(attributeTemplateListVo, new OnGetResponseListener<List<AttributeTemplateSrv>>() {

                @Override
                public void onResponse(ResultVo<List<AttributeTemplateSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    new Thread(() -> {
                        try {
                            assertEquals("PIRAHAn", result.getResult().get(0).getName());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void getAttributeTemplateList_RequiredParameters3() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("FOOD_GUILD");
        guildCodes.add("CLOTHING_GUILD");
        PodProduct podProduct = new PodProduct();

        try {
            AttributeTemplateListVo attributeTemplateListVo = new AttributeTemplateListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .build();
            podProduct.getAttributeTemplateList(attributeTemplateListVo, new OnGetResponseListener<List<AttributeTemplateSrv>>() {

                @Override
                public void onResponse(ResultVo<List<AttributeTemplateSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    new Thread(() -> {
                        try {
                            assertEquals("PIRAHAn", result.getResult().get(0).getName());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void getAttributeTemplateList_AllParameters3() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("FOOD_GUILD");
        guildCodes.add("CLOTHING_GUILD");
        PodProduct podProduct = new PodProduct();

        try {
            AttributeTemplateListVo attributeTemplateListVo = new AttributeTemplateListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setFirstId(111L)
                    .setSize(50)
                    .setLastId(58497L)
                    .build();
            podProduct.getAttributeTemplateList(attributeTemplateListVo, new OnGetResponseListener<List<AttributeTemplateSrv>>() {

                @Override
                public void onResponse(ResultVo<List<AttributeTemplateSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    new Thread(() -> {
                        try {
                            assertEquals("PIRAHAn", result.getResult().get(0).getName());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void getAttributeTemplateList_SomeRequiredParameters_Offset_LastId_FirstId() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("FOOD_GUILD");
        guildCodes.add("CLOTHING_GUILD");
        PodProduct podProduct = new PodProduct();

        try {
            AttributeTemplateListVo attributeTemplateListVo = new AttributeTemplateListVo.Builder(baseInfoVo)
                    .setSize(50)
                    .build();
            podProduct.getAttributeTemplateList(attributeTemplateListVo, new OnGetResponseListener<List<AttributeTemplateSrv>>() {

                @Override
                public void onResponse(ResultVo<List<AttributeTemplateSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    new Thread(() -> {
                        try {
                            fail();
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
    public void getAttributeTemplateList_NoParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("FOOD_GUILD");
        guildCodes.add("CLOTHING_GUILD");
        PodProduct podProduct = new PodProduct();

        try {
            AttributeTemplateListVo attributeTemplateListVo = new AttributeTemplateListVo.Builder(baseInfoVo)
                    .build();
            podProduct.getAttributeTemplateList(attributeTemplateListVo, new OnGetResponseListener<List<AttributeTemplateSrv>>() {

                @Override
                public void onResponse(ResultVo<List<AttributeTemplateSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
                    new Thread(() -> {
                        try {
                            fail();
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }

                @Override
                public void onFailed(PodException e) {
                    new Thread(() -> {
                        try {
                            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        } catch (AssertionFailedError el) {
                            optionalThrowable[0] = Optional.of(el);
                        }
                        cdl.countDown();
                    }).start();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


}
