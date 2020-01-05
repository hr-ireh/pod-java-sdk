package com.fanap.podSubscription.service;

import com.fanap.podBaseService.util.RetrofitUtil;
import com.fanap.podBaseService.util.ServerTypeSelectionUtil;
import com.fanap.podSubscription.data.modelSrv.SubscriptionFullSrv;
import com.fanap.podSubscription.data.modelSrv.SubscriptionPlanSrv;
import com.fanap.podSubscription.data.modelSrv.SubscriptionSrv;
import com.fanap.podSubscription.data.modelVo.*;
import com.fanap.podSubscription.util.GetResult;
import com.fanap.podSubscription.util.OnGetResponseListener;

import java.util.List;

/**
 * Created By Askarian on 5/28/2019
 */
public class Service {

    public void subscriptionList(SubscriptionListVo subscriptionListVo, OnGetResponseListener onGetResponseListener) {

        PodSubscription service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(subscriptionListVo.getBaseInfoVo().getServerType()))
                .create(PodSubscription.class);

        new GetResult<List<SubscriptionFullSrv>>(service.subscriptionList(
                subscriptionListVo.getBaseInfoVo().getToken(),
                subscriptionListVo.getBaseInfoVo().getToken_issuer(),
                subscriptionListVo.getScProductId(),
                subscriptionListVo.getBaseInfoVo().getScVoucherHash(),
                subscriptionListVo.getBaseInfoVo().getScApiKey(),
                subscriptionListVo.getSize(),
                subscriptionListVo.getOffset(),
                subscriptionListVo.getSubscriptionPlanId()
        ), onGetResponseListener).get();
    }

    public void consumeSubscription(ConsumeSubscriptionVo consumeSubscriptionVo, OnGetResponseListener onGetResponseListener) {

        PodSubscription service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(consumeSubscriptionVo.getBaseInfoVo().getServerType()))
                .create(PodSubscription.class);

        new GetResult<SubscriptionSrv>(service.consumeSubscription(
                consumeSubscriptionVo.getBaseInfoVo().getToken(),
                consumeSubscriptionVo.getBaseInfoVo().getToken_issuer(),
                consumeSubscriptionVo.getScProductId(),
                consumeSubscriptionVo.getBaseInfoVo().getScVoucherHash(),
                consumeSubscriptionVo.getBaseInfoVo().getScApiKey(),
                consumeSubscriptionVo.getId(),
                consumeSubscriptionVo.getUsedAmount()
        ), onGetResponseListener).get();
    }

    public void updateSubscriptionPlan(UpdateSubscriptionPlanVo updateSubscriptionPlanVo, OnGetResponseListener onGetResponseListener) {

        PodSubscription service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(updateSubscriptionPlanVo.getBaseInfoVo().getServerType()))
                .create(PodSubscription.class);

        new GetResult<SubscriptionPlanSrv>(service.updateSubscriptionPlan(
                updateSubscriptionPlanVo.getBaseInfoVo().getToken(),
                updateSubscriptionPlanVo.getBaseInfoVo().getToken_issuer(),
                updateSubscriptionPlanVo.getScProductId(),
                updateSubscriptionPlanVo.getBaseInfoVo().getScVoucherHash(),
                updateSubscriptionPlanVo.getBaseInfoVo().getScApiKey(),
                updateSubscriptionPlanVo.getId(),
                updateSubscriptionPlanVo.getPeriodTypeCode(),
                updateSubscriptionPlanVo.getPeriodTypeCount(),
                updateSubscriptionPlanVo.getUsageCountLimit(),
                updateSubscriptionPlanVo.getName(),
                updateSubscriptionPlanVo.getPrice(),
                updateSubscriptionPlanVo.getEnable()
        ), onGetResponseListener).get();
    }

    public void subscriptionPlanList(SubscriptionPlanListVo subscriptionPlanListVo,
                                     OnGetResponseListener onGetResponseListener) {

        PodSubscription service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(subscriptionPlanListVo.getBaseInfoVo().getServerType()))
                .create(PodSubscription.class);

        new GetResult<List<SubscriptionPlanSrv>>(service.subscriptionPlanList(
                subscriptionPlanListVo.getBaseInfoVo().getToken(),
                subscriptionPlanListVo.getBaseInfoVo().getToken_issuer(),
                subscriptionPlanListVo.getScProductId(),
                subscriptionPlanListVo.getBaseInfoVo().getScVoucherHash(),
                subscriptionPlanListVo.getBaseInfoVo().getScApiKey(),
                subscriptionPlanListVo.getPeriodTypeCode(),
                subscriptionPlanListVo.getPeriodTypeCountFrom(),
                subscriptionPlanListVo.getPeriodTypeCountTo(),
                subscriptionPlanListVo.getFromPrice(),
                subscriptionPlanListVo.getToPrice(),
                subscriptionPlanListVo.getOffset(),
                subscriptionPlanListVo.getEnable(),
                subscriptionPlanListVo.getSize(),
                subscriptionPlanListVo.getPermittedGuildCode(),
                subscriptionPlanListVo.getPermittedBusinessId(),
                subscriptionPlanListVo.getPermittedProductId(),
                subscriptionPlanListVo.getId(),
                subscriptionPlanListVo.getTypeCode(),
                subscriptionPlanListVo.getCurrencyCode()
        ), onGetResponseListener).get();
    }

    public void addSubscriptionPlanList(AddSubscriptionPlanVo addSubscriptionPlanVo,
                                        OnGetResponseListener onGetResponseListener) {

        PodSubscription service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(addSubscriptionPlanVo.getBaseInfoVo().getServerType()))
                .create(PodSubscription.class);

        new GetResult<SubscriptionPlanSrv>(service.addSubscriptionPlan(
                addSubscriptionPlanVo.getBaseInfoVo().getToken(),
                addSubscriptionPlanVo.getBaseInfoVo().getToken_issuer(),
                addSubscriptionPlanVo.getScProductId(),
                addSubscriptionPlanVo.getBaseInfoVo().getScVoucherHash(),
                addSubscriptionPlanVo.getBaseInfoVo().getScApiKey(),
                addSubscriptionPlanVo.getPeriodTypeCount(),
                addSubscriptionPlanVo.getUsageCountLimit(),
                addSubscriptionPlanVo.getUsageAmountLimit(),
                addSubscriptionPlanVo.getPermittedGuildCode(),
                addSubscriptionPlanVo.getPermittedBusinessId(),
                addSubscriptionPlanVo.getPermittedProductId(),
                addSubscriptionPlanVo.getEntityId(),
                addSubscriptionPlanVo.getName(),
                addSubscriptionPlanVo.getPrice(),
                addSubscriptionPlanVo.getPeriodTypeCode(),
                addSubscriptionPlanVo.getType(),
                addSubscriptionPlanVo.getGuildCode(),
                addSubscriptionPlanVo.getCurrencyCode()
        ), onGetResponseListener).get();
    }


    public void requestSubscription(RequestSubscriptionVo requestSubscriptionVo,
                                    OnGetResponseListener onGetResponseListener) {

        PodSubscription service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(requestSubscriptionVo.getBaseInfoVo().getServerType()))
                .create(PodSubscription.class);

        new GetResult<SubscriptionSrv>(service.requestSubscription(
                requestSubscriptionVo.getBaseInfoVo().getToken(),
                requestSubscriptionVo.getBaseInfoVo().getToken_issuer(),
                requestSubscriptionVo.getScProductId(),
                requestSubscriptionVo.getBaseInfoVo().getScVoucherHash(),
                requestSubscriptionVo.getBaseInfoVo().getScApiKey(),
                requestSubscriptionVo.getUserId(),
                requestSubscriptionVo.getSubscriptionPlanId()
        ), onGetResponseListener).get();
    }


    public void confirmSubscription(ConfirmSubscriptionVo confirmSubscriptionVo,
                                    OnGetResponseListener onGetResponseListener) {

        PodSubscription service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(confirmSubscriptionVo.getBaseInfoVo().getServerType()))
                .create(PodSubscription.class);

        new GetResult<SubscriptionSrv>(service.confirmSubscription(
                confirmSubscriptionVo.getBaseInfoVo().getToken(),
                confirmSubscriptionVo.getBaseInfoVo().getToken_issuer(),
                confirmSubscriptionVo.getScProductId(),
                confirmSubscriptionVo.getBaseInfoVo().getScVoucherHash(),
                confirmSubscriptionVo.getBaseInfoVo().getScApiKey(),
                confirmSubscriptionVo.getCode(),
                confirmSubscriptionVo.getSubscriptionId()
        ), onGetResponseListener).get();
    }

}
