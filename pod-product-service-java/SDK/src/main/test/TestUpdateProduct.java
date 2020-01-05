import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.JsonUtil;
import com.fanap.podProduct.controller.PodProduct;
import com.fanap.podProduct.data.modelSrv.ProductSrv;
import com.fanap.podProduct.data.modelVo.BaseInfoVo;
import com.fanap.podProduct.data.modelVo.ResultVo;
import com.fanap.podProduct.data.modelVo.UpdateProductVo;
import com.fanap.podProduct.util.OnGetResponseListener;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by Z.gholinia on 11/19/2019.
 */

public class TestUpdateProduct {
    @Test
    public void updateProduct_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("scProvider","nam");
//        String metaData=JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setName("4")
                    .setDescription("hhh")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setChangePreview(false)
                    .setEntityId(31279L)
                    .setAvailableCount(5)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    new Thread(() -> {
                        try {
                            assertEquals("4", result.getResult().getName());
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
    public void updateProduct_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("scProvider", "nam");
        String metaData = JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setName("4")
                    .setDescription("hhh")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setChangePreview(false)
                    .setEntityId(31279L)
                    .setAvailableCount(12)
                    .setVersion("1")
                    .setMetadata(metaData)
                    .setUnlimited(true)
                    .setGroupId(1818L)
                    .setCategories(categories)
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(false)
                    .setAllowUserPrice(true)
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setAttTemplateCode("")
                    .setGroupId(1881L)
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .setTagTreeCategoryName("")
                    .setContent("")
                    .setPreviewImage("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
                    new Thread(() -> {
                        try {
                            assertEquals("4", result.getResult().getName());
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
    public void updateProduct_SomeRequiredParameters_Name() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("scProvider", "nam");
        String metaData = JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setDescription("hhh")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setChangePreview(false)
                    .setEntityId(31279L)
                    .setAvailableCount(12)
                    .setVersion("1")
                    .setMetadata(metaData)
                    .setUnlimited(true)
                    .setGroupId(1818L)
                    .setCategories(categories)
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(false)
                    .setAllowUserPrice(true)
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setAttTemplateCode("")
                    .setGroupId(1881L)
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .setTagTreeCategoryName("")
                    .setContent("")
                    .setPreviewImage("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void updateProduct_SomeRequiredParameters_Description() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("scProvider", "nam");
        String metaData = JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setName("salam")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setChangePreview(false)
                    .setEntityId(31279L)
                    .setAvailableCount(12)
                    .setVersion("1")
                    .setMetadata(metaData)
                    .setUnlimited(true)
                    .setGroupId(1818L)
                    .setCategories(categories)
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(false)
                    .setAllowUserPrice(true)
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setAttTemplateCode("")
                    .setGroupId(1881L)
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .setTagTreeCategoryName("")
                    .setContent("")
                    .setPreviewImage("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void updateProduct_SomeRequiredParameters_CanComment() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("scProvider", "nam");
        String metaData = JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setName("salam")
                    .setDescription("DESCRIPTION")
                    .setCanLike(false)
                    .setEnable(false)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setChangePreview(false)
                    .setEntityId(31279L)
                    .setAvailableCount(12)
                    .setVersion("1")
                    .setMetadata(metaData)
                    .setUnlimited(true)
                    .setGroupId(1818L)
                    .setCategories(categories)
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(false)
                    .setAllowUserPrice(true)
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setAttTemplateCode("")
                    .setGroupId(1881L)
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .setTagTreeCategoryName("")
                    .setContent("")
                    .setPreviewImage("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void updateProduct_SomeRequiredParameters_CanLike() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("scProvider", "nam");
        String metaData = JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setName("salam")
                    .setDescription("DESCRIPTION")
                    .setCanComment(false)
                    .setEnable(false)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setChangePreview(false)
                    .setEntityId(31279L)
                    .setAvailableCount(12)
                    .setVersion("1")
                    .setMetadata(metaData)
                    .setUnlimited(true)
                    .setGroupId(1818L)
                    .setCategories(categories)
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(false)
                    .setAllowUserPrice(true)
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setAttTemplateCode("")
                    .setGroupId(1881L)
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .setTagTreeCategoryName("")
                    .setContent("")
                    .setPreviewImage("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void updateProduct_SomeRequiredParameters_Enable() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("scProvider", "nam");
        String metaData = JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setName("salam")
                    .setDescription("DESCRIPTION")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setChangePreview(false)
                    .setEntityId(31279L)
                    .setAvailableCount(12)
                    .setVersion("1")
                    .setMetadata(metaData)
                    .setUnlimited(true)
                    .setGroupId(1818L)
                    .setCategories(categories)
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(false)
                    .setAllowUserPrice(true)
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setAttTemplateCode("")
                    .setGroupId(1881L)
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .setTagTreeCategoryName("")
                    .setContent("")
                    .setPreviewImage("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void updateProduct_SomeRequiredParameters_Price() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("scProvider", "nam");
        String metaData = JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setName("salam")
                    .setDescription("DESCRIPTION")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setDiscount(new BigDecimal(0))
                    .setChangePreview(false)
                    .setEntityId(31279L)
                    .setAvailableCount(12)
                    .setVersion("1")
                    .setMetadata(metaData)
                    .setUnlimited(true)
                    .setGroupId(1818L)
                    .setCategories(categories)
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(false)
                    .setAllowUserPrice(true)
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setAttTemplateCode("")
                    .setGroupId(1881L)
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .setTagTreeCategoryName("")
                    .setContent("")
                    .setPreviewImage("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void updateProduct_SomeRequiredParameters_Discount() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("scProvider", "nam");
        String metaData = JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setName("salam")
                    .setDescription("DESCRIPTION")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setPrice(new BigDecimal(10))
                    .setChangePreview(false)
                    .setEntityId(31279L)
                    .setAvailableCount(12)
                    .setVersion("1")
                    .setMetadata(metaData)
                    .setUnlimited(true)
                    .setGroupId(1818L)
                    .setCategories(categories)
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(false)
                    .setAllowUserPrice(true)
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setAttTemplateCode("")
                    .setGroupId(1881L)
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .setTagTreeCategoryName("")
                    .setContent("")
                    .setPreviewImage("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void updateProduct_SomeRequiredParameters_ChangePreview() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("scProvider", "nam");
        String metaData = JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setName("salam")
                    .setDescription("DESCRIPTION")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setChangePreview(false)
                    .setEntityId(31279L)
                    .setAvailableCount(12)
                    .setVersion("1")
                    .setMetadata(metaData)
                    .setUnlimited(true)
                    .setGroupId(1818L)
                    .setCategories(categories)
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(false)
                    .setAllowUserPrice(true)
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setAttTemplateCode("")
                    .setGroupId(1881L)
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .setTagTreeCategoryName("")
                    .setContent("")
                    .setPreviewImage("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void updateProduct_SomeRequiredParameters_EntityId() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("scProvider", "nam");
        String metaData = JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setName("salam")
                    .setDescription("DESCRIPTION")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setChangePreview(false)
                    .setAvailableCount(12)
                    .setVersion("1")
                    .setMetadata(metaData)
                    .setUnlimited(true)
                    .setGroupId(1818L)
                    .setCategories(categories)
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(false)
                    .setAllowUserPrice(true)
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setAttTemplateCode("")
                    .setGroupId(1881L)
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .setTagTreeCategoryName("")
                    .setContent("")
                    .setPreviewImage("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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
    public void updateProduct_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodProduct podProduct = new PodProduct();

        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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


