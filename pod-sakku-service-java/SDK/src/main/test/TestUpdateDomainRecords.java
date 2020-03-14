import com.fanap.podSakku.controller.PodSakku;
import com.fanap.podSakku.data.modelSrv.DomainRRSet;
import com.fanap.podSakku.data.modelSrv.DomainRecord;
import com.fanap.podSakku.data.modelVo.BaseInfoVo;
import com.fanap.podSakku.data.modelVo.ResultVo;
import com.fanap.podSakku.data.modelVo.UpdateDomainRecordVo;
import com.fanap.podSakku.enums.EnumRecordType;
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

public class TestUpdateDomainRecords {
    private static String TOKEN = "";

    @Test
    public void updateDomainRecords_AllParameters() {
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
            UpdateDomainRecordVo updateDomainRecordVo = new UpdateDomainRecordVo.Builder(baseInfoVo)
                    .setDomain("testsdk1.com")
                    .setRecord(domainRRSet)
                    .setName("t1estSDk")
                    .setType(EnumRecordType.SOA)
                    .build();
            podSakku.updateDomainRecord(updateDomainRecordVo, new OnGetResponseListener<Boolean>() {
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
    public void updateDomainRecords_RequiredParameters_Domain() {
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
            UpdateDomainRecordVo updateDomainRecordVo = new UpdateDomainRecordVo.Builder(baseInfoVo)
                    .setRecord(domainRRSet)
                    .setName("z")
                    .setType(EnumRecordType.SOA)
                    .build();
            podSakku.updateDomainRecord(updateDomainRecordVo, new OnGetResponseListener<Boolean>() {
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
    public void updateDomainRecords_RequiredParameters_Record() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setAuthorization(TOKEN)
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            UpdateDomainRecordVo updateDomainRecordVo = new UpdateDomainRecordVo.Builder(baseInfoVo)
                    .setDomain("testsdk1.com")
                    .setName("t1estSDk")
                    .setType(EnumRecordType.SOA)
                    .build();
            podSakku.updateDomainRecord(updateDomainRecordVo, new OnGetResponseListener<Boolean>() {
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
    public void updateDomainRecords_RequiredParameters_Name() {
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
            UpdateDomainRecordVo updateDomainRecordVo = new UpdateDomainRecordVo.Builder(baseInfoVo)
                    .setDomain("testsdk1.com")
                    .setRecord(domainRRSet)
                    .setType(EnumRecordType.SOA)
                    .build();
            podSakku.updateDomainRecord(updateDomainRecordVo, new OnGetResponseListener<Boolean>() {
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
    public void updateDomainRecords_RequiredParameters_Type() {
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
            UpdateDomainRecordVo updateDomainRecordVo = new UpdateDomainRecordVo.Builder(baseInfoVo)
                    .setDomain("testsdk1.com")
                    .setRecord(domainRRSet)
                    .setName("z")
                    .build();
            podSakku.updateDomainRecord(updateDomainRecordVo, new OnGetResponseListener<Boolean>() {
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
    public void updateDomainRecords_NoParameters() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .build();
        PodSakku podSakku = new PodSakku();
        try {
            UpdateDomainRecordVo updateDomainRecordVo = new UpdateDomainRecordVo.Builder(baseInfoVo)
                    .build();
            podSakku.updateDomainRecord(updateDomainRecordVo, new OnGetResponseListener<Boolean>() {
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
