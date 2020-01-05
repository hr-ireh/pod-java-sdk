import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.controller.PodProduct;
import com.fanap.podProduct.data.modelSrv.ProductSrv;
import com.fanap.podProduct.data.modelVo.AddProductVo;
import com.fanap.podProduct.data.modelVo.AddProductsVo;
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

public class TestAddProducts {

    @Test
    public void addProductsdcsdcs_RequiredParameters() {
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
        PodProduct podProduct = new PodProduct();
        AddProductVo addProductVo1 = null;
        try {
            addProductVo1 = new AddProductVo.Builder(baseInfoVo)
                    .setName("product 1")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setDescription("product 1")
                    .build();
        } catch (PodException e) {
        }

        AddProductVo addProductVo2 = null;
        try {
            addProductVo2 = new AddProductVo.Builder(baseInfoVo)
                    .setName("product 2")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setDescription("product 2")
                    .build();
        } catch (PodException e) {
        }
        List<AddProductVo> addProductVos = new ArrayList<>();
        addProductVos.add(addProductVo1);
        addProductVos.add(addProductVo2);
        try {
            AddProductsVo addProductsVo = new AddProductsVo.Builder(baseInfoVo)
                    // .setBizId(7867L)
                    // .setCurrencyCode("USD")
                    // .setPreviewImage("")
                    .setData(addProductVos)
                    .build();
            podProduct.addProducts(addProductsVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult().get(0).getEntityId());
                    new Thread(() -> {
                        try {
                            assertEquals("product 1", result.getResult().get(0).getName());
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
    public void addProducts_AllParameters() {
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
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();
        AddProductVo addProductVo1 = null;
        try {
            addProductVo1 = new AddProductVo.Builder(baseInfoVo)
                    .setName("product 1")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setDescription("product 1")
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
                    .setTagTrees(tagTrees)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setPreviewImage("")
                    .setTagTreeCategoryName("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
        } catch (PodException e) {
        }

        AddProductVo addProductVo2 = null;
        try {
            addProductVo2 = new AddProductVo.Builder(baseInfoVo)
                    .setName("product 2")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setDescription("product 2")
                    .build();
        } catch (PodException e) {
        }
        List<AddProductVo> addProductVos = new ArrayList<>();
        addProductVos.add(addProductVo1);
        addProductVos.add(addProductVo2);
        try {
            AddProductsVo addProductsVo = new AddProductsVo.Builder(baseInfoVo)
                    .setBizId(7867L)
                    .setCurrencyCode("USD")
                    .setPreviewImage("")
                    .setData(addProductVos)
                    .build();
            podProduct.addProducts(addProductsVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult().get(0).getEntityId());
                    new Thread(() -> {
                        try {
                            assertEquals("product 1", result.getResult().get(0).getName());
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
    public void addProducts_SomeRequiredParameters_data() {
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
        String[] tags = {"tags1", "tags2"};
        String[] tagTrees = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();
        AddProductVo addProductVo1 = null;
        try {
            addProductVo1 = new AddProductVo.Builder(baseInfoVo)
                    .setName("product 1")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setDescription("product 1")
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
                    .setTagTrees(tagTrees)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setPreviewImage("")
                    .setTagTreeCategoryName("")
                    .setPreferredTaxRate(0D)
                    .setQuantityPrecision(0D)
                    .build();
        } catch (PodException e) {
        }

        AddProductVo addProductVo2 = null;
        try {
            addProductVo2 = new AddProductVo.Builder(baseInfoVo)
                    .setName("product 2")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setDescription("product 2")
                    .build();
        } catch (PodException e) {
        }
        List<AddProductVo> addProductVos = new ArrayList<>();
        addProductVos.add(addProductVo1);
        addProductVos.add(addProductVo2);
        try {
            AddProductsVo addProductsVo = new AddProductsVo.Builder(baseInfoVo)
                    .setBizId(7867L)
                    .setCurrencyCode("USD")
                    .setPreviewImage("")
                    .build();
            podProduct.addProducts(addProductsVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult().get(0).getEntityId());
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
    public void addProducts_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodProduct podProduct = new PodProduct();
        try {
            AddProductsVo addProductsVo = new AddProductsVo.Builder(baseInfoVo)
                    .build();
            podProduct.addProducts(addProductsVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult().get(0).getEntityId());
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
