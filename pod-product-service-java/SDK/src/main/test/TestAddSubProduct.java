import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.controller.PodProduct;
import com.fanap.podProduct.data.modelSrv.ProductSrv;
import com.fanap.podProduct.data.modelVo.AddSubProductVo;
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
public class TestAddSubProduct {
    @Test
    public void addSubProduct_RequiredParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("size");
        attCode.add("color");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        atValue.add("ddd");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        atGroup.add("false");
        PodProduct podProduct = new PodProduct();

        try {
            AddSubProductVo addSubProductVo = new AddSubProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setAvailableCount(9)
                    .setPrice(new BigDecimal(17500))
                    .setDiscount(new BigDecimal(0))
                    .build();
            podProduct.addSubProduct(addSubProductVo, new OnGetResponseListener<ProductSrv>() {
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
    public void addSubProduct_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("size");
        attCode.add("color");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        atValue.add("ddd");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        atGroup.add("false");
        PodProduct podProduct = new PodProduct();

        try {
            AddSubProductVo addSubProductVo = new AddSubProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setAvailableCount(9)
                    .setPrice(new BigDecimal(17500))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setGroupId(1903L)
                    .build();
            podProduct.addSubProduct(addSubProductVo, new OnGetResponseListener<ProductSrv>() {
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
    public void addSubProduct_SomeRequiredParameters_Name() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("size");
        attCode.add("color");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        atValue.add("ddd");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        atGroup.add("false");
        PodProduct podProduct = new PodProduct();

        try {
            AddSubProductVo addSubProductVo = new AddSubProductVo.Builder(baseInfoVo)
                    .setAvailableCount(9)
                    .setPrice(new BigDecimal(17500))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setGroupId(1903L)
                    .build();
            podProduct.addSubProduct(addSubProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
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
    public void addSubProduct_SomeRequiredParameters_AvailableCount() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("size");
        attCode.add("color");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        atValue.add("ddd");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        atGroup.add("false");
        PodProduct podProduct = new PodProduct();

        try {
            AddSubProductVo addSubProductVo = new AddSubProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setPrice(new BigDecimal(17500))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setGroupId(1903L)
                    .build();
            podProduct.addSubProduct(addSubProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(0));
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
    public void addSubProduct_SomeRequiredParameters_Price() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("size");
        attCode.add("color");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        atValue.add("ddd");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        atGroup.add("false");
        PodProduct podProduct = new PodProduct();

        try {
            AddSubProductVo addSubProductVo = new AddSubProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setAvailableCount(9)
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setGroupId(1903L)
                    .build();
            podProduct.addSubProduct(addSubProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(0));
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
    public void addSubProduct_SomeRequiredParameters_Discount() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("size");
        attCode.add("color");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        atValue.add("ddd");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        atGroup.add("false");
        PodProduct podProduct = new PodProduct();

        try {
            AddSubProductVo addSubProductVo = new AddSubProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setAvailableCount(9)
                    .setPrice(new BigDecimal(17500))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setGroupId(1903L)
                    .build();
            podProduct.addSubProduct(addSubProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(0));
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
    public void addSubProduct_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodProduct podProduct = new PodProduct();

        try {
            AddSubProductVo addSubProductVo = new AddSubProductVo.Builder(baseInfoVo)
                    .build();
            podProduct.addSubProduct(addSubProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(0));
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
