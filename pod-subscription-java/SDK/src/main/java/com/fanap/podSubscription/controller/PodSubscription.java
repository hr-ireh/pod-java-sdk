package com.fanap.podSubscription.controller;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podSubscription.data.modelVo.*;
import com.fanap.podSubscription.service.Service;
import com.fanap.podSubscription.util.OnGetResponseListener;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class PodSubscription {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();

    /**
     * subscription list.
     * <p>
     * //    * @param subscriptionListVo
     *
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSubscription subscriptionList(SubscriptionListVo subscriptionListVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.subscriptionList(subscriptionListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * consume Subscription.
     * <p>
     * //    * @param consumeSubscriptionVo
     *
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSubscription consumeSubscription(ConsumeSubscriptionVo consumeSubscriptionVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.consumeSubscription(consumeSubscriptionVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * update Subscription Plan.
     * <p>
     * //    * @param updateSubscriptionPlanVo
     *
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSubscription updateSubscriptionPlan(UpdateSubscriptionPlanVo updateSubscriptionPlanVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.updateSubscriptionPlan(updateSubscriptionPlanVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Add subscription plan.
     *
     * @param addSubscriptionPlanVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSubscription addSubscriptionPlan(AddSubscriptionPlanVo addSubscriptionPlanVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addSubscriptionPlanList(addSubscriptionPlanVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Subscription plan List.
     *
     * @param subscriptionPlanListVo
     * @param onGetResponseListener  A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                               InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSubscription subscriptionPlanList(SubscriptionPlanListVo subscriptionPlanListVo,
                                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.subscriptionPlanList(subscriptionPlanListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * request Subscription.
     *
     * @param requestSubscriptionVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSubscription requestSubscription(RequestSubscriptionVo requestSubscriptionVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.requestSubscription(requestSubscriptionVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * confirmS ubscription.
     *
     * @param confirmSubscriptionVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodSubscription confirmSubscription(ConfirmSubscriptionVo confirmSubscriptionVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.confirmSubscription(confirmSubscriptionVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

}
