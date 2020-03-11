import com.fanap.podAIPlatform.controller.PodAIPlatform;
import com.fanap.podAIPlatform.data.modelSrv.LicensePlateReaderSrv;
import com.fanap.podAIPlatform.data.modelVo.BaseInfoVo;
import com.fanap.podAIPlatform.data.modelVo.LicensePlateReaderVo;
import com.fanap.podAIPlatform.data.modelVo.ResultVo;
import com.fanap.podAIPlatform.util.OnGetResponseListener;
import com.fanap.podBaseService.exception.PodException;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podAIPlatform.util.Keys.SC_API_KEY_LICENSE_PLATE_READER;
import static com.fanap.podAIPlatform.util.Keys.TOKEN;
import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestLicensePlateReader {

    @Test
    public void licensePlateReader_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_LICENSE_PLATE_READER)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            LicensePlateReaderVo licensePlateReaderVo = new LicensePlateReaderVo.Builder(baseInfoVo)
                    .setCrop(false)
                    .setImage("http://mepatogh.ir/wp-content/uploads/2016/04/5712234300227-mepatogh.ir.jpg")
                    .build();
            podAIPlatform.licensePlateReader(licensePlateReaderVo, new OnGetResponseListener<LicensePlateReaderSrv>() {
                @Override
                public void onResponse(ResultVo<LicensePlateReaderSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getResult().size());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
                    try {
                        assertEquals(false, result.isHasError());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void licensePlateReader_RequiredParameters_Image() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_LICENSE_PLATE_READER)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            LicensePlateReaderVo licensePlateReaderVo = new LicensePlateReaderVo.Builder(baseInfoVo)
                    .setCrop(false)
                    .build();
            podAIPlatform.licensePlateReader(licensePlateReaderVo, new OnGetResponseListener<LicensePlateReaderSrv>() {
                @Override
                public void onResponse(ResultVo<LicensePlateReaderSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getResult().size());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void licensePlateReader_RequiredParameters_IsCrop() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_LICENSE_PLATE_READER)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            LicensePlateReaderVo licensePlateReaderVo = new LicensePlateReaderVo.Builder(baseInfoVo)
                    .setImage("http://mepatogh.ir/wp-content/uploads/2016/04/5712234300227-mepatogh.ir.jpg")
                    .build();
            podAIPlatform.licensePlateReader(licensePlateReaderVo, new OnGetResponseListener<LicensePlateReaderSrv>() {
                @Override
                public void onResponse(ResultVo<LicensePlateReaderSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getResult().size());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void licensePlateReader_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            LicensePlateReaderVo licensePlateReaderVo = new LicensePlateReaderVo.Builder(baseInfoVo)
                    .build();
            podAIPlatform.licensePlateReader(licensePlateReaderVo, new OnGetResponseListener<LicensePlateReaderSrv>() {
                @Override
                public void onResponse(ResultVo<LicensePlateReaderSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getResult().size());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
                    try {
                        fail();
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }

                @Override
                public void onFailed(PodException e) {
                    try {
                        fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    } catch (AssertionFailedError el) {
                        optionalThrowable[0] = Optional.of(el);
                    }
                    cdl.countDown();
                }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887, e.getCode(), "code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

}
