package com.fanap.podAIPlatform.data.modelSrv;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestContent {
    @JsonProperty("PacketID")
    private String PacketID;
    @JsonProperty("UserID")
    private String UserID;
    @JsonProperty("ConversationID")
    private String ConversationID;
    @JsonProperty("TimeStamp")
    private String TimeStamp;
    @JsonProperty("LinkFile")
    private String LinkFile;

    public String getPacketID() {
        return PacketID;
    }

    public void setPacketID(String packetID) {
        PacketID = packetID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getConversationID() {
        return ConversationID;
    }

    public void setConversationID(String conversationID) {
        ConversationID = conversationID;
    }

    public String getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        TimeStamp = timeStamp;
    }

    public String getLinkFile() {
        return LinkFile;
    }

    public void setLinkFile(String linkFile) {
        LinkFile = linkFile;
    }
}
