import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podVirtualAccount.controller.PodVirtualAccount;
import com.fanap.podVirtualAccount.data.modelSrv.BusinessSrv;
import com.fanap.podVirtualAccount.data.modelVo.BaseInfoVo;
import com.fanap.podVirtualAccount.data.modelVo.GetBusinessVo;
import com.fanap.podVirtualAccount.data.modelVo.ResultVo;
import com.fanap.podVirtualAccount.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestGetBusiness {


    private static String TOKEN = "";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    @Test
    public void getBusiness() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        try {
            GetBusinessVo getBusinessVo = new GetBusinessVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.getBusiness(getBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
                    new Thread(() -> {
                        try {
                            assertEquals(false, result.isHasError());
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
    public void getBusiness_NoParameters() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodVirtualAccount podVirtualAccount = new PodVirtualAccount();
        try {
            GetBusinessVo getBusinessVo = new GetBusinessVo.Builder(baseInfoVo)
                    .build();
            podVirtualAccount.getBusiness(getBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getId());
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
