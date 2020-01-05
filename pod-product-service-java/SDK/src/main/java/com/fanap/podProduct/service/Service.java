package com.fanap.podProduct.service;

import com.fanap.podBaseService.util.RetrofitUtil;
import com.fanap.podBaseService.util.ServerTypeSelectionUtil;
import com.fanap.podProduct.data.modelSrv.AttributeTemplateSrv;
import com.fanap.podProduct.data.modelSrv.ProductSrv;
import com.fanap.podProduct.data.modelSrv.SearchProductSrv;
import com.fanap.podProduct.data.modelVo.*;
import com.fanap.podProduct.util.GetResult;
import com.fanap.podProduct.util.OnGetResponseListener;


import java.util.List;

/**
 * Created by Z.gholinia on 9/11/2019.
 */

public class Service {


    public void addProduct(AddProductVo addProductVo,
                           OnGetResponseListener onGetResponseListener) {

        PodProduct service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(addProductVo.getBaseInfoVo().getServerType()))
                .create(PodProduct.class);

        new GetResult<ProductSrv>(service.addProduct(
                addProductVo.getBaseInfoVo().getToken(),
                addProductVo.getBaseInfoVo().getToken_issuer(),
                addProductVo.getScProductId(),
                addProductVo.getBaseInfoVo().getScVoucherHash(),
                addProductVo.getBaseInfoVo().getScApiKey(),
                addProductVo.getParentProductId(),
                addProductVo.getName(),
                addProductVo.getDescription(),
                addProductVo.getUniqueId(),
                addProductVo.getCanComment(),
                addProductVo.getCanLike(),
                addProductVo.getEnable(),
                addProductVo.getMetadata(),
                addProductVo.getBusinessId(),
                addProductVo.getUnlimited(),
                addProductVo.getAvailableCount(),
                addProductVo.getPrice(),
                addProductVo.getDiscount(),
                addProductVo.getGuildCode(),
                addProductVo.getAllowUserInvoice(),
                addProductVo.getAllowUserPrice(),
                addProductVo.getCurrencyCode(),
                addProductVo.getAttTemplateCode(),
                addProductVo.getAttCode(),
                addProductVo.getAttValue(),
                addProductVo.getAttGroup(),
                addProductVo.getLat(),
                addProductVo.getLng(),
                addProductVo.getTags(),
                addProductVo.getContent(),
                addProductVo.getPreviewImage(),
                addProductVo.getTagTrees(),
                addProductVo.getTagTreeCategoryName(),
                addProductVo.getPreferredTaxRate(),
                addProductVo.getQuantityPrecision()


        ), onGetResponseListener).get();
    }

    public void addProducts(AddProductsVo addProductsVo,
                            OnGetResponseListener onGetResponseListener) {

        PodProduct service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(addProductsVo.getBaseInfoVo().getServerType()))
                .create(PodProduct.class);

        new GetResult<List<ProductSrv>>(service.addProducts(
                addProductsVo.getBaseInfoVo().getToken(),
                addProductsVo.getBaseInfoVo().getToken_issuer(),
                addProductsVo.getScProductId(),
                addProductsVo.getBaseInfoVo().getScVoucherHash(),
                addProductsVo.getBaseInfoVo().getScApiKey(),
                addProductsVo.getBizId(),
                addProductsVo.getData(),
                addProductsVo.getPreviewImage(),
                addProductsVo.getCurrencyCode()


        ), onGetResponseListener).get();
    }

    public void updateProduct(UpdateProductVo updateProductVo,
                              OnGetResponseListener onGetResponseListener) {

        PodProduct service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(updateProductVo.getBaseInfoVo().getServerType()))
                .create(PodProduct.class);

        new GetResult<ProductSrv>(service.updateProduct(
                updateProductVo.getBaseInfoVo().getToken(),
                updateProductVo.getBaseInfoVo().getToken_issuer(),
                updateProductVo.getScProductId(),
                updateProductVo.getBaseInfoVo().getScVoucherHash(),
                updateProductVo.getBaseInfoVo().getScApiKey(),
                updateProductVo.getName(),
                updateProductVo.getDescription(),
                updateProductVo.getVersion(),
                updateProductVo.getCanComment(),
                updateProductVo.getCanLike(),
                updateProductVo.getEnable(),
                updateProductVo.getMetadata(),
                updateProductVo.getEntityId(),
                updateProductVo.getUnlimited(),
                updateProductVo.getAvailableCount(),
                updateProductVo.getCategories(),
                updateProductVo.getGuildCode(),
                updateProductVo.getAllowUserInvoice(),
                updateProductVo.getAllowUserPrice(),
                updateProductVo.getAttTemplateCode(),
                updateProductVo.getAttValue(),
                updateProductVo.getAttCode(),
                updateProductVo.getAttGroup(),
                updateProductVo.getGroupId(),
                updateProductVo.getPrice(),
                updateProductVo.getDiscount(),
                updateProductVo.getChangePreview(),
                updateProductVo.getLat(),
                updateProductVo.getLng(),
                updateProductVo.getTags(),
                updateProductVo.getContent(),
                updateProductVo.getPreviewImage(),
                updateProductVo.getTagTrees(),
                updateProductVo.getTagTreeCategoryName(),
                updateProductVo.getPreferredTaxRate(),
                updateProductVo.getQuantityPrecision()


        ), onGetResponseListener).get();
    }


    public void updateProducts(UpdateProductsVo updateProductsVo,
                               OnGetResponseListener onGetResponseListener) {

        PodProduct service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(updateProductsVo.getBaseInfoVo().getServerType()))
                .create(PodProduct.class);

        new GetResult<List<ProductSrv>>(service.updateProducts(
                updateProductsVo.getBaseInfoVo().getToken(),
                updateProductsVo.getBaseInfoVo().getToken_issuer(),
                updateProductsVo.getScProductId(),
                updateProductsVo.getBaseInfoVo().getScVoucherHash(),
                updateProductsVo.getBaseInfoVo().getScApiKey(),
                updateProductsVo.getData(),
                updateProductsVo.getChangePreview(),
                updateProductsVo.getPreviewImage(),
                updateProductsVo.getCurrencyCode()

        ), onGetResponseListener).get();
    }

    public void getProductList(ProductListVo productListVo,
                               OnGetResponseListener onGetResponseListener) {

        PodProduct service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(productListVo.getBaseInfoVo().getServerType()))
                .create(PodProduct.class);

        new GetResult<List<ProductSrv>>(service.getProductList(
                productListVo.getBaseInfoVo().getToken(),
                productListVo.getBaseInfoVo().getToken_issuer(),
                productListVo.getScProductId(),
                productListVo.getBaseInfoVo().getScVoucherHash(),
                productListVo.getBaseInfoVo().getScApiKey(),
                productListVo.getBusinessId(),
                productListVo.getId(),
                productListVo.getUniqueId(),
                productListVo.getCategoryCode(),
                productListVo.getGuildCode(),
                productListVo.getCurrencyCode(),
                productListVo.getFirstId(),
                productListVo.getLastId(),
                productListVo.getOffset(),
                productListVo.getSize(),
                productListVo.getAttributeTemplateCode(),
                productListVo.getAttributeCode(),
                productListVo.getAttributeValue(),
                productListVo.getOrderByLike(),
                productListVo.getOrderBySale(),
                productListVo.getOrderByPrice(),
                productListVo.getTags(),
                productListVo.getTagTrees()

        ), onGetResponseListener).get();
    }


    public void getBusinessProductList(BusinessProductListVo businessProductListVo,
                                       OnGetResponseListener onGetResponseListener) {

        PodProduct service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(businessProductListVo.getBaseInfoVo().getServerType()))
                .create(PodProduct.class);

        new GetResult<List<ProductSrv>>(service.getBusinessProductList(
                businessProductListVo.getBaseInfoVo().getToken(),
                businessProductListVo.getBaseInfoVo().getToken_issuer(),
                businessProductListVo.getScProductId(),
                businessProductListVo.getBaseInfoVo().getScVoucherHash(),
                businessProductListVo.getBaseInfoVo().getScApiKey(),
                businessProductListVo.getBusinessId(),
                businessProductListVo.getId(),
                businessProductListVo.getUniqueId(),
                businessProductListVo.getCategoryCode(),
                businessProductListVo.getGuildCode(),
                businessProductListVo.getCurrencyCode(),
                businessProductListVo.getFirstId(),
                businessProductListVo.getLastId(),
                businessProductListVo.getOffset(),
                businessProductListVo.getSize(),
                businessProductListVo.getAttributeTemplateCode(),
                businessProductListVo.getAttributeCode(),
                businessProductListVo.getAttributeValue(),
                businessProductListVo.getOrderByLike(),
                businessProductListVo.getOrderBySale(),
                businessProductListVo.getOrderByPrice(),
                businessProductListVo.getTags(),
                businessProductListVo.getTagTrees(),
                businessProductListVo.getScope(),
                businessProductListVo.getAttributeSearchQuery()
//                businessProductListVo.getScVoucherHash(),
//                businessProductListVo.getScApiKey()

        ), onGetResponseListener).get();
    }

    public void getAttributeTemplateList(AttributeTemplateListVo attributeTemplateListVo,
                                         OnGetResponseListener onGetResponseListener) {

        PodProduct service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(attributeTemplateListVo.getBaseInfoVo().getServerType()))
                .create(PodProduct.class);

        new GetResult<List<AttributeTemplateSrv>>(service.getAttributeTemplateList(
                attributeTemplateListVo.getBaseInfoVo().getToken(),
                attributeTemplateListVo.getBaseInfoVo().getToken_issuer(),
                attributeTemplateListVo.getScProductId(),
                attributeTemplateListVo.getBaseInfoVo().getScVoucherHash(),
                attributeTemplateListVo.getBaseInfoVo().getScApiKey(),
                attributeTemplateListVo.getGuildCode(),
                attributeTemplateListVo.getFirstId(),
                attributeTemplateListVo.getLastId(),
                attributeTemplateListVo.getOffset(),
                attributeTemplateListVo.getSize()


        ), onGetResponseListener).get();
    }


    public void addSubProduct(AddSubProductVo addSubProductVo,
                              OnGetResponseListener onGetResponseListener) {

        PodProduct service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(addSubProductVo.getBaseInfoVo().getServerType()))
                .create(PodProduct.class);

        new GetResult<ProductSrv>(service.addSubProduct(
                addSubProductVo.getBaseInfoVo().getToken(),
                addSubProductVo.getBaseInfoVo().getToken_issuer(),
                addSubProductVo.getScProductId(),
                addSubProductVo.getBaseInfoVo().getScVoucherHash(),
                addSubProductVo.getBaseInfoVo().getScApiKey(),
                addSubProductVo.getParentProductId(),
                addSubProductVo.getName(),
                addSubProductVo.getDescription(),
                addSubProductVo.getUniqueId(),
                addSubProductVo.getMetadata(),
                addSubProductVo.getBusinessId(),
                addSubProductVo.getUnlimited(),
                addSubProductVo.getAvailableCount(),
                addSubProductVo.getPrice(),
                addSubProductVo.getDiscount(),
                addSubProductVo.getGuildCode(),
                addSubProductVo.getAllowUserInvoice(),
                addSubProductVo.getAllowUserPrice(),
                addSubProductVo.getCurrencyCode(),
                addSubProductVo.getAttTemplateCode(),
                addSubProductVo.getAttCode(),
                addSubProductVo.getAttValue(),
                addSubProductVo.getAttGroup(),
                addSubProductVo.getGroupId(),
                addSubProductVo.getContent(),
                addSubProductVo.getPreviewImage(),
                addSubProductVo.getTagTreeCategoryName(),
                addSubProductVo.getPreferredTaxRate(),
                addSubProductVo.getQuantityPrecision()

        ), onGetResponseListener).get();
    }

    public void searchProduct(SearchProductVo searchProductVo,
                              OnGetResponseListener onGetResponseListener) {

        PodProduct service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(searchProductVo.getBaseInfoVo().getServerType()))
                .create(PodProduct.class);

        new GetResult<SearchProductSrv>(service.searchProduct(
                searchProductVo.getBaseInfoVo().getToken(),
                searchProductVo.getBaseInfoVo().getToken_issuer(),
                searchProductVo.getScProductId(),
                searchProductVo.getBaseInfoVo().getScVoucherHash(),
                searchProductVo.getBaseInfoVo().getScApiKey(),
                searchProductVo.getQ(),
                searchProductVo.getId(),
                searchProductVo.getUniqueId(),
                searchProductVo.getBusinessId(),
                searchProductVo.getCategoryCodes(),
                searchProductVo.getGuildCode(),
                searchProductVo.getCurrencyCode(),
                searchProductVo.getFirstId(),
                searchProductVo.getLastId(),
                searchProductVo.getOffset(),
                searchProductVo.getSize(),
                searchProductVo.getAttributeTemplateCode(),
                searchProductVo.getAttributeCode(),
                searchProductVo.getAttributeValue(),
                searchProductVo.getOrderByLike(),
                searchProductVo.getOrderBySale(),
                searchProductVo.getOrderByPrice(),
                searchProductVo.getTags(),
                searchProductVo.getTagTrees()

        ), onGetResponseListener).get();
    }



    public void searchSubProduct(SearchSubProductVo searchSubProductVo,
                              OnGetResponseListener onGetResponseListener) {

        PodProduct service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(searchSubProductVo.getBaseInfoVo().getServerType()))
                .create(PodProduct.class);

        new GetResult<SearchProductSrv>(service.searchSubProduct(
                searchSubProductVo.getBaseInfoVo().getToken(),
                searchSubProductVo.getBaseInfoVo().getToken_issuer(),
                searchSubProductVo.getScProductId(),
                searchSubProductVo.getBaseInfoVo().getScVoucherHash(),
                searchSubProductVo.getBaseInfoVo().getScApiKey(),
                searchSubProductVo.getQ(),
                searchSubProductVo.getProductGroupId(),
                searchSubProductVo.getOffset(),
                searchSubProductVo.getSize(),
                searchSubProductVo.getAttributeCode(),
                searchSubProductVo.getAttributeValue(),
                searchSubProductVo.getOrderByAttributeCode(),
                searchSubProductVo.getOrderByDirection(),
                searchSubProductVo.getTags(),
                searchSubProductVo.getTagTrees()
        ), onGetResponseListener).get();
    }


}
