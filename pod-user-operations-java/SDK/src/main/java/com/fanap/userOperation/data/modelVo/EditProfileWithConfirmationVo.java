package com.fanap.userOperation.data.modelVo;

import com.fanap.userOperation.exception.PodException;
import com.fanap.userOperation.util.PodServicesEnum;
import com.fanap.userOperation.util.TypeConversionUtil;

import java.util.List;


/**
 * Created by Z.Gholinia on 10/12/2019.
 */
public class EditProfileWithConfirmationVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and nichName are required parameters!";

    private String firstName;
    private String lastName;
    private String nickName;
    private String email;
    private String phoneNumber;
    private String cellphoneNumber;
    private String nationalCode;
    private String gender;
    private String address;
    private String birthDate;
    private String country;
    private String state;
    private String city;
    private String postalcode;
    private String sheba;
    private String profileImage;
    private String client_metadata;
    private String birthState;
    private String identificationNumber;
    private String fatherName;
    private BaseInfoVo baseInfoVo;
    private static String scProductId;


    public EditProfileWithConfirmationVo(Builder builder) {
        super();
        this.baseInfoVo = builder.getBaseInfoVo();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.nickName = builder.getNickName();
        this.email = builder.getEmail();
        this.phoneNumber = builder.getPhoneNumber();
        this.cellphoneNumber = builder.getCellphoneNumber();
        this.nationalCode = builder.getNationalCode();
        this.gender = builder.getGender();
        this.address = builder.getAddress();
        this.birthDate = builder.getBirthDate();
        this.country = builder.getCountry();
        this.state = builder.getState();
        this.city = builder.getCity();
        this.postalcode = builder.getPostalcode();
        this.sheba = builder.getSheba();
        this.profileImage = builder.getProfileImage();
        this.client_metadata = builder.getClient_metadata();
        this.birthState = builder.getBirthState();
        this.identificationNumber = builder.getIdentificationNumber();
        this.fatherName = builder.getFatherName();
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_EDIT_PROFILE_WITH_CONFIRMATION);


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthDate() {
        return birthDate;
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

    public String getPostalcode() {
        return postalcode;
    }

    public String getSheba() {
        return sheba;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public String getClient_metadata() {
        return client_metadata;
    }

    public String getBirthState() {
        return birthState;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private String nickName;
        private String email;
        private String phoneNumber;
        private String cellphoneNumber;
        private String nationalCode;
        private String gender;
        private String address;
        private String birthDate;
        private String country;
        private String state;
        private String city;
        private String postalcode;
        private String sheba;
        private String profileImage;
        private String client_metadata;
        private String birthState;
        private String identificationNumber;
        private String fatherName;
        private BaseInfoVo baseInfoVo;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
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

        public String getNickName() {
            return nickName;
        }

        public Builder setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public String getCellphoneNumber() {
            return cellphoneNumber;
        }

        public Builder setCellphoneNumber(String cellphoneNumber) {
            this.cellphoneNumber = cellphoneNumber;
            return this;
        }

        public String getNationalCode() {
            return nationalCode;
        }

        public Builder setNationalCode(String nationalCode) {
            this.nationalCode = nationalCode;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public Builder setBirthDate(String birthDate) {
            this.birthDate = birthDate;
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

        public String getPostalcode() {
            return postalcode;
        }

        public Builder setPostalcode(String postalcode) {
            this.postalcode = postalcode;
            return this;
        }

        public String getSheba() {
            return sheba;
        }

        public Builder setSheba(String sheba) {
            this.sheba = sheba;
            return this;
        }

        public String getProfileImage() {
            return profileImage;
        }

        public Builder setProfileImage(String profileImage) {
            this.profileImage = profileImage;
            return this;
        }

        public String getClient_metadata() {
            return client_metadata;
        }

        public Builder setClient_metadata(String client_metadata) {
            this.client_metadata = client_metadata;
            return this;
        }

        public String getBirthState() {
            return birthState;
        }

        public Builder setBirthState(String birthState) {
            this.birthState = birthState;
            return this;
        }

        public String getIdentificationNumber() {
            return identificationNumber;
        }

        public Builder setIdentificationNumber(String identificationNumber) {
            this.identificationNumber = identificationNumber;
            return this;
        }

        public String getFatherName() {
            return fatherName;
        }

        public Builder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public EditProfileWithConfirmationVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.nickName != null)
                return new EditProfileWithConfirmationVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
