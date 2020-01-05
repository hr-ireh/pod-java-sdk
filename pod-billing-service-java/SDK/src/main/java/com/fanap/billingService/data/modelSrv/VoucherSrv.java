package com.fanap.billingService.data.modelSrv;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by h.mehrara on 6/19/2016.
 */
/*@ApiObject(
        name = "VoucherSrv",
        description = "desc"
)*/
public class VoucherSrv implements Serializable {
    private long id;
    private boolean active;
    private BusinessSoftSrv business;
    private GuildSrv guild;
    private UserSrv limitedConsumer;
    private UserSrv consumer;
    private String hash;
    private String name;
    private String description;
    private BigDecimal creditAmount;
    private float discountPercentage;
    private long creationDate;
    private long expireDate;
    private List<ProductSrv> productList;
    private boolean isUsed;
    private BigDecimal usedAmount;
    private int type;
    private List<VoucherUsageSrv> usageList;






    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public BusinessSoftSrv getBusiness() {
        return business;
    }

    public void setBusiness(BusinessSoftSrv business) {
        this.business = business;
    }

    public GuildSrv getGuild() {
        return guild;
    }

    public void setGuild(GuildSrv guild) {
        this.guild = guild;
    }

    public UserSrv getLimitedConsumer() {
        return limitedConsumer;
    }

    public void setLimitedConsumer(UserSrv limitedConsumer) {
        this.limitedConsumer = limitedConsumer;
    }

    public UserSrv getConsumer() {
        return consumer;
    }

    public void setConsumer(UserSrv consumer) {
        this.consumer = consumer;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public long getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(long expireDate) {
        this.expireDate = expireDate;
    }

    public List<ProductSrv> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductSrv> productList) {
        this.productList = productList;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public BigDecimal getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<VoucherUsageSrv> getUsageList() {
        return usageList;
    }

    public void setUsageList(List<VoucherUsageSrv> usageList) {
        this.usageList = usageList;
    }
}
