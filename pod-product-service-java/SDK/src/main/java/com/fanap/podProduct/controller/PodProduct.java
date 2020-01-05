package com.fanap.podProduct.controller;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.data.modelVo.*;
import com.fanap.podProduct.service.Service;
import com.fanap.podProduct.util.OnGetResponseListener;

/**
 * Created by Z.gholinia on 9/11/2019.
 */

public class PodProduct {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();


    /**
     * addP roduct.
     *
     * @param addProductVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodProduct addProduct(AddProductVo addProductVo,
                                 OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addProduct(addProductVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * add Products.
     *
     * @param addProductsVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodProduct addProducts(AddProductsVo addProductsVo,
                                  OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addProducts(addProductsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * update Product.
     *
     * @param updateProductVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodProduct updateProduct(UpdateProductVo updateProductVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateProduct(updateProductVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * update Products.
     *
     * @param updateProductsVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodProduct updateProducts(UpdateProductsVo updateProductsVo,
                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.updateProducts(updateProductsVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Product List.
     *
     * @param productListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodProduct getProductList(ProductListVo productListVo,
                                     OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getProductList(productListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Business Product List.
     *
     * @param businessProductListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodProduct getBusinessProductList(BusinessProductListVo businessProductListVo,
                                             OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getBusinessProductList(businessProductListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * get Attribute Template List.
     *
     * @param attributeTemplateListVo
     * @param onGetResponseListener   A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodProduct getAttributeTemplateList(AttributeTemplateListVo attributeTemplateListVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getAttributeTemplateList(attributeTemplateListVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * add sub Product.
     *
     * @param addSubProductVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodProduct addSubProduct(AddSubProductVo addSubProductVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.addSubProduct(addSubProductVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * search Product.
     *
     * @param searchProductVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodProduct searchProduct(SearchProductVo searchProductVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.searchProduct(searchProductVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


    /**
     * search SubProduct.
     *
     * @param searchSubProductVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public PodProduct searchSubProduct(SearchSubProductVo searchSubProductVo,
                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.searchSubProduct(searchSubProductVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }


}
