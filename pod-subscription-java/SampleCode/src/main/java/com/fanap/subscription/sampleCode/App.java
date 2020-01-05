package com.fanap.subscription.sampleCode;

import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.controller.PodSubscription;
import com.fanap.podSubscription.data.modelSrv.SubscriptionFullSrv;
import com.fanap.podSubscription.data.modelSrv.SubscriptionPlanSrv;
import com.fanap.podSubscription.data.modelSrv.SubscriptionSrv;
import com.fanap.podSubscription.data.modelVo.*;
import com.fanap.podSubscription.enums.Enum_Period_Type_Code;
import com.fanap.podSubscription.enums.Enum_Type;
import com.fanap.podSubscription.util.OnGetResponseListener;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */

public class App {

    private static String TOKEN = "1c0898d03cef4c0a80741653aaa1b8ad";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    public static void main(String[] args) {

        addSubscriptionPlan();
//        subscriptionPlanList();
//        subscriptionList();
//        updateSubscriptionPlan();
//        consumeSubscription();
//        requestSubscription();
//        confirmSubscription();

    }

    private static void subscriptionList() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodSubscription podSubscription = new PodSubscription();


        try {
            SubscriptionListVo subscriptionListVo = new SubscriptionListVo.Builder(baseInfoVo)
                    .setOffset(0L)
                    .setSize(100L)
                    .setSubscriptionPlanId(41L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podSubscription.subscriptionList(subscriptionListVo, new OnGetResponseListener<List<SubscriptionFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionFullSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void consumeSubscription() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodSubscription billingService = new PodSubscription();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");

        try {
            ConsumeSubscriptionVo ConsumeSubscriptionVo = new ConsumeSubscriptionVo.Builder(baseInfoVo)
                    .setId(203L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            billingService.consumeSubscription(ConsumeSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void updateSubscriptionPlan() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        PodSubscription podSubscription = new PodSubscription();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");

        try {
            UpdateSubscriptionPlanVo UpdateSubscriptionPlanVo = new UpdateSubscriptionPlanVo.Builder(baseInfoVo)
                    .setId(62L).setPeriodTypeCount(2L).setPeriodTypeCode("SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY").
                            setEnable("true").setName("zahra").setPrice(10000L).setUsageCountLimit(3L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podSubscription.updateSubscriptionPlan(UpdateSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getPeriodTypeCode());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void subscriptionPlanList() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodSubscription podSubscription = new PodSubscription();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");

        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        List<Long> permittedBussinessId = new ArrayList<>();
        permittedBussinessId.add(4131L);

        List<Long> permittedProductId = new ArrayList<>();
        permittedProductId.add(16263L);

        try {
            SubscriptionPlanListVo subscriptionPlanListVo = new SubscriptionPlanListVo.Builder(baseInfoVo)
                    .setBaseInfoVo(baseInfoVo)
                    .setOffset(0L)
                    .setSize(10L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podSubscription.subscriptionPlanList(subscriptionPlanListVo, new OnGetResponseListener<List<SubscriptionPlanSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionPlanSrv>> result) {
                    System.out.println(result.getResult().size());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void addSubscriptionPlan() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodSubscription podSubscription = new PodSubscription();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");

        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        List<Long> permittedBussinessId = new ArrayList<>();
        permittedBussinessId.add(4131L);

        List<Long> permittedProductId = new ArrayList<>();
        permittedProductId.add(16263L);

        try {
            AddSubscriptionPlanVo addSubscriptionPlanVo = new AddSubscriptionPlanVo.Builder(baseInfoVo)
                    .setPeriodTypeCount(1L)
                    .setPermittedGuildCode(permittedGuildCodeList)
                    .setPermittedBusinessId(permittedBussinessId)
                    .setPermittedProductId(permittedProductId)
                    .setEntityId(16263L)
                    .setName("نام پلن")
                    .setPrice(new BigDecimal(1))
                    .setPeriodTypeCode(Enum_Period_Type_Code.SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY.getPeriodTypeCode())
                    .setType(Enum_Type.SUBSCRIPTION_PLAN_TYPE_CASH.getType())
                    .setGuildCode(GUILD_CODE)
                    .setCurrencyCode("IRR")
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podSubscription.addSubscriptionPlan(addSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void requestSubscription() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodSubscription podSubscription = new PodSubscription();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");

        try {
            RequestSubscriptionVo requestSubscriptionVo = new RequestSubscriptionVo.Builder(baseInfoVo)
                    .setSubscriptionPlanId(629L)
                    .setUserId(7001L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podSubscription.requestSubscription(requestSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void confirmSubscription() {
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodSubscription podSubscription = new PodSubscription();
//        List<String> scVoucherHashs=new ArrayList<>();
//        scVoucherHashs.add("ghjdshfjshf");

        try {
            ConfirmSubscriptionVo confirmSubscriptionVo = new ConfirmSubscriptionVo.Builder(baseInfoVo)
                    .setSubscriptionId(444L)
                    .setCode(2000968L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podSubscription.confirmSubscription(confirmSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


}
