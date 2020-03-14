package com.fanap.podSakku.data.modelSrv;

import com.fanap.podSakku.enums.CatalogMetadataScope;

/**
 * @author N.Zamiri
 */

public class CatalogMetadata {

    private String name;
    private CatalogMetadataScope scope;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CatalogMetadataScope getScope() {
        return scope;
    }

    public void setScope(CatalogMetadataScope scope) {
        this.scope = scope;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
