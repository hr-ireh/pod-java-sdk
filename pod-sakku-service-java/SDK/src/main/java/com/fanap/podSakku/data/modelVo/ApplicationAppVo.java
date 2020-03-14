package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.enums.EnumAppType;

import java.io.File;


public class ApplicationAppVo {

    private File appFile;
    private EnumAppType type;
    private String fileHash;
    private String imageName;

    public File getAppFile() {
        return appFile;
    }

    public void setAppFile(File appFile) {
        this.appFile = appFile;
    }

    public EnumAppType getType() {
        return type;
    }

    public void setType(EnumAppType type) {
        this.type = type;
    }

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
