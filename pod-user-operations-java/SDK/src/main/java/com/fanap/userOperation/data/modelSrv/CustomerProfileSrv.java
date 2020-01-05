package com.fanap.userOperation.data.modelSrv;

import java.io.Serializable;

/**
 * Created by h.mehrara on 10/20/2014 @Nozhaco.
 */
/*@ApiObject(
        name = "CustomerProfileSrv",
        description = "desc"
)*/
public class CustomerProfileSrv implements Serializable {
    private Integer version;
    private String firstName; // profile
    private String lastName; // profile
    private String name; // profile
    private String email; // email
    private String email_unverified; // email
    private String phoneNumber; // legal
    private String nationalCode; // legal
    private String nationalCode_verified; // legal
    private String gender; // profile
    private AddressSrv addressSrv; // address
    private String nickName; // profile
    private Long birthDate; // legal
    private Long score; // activity
    private Long followingCount; // activity
    private ImageInfoSrv imageInfo; // profile
    private String profileImage;    // profile
    private Long joinDate; // activity
    private String cellphoneNumber; // phone
    private String cellphoneNumber_unverified; // phone
    private Long userId; // profile
    private String sheba; // legal
    private Boolean guest; // admin
    private Boolean chatSendEnable; // admin
    private Boolean chatReceiveEnable; // admin
    private String username;    // profile
    private String ssoId;
    private Integer ssoIssuerCode;
    private String client_metadata;
    private Boolean isFollower;
    private CustomerLegalInfoSrv legalInfo;
    private FinancialLevelSrv financialLevelSrv;
    private String readOnlyFields;

    public CustomerLegalInfoSrv getLegalInfo() {
        return legalInfo;
    }

    public void setLegalInfo(CustomerLegalInfoSrv legalInfo) {
        this.legalInfo = legalInfo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public AddressSrv getAddressSrv() {
        return addressSrv;
    }

    public void setAddressSrv(AddressSrv addressSrv) {
        this.addressSrv = addressSrv;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Long followingCount) {
        this.followingCount = followingCount;
    }

    public ImageInfoSrv getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(ImageInfoSrv imageInfo) {
        this.imageInfo = imageInfo;
    }

    public Long getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Long joinDate) {
        this.joinDate = joinDate;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getEmail_unverified() {
        return email_unverified;
    }

    public void setEmail_unverified(String email_unverified) {
        this.email_unverified = email_unverified;
    }

    public String getCellphoneNumber_unverified() {
        return cellphoneNumber_unverified;
    }

    public void setCellphoneNumber_unverified(String cellphoneNumber_unverified) {
        this.cellphoneNumber_unverified = cellphoneNumber_unverified;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
    }

    public Boolean isGuest() {
        return guest;
    }

    public void setGuest(Boolean guest) {
        this.guest = guest;
    }

    public Boolean isChatSendEnable() {
        return chatSendEnable;
    }

    public void setChatSendEnable(Boolean chatSendEnable) {
        this.chatSendEnable = chatSendEnable;
    }

    public Boolean isChatReceiveEnable() {
        return chatReceiveEnable;
    }

    public void setChatReceiveEnable(Boolean chatReceiveEnable) {
        this.chatReceiveEnable = chatReceiveEnable;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSsoId() {
        return ssoId;
    }

    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    public Integer getSsoIssuerCode() {
        return ssoIssuerCode;
    }

    public void setSsoIssuerCode(Integer ssoIssuerCode) {
        this.ssoIssuerCode = ssoIssuerCode;
    }

    public String getClient_metadata() {
        return client_metadata;
    }

    public void setClient_metadata(String client_metadata) {
        this.client_metadata = client_metadata;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public Boolean getFollower() {
        return isFollower;
    }

    public void setFollower(Boolean follower) {
        isFollower = follower;
    }

    public String getNationalCode_verified() {
        return nationalCode_verified;
    }

    public void setNationalCode_verified(String nationalCode_verified) {
        this.nationalCode_verified = nationalCode_verified;
    }

    public String getReadOnlyFields() {
        return readOnlyFields;
    }

    public void setReadOnlyFields(String readOnlyFields) {
        this.readOnlyFields = readOnlyFields;
    }

    public FinancialLevelSrv getFinancialLevelSrv() {
        return financialLevelSrv;
    }

    public void setFinancialLevelSrv(FinancialLevelSrv financialLevelSrv) {
        this.financialLevelSrv = financialLevelSrv;
    }
}
