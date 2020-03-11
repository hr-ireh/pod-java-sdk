package com.fanap.AIPlatform.sampleCode;

import com.fanap.podAIPlatform.controller.PodAIPlatform;
import com.fanap.podAIPlatform.data.modelSrv.*;
import com.fanap.podAIPlatform.data.modelVo.*;
import com.fanap.podAIPlatform.enums.EnumMode;
import com.fanap.podAIPlatform.util.Keys;
import com.fanap.podAIPlatform.util.OnGetResponseListener;
import com.fanap.podBaseService.exception.PodException;

import static com.fanap.podAIPlatform.util.Keys.*;

/**
 * Created by Z.gholinia on 11/9/2019.
 */
public class App {

    public static void main(String[] args) {
//        speechToText();
//        imageProcessingAuthentication();
//        NLUTransferMoney();
//        NLUPayBill();
//        NLUMobilePhoneCharging();
//        NLUGetBalance();
//        NLUIOT();
//        licensePlateReader();
    }

    private static void speechToText() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_SPEECH_TO_TEXT)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            SpeechToTextVo speechToTextVo = new SpeechToTextVo.Builder(baseInfoVo)
                    .setLinkFile("http://tilin.ir/kWwj26K")
                    .build();
            podAIPlatform.speechToText(speechToTextVo, new OnGetResponseListener<SpeechToTextSrv>() {
                @Override
                public void onResponse(ResultVo<SpeechToTextSrv> result) {
                    try {
                        System.out.println(result.getResult().getResult().getData().getText());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
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

    private static void imageProcessingAuthentication() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_IMAGE_PROCESSING)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            ImageProcessingAuthenticationVo imageProcessingAuthenticationVo = new ImageProcessingAuthenticationVo.Builder(baseInfoVo)
                    .setImage1("https://core.pod.ir:443/nzh/image/?imageId=110531&width=909&height=909&hashCode=16b11e5cf3c-0.42178732891944504")
                    .setImage2("https://core.pod.ir:443/nzh/image/?imageId=104132&width=409&height=409&hashCode=16afd4e69b5-0.30817062367834125")
                    .setMode(EnumMode.EASY)
                    .build();
            podAIPlatform.imageProcessingAuthentication(imageProcessingAuthenticationVo, new OnGetResponseListener<ImageProcessingAuthenticationSrv>() {
                @Override
                public void onResponse(ResultVo<ImageProcessingAuthenticationSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getStatusMessage());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
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

    private static void NLUTransferMoney() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_NLU_BANKING)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            NLUTransferMoneyVo nluTransferMoneyVo = new NLUTransferMoneyVo.Builder(baseInfoVo)
                    .setText("مبلغ 1 تومان از حساب 80000 به حساب 100000 واریز کن")
                    .build();
            podAIPlatform.NLUTransferMoney(nluTransferMoneyVo, new OnGetResponseListener<NLUTransferMoneySrv>() {
                @Override
                public void onResponse(ResultVo<NLUTransferMoneySrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getAmount());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
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

    private static void NLUPayBill() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_NLU_BANKING)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            NLUPayBillVo nluPayBillVo = new NLUPayBillVo.Builder(baseInfoVo)
                    .setText("قبض با شماره شناسایی 456456 را پرداخت کن")
                    .build();
            podAIPlatform.NLUPayBill(nluPayBillVo, new OnGetResponseListener<NLUPayBillSrv>() {
                @Override
                public void onResponse(ResultVo<NLUPayBillSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getIntent());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
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

    private static void NLUMobilePhoneCharging() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_NLU_BANKING)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            NLUMobilePhoneChargingVo nluMobilePhoneChargingVo = new NLUMobilePhoneChargingVo.Builder(baseInfoVo)
                    .setText("شماره موبایل 456456 را به مبلغ 1 تومان شارژ کن")
                    .build();
            podAIPlatform.NLUMobilePhoneCharging(nluMobilePhoneChargingVo, new OnGetResponseListener<NLUMobilePhoneChargingSrv>() {
                @Override
                public void onResponse(ResultVo<NLUMobilePhoneChargingSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getAmount());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
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

    private static void NLUGetBalance() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_NLU_BANKING)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            NLUGetBalanceVo nluGetBalanceVo = new NLUGetBalanceVo.Builder(baseInfoVo)
                    .setText("موجودی شماره حساب 123545 را بده")
                    .build();
            podAIPlatform.NLUGetBalance(nluGetBalanceVo, new OnGetResponseListener<NLUGetBalanceSrv>() {
                @Override
                public void onResponse(ResultVo<NLUGetBalanceSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getIntent());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
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


    private static void NLUIOT() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setScApiKey(SC_API_KEY_NLU_IOT)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodAIPlatform podAIPlatform = new PodAIPlatform();
        try {
            NLUIOTVo nluiotVo = new NLUIOTVo.Builder(baseInfoVo)
                    .setText("تلویزیون را روشن کن")
                    .build();
            podAIPlatform.NLUIOT(nluiotVo, new OnGetResponseListener<NLUIOTSrv>() {
                @Override
                public void onResponse(ResultVo<NLUIOTSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
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

    private static void licensePlateReader() {
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
                        System.out.println(result.getResult().getResult().getStatusCode());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
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
