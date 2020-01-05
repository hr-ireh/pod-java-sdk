package com.fanap.userOperation.sampleCode;

import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podProduct.controller.PodProduct;
import com.fanap.podProduct.data.modelSrv.AttributeTemplateSrv;
import com.fanap.podProduct.data.modelSrv.ProductSrv;
import com.fanap.podProduct.data.modelSrv.SearchProductSrv;
import com.fanap.podProduct.data.modelVo.*;
import com.fanap.podProduct.util.OnGetResponseListener;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Z.gholinia on 9/11/2019.
 */

public class App {

    private static String TOKEN = "c43049a626e5462ab85c0a8e4028e9fe";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    public static void main(String[] args) {

//        addProduct();
//        addProducts();
//        updateProduct();
//        updateProducts();
//        getProductList();
//        getBusinessProductList();
//        getAttributeTemplateList();
//        addSubProduct();
        searchProduct();
//        searchSubProduct();

    }


    private static void addProduct() {
        //        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("ce75cca723fe43bba437e07214651a89")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");

        try {
            AddProductVo addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
//                  .setUniqueId("1232")
//                  .setMetadata("metaData")
//                  .setGuildCode("CLOTHING_GUILD")
//                  .setAllowUserInvoice(true)
//                  .setAllowUserPrice(true)
//                  .setUnlimited(true)
//                  .setCurrencyCode("USD")
//                  .setAttTemplateCode("پیراهن مردانه")
//                  .setGroupId(1903L)
//                  .setLat(36.3183414)
//                  .setLng(59.5370587)
                    .setTags(tags)
//                  .setTagTrees(tagTres)
//                  .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
//                  .setPreviewImage("")
//                  .setTagTreeCategoryName("")
//                  .setPreferredTaxRate(0D)
//                  .setQuantityPrecision(0D)
//                   .setScVoucherHash(scVoucherHashs)
                    .build();
            podProduct.addProduct(addProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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

    private static void addProducts() {
        //        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                //                .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();
        AddProductVo addProductVo1 = null;
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        try {
            addProductVo1 = new AddProductVo.Builder(baseInfoVo)
                    .setName("product 1")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setDescription("product 1")
//                  .setAttCode(attCode)
//                  .setAttGroup(atGroup)
//                  .setAttValue(atValue)
//                  .setAttTemplateCode("\u0645\u0627\u0646\u062a\u0648")
//                  .setAttTemplateCode("پیراهن مردانه")
//                  .setUniqueId("1232")
//                  .setMetadata("metaData")
//                  .setGuildCode("CLOTHING_GUILD")
//                  .setAllowUserInvoice(true)
//                  .setAllowUserPrice(true)
//                  .setUnlimited(true)
//                  .setCurrencyCode("USD")
//                  .setAttTemplateCode("پیراهن مردانه")
//                  .setGroupId(1903L)
//                  .setLat(36.3183414)
//                  .setLng(59.5370587)
//                  .setTags(tags)
//                  .setTagTrees(tagTrees)
//                  .setContent("اطلاعات سری که اونایی که پول بدن میدونن چیه")
//                  .setPreviewImage("")
//                  .setTagTreeCategoryName("")
//                  .setPreferredTaxRate(0D)
//                  .setQuantityPrecision(0D)
                    .build();
        } catch (PodException e) {
        }

        AddProductVo addProductVo2 = null;
        try {
            addProductVo2 = new AddProductVo.Builder(baseInfoVo)
                    .setName("product 2")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setDescription("product 2")
                    .build();
        } catch (PodException e) {
        }
        List<AddProductVo> addProductVos = new ArrayList<>();
        addProductVos.add(addProductVo1);
        addProductVos.add(addProductVo2);
        try {
            AddProductsVo addProductsVo = new AddProductsVo.Builder(baseInfoVo)
                    // .setBizId(7867L)
                    // .setCurrencyCode("USD")
                    // .setPreviewImage("")
                    .setData(addProductVos)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podProduct.addProducts(addProductsVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult().get(0).getEntityId());
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

    private static void updateProduct() {
        //        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey("dhfsdhfhsdfuhfuwehuiSEfihdfhe")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        List<String> categories = new ArrayList<>();
        categories.add("categories");
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("scProvider","nam");
//        String metaData=JsonUtil.getJson(jsonObject);
        String[] tags = {"tags1", "tags2"};
        String[] tagTres = {"tagTrees1", "tagTrees2"};
        PodProduct podProduct = new PodProduct();


        try {
            UpdateProductVo updateProductVo = new UpdateProductVo.Builder(baseInfoVo)
                    .setName("4")
                    .setDescription("hhh")
                    .setCanComment(false)
                    .setCanLike(false)
                    .setEnable(false)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setChangePreview(false)
                    .setEntityId(31279L)
                    .setAvailableCount(12)
//                   .setVersion("1")
//                   .setMetadata(metaData)
//                   .setUnlimited(true)
//                   .setGroupId(1818L)
//                   .setCategories(categories)
//                   .setGuildCode("CLOTHING_GUILD")
//                   .setAllowUserInvoice(false)
//                   .setAllowUserPrice(true)
//                   .setAttCode(attCode)
//                   .setAttGroup(atGroup)
//                   .setAttValue(atValue)
//                   .setAttTemplateCode("")
//                   .setGroupId(1881L)
//                   .setLat(36.3183414)
//                   .setLng(59.5370587)
//                   .setTags (tags)
//                   .setTagTrees(tagTrees)
//                   .setTagTreeCategoryName("")
//                   .setContent("")
//                   .setPreviewImage("")
//                   .setPreferredTaxRate(0D)
//                   .setQuantityPrecision(0D)

                    .build();
            podProduct.updateProduct(updateProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(1));
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


    private static void updateProducts() {
        //        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                //   .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("gender");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");

        PodProduct podProduct = new PodProduct();
        AddProductVo addProductVo = null;
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        try {
            addProductVo = new AddProductVo.Builder(baseInfoVo)
                    .setName("PIRAHA")
                    .setCanComment(false)
                    .setEnable(false)
                    .setAvailableCount(10)
                    .setPrice(new BigDecimal(10))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setDescription("ddd")
                    .setCanLike(false)
                    .setEntityId(29990L)
                    .build();
        } catch (PodException e) {
        }
        List<AddProductVo> addProductVos = new ArrayList<>();
        addProductVos.add(addProductVo);

        try {
            UpdateProductsVo updateProductsVo = new UpdateProductsVo.Builder(baseInfoVo)
                    .setData(addProductVos)
                    .setChangePreview(false)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podProduct.updateProducts(updateProductsVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult().get(0).getDescription());
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

    private static void getProductList() {
        //        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                //  .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<Long> ids = new ArrayList<>();
        ids.add(0L);
        List<String> uniqueIds = new ArrayList<>();
        uniqueIds.add("");
        List<String> categoryCodes = new ArrayList<>();
        categoryCodes.add("");
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("CLOTHING_GUILD");
        List<String> attributeCodes = new ArrayList<>();
        attributeCodes.add("");
        List<String> attributeValues = new ArrayList<>();
        attributeValues.add("");
        List<String> tags = new ArrayList<>();
        tags.add("");
        List<String> tagTrees = new ArrayList<>();
        tagTrees.add("");
        PodProduct podProduct = new PodProduct();
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");

        try {
            ProductListVo productListVo = new ProductListVo.Builder(baseInfoVo)
                    .setBusinessId(7867L)
                    .setOffset(0)
//                  .setFirstId(0L)
//                  .setLastId(0L)
//                  .setSize(10)
//                  .setId(ids)
//                  .setUniqueId(uniqueIds)
//                  .setCategoryCode(categoryCodes)
//                  .setGuildCode(guildCodes)
//                  .setCurrencyCode("")
//                  .setAttributeTemplateCode("")
//                  .setAttributeCode(attributeCodes)
//                  .setAttributeValue(attributeValues)
//                  .setOrderByLike("asc")
//                  .setOrderByPrice("asc")
//                  .setOrderBySale("asc")
//                  .setTags(tags)
//                  .setTagTrees(tagTrees)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podProduct.getProductList(productListVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
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

    private static void getBusinessProductList() {
        //        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                //  .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<Long> ids = new ArrayList<>();
        ids.add(0L);
        List<String> uniqueIds = new ArrayList<>();
        uniqueIds.add("");
        List<String> categoryCodes = new ArrayList<>();
        categoryCodes.add("");
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("CLOTHING_GUILD");
        List<String> attributeCodes = new ArrayList<>();
        attributeCodes.add("");
        List<String> attributeValues = new ArrayList<>();
        attributeValues.add("");
        List<String> tags = new ArrayList<>();
        tags.add("");
        List<String> tagTrees = new ArrayList<>();
        tagTrees.add("");
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        PodProduct podProduct = new PodProduct();

        try {
            BusinessProductListVo businessProductListVo = new BusinessProductListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(10)
//                  .setFirstId(0L)
//                  .setLastId(0L)
//                  .setSize(10)
//                  .setId(ids)
//                  .setUniqueId(uniqueIds)
//                  .setCategoryCode(categoryCodes)
//                  .setGuildCode(guildCodes)
//                  .setCurrencyCode("")
//                  .setAttributeTemplateCode("")
//                  .setAttributeCode(attributeCodes)
//                  .setAttributeValue(attributeValues)
//                  .setOrderByLike("asc")
//                  .setOrderByPrice("asc")
//                  .setOrderBySale("asc")
//                  .setTags(tags)
//                  .setTagTrees(tagTrees)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podProduct.getBusinessProductList(businessProductListVo, new OnGetResponseListener<List<ProductSrv>>() {
                @Override
                public void onResponse(ResultVo<List<ProductSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
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


    private static void getAttributeTemplateList() {
        //        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                // .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<String> guildCodes = new ArrayList<>();
        guildCodes.add("FOOD_GUILD");
        guildCodes.add("CLOTHING_GUILD");
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");

        PodProduct podProduct = new PodProduct();

        try {
            AttributeTemplateListVo attributeTemplateListVo = new AttributeTemplateListVo.Builder(baseInfoVo)
                    .setSize(50)
                    .setOffset(0)
                    .setGuildCode(guildCodes)
                    .setFirstId(0L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podProduct.getAttributeTemplateList(attributeTemplateListVo, new OnGetResponseListener<List<AttributeTemplateSrv>>() {

                @Override
                public void onResponse(ResultVo<List<AttributeTemplateSrv>> result) {
                    System.out.println(result.getResult().get(0).getName());
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

    private static void addSubProduct() {
        //        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                // .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<String> attCode = new ArrayList<>();
        attCode.add("size");
        attCode.add("color");
        List<String> atValue = new ArrayList<>();
        atValue.add("mardane");
        atValue.add("ddd");
        List<String> atGroup = new ArrayList<>();
        atGroup.add("false");
        atGroup.add("false");
//        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");

        PodProduct podProduct = new PodProduct();

        try {
            AddSubProductVo addSubProductVo = new AddSubProductVo.Builder(baseInfoVo)
                    .setName("PIRAHAn")
                    .setAvailableCount(9)
                    .setPrice(new BigDecimal(17500))
                    .setDiscount(new BigDecimal(0))
                    .setAttCode(attCode)
                    .setAttGroup(atGroup)
                    .setAttValue(atValue)
                    .setGroupId(1903L)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podProduct.addSubProduct(addSubProductVo, new OnGetResponseListener<ProductSrv>() {
                @Override
                public void onResponse(ResultVo<ProductSrv> result) {
                    System.out.println(result.getResult().getTags().get(0));
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


    private static void searchProduct() {
        //        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                // .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        PodProduct podProduct = new PodProduct();

        try {
            SearchProductVo searchProductVo = new SearchProductVo.Builder(baseInfoVo)
                    .setSize(50)
                    .setOffset(0)
//                   .setQuery("\"scProvider\",\"nam\"")
//                   .setFirstId(0L)
//                  .setLastId(0L)
//                  .setSize(10)
//                  .setId(ids)
//                  .setUniqueId(uniqueIds)
//                  .setCategoryCode(categoryCodes)
//                  .setGuildCode(guildCodes)
//                  .setCurrencyCode("")
//                  .setAttributeTemplateCode("")
//                  .setAttributeCode(attributeCodes)
//                  .setAttributeValue(attributeValues)
//                  .setOrderByLike("asc")
//                  .setOrderByPrice("asc")
//                  .setOrderBySale("asc")
//                  .setTags(tags)
//                  .setTagTrees(tagTrees)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podProduct.searchProduct(searchProductVo, new OnGetResponseListener<SearchProductSrv>() {
                @Override
                public void onResponse(ResultVo<SearchProductSrv> result) {
                    System.out.println(result.getResult().getProducts().get(0).getId());
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


    private static void searchSubProduct() {
        //        List<String> scVoucherHashs =new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                // .setScApiKey("")
//                .setScVoucherHash(scVoucherHashs)
                .build();
//        List<String> scVoucherHashs = new ArrayList<>();
//        scVoucherHashs.add("YELZF7WUHRLD");

        List<Long> productGroupIds = new ArrayList<>();
        productGroupIds.add(1903L);
        PodProduct podProduct = new PodProduct();

        try {
            SearchSubProductVo searchSubProductVo = new SearchSubProductVo.Builder(baseInfoVo)
//                    .setSize(50)
                    .setOffset(0)
                    .setProductGroupId(productGroupIds)
//                   .setQuery("\"scProvider\",\"nam\"")
//                  .setAttributeCode(attributeCodes)
//                  .setAttributeValue(attributeValues)
//                  .setTags(tags)
//                  .setTagTrees(tagTrees)
//                    .setScVoucherHash(scVoucherHashs)
                    .build();
            podProduct.searchSubProduct(searchSubProductVo, new OnGetResponseListener<SearchProductSrv>() {
                @Override
                public void onResponse(ResultVo<SearchProductSrv> result) {
                    System.out.println(result.getResult().getProducts().get(0).getId());
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
