package com.fanap.AvandService.controller;

import com.fanap.AvandService.data.modelVo.*;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.AvandService.service.Service;
import com.fanap.AvandService.util.OnGetResponseListener;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class AvandService {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();

    /**
     * Issue invoice.
     *
     * @param issueInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public AvandService issueInvoice(IssueInvoiceVo issueInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.issueInvoice(issueInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list as file.
     *
     * @param cancelInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public AvandService cancelInvoice(CancelInvoiceVo cancelInvoiceVo,
                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.cancelInvoice(cancelInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     *verify Invoice.
     *
     * @param verifyInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public AvandService verifyInvoice(VerifyInvoiceVo verifyInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.verifyInvoice(verifyInvoiceVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list.
     *
     * @param getInvoiceListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public AvandService getInvoiceList(GetInvoiceListVo getInvoiceListVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getInvoiceList(getInvoiceListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

}
