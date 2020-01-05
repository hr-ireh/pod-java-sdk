package com.fanap.SsoService.data.modelVo;

import com.fanap.SsoService.exception.PodException;

/**
 * Created by Shahab Askarian on 6/19/2019.
 */
public class HandshakeVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization, client_id and device_uid are required parameters!";

    private String authorization;
    private String client_id;
    private String device_uid;
    private double device_lat;
    private double device_lon;
    private String device_os;
    private String device_os_version;
    private String device_type;
    private String device_name;
    private String algorithm;

    public HandshakeVo(Builder builder) {
        this.authorization = builder.getAuthorization();
        this.client_id = builder.getClient_id();
        this.device_uid = builder.getDevice_uid();
        this.device_lat = builder.getDevice_lat();
        this.device_lon = builder.getDevice_lon();
        this.device_os = builder.getDevice_os();
        this.device_os_version = builder.getDevice_os_version();
        this.device_type = builder.getDevice_type();
        this.device_name = builder.getDevice_name();
        this.algorithm = builder.getAlgorithm();
    }

    public String getAuthorization() {
        return authorization;
    }

    public String getClient_id() {
        return client_id;
    }

    public String getDevice_uid() {
        return device_uid;
    }

    public double getDevice_lat() {
        return device_lat;
    }

    public double getDevice_lon() {
        return device_lon;
    }

    public String getDevice_os() {
        return device_os;
    }

    public String getDevice_os_version() {
        return device_os_version;
    }

    public String getDevice_type() {
        return device_type;
    }

    public String getDevice_name() {
        return device_name;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public static class Builder {
        private String authorization;
        private String client_id;
        private String device_uid;
        private double device_lat;
        private double device_lon;
        private String device_os;
        private String device_os_version;
        private String device_type;
        private String device_name;
        private String algorithm;

        public String getAuthorization() {
            return authorization;
        }

        public Builder setAuthorization(String authorization) {
            this.authorization = "Bearer " + authorization;
            return this;
        }

        public String getClient_id() {
            return client_id;
        }

        public Builder setClient_id(String client_id) {
            this.client_id = client_id;
            return this;
        }

        public String getDevice_uid() {
            return device_uid;
        }

        public Builder setDevice_uid(String device_uid) {
            this.device_uid = device_uid;
            return this;
        }

        public double getDevice_lat() {
            return device_lat;
        }

        public Builder setDevice_lat(double device_lat) {
            this.device_lat = device_lat;
            return this;
        }

        public double getDevice_lon() {
            return device_lon;
        }

        public Builder setDevice_lon(double device_lon) {
            this.device_lon = device_lon;
            return this;
        }

        public String getDevice_os() {
            return device_os;
        }

        public Builder setDevice_os(String device_os) {
            this.device_os = device_os;
            return this;
        }

        public String getDevice_os_version() {
            return device_os_version;
        }

        public Builder setDevice_os_version(String device_os_version) {
            this.device_os_version = device_os_version;
            return this;
        }

        public String getDevice_type() {
            return device_type;
        }

        public Builder setDevice_type(String device_type) {
            this.device_type = device_type;
            return this;
        }

        public String getDevice_name() {
            return device_name;
        }

        public Builder setDevice_name(String device_name) {
            this.device_name = device_name;
            return this;
        }

        public String getAlgorithm() {
            return algorithm;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public HandshakeVo build() throws PodException {
            if (this.getDevice_uid() != null && this.getAuthorization() != null &&
                    this.getClient_id() != null)
                return new HandshakeVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
