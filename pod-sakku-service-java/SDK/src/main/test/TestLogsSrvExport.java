import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelVo.LogsExportVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import com.fanap.podSakku.util.OnGetResponseListenerExportLogs;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
/**
 * Created by zahra Gholinia on 2/16/2020.
 */

public class TestLogsSrvExport {
    private static String TOKEN = "";

    @Test
    public void logsExport_RequiredParameters() {
        PodSakku podSakku = new PodSakku();
        try {
            LogsExportVo logsExportVo = new LogsExportVo.Builder()
                    .setAppId(2338L)
                    .setToken(TOKEN)
                    .build();
            podSakku.logsExport(logsExportVo, new OnGetResponseListenerExportLogs() {
                @Override
                public void onResponse(String result) {
                    System.out.println(result);
                    try {
                        assertEquals("it saved in logs.txt", result);
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
                    cdl.countDown();   }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    @Test
    public void logsExport_AllParameters() {
        PodSakku podSakku = new PodSakku();
        try {
            LogsExportVo logsExportVo = new LogsExportVo.Builder()
                    .setAppId(2338L)
                    .setToken(TOKEN)
                    .setFromDate("1569184200000")
                    .setToDate("1569184200000")
                    .build();
            podSakku.logsExport(logsExportVo, new OnGetResponseListenerExportLogs() {
                @Override
                public void onResponse(String result) {
                    System.out.println(result);
                    try {
                        assertEquals("it saved in logs.txt", result);
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
                    cdl.countDown();   }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            fail("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    @Test
    public void logsExport_NoParameters() {
        PodSakku podSakku = new PodSakku();
        try {
            LogsExportVo logsExportVo = new LogsExportVo.Builder()
                    .build();
            podSakku.logsExport(logsExportVo, new OnGetResponseListenerExportLogs() {
                @Override
                public void onResponse(String result) {
                    System.out.println(result);
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
                    cdl.countDown();   }
            });
            optional(countDownLatch());
        } catch (PodException e) {
            assertEquals(887,e.getCode(),"code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


}
