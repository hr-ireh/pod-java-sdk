package com.fanap.podProduct.data.modelSrv;


import java.io.Serializable;

/**
 * Created by h.mehrara on 9/20/2014 @Nozhaco.
 */
/*
@ApiObject(
        name = "UserPostInfoSrv",
        description = "desc"
)
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
