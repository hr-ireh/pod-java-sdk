package com.fanap.podTools.controller;

import com.fanap.podTools.data.modelVo.PayBillVo;
import com.fanap.podTools.data.modelVo.PayedBillListVo;
import com.fanap.podTools.exception.PodException;
import com.fanap.podTools.service.Service;
import com.fanap.podTools.util.OnGetResponseListener;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class PodTools {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();


    /**
     * pay Bill.
     *
     * @param payBillVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodTools payBill(PayBillVo payBillVo,
                            OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.payBill(payBillVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * payed Bill List.
     *
     * @param payedBillListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodTools payedBillList(PayedBillListVo payedBillListVo,
                                  OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.payedBillList(payedBillListVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

}
