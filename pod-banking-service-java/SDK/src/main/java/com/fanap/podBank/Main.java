package com.fanap.podBank;

import com.fanap.podBank.controller.PodBanking;
import com.fanap.podBank.data.modelSrv.*;
import com.fanap.podBank.data.modelVo.*;
import com.fanap.podBank.util.OnGetResponseListener;
import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Z.gholinia on 11/9/2019.
 */
public class Main {

    private static String TOKEN = "";
    private static String API_KEY = "";


    public static void main(String[] args) {

//        getShebaInfo();
//        getDebitCardInfo();
//        getDepositNumberByCardNumber();
//        getShebaByCardNumber();
//        getCardInformation();
//        getSubmissionChque();
//        convertDepositNumberToSheba();
//        convertShebaToDeposit();
//        getDepositInvoice();
//        getDepositBalance();
//        transferMoney();
//        getTransferMoneyState();
//        billPaymentByDeposit();
//        cardToCard();
//        cardToCardList();
//        payaSerivice();
        getShebaAndStatus();

    }


    private static void getShebaInfo() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        try {
            GetShebaInfoVo getShebaInfoVo = new GetShebaInfoVo.Builder(baseInfoVo)
                    .setSheba("")
                    .build();
            podBanking.getShebaInfo(getShebaInfoVo, new OnGetResponseListener<ShebaInfoSrv>() {
                @Override
                public void onResponse(ResultVo<ShebaInfoSrv> result) {
                    System.out.println(result.getResult().getOwners().get(0).getLastName());
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


    private static void getDebitCardInfo() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        try {
            GetDebitCardInfoVo getDebitCardInfoVo = new GetDebitCardInfoVo.Builder(baseInfoVo)
                    .setCardNumber("")
                    .build();
            podBanking.getDebitCardInfo(getDebitCardInfoVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
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

    private static void getDepositNumberByCardNumber() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            GetDepositNumberByCardNumberVo getDepositNumberByCardNumberVo = new GetDepositNumberByCardNumberVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setSignatureInfo(signatureInfo)
                    .setCardNumber("")
                    .build();
            podBanking.getDepositNumberByCardNumber(getDepositNumberByCardNumberVo, new OnGetResponseListener<GetDepositNumberByCardNumberSrv>() {
                @Override
                public void onResponse(ResultVo<GetDepositNumberByCardNumberSrv> result) {
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


    private static void getShebaByCardNumber() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            GetShebaByCardNumberVo getShebaByCardNumberVo = new GetShebaByCardNumberVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setSignature(signatureInfo)
                    .setCardNumber("")
                    .build();
            podBanking.getShebaByCardNumber(getShebaByCardNumberVo, new OnGetResponseListener<GetShebaByCardNumberSrv>() {
                @Override
                public void onResponse(ResultVo<GetShebaByCardNumberSrv> result) {

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


    private static void getCardInformation() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            GetCardInformationVo getCardInformationVo = new GetCardInformationVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setSignature(signatureInfo)
                    .setSrcCardNumber("")
                    .setDestCardNumber("")
                    .setEmail("")
                    .build();
            podBanking.getCardInformation(getCardInformationVo, new OnGetResponseListener<GetCardInformationSrv>() {
                @Override
                public void onResponse(ResultVo<GetCardInformationSrv> result) {

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


    private static void getSubmissionChque() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            GetSubmissionChqueVo getSubmissionChqueVo = new GetSubmissionChqueVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setDeposit("")
                    .setMinAmount(0L)
//                    .setChequeNumber("")
                    .setMaxAmount(0L)
                    .setSignature(signatureInfo)
                    .setStartDate("")
                    .setEndDate("")
                    .setChequeStatus("0")
                    .setStartSubmisionDate("")
                    .setEndSubmitionDate("")
                    .setRowCount(10)
                    .setBankCode("")
                    .build();
            podBanking.getSubmissionChque(getSubmissionChqueVo, new OnGetResponseListener<GetSubmissionChqueSrv>() {
                @Override
                public void onResponse(ResultVo<GetSubmissionChqueSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().size());
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


    private static void convertShebaToDeposit() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            ConvertShebaToDepositVo convertShebaToDepositVo = new ConvertShebaToDepositVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setSignature(signatureInfo)
                    .setSheba("")
                    .build();
            podBanking.convertShebaToDeposit(convertShebaToDepositVo, new OnGetResponseListener<ConvertShebaToDepositSrv>() {
                @Override
                public void onResponse(ResultVo<ConvertShebaToDepositSrv> result) {

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

    private static void convertDepositNumberToSheba() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            ConvertDepositNumberToShebaVo convertDepositNumberToShebaVo = new ConvertDepositNumberToShebaVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setSignature(signatureInfo)
                    .setDepositNumber("")
                    .build();
            podBanking.convertDepositNumberToSheba(convertDepositNumberToShebaVo, new OnGetResponseListener<ConvertDepositNumberToShebaSrv>() {
                @Override
                public void onResponse(ResultVo<ConvertDepositNumberToShebaSrv> result) {

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

    private static void getDepositInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            GetDepositInvoiceVo getDepositInvoiceVo = new GetDepositInvoiceVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setCount(1)
                    .setFirstIndex(1)
                    .setDepositNumber("")
                    .setStartDate("")
                    .setEndDate("")
                    .setSignatureInfo(signatureInfo)
                    .setSheba("")
                    .build();
            podBanking.getDepositInvoice(getDepositInvoiceVo, new OnGetResponseListener<GetDepositInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<GetDepositInvoiceSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().size());
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

    private static void getDepositBalance() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            GetDepositBalanceVo getDepositBalanceVo = new GetDepositBalanceVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setDepositNumber("")
                    .setSignatureInfo(signatureInfo)
                    .build();
            podBanking.getDepositBalance(getDepositBalanceVo, new OnGetResponseListener<GetDepositBalanceSrv>() {
                @Override
                public void onResponse(ResultVo<GetDepositBalanceSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getAmounts());
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


    private static void transferMoney() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            TransferMoneyVo transferMoneyVo = new TransferMoneyVo.Builder(baseInfoVo)
                    .setUserName("")
//                    .setSourceSheba("IR930570100000014027212101")
//                    .setDestSheba("IR640170000000100001752007")
                    .setSourceDepositNumber("")
                    .setDestDepositNumber("")
//                    .setDestFirstName("")
//                    .setDestLastName("")
                    .setAmount("1")
                    .setPaymentId("1")
//                    .setDestDepositNumber("1001.800.66497.2")
//                    .setSourceDepositNumber("1001.800.66497.2")
                    .setSignature(signatureInfo)
                    .build();
            podBanking.transferMoney(transferMoneyVo, new OnGetResponseListener<TransferMoneySrv>() {
                @Override
                public void onResponse(ResultVo<TransferMoneySrv> result) {

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

    private static void getTransferMoneyState() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            GetTranfserStateVo getTranfserStateVo = new GetTranfserStateVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setDate("")
                    .setPaymentId("")
                    .setSignature(signatureInfo)
                    .build();
            podBanking.getTransferMoneyState(getTranfserStateVo, new OnGetResponseListener<GetTranfserStateSrv>() {
                @Override
                public void onResponse(ResultVo<GetTranfserStateSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getMessage());
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


    private static void billPaymentByDeposit() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            BillPaymentByDepositVo billPaymentByDepositVo = new BillPaymentByDepositVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setPaymentId("")
                    .setDepositNumber("")
                    .setBillNumber("")
                    .setSignature(signatureInfo)
                    .build();
            podBanking.billPaymentByDeposit(billPaymentByDepositVo, new OnGetResponseListener<BillPaymentByDepositSrv>() {
                @Override
                public void onResponse(ResultVo<BillPaymentByDepositSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getIsSuccess());
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


    private static void cardToCard() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        JsonDateContent jsonDateContent = new JsonDateContent();
        jsonDateContent.setDeviceId("");
        jsonDateContent.setIP("");
        jsonDateContent.setPlatfrom("");
        jsonDateContent.setOS("");
//        jsonDateContent.setUserAgent("");
        jsonDateContent.setImei("");

        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            CardToCardVo cardToCardVo = new CardToCardVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setSrcCardNumber("")
                    .setDestCardNumber("")
                    .setPassword("")
                    .setCvv2("")
                    .setExpireMonth("08")
                    .setExpireYear("00")
                    .setAmount(1L)
                    .setEmail("")
                    .setAuthorizationCode("0")
                    .setWithReferenceNumber(false)
                    .setCardName("")
                    .setSrcComment("")
                    .setDestComment("hiiiiiiiiiiiiiiiiiii")
                    .setOriginalAddress("")
                    .setExtraData(jsonDateContent)
                    .setSignature(signatureInfo)
                    .build();
            podBanking.cardToCard(cardToCardVo, new OnGetResponseListener<cardToCardSrv>() {
                @Override
                public void onResponse(ResultVo<cardToCardSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getIsSuccess());
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

    private static void cardToCardList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            CardToCardListVo cardToCardListVo = new CardToCardListVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setSourceCardNumber("")
                    .setDestinationCardNumber("")
                    .setMinAmount(1l)
                    .setMaxAmount(100L)
                    .setStartDate("2019/12/15")
                    .setEndDate("2019/12/17")
                    .setDestinationNote("11")
                    .setRefrenceNumber("22")
                    .setSequenceNumber("33")
                    .setSourceNote("44")
                    .setSignature(signatureInfo)
                    .build();
            podBanking.cardToCardList(cardToCardListVo, new OnGetResponseListener<CardToCardListSrv>() {
                @Override
                public void onResponse(ResultVo<CardToCardListSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getMessage());
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


    private static void payaSerivice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        BatchPayaItemInfoContents batchPayaItemInfoContents = new BatchPayaItemInfoContents();
        batchPayaItemInfoContents.setAmount(100L);
        batchPayaItemInfoContents.setBeneficiaryFullName("رضا زارع خواجه");
        batchPayaItemInfoContents.setDescription("بانک");
        batchPayaItemInfoContents.setDestShebaNumber("");
        batchPayaItemInfoContents.setBillNumber("");
        List<BatchPayaItemInfoContents> batchPayaItemInfoContentsList = new ArrayList<>();
      batchPayaItemInfoContentsList.add(batchPayaItemInfoContents);
        signatureInfo.setPrivateKey("");
        try {
            PayaSeriviceVo payaSeriviceVo = new PayaSeriviceVo.Builder(baseInfoVo)
                    .setUserName("")
                    .setSourceDepositNumber("")
                    .setFileUniqueIdentifier("")
                    .setBatchPayaItemInfos(batchPayaItemInfoContentsList)
                    .setSignature(signatureInfo)
                    .build();
            podBanking.payaService(payaSeriviceVo, new OnGetResponseListener<PayaSeriviceSrv>() {
                @Override
                public void onResponse(ResultVo<PayaSeriviceSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().get(0).getAmount());
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
    private static void getShebaAndStatus() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("");
        try {
            GetShebaAndStatusVo getShebaAndStatusVo = new GetShebaAndStatusVo.Builder(baseInfoVo)
                    .setUserName("")
                   .setSheba("")
                    .setShenaseVariz("")
                    .setSignatureInfo(signatureInfo)
                    .build();
            podBanking.getShebaAndStatus(getShebaAndStatusVo, new OnGetResponseListener<GetShebaAndStatusSrv>() {
                @Override
                public void onResponse(ResultVo<GetShebaAndStatusSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getAccountOwners().get(0).getFirstName());
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
