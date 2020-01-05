import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.controller.PodProduct;
import com.fanap.podProduct.data.modelSrv.ProductSrv;
import com.fanap.podProduct.data.modelVo.BaseInfoVo;
import com.fanap.podProduct.data.modelVo.ProductListVo;
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

public class TestProductList {


    @Test
    public void getProductList_RequiredParameters1() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<Long> ids = new ArrayList<>();
        ids.add(0L);
        List<String> uniqueIds = new ArrayList<>();
        uniqueIds.add("");
        List<String> categoryCodes = new ArrayList<>();
        categoryCodes.add("");
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("CLOTHING_GUILD");
        List<String> attributeCodes = new ArrayList<>();
        attributeCodes.add("");
        List<String> attributeValues = new ArrayList<>();
        attributeValues.add("");
        List<String> tags = new ArrayList<>();
        tags.add("");
        List<String> tagTrees = new ArrayList<>();
        tagTrees.add("");
        PodProduct podProduct = new PodProduct();

        try {
            ProductListVo productListVo = new ProductListVo.Builder(baseInfoVo)
                    .setBusinessId(7867L)
                    .setOffset(0)
                    .build();
            podProduct.getProductList(productListVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult());
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
    public void getProductList_RequiredParameters2() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<Long> ids = new ArrayList<>();
        ids.add(0L);
        List<String> uniqueIds = new ArrayList<>();
        uniqueIds.add("");
        List<String> categoryCodes = new ArrayList<>();
        categoryCodes.add("");
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("CLOTHING_GUILD");
        List<String> attributeCodes = new ArrayList<>();
        attributeCodes.add("");
        List<String> attributeValues = new ArrayList<>();
        attributeValues.add("");
        List<String> tags = new ArrayList<>();
        tags.add("");
        List<String> tagTrees = new ArrayList<>();
        tagTrees.add("");
        PodProduct podProduct = new PodProduct();
        try {
            ProductListVo productListVo = new ProductListVo.Builder(baseInfoVo)
                    .setBusinessId(7867L)
                    .setFirstId(0L)
                    .build();
            podProduct.getProductList(productListVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult());
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void getProductList_RequiredParameters3() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<Long> ids = new ArrayList<>();
        ids.add(0L);
        List<String> uniqueIds = new ArrayList<>();
        uniqueIds.add("");
        List<String> categoryCodes = new ArrayList<>();
        categoryCodes.add("");
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("CLOTHING_GUILD");
        List<String> attributeCodes = new ArrayList<>();
        attributeCodes.add("");
        List<String> attributeValues = new ArrayList<>();
        attributeValues.add("");
        List<String> tags = new ArrayList<>();
        tags.add("");
        List<String> tagTrees = new ArrayList<>();
        tagTrees.add("");
        PodProduct podProduct = new PodProduct();

        try {
            ProductListVo productListVo = new ProductListVo.Builder(baseInfoVo)
                    .setBusinessId(7867L)
                    .setLastId(0L)
                    .build();
            podProduct.getProductList(productListVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult());
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
    public void getProductList_SomeRequiredParameters_Offset_LastId_FirstId() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<Long> ids = new ArrayList<>();
        ids.add(0L);
        List<String> uniqueIds = new ArrayList<>();
        uniqueIds.add("");
        List<String> categoryCodes = new ArrayList<>();
        categoryCodes.add("");
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("CLOTHING_GUILD");
        List<String> attributeCodes = new ArrayList<>();
        attributeCodes.add("");
        List<String> attributeValues = new ArrayList<>();
        attributeValues.add("");
        List<String> tags = new ArrayList<>();
        tags.add("");
        List<String> tagTrees = new ArrayList<>();
        tagTrees.add("");
        PodProduct podProduct = new PodProduct();

        try {
            ProductListVo productListVo = new ProductListVo.Builder(baseInfoVo)
                    .setBusinessId(7867L)
                    .build();
            podProduct.getProductList(productListVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult());
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
    public void getProductList_AllParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<Long> ids = new ArrayList<>();
        ids.add(0L);
        List<String> uniqueIds = new ArrayList<>();
        uniqueIds.add("");
        List<String> categoryCodes = new ArrayList<>();
        categoryCodes.add("");
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("CLOTHING_GUILD");
        List<String> attributeCodes = new ArrayList<>();
        attributeCodes.add("");
        List<String> attributeValues = new ArrayList<>();
        attributeValues.add("");
        List<String> tags = new ArrayList<>();
        tags.add("");
        List<String> tagTrees = new ArrayList<>();
        tagTrees.add("");
        PodProduct podProduct = new PodProduct();

        try {
            ProductListVo productListVo = new ProductListVo.Builder(baseInfoVo)
                    .setBusinessId(7867L)
                    .setOffset(0)
                    .setFirstId(0L)
                    .setLastId(0L)
                    .setSize(10)
                    .setId(ids)
                    .setUniqueId(uniqueIds)
                    .setCategoryCode(categoryCodes)
                    .setGuildCode(guildCodes)
                    .setCurrencyCode("")
                    .setAttributeTemplateCode("")
                    .setAttributeCode(attributeCodes)
                    .setAttributeValue(attributeValues)
                    .setOrderByLike("asc")
                    .setOrderByPrice("asc")
                    .setOrderBySale("asc")
                    .setTags(tags)
                    .setTagTrees(tagTrees)

                    .build();
            podProduct.getProductList(productListVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult());
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
    public void getProductList_NoParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodProduct podProduct = new PodProduct();

        try {
            ProductListVo productListVo = new ProductListVo.Builder(baseInfoVo)
                    .build();
            podProduct.getProductList(productListVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult());
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
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
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
