package com.fanap.podProduct.data.modelSrv;


import java.io.Serializable;
import java.util.List;

/**
 * Created by h.mehrara on 2/1/2016.
 */
/*@ApiObject(
        name = "SearchProductSrv",
        description = "desc"
)*/
public class SearchProductSrv implements Serializable {
    private List<ProductSrv> products;
    private List<GuildSrv> guilds;

    public List<ProductSrv> getProducts() {
        return products;
    }

    public void setProducts(List<ProductSrv> products) {
        this.products = products;
    }

    public List<GuildSrv> getGuilds() {
        return guilds;
    }

    public void setGuilds(List<GuildSrv> guilds) {
        this.guilds = guilds;
    }
}
