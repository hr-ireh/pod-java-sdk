import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.DomainRRSet;
import com.fanap.podSakku.data.modelSrv.DomainRecord;
import com.fanap.podSakku.data.modelVo.AddDomainRecordVo;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.OnGetResponseListener;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.fanap.podBaseService.util.MyOptional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestAddDomainRecords {
    private static String TOKEN = "";

    @Test
    public void addDomainRecords_AllParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        DomainRecord domainRecord = new DomainRecord();
        domainRecord.setContent("ns.sakku.cloud. hostmaster.sakku.cloud. 2019112302 5400 1800 302400 1800");
        domainRecord.setDisabled(false);
        List<DomainRecord> domainRecords = new ArrayList<>();
        domainRecords.add(domainRecord);
        DomainRRSet domainRRSet = new DomainRRSet();
        domainRRSet.setName("t1estSDk");
        domainRRSet.setTtl(1);
        domainRRSet.setType("SOA");
        domainRRSet.setRecords(domainRecords);
        try {
            AddDomainRecordVo addDomainRecordVo = new AddDomainRecordVo.Builder(baseInfoVo)
                    .setDomain("testsdk1.com")
                    .setRecord(domainRRSet)
                    .build();
            podSakku.addDomainRecord(addDomainRecordVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                    try {
                        assertEquals(true, result.getResult());
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
    public void addDomainRecords_RequiredParameters_Domain() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        DomainRecord domainRecord = new DomainRecord();
        domainRecord.setContent("ns.sakku.cloud. hostmaster.sakku.cloud. 2019112302 5400 1800 302400 1800");
        domainRecord.setDisabled(false);
        List<DomainRecord> domainRecords = new ArrayList<>();
        domainRecords.add(domainRecord);
        DomainRRSet domainRRSet = new DomainRRSet();
//        domainRRSet.setName("testSDk");
        domainRRSet.setTtl(1);
        domainRRSet.setType("SOA");
        domainRRSet.setRecords(domainRecords);
        try {
            AddDomainRecordVo addDomainRecordVo = new AddDomainRecordVo.Builder(baseInfoVo)
                    .setRecord(domainRRSet)
                    .build();
            podSakku.addDomainRecord(addDomainRecordVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
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
    public void addDomainRecords_RequiredParameters_Record() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        DomainRecord domainRecord = new DomainRecord();
        domainRecord.setContent("ns.sakku.cloud. hostmaster.sakku.cloud. 2019112302 5400 1800 302400 1800");
        domainRecord.setDisabled(false);
        List<DomainRecord> domainRecords = new ArrayList<>();
        domainRecords.add(domainRecord);
        DomainRRSet domainRRSet = new DomainRRSet();
//        domainRRSet.setName("testSDk");
        domainRRSet.setTtl(1);
        domainRRSet.setType("SOA");
        domainRRSet.setRecords(domainRecords);
        try {
            AddDomainRecordVo addDomainRecordVo = new AddDomainRecordVo.Builder(baseInfoVo)
                    .setDomain("testsdk1.com")
                    .build();
            podSakku.addDomainRecord(addDomainRecordVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
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
    public void addDomainRecords_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            AddDomainRecordVo addDomainRecordVo = new AddDomainRecordVo.Builder(baseInfoVo)
                    .build();
            podSakku.addDomainRecord(addDomainRecordVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
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
