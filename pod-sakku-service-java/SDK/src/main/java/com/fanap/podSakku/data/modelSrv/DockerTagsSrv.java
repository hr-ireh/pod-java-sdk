package com.fanap.podSakku.data.modelSrv;

import java.util.ArrayList;
import java.util.List;

/**
 * Mehdi Akbarian-Rastaghi 8/6/19
 */

public class DockerTagsSrv {
    private String name;
    private String avatar;
    private String description;

    private List<DockerTagVO> tags = new ArrayList<>();

    public static class DockerTagVO {
        private String name;
        private long size;
        private String createDate;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<DockerTagVO> getTags() {
        return tags;
    }

    public void setTags(List<DockerTagVO> tags) {
        this.tags = tags;
    }
}
