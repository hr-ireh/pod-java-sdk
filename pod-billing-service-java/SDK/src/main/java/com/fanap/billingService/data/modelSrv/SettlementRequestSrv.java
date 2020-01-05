package com.fanap.billingService.data.modelSrv;



import java.io.Serializable;
import java.util.List;

/**
 * Created by h.mehrara on 4/10/2016.
 */

/*@ApiObject(
        name = "SettlementRequestSrv",
        description = "desc"
)*/
public class SettlementRequestSrv implements Serializable {
    private long id;
    private Double amount;
    private long requestDate;
    private CustomerProfileSrv customerProfileSrv;
    private BusinessSoftSrv businessSoftSrv;
    private GuildSrv guildSrv;
    private long settleDate;
    private String status;
    private List<CustomerAmountSrv> customerAmountSrvs;
    private CurrencySrv currency;
    private String toolCode;
    private String toolId;
    private String firstName;
    private String lastName;
    private String referenceId;
    private List<SettlementLogSrv> settlementLogSrvs;
    private String wallet;
    private String description;
    private String uniqueId;
    private boolean instant;
    private long sendToBankDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public long getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(long requestDate) {
        this.requestDate = requestDate;
    }

    public CustomerProfileSrv getCustomerProfileSrv() {
        return customerProfileSrv;
    }

    public void setCustomerProfileSrv(CustomerProfileSrv customerProfileSrv) {
        this.customerProfileSrv = customerProfileSrv;
    }

    public BusinessSoftSrv getBusinessSoftSrv() {
        return businessSoftSrv;
    }

    public void setBusinessSoftSrv(BusinessSoftSrv businessSoftSrv) {
        this.businessSoftSrv = businessSoftSrv;
    }

    public GuildSrv getGuildSrv() {
        return guildSrv;
    }

    public void setGuildSrv(GuildSrv guildSrv) {
        this.guildSrv = guildSrv;
    }

    public long getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(long settleDate) {
        this.settleDate = settleDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CustomerAmountSrv> getCustomerAmountSrvs() {
        return customerAmountSrvs;
    }

    public void setCustomerAmountSrvs(List<CustomerAmountSrv> customerAmountSrvs) {
        this.customerAmountSrvs = customerAmountSrvs;
    }

    public CurrencySrv getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencySrv currency) {
        this.currency = currency;
    }

    public String getToolCode() {
        return toolCode;
    }

    public void setToolCode(String toolCode) {
        this.toolCode = toolCode;
    }

    public String getToolId() {
        return toolId;
    }

    public void setToolId(String toolId) {
        this.toolId = toolId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public List<SettlementLogSrv> getSettlementLogSrvs() {
        return settlementLogSrvs;
    }

    public void setSettlementLogSrvs(List<SettlementLogSrv> settlementLogSrvs) {
        this.settlementLogSrvs = settlementLogSrvs;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public boolean isInstant() {
        return instant;
    }

    public void setInstant(boolean instant) {
        this.instant = instant;
    }

    public long getSendToBankDate() {
        return sendToBankDate;
    }

    public void setSendToBankDate(long sendToBankDate) {
        this.sendToBankDate = sendToBankDate;
    }
}
