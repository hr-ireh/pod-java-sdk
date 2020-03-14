
package com.fanap.podSakku.data.modelVo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accessToken",
    "buildArgs",
    "docker_file",
    "image_name",
    "url",
    "urlBranch",
    "username"
})
public class ApplicationGitVo {

    @JsonProperty("accessToken")
    private String accessToken;
    @JsonProperty("buildArgs")
    private List<String> buildArgs = null;
    @JsonProperty("docker_file")
    private String dockerFile;
    @JsonProperty("image_name")
    private String imageName;
    @JsonProperty("url")
    private String url;
    @JsonProperty("urlBranch")
    private String urlBranch;
    @JsonProperty("username")
    private String username;

    @JsonProperty("accessToken")
    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("accessToken")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @JsonProperty("buildArgs")
    public List<String> getBuildArgs() {
        return buildArgs;
    }

    @JsonProperty("buildArgs")
    public void setBuildArgs(List<String> buildArgs) {
        this.buildArgs = buildArgs;
    }

    @JsonProperty("docker_file")
    public String getDockerFile() {
        return dockerFile;
    }

    @JsonProperty("docker_file")
    public void setDockerFile(String dockerFile) {
        this.dockerFile = dockerFile;
    }

    @JsonProperty("image_name")
    public String getImageName() {
        return imageName;
    }

    @JsonProperty("image_name")
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("urlBranch")
    public String getUrlBranch() {
        return urlBranch;
    }

    @JsonProperty("urlBranch")
    public void setUrlBranch(String urlBranch) {
        this.urlBranch = urlBranch;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

}
