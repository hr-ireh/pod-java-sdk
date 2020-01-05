import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.JsonUtil;
import com.fanap.podProduct.controller.PodProduct;
import com.fanap.podProduct.data.modelSrv.ProductSrv;
import com.fanap.podProduct.data.modelVo.AddProductVo;
import com.fanap.podProduct.data.modelVo.BaseInfoVo;
import com.fanap.podProduct.data.modelVo.ResultVo;
import com.fanap.podProduct.data.modelVo.UpdateProductsVo;
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

public class TestUpdateProducts {
    @Test
    public void updateProducts_RequiredParameters() {
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
        AddProductVo addProductVo = null;
        try {
            addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHA")
                    .setCanComment(false)
                    .setCanLike(true)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setDescription("hhi")
                    .build();
        } catch (PodException e) {
        }
        List<AddProductVo> addProductVos = new ArrayList<>();
        addProductVos.add(addProductVo);

        try {
            UpdateProductsVo updateProductsVo = new UpdateProductsVo.Builder(baseInfoVo)
                    .setData(addProductVos)
                    .setChangePreview(false)
                    .build();
            podProduct.updateProducts(updateProductsVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult().get(0).getDescription());
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
    public void updateProducts_AllParameters() {
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
        AddProductVo addProductVo = null;

        try {
            addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHA")
                    .setCanComment(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setDescription("ddd")
                    .setCanLike(false)
                    .setEntityId(29990L)
                    .setTags(tags)
                    .setAllowUserInvoice(true)
                    .setAllowUserPrice(false)
                    .setAttTemplateCode("")
                    .setBusinessId(2841073L)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setCurrencyCode("USD")
                    .setGuildCode("CLOTHING_GUILD")
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setMetadata(metaData)
                    .setDescription("hhi")
                    .build();
        } catch (PodException e) {
        }
        List<AddProductVo> addProductVos = new ArrayList<>();
        addProductVos.add(addProductVo);

        try {
            UpdateProductsVo updateProductsVo = new UpdateProductsVo.Builder(baseInfoVo)
                    .setData(addProductVos)
                    .setChangePreview(false)
                    .build();
            podProduct.updateProducts(updateProductsVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult().get(0).getDescription());
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
    public void updateProducts_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodProduct podProduct = new PodProduct();
        try {
            UpdateProductsVo updateProductsVo = new UpdateProductsVo.Builder(baseInfoVo)
                    .build();
            podProduct.updateProducts(updateProductsVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult().get(0).getDescription());
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
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void updateProducts_SomeRequiredParameters_Data() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
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
        AddProductVo addProductVo = null;

        try {
            addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHA")
                    .setCanComment(false)
                    .setAvailableCount(10)
                    .setEnable(true)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setDescription("ddd")
                    .setEntityId(29990L)
                    .setTags(tags)
                    .setAllowUserInvoice(false)
                    .setAllowUserPrice(false)
                    .setAttTemplateCode("")
                    .setBusinessId(2841073L)
                    .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
                    .setCurrencyCode("USD")
                    .setGuildCode("CLOTHING_GUILD")
                    .setLat(36.3183414)
                    .setLng(59.5370587)
                    .setMetadata(metaData)
                    .build();
        } catch (PodException e) {
        }
        List<AddProductVo> addProductVos = new ArrayList<>();
        addProductVos.add(addProductVo);

        try {
            UpdateProductsVo updateProductsVo = new UpdateProductsVo.Builder(baseInfoVo)
                    .setChangePreview(false)
                    .build();
            podProduct.updateProducts(updateProductsVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult().get(0).getDescription());
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
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


}
