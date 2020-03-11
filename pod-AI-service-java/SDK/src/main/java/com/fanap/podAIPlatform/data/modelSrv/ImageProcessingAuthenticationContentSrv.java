package com.fanap.podAIPlatform.data.modelSrv;

public class ImageProcessingAuthenticationContentSrv {

    private String confidence;
    private String resultStatus;
    private String statusMessage;
    private final static String NO_FACE_IN_FIRST_IMAGE = "در تصویر اول چهره وجود ندارد";
    private final static String NO_FACE_IN_SECOND_IMAGE = "در تصویر دوم چهره وجود ندارد";
    private final static String PROBABLY_MATCH = "به احتمال فراوان دو تصویر متعلق به یک نفر است";
    private final static String PROBABLY_MISSMATCH = "به احتمال فراوان دو تصویر متعلق به یک نفر نیست";
    private final static String MATCH = "هر دو تصویر متعلق به یک نفر است";
    private final static String MISMATCH = "دو تصویر متعلق به دو نفر است";

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public String getStatusMessage() {
        setStatusMessage();
        return statusMessage;
    }

    public void setStatusMessage() {
        switch (resultStatus) {
            case "-1":
                this.statusMessage = NO_FACE_IN_FIRST_IMAGE;
                break;
            case "-2":
                this.statusMessage = NO_FACE_IN_SECOND_IMAGE;
                break;
            case "1":
                this.statusMessage = PROBABLY_MATCH;
                break;
            case "2":
                this.statusMessage = PROBABLY_MISSMATCH;
                break;
            case "0":
                this.statusMessage = MATCH;
                break;
            case "3":
                this.statusMessage = MISMATCH;
                break;
        }
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }
}
