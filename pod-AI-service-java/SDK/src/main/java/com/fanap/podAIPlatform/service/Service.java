package com.fanap.podAIPlatform.service;

import com.fanap.podAIPlatform.data.modelSrv.*;
import com.fanap.podAIPlatform.data.modelVo.*;
import com.fanap.podAIPlatform.util.GetResult;
import com.fanap.podAIPlatform.util.OnGetResponseListener;
import com.fanap.podAIPlatform.util.ServerTypeSelectionUtil;
import com.fanap.podBaseService.util.RetrofitUtil;

/**
 * Created by Z.gholinia on 01/05/2020.
 */
public class Service {

    public void speechToText(SpeechToTextVo speechToTextVo,
                             OnGetResponseListener onGetResponseListener) {

        PodAIPlatform service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL()).create(PodAIPlatform.class);

        new GetResult<SpeechToTextSrv>(service.speechToText(
                speechToTextVo.getBaseInfoVo().getToken(),
                speechToTextVo.getBaseInfoVo().getToken_issuer(),
                speechToTextVo.getScProductId(),
                speechToTextVo.getBaseInfoVo().getScVoucherHash(),
                speechToTextVo.getBaseInfoVo().getScApiKey(),
                speechToTextVo.getLinkFile()
        ), onGetResponseListener).get();
    }


    public void imageProcessingAuthentication(ImageProcessingAuthenticationVo imageProcessingAuthenticationVo,
                                              OnGetResponseListener onGetResponseListener) {

        PodAIPlatform service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL())
                .create(PodAIPlatform.class);

        new GetResult<ImageProcessingAuthenticationSrv>(service.imageProcessingAuthentication(
                imageProcessingAuthenticationVo.getBaseInfoVo().getToken(),
                imageProcessingAuthenticationVo.getBaseInfoVo().getToken_issuer(),
                imageProcessingAuthenticationVo.getScProductId(),
                imageProcessingAuthenticationVo.getBaseInfoVo().getScVoucherHash(),
                imageProcessingAuthenticationVo.getBaseInfoVo().getScApiKey(),
                imageProcessingAuthenticationVo.getImage1(),
                imageProcessingAuthenticationVo.getImage2(),
                imageProcessingAuthenticationVo.getMode()
        ), onGetResponseListener).get();
    }

    public void NLUTransferMoney(NLUTransferMoneyVo nluTransferMoneyVo,
                                 OnGetResponseListener onGetResponseListener) {

        PodAIPlatform service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL())
                .create(PodAIPlatform.class);

        new GetResult<NLUTransferMoneySrv>(service.NLUTransferMoney(
                nluTransferMoneyVo.getBaseInfoVo().getToken(),
                nluTransferMoneyVo.getBaseInfoVo().getToken_issuer(),
                nluTransferMoneyVo.getScProductId(),
                nluTransferMoneyVo.getBaseInfoVo().getScVoucherHash(),
                nluTransferMoneyVo.getBaseInfoVo().getScApiKey(),
                nluTransferMoneyVo.getText()
        ), onGetResponseListener).get();
    }


    public void NLUPayBill(NLUPayBillVo nluPayBillVo,
                           OnGetResponseListener onGetResponseListener) {

        PodAIPlatform service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL())
                .create(PodAIPlatform.class);

        new GetResult<NLUPayBillSrv>(service.NLUPayBill(
                nluPayBillVo.getBaseInfoVo().getToken(),
                nluPayBillVo.getBaseInfoVo().getToken_issuer(),
                nluPayBillVo.getScProductId(),
                nluPayBillVo.getBaseInfoVo().getScVoucherHash(),
                nluPayBillVo.getBaseInfoVo().getScApiKey(),
                nluPayBillVo.getText()
        ), onGetResponseListener).get();
    }

    public void NLUMobilePhoneCharging(NLUMobilePhoneChargingVo nluMobilePhoneChargingVo,
                                       OnGetResponseListener onGetResponseListener) {

        PodAIPlatform service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL())
                .create(PodAIPlatform.class);

        new GetResult<NLUMobilePhoneChargingSrv>(service.NLUMobilePhoneCharging(
                nluMobilePhoneChargingVo.getBaseInfoVo().getToken(),
                nluMobilePhoneChargingVo.getBaseInfoVo().getToken_issuer(),
                nluMobilePhoneChargingVo.getScProductId(),
                nluMobilePhoneChargingVo.getBaseInfoVo().getScVoucherHash(),
                nluMobilePhoneChargingVo.getBaseInfoVo().getScApiKey(),
                nluMobilePhoneChargingVo.getText()
        ), onGetResponseListener).get();
    }


    public void NLUGetBalance(NLUGetBalanceVo nluGetBalanceVo,
                              OnGetResponseListener onGetResponseListener) {

        PodAIPlatform service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL())
                .create(PodAIPlatform.class);

        new GetResult<NLUGetBalanceSrv>(service.NLUGetBalance(
                nluGetBalanceVo.getBaseInfoVo().getToken(),
                nluGetBalanceVo.getBaseInfoVo().getToken_issuer(),
                nluGetBalanceVo.getScProductId(),
                nluGetBalanceVo.getBaseInfoVo().getScVoucherHash(),
                nluGetBalanceVo.getBaseInfoVo().getScApiKey(),
                nluGetBalanceVo.getText()
        ), onGetResponseListener).get();
    }


    public void NLUIOT(NLUIOTVo nluiotVo,
                       OnGetResponseListener onGetResponseListener) {

        PodAIPlatform service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL())
                .create(PodAIPlatform.class);

        new GetResult<NLUIOTSrv>(service.NLUIOT(
                nluiotVo.getBaseInfoVo().getToken(),
                nluiotVo.getBaseInfoVo().getToken_issuer(),
                nluiotVo.getScProductId(),
                nluiotVo.getBaseInfoVo().getScVoucherHash(),
                nluiotVo.getBaseInfoVo().getScApiKey(),
                nluiotVo.getText()
        ), onGetResponseListener).get();
    }

    public void licensePlateReader(LicensePlateReaderVo licensePlateReaderVo,
                                   OnGetResponseListener onGetResponseListener) {

        PodAIPlatform service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL())
                .create(PodAIPlatform.class);

        new GetResult<LicensePlateReaderSrv>(service.licensePlateReader(
                licensePlateReaderVo.getBaseInfoVo().getToken(),
                licensePlateReaderVo.getBaseInfoVo().getToken_issuer(),
                licensePlateReaderVo.getScProductId(),
                licensePlateReaderVo.getBaseInfoVo().getScVoucherHash(),
                licensePlateReaderVo.getBaseInfoVo().getScApiKey(),
                licensePlateReaderVo.getImage(),
                licensePlateReaderVo.getIsCrop()
        ), onGetResponseListener).get();
    }

}
