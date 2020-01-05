package com.fanap.podTools.service;

import com.fanap.podTools.data.modelSrv.ServiceBillSrv;
import com.fanap.podTools.data.modelVo.PayBillVo;
import com.fanap.podTools.data.modelVo.PayedBillListVo;
import com.fanap.podTools.util.GetResult;
import com.fanap.podTools.util.OnGetResponseListener;
import com.fanap.podTools.util.RetrofitUtil;
import com.fanap.podTools.util.ServerTypeSelectionUtil;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class Service {


    public void payBill(PayBillVo payBillVo,
                        OnGetResponseListener onGetResponseListener) {

        PodTools service = RetrofitUtil
                .getInstance()
                .create(PodTools.class);

        new GetResult<ServiceBillSrv>(service.payBill(
                payBillVo.getBaseInfoVo().getToken(),
                payBillVo.getBaseInfoVo().getToken_issuer(),
                payBillVo.getScProductId(),
                payBillVo.getBaseInfoVo().getScVoucherHash(),
                payBillVo.getBaseInfoVo().getScApiKey(),
                payBillVo.getBillId(),
                payBillVo.getPaymentId()

        ), onGetResponseListener).get();
    }


    public void payedBillList(PayedBillListVo payedBillListVo,
                              OnGetResponseListener onGetResponseListener) {

        PodTools service = RetrofitUtil
                .getInstance()
                .create(PodTools.class);

        new GetResult<List<ServiceBillSrv>>(service.payedBillList(
                payedBillListVo.getBaseInfoVo().getToken(),
                payedBillListVo.getBaseInfoVo().getToken_issuer(),
                payedBillListVo.getScProductId(),
                payedBillListVo.getBaseInfoVo().getScVoucherHash(),
                payedBillListVo.getBaseInfoVo().getScApiKey(),
                payedBillListVo.getId(),
                payedBillListVo.getReferenceNumber(),
                payedBillListVo.getFromDate(),
                payedBillListVo.getToDate(),
                payedBillListVo.getBillId(),
                payedBillListVo.getPaymentId(),
                payedBillListVo.getOffset(),
                payedBillListVo.getSize()


        ), onGetResponseListener).get();
    }


}
