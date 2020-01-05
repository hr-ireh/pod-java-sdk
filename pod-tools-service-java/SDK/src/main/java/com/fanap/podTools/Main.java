package com.fanap.podTools;

import com.fanap.podTools.controller.PodTools;
import com.fanap.podTools.data.modelSrv.ServiceBillSrv;
import com.fanap.podTools.data.modelVo.BaseInfoVo;
import com.fanap.podTools.data.modelVo.PayBillVo;
import com.fanap.podTools.data.modelVo.PayedBillListVo;
import com.fanap.podTools.data.modelVo.ResultVo;
import com.fanap.podTools.exception.PodException;
import com.fanap.podTools.util.OnGetResponseListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */

public class Main {

    private static String TOKEN = "55c549bc0108451cbb9e6c3f8cd992a9";
    private static String API_KEY = "328a2508178d4d16b769712917c16dcc";


    public static void main(String[] args) {


        payBill();
        payedBillList();
    }


    private static void payBill() {
//        List<String> voucherHahss=new ArrayList<>();
//        voucherHahss.add("FGHUYUHJG");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("6bb14ce85f984f368f6605d73656a886")
                .setToken_issuer(1)
//                .setScVoucherHash(voucherHahss)
//                .setScApiKey("")
                .build();

        PodTools podTools = new PodTools();

        try {
            PayBillVo payBillVo = new PayBillVo.Builder(baseInfoVo)
                    .setBillId(123456L)
                    .setPaymentId(29883640L)
                    .build();
            podTools.payBill(payBillVo, new OnGetResponseListener<ServiceBillSrv>() {
                @Override
                public void onResponse(ResultVo<ServiceBillSrv> result) {
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


    private static void payedBillList() {
        //        List<String> voucherHahss=new ArrayList<>();
//        voucherHahss.add("FGHUYUHJG");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("6bb14ce85f984f368f6605d73656a886")
                .setToken_issuer(1)
//                .setScVoucherHash(voucherHahss)
//                .setScApiKey("")
                .build();

        PodTools podTools = new PodTools();
        try {
            PayedBillListVo payedBillListVo = new PayedBillListVo.Builder(baseInfoVo)

//                    .setBillId(5006002508016L)
//                    .setPaymentId(29883640L)
                    .setSize(50)
                    .setOffset(0)

                    .build();
            podTools.payedBillList(payedBillListVo, new OnGetResponseListener<List<ServiceBillSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ServiceBillSrv>> result) {
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


}
