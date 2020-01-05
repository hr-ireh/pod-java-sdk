package com.fanap.podBilling;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.DirectWithdrawSrv;
import com.fanap.billingService.data.modelVo.BaseInfoVo;
import com.fanap.billingService.data.modelVo.ResultVo;
import com.fanap.billingService.data.modelVo.UpdateDirectWithdrawVo;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestUpdateDirectWithdraw {
    private final String TOKEN = "";

    @Test
    public void updateDirectWithdraw_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        File xmlFile = new File("info.xml");

        try {
            UpdateDirectWithdrawVo updateDirectWithdrawVo = new UpdateDirectWithdrawVo.Builder(baseInfoVo)
                    .setId(21L)
                    .setUsername("zahraz")
                    .setPrivateKey(xmlFile)
//                    .setPrivateKey("<RSAKeyValue><Modulus>p432JnQ+HxV2jzFv+i1bG3mEBoCrca0BcRiPBIjKJ+ay3IVVEx71C9IhTdIm1vnzzxufmpU5HA3IzUuo+YfVjybn6aZp78AjH2BInQyl43NNVGZyLBJ0YXnHKaZuWBlxnW25tzUshlJtphDHuHxaXDkuccKc0ze0BQjQ98/bBL0=</Modulus><Exponent>AQAB</Exponent><P>18o6JZPz6ftCukdjfYUfAlr5kUQuGE6aYVF7md493vbyx30FF5Js/8EstoHVXyI82BLm8UkSG0C8PMPKNIRJzw==</P><Q>xsbF16w14Foff1MXcuVW8jfZKbMKTdDpMEfzK8jQNROND1B3uLfxmFCLI3/SVuRYfPd65psxIxYn3V5Imq1Hsw==</Q><DP>cl0F9hZ0hcQZODpPex2LMqdebuOwfkdiQEN7+y8yoTFFt/4FLdn3lJAfj1Y97B5sGqPh62yrgPANEzM8vhqCNw==</DP><DQ>JzCfZwMr6By8owTF1cBDoSPDrAYBnQ/4Oa2l0tcXva8qG3/Y6tFRT59pn0kfNkR08cZ1M6wbRviiSXHCTMSnIw==</DQ><InverseQ>KXUY0Rtae0YgJ/QdZ6+AkvzuyYDohzRmrzY8AHgDUnNbYN5kzdsEAPC1fhkScPAA7MH420Fl2FH9V4f9I04yFg==</InverseQ><D>H2c4+i4RMow4Q1A1t4Lmr3iP6RQWjeCqA4Nh0qy8jsvrO+91aXcE4GlKuqYnh2Ujb+6ydCuBn6NpvihvDA2MVdF20KZW4PZX0Bq+yj/WV4hH9mOoUKE86rZIU90rHNF0aRRPRAaCaIXCExyK9LvnGcDKjX0liD5pWPHDL8J2/9U=</D></RSAKeyValue>")
                    .setDepositNumber("13692932")
                    .setOnDemand(true)
                    .setMinAmount(10000L)
                    .setMaxAmount(10000000L)
                    .setWallet("PODLAND_WALLET")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.updateDirectWithdraw(updateDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
                    System.out.println(result.getResult().getUsername());
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
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                            assertEquals(78,e.getCode());
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
        } catch (IOException e) {
            fail();
        }

    }

    @Test
    public void updateDirectWithdraw_RequiredParameters()  {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        File xmlFile = new File("info.xml");

        try {
            UpdateDirectWithdrawVo updateDirectWithdrawVo = new UpdateDirectWithdrawVo.Builder(baseInfoVo)
                    .setId(21L)
                    .build();
            billingService.updateDirectWithdraw(updateDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
                    System.out.println(result.getResult().getUsername());
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
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                            assertEquals(78,e.getCode());
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
    public void updateDirectWithdraw_RequiredParameters_Id() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
//        List<String> voucherHashs =new ArrayList<>();
//        voucherHashs.add("YELZF7WUHRLD");
        File xmlFile = new File("info.xml");

        try {
            UpdateDirectWithdrawVo updateDirectWithdrawVo = new UpdateDirectWithdrawVo.Builder(baseInfoVo)
                    .setUsername("zahraz")
                    .setPrivateKey(xmlFile)
//                    .setPrivateKey("<RSAKeyValue><Modulus>p432JnQ+HxV2jzFv+i1bG3mEBoCrca0BcRiPBIjKJ+ay3IVVEx71C9IhTdIm1vnzzxufmpU5HA3IzUuo+YfVjybn6aZp78AjH2BInQyl43NNVGZyLBJ0YXnHKaZuWBlxnW25tzUshlJtphDHuHxaXDkuccKc0ze0BQjQ98/bBL0=</Modulus><Exponent>AQAB</Exponent><P>18o6JZPz6ftCukdjfYUfAlr5kUQuGE6aYVF7md493vbyx30FF5Js/8EstoHVXyI82BLm8UkSG0C8PMPKNIRJzw==</P><Q>xsbF16w14Foff1MXcuVW8jfZKbMKTdDpMEfzK8jQNROND1B3uLfxmFCLI3/SVuRYfPd65psxIxYn3V5Imq1Hsw==</Q><DP>cl0F9hZ0hcQZODpPex2LMqdebuOwfkdiQEN7+y8yoTFFt/4FLdn3lJAfj1Y97B5sGqPh62yrgPANEzM8vhqCNw==</DP><DQ>JzCfZwMr6By8owTF1cBDoSPDrAYBnQ/4Oa2l0tcXva8qG3/Y6tFRT59pn0kfNkR08cZ1M6wbRviiSXHCTMSnIw==</DQ><InverseQ>KXUY0Rtae0YgJ/QdZ6+AkvzuyYDohzRmrzY8AHgDUnNbYN5kzdsEAPC1fhkScPAA7MH420Fl2FH9V4f9I04yFg==</InverseQ><D>H2c4+i4RMow4Q1A1t4Lmr3iP6RQWjeCqA4Nh0qy8jsvrO+91aXcE4GlKuqYnh2Ujb+6ydCuBn6NpvihvDA2MVdF20KZW4PZX0Bq+yj/WV4hH9mOoUKE86rZIU90rHNF0aRRPRAaCaIXCExyK9LvnGcDKjX0liD5pWPHDL8J2/9U=</D></RSAKeyValue>")
                    .setDepositNumber("13692932")
                    .setOnDemand(true)
                    .setMinAmount(10000L)
                    .setMaxAmount(10000000L)
                    .setWallet("PODLAND_WALLET")
//                    .setScVoucherHash(voucherHashs)
                    .build();
            billingService.updateDirectWithdraw(updateDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
                    System.out.println(result.getResult().getUsername());
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
        } catch (IOException e) {
         fail();
        }

    }

    @Test
    public void updateDirectWithdraw_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        BillingService billingService = new BillingService();

        try {
            UpdateDirectWithdrawVo updateDirectWithdrawVo = new UpdateDirectWithdrawVo.Builder(baseInfoVo)
                    .build();
            billingService.updateDirectWithdraw(updateDirectWithdrawVo, new OnGetResponseListener<DirectWithdrawSrv>() {
                @Override
                public void onResponse(ResultVo<DirectWithdrawSrv> result) {
                    System.out.println(result.getResult().getUsername());
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
