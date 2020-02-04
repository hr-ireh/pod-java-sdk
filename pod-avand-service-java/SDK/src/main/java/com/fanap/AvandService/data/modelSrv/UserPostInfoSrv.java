package com.fanap.AvandService.data.modelSrv;


import java.io.Serializable;

/**
 * Created by Zahra.Gholinia on 2/4/2020.
 */
public class UserPostInfoSrv implements Serializable {
    private long postId;
    private boolean liked;
    private boolean favorite;

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
