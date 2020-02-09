package com.fanap.podVirtualAccount.data.modelSrv;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Zahra Golinia on 2/4/2020.
 */

public class BusinessSrv implements Serializable {
    private long id;
    private String name;
    private List<GuildSrv> guilds;
    private String description;
    //    private ImageInfoSrv imageInfo;
//    private ImageInfoSrv coverImageInfo;
    private String image;
    private String coverImage;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalcode;
    private String phone;
    private String cellphone;
    private String faxNumber;
    private double latitude;
    private double longitude;
    private int subscriptionCount;
    private boolean subscribed;
    private int numOfComments;
    private RateSrv rate;
    private long userId;
    private String ssoId;
    private int numOfProducts;
    private String firstName;
    private String lastName;
    private String nationalCode;
    private String economicCode;
    private String registrationNumber;
    private String sheba;
    private String email;
    private String fullAddress;
    private List<String> tags;
    private List<String> tagTrees;
    private String link;
    private boolean active;
    private String apiToken;
    private BusinessAgentSrv agent;
    private Long numOfLike;
    private Long numOfDislike;
    private BusinessLegalInfoSrv legalInfo;
    private String username;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
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

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getEconomicCode() {
        return economicCode;
    }

    public void setEconomicCode(String economicCode) {
        this.economicCode = economicCode;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GuildSrv> getGuilds() {
        return guilds;
    }

    public void setGuilds(List<GuildSrv> guilds) {
        this.guilds = guilds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

/*
    public ImageInfoSrv getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(ImageInfoSrv imageInfo) {
        this.imageInfo = imageInfo;
    }

    public ImageInfoSrv getCoverImageInfo() {
        return coverImageInfo;
    }

    public void setCoverImageInfo(ImageInfoSrv coverImageInfo) {
        this.coverImageInfo = coverImageInfo;
    }
*/

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getSubscriptionCount() {
        return subscriptionCount;
    }

    public void setSubscriptionCount(int subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public int getNumOfComments() {
        return numOfComments;
    }

    public void setNumOfComments(int numOfComments) {
        this.numOfComments = numOfComments;
    }

    public RateSrv getRate() {
        return rate;
    }

    public void setRate(RateSrv rate) {
        this.rate = rate;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getSsoId() {
        return ssoId;
    }

    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    public int getNumOfProducts() {
        return numOfProducts;
    }

    public void setNumOfProducts(int numOfProducts) {
        this.numOfProducts = numOfProducts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getTagTrees() {
        return tagTrees;
    }

    public void setTagTrees(List<String> tagTrees) {
        this.tagTrees = tagTrees;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public BusinessAgentSrv getAgent() {
        return agent;
    }

    public void setAgent(BusinessAgentSrv agent) {
        this.agent = agent;
    }

    public Long getNumOfLike() {
        return numOfLike;
    }

    public void setNumOfLike(Long numOfLike) {
        this.numOfLike = numOfLike;
    }

    public Long getNumOfDislike() {
        return numOfDislike;
    }

    public void setNumOfDislike(Long numOfDislike) {
        this.numOfDislike = numOfDislike;
    }

    public BusinessLegalInfoSrv getLegalInfo() {
        return legalInfo;
    }

    public void setLegalInfo(BusinessLegalInfoSrv legalInfo) {
        this.legalInfo = legalInfo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
