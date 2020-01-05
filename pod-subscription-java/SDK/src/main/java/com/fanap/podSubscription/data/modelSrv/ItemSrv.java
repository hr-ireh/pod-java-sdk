package com.fanap.podSubscription.data.modelSrv;

import java.io.Serializable;
import java.util.List;

/**
 * Created by h.mehrara on 9/20/2014 @Nozhaco.
 */
/*
@ApiObject(
        name = "ItemSrv",
        description = "desc"
)
*/
abstract public class ItemSrv implements Serializable {
    private long id;
    private int version;
    private long timelineId;
    private long entityId;
    private long numOfLikes;
    private long numOfDisLikes;
    private long numOfFavorites;
    private long numOfComments;
    private long timestamp;
    private boolean enable;
    private boolean hide;
    private BusinessSoftSrv business;
    private UserSrv userSrv;
    private UserPostInfoSrv userPostInfo;
    private String metadata;
    private double latitude;
    private double longitude;
    private Boolean canComment;
    private Boolean canLike;
    private List<String> tags;
    private List<String> tagTrees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getTimelineId() {
        return timelineId;
    }

    public void setTimelineId(long timelineId) {
        this.timelineId = timelineId;
    }

    public long getEntityId() {
        return entityId;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    public long getNumOfLikes() {
        return numOfLikes;
    }

    public void setNumOfLikes(long numOfLikes) {
        this.numOfLikes = numOfLikes;
    }

    public long getNumOfFavorites() {
        return numOfFavorites;
    }

    public void setNumOfFavorites(long numOfFavorites) {
        this.numOfFavorites = numOfFavorites;
    }

    public long getNumOfComments() {
        return numOfComments;
    }

    public void setNumOfComments(long numOfComments) {
        this.numOfComments = numOfComments;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }

    public BusinessSoftSrv getBusiness() {
        return business;
    }

    public void setBusiness(BusinessSoftSrv business) {
        this.business = business;
    }

    public UserSrv getUserSrv() {
        return userSrv;
    }

    public void setUserSrv(UserSrv userSrv) {
        this.userSrv = userSrv;
    }

    public UserPostInfoSrv getUserPostInfo() {
        return userPostInfo;
    }

    public void setUserPostInfo(UserPostInfoSrv userPostInfo) {
        this.userPostInfo = userPostInfo;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
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

    public Boolean getCanComment() {
        return canComment;
    }

    public void setCanComment(Boolean canComment) {
        this.canComment = canComment;
    }

    public Boolean getCanLike() {
        return canLike;
    }

    public void setCanLike(Boolean canLike) {
        this.canLike = canLike;
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

    public long getNumOfDisLikes() {
        return numOfDisLikes;
    }

    public void setNumOfDisLikes(long numOfDisLikes) {
        this.numOfDisLikes = numOfDisLikes;
    }
}
