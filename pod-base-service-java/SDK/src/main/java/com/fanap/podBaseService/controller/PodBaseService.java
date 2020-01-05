package com.fanap.podBaseService.controller;

import com.fanap.podBaseService.data.modelVo.*;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.service.Service;
import com.fanap.podBaseService.util.OnGetResponseListener;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class PodBaseService {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();


    /**
     * add Tag Tree Category.
     *
     * @param addTagTreeCategoryVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBaseService addTagTreeCategory(AddTagTreeCategoryVo addTagTreeCategoryVo,
                                             OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addTagTreeCategory(addTagTreeCategoryVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }




    /**
     * get Tag Tree Category List.
     *
     * @param getTagTreeCategoryListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBaseService getTagTreeCategoryList(GetTagTreeCategoryListVo getTagTreeCategoryListVo,
                                                 OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getTagTreeCategoryList(getTagTreeCategoryListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     * update Tag Tree Category.
     *
     * @param updateTagTreeCategoryVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBaseService updateTagTreeCategory(UpdateTagTreeCategoryVo updateTagTreeCategoryVo,
                                                OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateTagTreeCategory(updateTagTreeCategoryVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * add Tag Tree.
     *
     * @param addTagTreeVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBaseService addTagTree(AddTagTreeVo addTagTreeVo,
                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addTagTree(addTagTreeVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * get Tag Tree List.
     *
     * @param getTagTreeListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBaseService getTagTreeList(GetTagTreeListVo getTagTreeListVo,
                                         OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getTagTreeList(getTagTreeListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }



    /**
     * update Tag Tree.
     *
     * @param updateTagTreeVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBaseService updateTagTree(UpdateTagTreeVo updateTagTreeVo,
                                        OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateTagTree(updateTagTreeVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
    /**
     *remove Auto Settlement.
     *
     * @param currencyListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodBaseService getCurrencyList(CurrencyListVo currencyListVo, OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getCurrencyList(currencyListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


}
