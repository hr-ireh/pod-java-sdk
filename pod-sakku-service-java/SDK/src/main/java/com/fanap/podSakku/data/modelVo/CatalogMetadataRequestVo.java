package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.enums.CatalogMetadataScope;

/**
 * @author N.Zamiri
 */

public class CatalogMetadataRequestVo {
    private String name;
    private CatalogMetadataScope scope;
    private String value;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
