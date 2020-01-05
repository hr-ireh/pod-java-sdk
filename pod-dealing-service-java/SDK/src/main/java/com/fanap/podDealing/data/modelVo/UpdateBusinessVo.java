package com.fanap.podDealing.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podDealing.util.ScProductIdPodServicesProduction;
import com.fanap.podDealing.util.ScProductIdPodServicesSandBox;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.fanap.podBaseService.enums.Enum_Server_type.PRODUCTION;

public class UpdateBusinessVo {


    /**
     * Created by Z.gholinia on 7/31/2019.
     */


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, bizId, businessName,guildCode, " +
            "country, state, city, address and description  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String bizId;
    private String businessName;
    private String companyName;
    private String shopName;
    private String shopNameEn;
    private String website;
    private String dateEstablishing;
    private String firstName;
    private String lastName;
    private String sheba;
    private String nationalCode;
    private String economicCode;
    private String registrationNumber;
    private String email;
    private List<String> guildCode;
    private String cellphone;
    private String phone;
    private String fax;
    private String postalCode;
    private String country;
    private String state;
    private String city;
    private String address;
    private String description;
    private String changeLogo;
    private String changeCover;
    private String logoImage;
    private String coverImage;
    private String tags;
    private String tagTrees;
    private String tagTreeCategoryName;
    private String link;
    private String lat;
    private String lng;
    private String agentFirstName;
    private String agentLastName;
    private String agentCellphoneNumber;
    private String agentNationalCode;
    private String changeAgent;
    private static String scProductId;


    public String getBizId() {
        return bizId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopNameEn() {
        return shopNameEn;
    }

    public String getWebsite() {
        return website;
    }

    public String getDateEstablishing() {
        return dateEstablishing;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSheba() {
        return sheba;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getEconomicCode() {
        return economicCode;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getGuildCode() {
        return guildCode;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getChangeLogo() {
        return changeLogo;
    }

    public String getChangeCover() {
        return changeCover;
    }

    public String getLogoImage() {
        return logoImage;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public String getTags() {
        return tags;
    }

    public String getTagTrees() {
        return tagTrees;
    }

    public String getTagTreeCategoryName() {
        return tagTreeCategoryName;
    }

    public String getLink() {
        return link;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public String getAgentFirstName() {
        return agentFirstName;
    }

    public String getAgentLastName() {
        return agentLastName;
    }

    public String getAgentCellphoneNumber() {
        return agentCellphoneNumber;
    }

    public String getAgentNationalCode() {
        return agentNationalCode;
    }

    public String getChangeAgent() {
        return changeAgent;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public UpdateBusinessVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.bizId = TypeConversionUtil.longToString(builder.getBizId());
        this.businessName = builder.getBusinessName();
        this.companyName = builder.getCompanyName();
        this.shopName = builder.getShopName();
        this.shopNameEn = builder.getShopNameEn();
        this.website = builder.getWebsite();
        this.dateEstablishing = builder.getDateEstablishing();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.sheba = builder.getSheba();
        this.nationalCode = builder.getNationalCode();
        this.economicCode = builder.getEconomicCode();
        this.registrationNumber = builder.getRegistrationNumber();
        this.email = builder.getEmail();
        this.guildCode = builder.getGuildCode();
        this.cellphone = builder.getCellphone();
        this.phone = builder.getPhone();
        this.fax = builder.getFax();
        this.postalCode = builder.getPostalCode();
        this.country = builder.getCountry();
        this.state = builder.getState();
        this.city = builder.getCity();
        this.address = builder.getAddress();
        this.description = builder.getDescription();
        this.changeLogo = TypeConversionUtil.booleanToString(builder.getChangeLogo());
        this.changeCover = TypeConversionUtil.booleanToString(builder.getChangeCover());
        this.logoImage = builder.getLogoImage();
        this.coverImage = builder.getCoverImage();
        this.tags = builder.getTags();
        this.tagTrees = builder.getTagTrees();
        this.tagTreeCategoryName = builder.getTagTreeCategoryName();
        this.link = builder.getLink();
        this.lat = builder.getLat();
        this.lng = builder.getLng();
        this.agentFirstName = builder.getAgentFirstName();
        this.agentLastName = builder.getAgentLastName();
        this.agentCellphoneNumber = builder.getAgentCellphoneNumber();
        this.agentNationalCode = builder.getAgentNationalCode();
        this.changeAgent =TypeConversionUtil.booleanToString(builder.getChangeAgent());
        if (getBaseInfoVo().getServerType().equals(PRODUCTION))
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesProduction.NZH_BIZ_UPDATE_BUSINESS);
        else
            this.scProductId = TypeConversionUtil.intToString(ScProductIdPodServicesSandBox.NZH_BIZ_UPDATE_BUSINESS);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long bizId;
        private String businessName;
        private String companyName;
        private String shopName;
        private String shopNameEn;
        private String website;
        private String dateEstablishing;
        private String firstName;
        private String lastName;
        private String sheba;
        private String nationalCode;
        private String economicCode;
        private String registrationNumber;
        private String email;
        private List<String> guildCode;
        private String cellphone;
        private String phone;
        private String fax;
        private String postalCode;
        private String country;
        private String state;
        private String city;
        private String address;
        private String description;
        private Boolean changeLogo;
        private Boolean changeCover;
        private String logoImage;
        private String coverImage;
        private String tags;
        private String tagTrees;
        private String tagTreeCategoryName;
        private String link;
        private String lat;
        private String lng;
        private String agentFirstName;
        private String agentLastName;
        private String agentCellphoneNumber;
        private String agentNationalCode;
        private Boolean changeAgent;

        public Long getBizId() {
            return bizId;
        }


        public Builder setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }

        public String getBusinessName() {
            return businessName;
        }

        public Builder setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }

        public String getCompanyName() {
            return companyName;
        }

        public Builder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public String getShopName() {
            return shopName;
        }

        public Builder setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }

        public String getShopNameEn() {
            return shopNameEn;
        }

        public Builder setShopNameEn(String shopNameEn) {
            this.shopNameEn = shopNameEn;
            return this;
        }

        public String getWebsite() {
            return website;
        }

        public Builder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public String getDateEstablishing() {
            return dateEstablishing;
        }

        public Builder setDateEstablishing(String dateEstablishing) {
            this.dateEstablishing = dateEstablishing;
            return this;
        }

        public String getFirstName() {
            return firstName;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String getSheba() {
            return sheba;
        }

        public Builder setSheba(String sheba) throws PodException {
            String regex = "^(\\d)(?!\\1{23}$)\\d{23}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(sheba);
            if (mach.find() && mach.group().equals(sheba))
                this.sheba = sheba;
            else
                throw PodException.invalidParameter(sheba + " is not a valid sheba");
            return this;
        }

        public String getNationalCode() {
            return nationalCode;
        }

        public Builder setNationalCode(String nationalCode) throws PodException {
            String regex = "^\\d{10}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(nationalCode);
            if (mach.find() && mach.group().equals(nationalCode))
                this.nationalCode = nationalCode;
            else
                throw PodException.invalidParameter(nationalCode + " is not a valid nationalCode");
            return this;
        }

        public String getEconomicCode() {
            return economicCode;
        }

        public Builder setEconomicCode(String economicCode) {
            this.economicCode = economicCode;
            return this;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public Builder setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public List<String> getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(List<String> guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public String getCellphone() {
            return cellphone;
        }

        public Builder setCellphone(String cellphone) throws PodException {
            String regex = "^(0|\\+98|0098){1}[9]{1}[\\d]{9}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(cellphone);
            if (mach.find() && mach.group().equals(cellphone))
                this.cellphone = cellphone;
            else
                throw PodException.invalidParameter(cellphone + " is not a valid cellphoneNumber");
            return this;

        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) throws PodException {
            String regex = "^(0[1-8][1-9]-?)?[1-9][0-9]{7}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(phone);
            if (mach.find() && mach.group().equals(phone))
                this.phone = phone;
            else
                throw PodException.invalidParameter(phone + " is not a valid phoneNumber");
            return this;
        }

        public String getFax() {
            return fax;
        }

        public Builder setFax(String fax) throws PodException {
            String regex = "^(0[1-8][1-9]-?)?[1-9][0-9]{7}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(fax);
            if (mach.find() && mach.group().equals(fax))
                this.fax = fax;
            else
                throw PodException.invalidParameter(fax + " is not a valid fax");
            return this;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public Builder setPostalCode(String postalCode) throws PodException {
            String regex = "^(?!(\\d)\\\\1{3})[13-9]{4}[1346-9][013-9]{5}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(postalCode);
            if (mach.find() && mach.group().equals(postalCode))
                this.postalCode = postalCode;
            else
                throw PodException.invalidParameter(postalCode + " is not a valid postalcode");
            return this;
        }

        public String getCountry() {
            return country;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public String getState() {
            return state;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public String getCity() {
            return city;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Boolean getChangeLogo() {
            return changeLogo;
        }

        public Builder setChangeLogo(Boolean changeLogo) {
            this.changeLogo = changeLogo;
            return this;
        }

        public Boolean getChangeCover() {
            return changeCover;
        }

        public Builder setChangeCover(Boolean changeCover) {
            this.changeCover = changeCover;
            return this;
        }

        public String getLogoImage() {
            return logoImage;
        }

        public Builder setLogoImage(String logoImage) {
            this.logoImage = logoImage;
            return this;
        }

        public String getCoverImage() {
            return coverImage;
        }

        public Builder setCoverImage(String coverImage) {
            this.coverImage = coverImage;
            return this;
        }

        public String getTags() {
            return tags;
        }

        public Builder setTags(String[] tags) {
            this.tags = String.join(",", tags);
            return this;
        }

        public String getTagTrees() {
            return tagTrees;
        }

        public Builder setTagTrees(String[] tagTrees) {
            this.tagTrees = String.join(",", tagTrees);
            return this;
        }

        public String getTagTreeCategoryName() {
            return tagTreeCategoryName;
        }

        public Builder setTagTreeCategoryName(String tagTreeCategoryName) {
            this.tagTreeCategoryName = tagTreeCategoryName;
            return this;
        }

        public String getLink() {
            return link;
        }

        public Builder setLink(String link) {
            this.link = link;
            return this;
        }

        public String getLat() {
            return lat;
        }

        public Builder setLat(String lat) {
            this.lat = lat;
            return this;
        }

        public String getLng() {
            return lng;
        }

        public Builder setLng(String lng) {
            this.lng = lng;
            return this;
        }

        public String getAgentFirstName() {
            return agentFirstName;
        }

        public Builder setAgentFirstName(String agentFirstName) {
            this.agentFirstName = agentFirstName;
            return this;
        }

        public String getAgentLastName() {
            return agentLastName;
        }

        public Builder setAgentLastName(String agentLastName) {
            this.agentLastName = agentLastName;
            return this;
        }

        public String getAgentCellphoneNumber() {
            return agentCellphoneNumber;
        }

        public Builder setAgentCellphoneNumber(String agentCellphoneNumber) throws PodException {
            String regex = "^(0|\\+98|0098){1}[9]{1}[\\d]{9}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(agentCellphoneNumber);
            if (mach.find() && mach.group().equals(agentCellphoneNumber))
                this.agentCellphoneNumber = agentCellphoneNumber;
            else
                throw PodException.invalidParameter(agentCellphoneNumber + " is not a valid cellphoneNumber");
            return this;
        }

        public String getAgentNationalCode() {
            return agentNationalCode;
        }

        public Builder setAgentNationalCode(String agentNationalCode) throws PodException {
            String regex = "^\\d{10}$";
            Pattern p = Pattern.compile(regex);
            Matcher mach = p.matcher(agentNationalCode);
            if (mach.find() && mach.group().equals(agentNationalCode))
                this.agentNationalCode = agentNationalCode;
            else
                throw PodException.invalidParameter(agentNationalCode + " is not a valid nationalCode");
            return this;
        }

        public Boolean getChangeAgent() {
            return changeAgent;
        }

        public Builder setChangeAgent(Boolean changeAgent) {
            this.changeAgent = changeAgent;
            return this;
        }

        public Builder(BaseInfoVo baseInfoVo) {

            this.baseInfoVo = baseInfoVo;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public UpdateBusinessVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.bizId != null && this.businessName != null &&
                    this.guildCode != null && this.country != null &&
                    this.state != null && this.city != null &&
                    this.address != null && this.description != null)
                return new UpdateBusinessVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}







