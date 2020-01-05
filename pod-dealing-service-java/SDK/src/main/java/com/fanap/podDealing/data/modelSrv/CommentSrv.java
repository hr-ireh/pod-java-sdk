package com.fanap.podDealing.data.modelSrv;


import java.io.Serializable;

/**
 * Created by h.mehrara on 9/21/2014 @Nozhaco.
 */
/*@ApiObject(
        name = "CommentSrv",
        description = "desc"
)*/
public class CommentSrv implements Serializable {
    private long id;
    private String text;
    private long timestamp;
    private UserSrv user;
    private boolean confirmed;
    private long numOfLikes;
    private long numOfComments;
    private boolean liked;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public UserSrv getUser() {
        return user;
    }

    public void setUser(UserSrv user) {
        this.user = user;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public long getNumOfLikes() {
        return numOfLikes;
    }

    public void setNumOfLikes(long numOfLikes) {
        this.numOfLikes = numOfLikes;
    }

    public long getNumOfComments() {
        return numOfComments;
    }

    public void setNumOfComments(long numOfComments) {
        this.numOfComments = numOfComments;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}
