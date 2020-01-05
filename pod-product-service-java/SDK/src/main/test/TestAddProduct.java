import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.controller.PodProduct;
import com.fanap.podProduct.data.modelSrv.ProductSrv;
import com.fanap.podProduct.data.modelVo.AddProductVo;
import com.fanap.podProduct.data.modelVo.BaseInfoVo;
import com.fanap.podProduct.data.modelVo.ResultVo;
import com.fanap.podProduct.util.OnGetResponseListener;
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

public class TestAddProduct {

    @Test
    public void addProduct_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("ce75cca723fe43bba437e07214651a89")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");

        try {
            AddProductVo addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .build();
            podProduct.addProduct(addProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    new Thread(() -> {
                        try {
                            assertEquals("PIRAHAn", result.getResult().getName());
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
    public void addProduct_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("ce75cca723fe43bba437e07214651a89")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();

        try {
            AddProductVo addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setUniqueId("1232")
                    .setMetadata("metaData")
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(true)
                    .setAllowUserPrice(true)
                    .setUnlimited(true)
                    .setCurrencyCode("USD")
                    .setAttTemplateCode("پیراهن مردانه")
//                  .setGroupId(1903L)
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTres)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setPreviewImage("")
                    .setTagTreeCategoryName("ویژه")
                    .setPreferredTaxRate(0.08)
                    .setQuantityPrecision(2D)
                    .build();
            podProduct.addProduct(addProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    new Thread(() -> {
                        try {
                            assertEquals("PIRAHAn", result.getResult().getName());
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
    public void addProduct_SomeRequiredParameters_CanLike() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("ce75cca723fe43bba437e07214651a89")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();
        try {
            AddProductVo addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setCanComment(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setUniqueId("1232")
                    .setMetadata("metaData")
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(true)
                    .setAllowUserPrice(true)
                    .setUnlimited(true)
                    .setCurrencyCode("USD")
                    .setAttTemplateCode("پیراهن مردانه")
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTres)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setPreviewImage("")
                    .setTagTreeCategoryName("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.addProduct(addProductVo, new OnGetResponseListener<ProductSrv>() {
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
    public void addProduct_SomeRequiredParameters_CanComment() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("ce75cca723fe43bba437e07214651a89")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            AddProductVo addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setUniqueId("1232")
                    .setMetadata("metaData")
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(true)
                    .setAllowUserPrice(true)
                    .setUnlimited(true)
                    .setCurrencyCode("USD")
                    .setAttTemplateCode("پیراهن مردانه")
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTres)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setPreviewImage("")
                    .setTagTreeCategoryName("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.addProduct(addProductVo, new OnGetResponseListener<ProductSrv>() {
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
    public void addProduct_SomeRequiredParameters_Enable() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("ce75cca723fe43bba437e07214651a89")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();

        try {
            AddProductVo addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setUniqueId("1232")
                    .setMetadata("metaData")
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(true)
                    .setAllowUserPrice(true)
                    .setUnlimited(true)
                    .setCurrencyCode("USD")
                    .setAttTemplateCode("پیراهن مردانه")
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTres)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setPreviewImage("")
                    .setTagTreeCategoryName("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.addProduct(addProductVo, new OnGetResponseListener<ProductSrv>() {
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
    public void addProduct_SomeRequiredParameters_Name() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("ce75cca723fe43bba437e07214651a89")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();
        try {
            AddProductVo addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setUniqueId("1232")
                    .setMetadata("metaData")
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(true)
                    .setAllowUserPrice(true)
                    .setUnlimited(true)
                    .setCurrencyCode("USD")
                    .setAttTemplateCode("پیراهن مردانه")
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTres)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setPreviewImage("")
                    .setTagTreeCategoryName("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.addProduct(addProductVo, new OnGetResponseListener<ProductSrv>() {
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
    public void addProduct_SomeRequiredParameters_AvailableCount() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("ce75cca723fe43bba437e07214651a89")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();
        try {
            AddProductVo addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setUniqueId("1232")
                    .setMetadata("metaData")
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(true)
                    .setAllowUserPrice(true)
                    .setUnlimited(true)
                    .setCurrencyCode("USD")
                    .setAttTemplateCode("پیراهن مردانه")
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTres)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setPreviewImage("")
                    .setTagTreeCategoryName("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.addProduct(addProductVo, new OnGetResponseListener<ProductSrv>() {
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
    public void addProduct_SomeRequiredParameters_Price() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("ce75cca723fe43bba437e07214651a89")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();

        try {
            AddProductVo addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setUniqueId("1232")
                    .setMetadata("metaData")
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(true)
                    .setAllowUserPrice(true)
                    .setUnlimited(true)
                    .setCurrencyCode("USD")
                    .setAttTemplateCode("پیراهن مردانه")
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTres)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setPreviewImage("")
                    .setTagTreeCategoryName("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.addProduct(addProductVo, new OnGetResponseListener<ProductSrv>() {
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
    public void addProduct_SomeRequiredParameters_Discount() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("ce75cca723fe43bba437e07214651a89")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();

        try {
            AddProductVo addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setUniqueId("1232")
                    .setMetadata("metaData")
                    .setGuildCode("CLOTHING_GUILD")
                    .setAllowUserInvoice(true)
                    .setAllowUserPrice(true)
                    .setUnlimited(true)
                    .setCurrencyCode("USD")
                    .setAttTemplateCode("پیراهن مردانه")
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setTags(tags)
                    .setTagTrees(tagTres)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setPreviewImage("")
                    .setTagTreeCategoryName("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
            podProduct.addProduct(addProductVo, new OnGetResponseListener<ProductSrv>() {
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
    public void addProduct_NoParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodProduct podProduct = new PodProduct();


        try {
            AddProductVo addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .build();
            podProduct.addProduct(addProductVo, new OnGetResponseListener<ProductSrv>() {
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
