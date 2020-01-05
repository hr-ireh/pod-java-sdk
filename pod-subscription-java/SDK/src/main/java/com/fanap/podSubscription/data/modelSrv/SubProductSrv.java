package com.fanap.podSubscription.data.modelSrv;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by h.mehrara on 12/3/2015.
 */
/*@ApiObject(
        name = "SubProductSrv",
        description = "desc"
)*/
public class SubProductSrv implements Serializable {
    private long id;
    private ImageInfoSrv previewInfo;
    private BigDecimal availableCount;
    private BigDecimal price;
    private Double discount;
    private List<AttributeValueSrv> attributeValues;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ImageInfoSrv getPreviewInfo() {
        return previewInfo;
    }

    public void setPreviewInfo(ImageInfoSrv previewInfo) {
        this.previewInfo = previewInfo;
    }

    public BigDecimal getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(BigDecimal availableCount) {
        this.availableCount = availableCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public List<AttributeValueSrv> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List<AttributeValueSrv> attributeValues) {
        this.attributeValues = attributeValues;
    }
}
