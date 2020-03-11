package com.fanap.podAIPlatform.controller;

import com.fanap.podAIPlatform.data.modelVo.*;
import com.fanap.podAIPlatform.service.Service;
import com.fanap.podAIPlatform.util.OnGetResponseListener;
import com.fanap.podBaseService.exception.PodException;

/**
 * Created by Z.gholinia on 01/05/2020.
 */
public class PodAIPlatform {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();

    /**
     * Bill Payment By Deposit.
     *
     * @param speechToTextVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodAIPlatform speechToText(SpeechToTextVo speechToTextVo,
                                      OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.speechToText(speechToTextVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Bill Payment By Deposit.
     *
     * @param imageProcessingAuthenticationVo
     * @param onGetResponseListener           A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                        InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodAIPlatform imageProcessingAuthentication(ImageProcessingAuthenticationVo imageProcessingAuthenticationVo,
                                                       OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.imageProcessingAuthentication(imageProcessingAuthenticationVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Bill Payment By Deposit.
     *
     * @param nluTransferMoneyVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodAIPlatform NLUTransferMoney(NLUTransferMoneyVo nluTransferMoneyVo,
                                          OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.NLUTransferMoney(nluTransferMoneyVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * Bill Payment By Deposit.
     *
     * @param nluPayBillVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodAIPlatform NLUPayBill(NLUPayBillVo nluPayBillVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.NLUPayBill(nluPayBillVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Bill Payment By Deposit.
     *
     * @param nluMobilePhoneChargingVo
     * @param onGetResponseListener    A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                 InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodAIPlatform NLUMobilePhoneCharging(NLUMobilePhoneChargingVo nluMobilePhoneChargingVo,
                                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.NLUMobilePhoneCharging(nluMobilePhoneChargingVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Bill Payment By Deposit.
     *
     * @param nluGetBalanceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodAIPlatform NLUGetBalance(NLUGetBalanceVo nluGetBalanceVo,
                                       OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.NLUGetBalance(nluGetBalanceVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Bill Payment By Deposit.
     *
     * @param nluiotVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodAIPlatform NLUIOT(NLUIOTVo nluiotVo,
                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.NLUIOT(nluiotVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * license Plate Reader.
     *
     * @param licensePlateReaderVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodAIPlatform licensePlateReader(LicensePlateReaderVo licensePlateReaderVo,
                                            OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null) {
            service.licensePlateReader(licensePlateReaderVo, onGetResponseListener);
        } else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

}

