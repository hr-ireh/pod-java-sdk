import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.controller.PodProduct;
import com.fanap.podProduct.data.modelSrv.SearchProductSrv;
import com.fanap.podProduct.data.modelVo.BaseInfoVo;
import com.fanap.podProduct.data.modelVo.ResultVo;
import com.fanap.podProduct.data.modelVo.SearchSubProductVo;
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

public class TestSearchSubProduct {


    @Test
    public void searchSubProduct_RequiredParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        List<Long> productGroupIds = new ArrayList<>();
        productGroupIds.add(1903L);
        PodProduct podProduct = new PodProduct();

        try {
            SearchSubProductVo searchSubProductVo = new SearchSubProductVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setProductGroupId(productGroupIds)
                    .build();
            podProduct.searchSubProduct(searchSubProductVo, new OnGetResponseListener<SearchProductSrv>() {
                @Override
                public void onResponse(ResultVo<SearchProductSrv> result) {
                    System.out.println(result.getResult().getProducts().get(0).getId());
                    new Thread(() -> {
                        try {
                            assertEquals("PIRAHAn", result.getResult().getProducts().get(0).getName());
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
    public void searchSubProduct_AllParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        List<Long> productGroupIds = new ArrayList<>();
        productGroupIds.add(1903L);
        PodProduct podProduct = new PodProduct();
        List<String> attributeCodes = new ArrayList<>();
        attributeCodes.add("");
        List<String> attributeValues = new ArrayList<>();
        attributeValues.add("");
        List<String> tags = new ArrayList<>();
        tags.add("");
        List<String> tagTrees = new ArrayList<>();
        tagTrees.add("");

        try {
            SearchSubProductVo searchSubProductVo = new SearchSubProductVo.Builder(baseInfoVo)
                    .setSize(50)
                    .setOffset(0)
                    .setProductGroupId(productGroupIds)
                    .setQuery("\"scProvider\",\"nam\"")
                    .setAttributeCode(attributeCodes)
                    .setAttributeValue(attributeValues)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .build();
            podProduct.searchSubProduct(searchSubProductVo, new OnGetResponseListener<SearchProductSrv>() {
                @Override
                public void onResponse(ResultVo<SearchProductSrv> result) {
                    System.out.println(result.getResult().getProducts().get(0).getId());
                    new Thread(() -> {
                        try {
                            assertEquals("PIRAHAn", result.getResult().getProducts().get(0).getName());
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
    public void searchSubProduct_SomeRequiredParameters_Offset() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        List<Long> productGroupIds = new ArrayList<>();
        productGroupIds.add(1903L);
        PodProduct podProduct = new PodProduct();
        List<String> attributeCodes = new ArrayList<>();
        attributeCodes.add("");
        List<String> attributeValues = new ArrayList<>();
        attributeValues.add("");
        List<String> tags = new ArrayList<>();
        tags.add("");
        List<String> tagTrees = new ArrayList<>();
        tagTrees.add("");

        try {
            SearchSubProductVo searchSubProductVo = new SearchSubProductVo.Builder(baseInfoVo)
                    .setSize(50)
                    .setProductGroupId(productGroupIds)
                    .setQuery("\"scProvider\",\"nam\"")
                    .setAttributeCode(attributeCodes)
                    .setAttributeValue(attributeValues)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .build();
            podProduct.searchSubProduct(searchSubProductVo, new OnGetResponseListener<SearchProductSrv>() {
                @Override
                public void onResponse(ResultVo<SearchProductSrv> result) {
                    System.out.println(result.getResult().getProducts().get(0).getId());
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
    public void searchSubProduct_SomeRequiredParameters_ProductGroupId() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        List<Long> productGroupIds = new ArrayList<>();
        productGroupIds.add(1903L);
        PodProduct podProduct = new PodProduct();
        List<String> attributeCodes = new ArrayList<>();
        attributeCodes.add("");
        List<String> attributeValues = new ArrayList<>();
        attributeValues.add("");
        List<String> tags = new ArrayList<>();
        tags.add("");
        List<String> tagTrees = new ArrayList<>();
        tagTrees.add("");

        try {
            SearchSubProductVo searchSubProductVo = new SearchSubProductVo.Builder(baseInfoVo)
                    .setSize(50)
                    .setOffset(0)
                    .setQuery("\"scProvider\",\"nam\"")
                    .setAttributeCode(attributeCodes)
                    .setAttributeValue(attributeValues)
                    .setTags(tags)
                    .setTagTrees(tagTrees)
                    .build();
            podProduct.searchSubProduct(searchSubProductVo, new OnGetResponseListener<SearchProductSrv>() {
                @Override
                public void onResponse(ResultVo<SearchProductSrv> result) {
                    System.out.println(result.getResult().getProducts().get(0).getId());
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
    public void searchSubProduct_NoParameters() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        List<Long> productGroupIds = new ArrayList<>();
        productGroupIds.add(1903L);
        PodProduct podProduct = new PodProduct();

        try {
            SearchSubProductVo searchSubProductVo = new SearchSubProductVo.Builder(baseInfoVo)
                    .build();
            podProduct.searchSubProduct(searchSubProductVo, new OnGetResponseListener<SearchProductSrv>() {
                @Override
                public void onResponse(ResultVo<SearchProductSrv> result) {
                    System.out.println(result.getResult().getProducts().get(0).getId());
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
