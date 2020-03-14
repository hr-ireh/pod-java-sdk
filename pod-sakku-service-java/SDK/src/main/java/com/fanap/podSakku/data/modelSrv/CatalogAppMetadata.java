package com.fanap.podSakku.data.modelSrv;

import com.fanap.podSakku.enums.CatalogMetadataScope;
import com.fanap.podSakku.enums.EnumInputType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author N.Zamiri
 */

public class CatalogAppMetadata {

    private String name;
    private String defaultValue;
    private CatalogMetadataScope scope;
    private EnumInputType inputType;
    private List<String> values = new ArrayList<>();
    private boolean advanced;
    private boolean forced;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public CatalogMetadataScope getScope() {
        return scope;
    }

    public void setScope(CatalogMetadataScope scope) {
        this.scope = scope;
    }

    public EnumInputType getInputType() {
        return inputType;
    }

    public void setInputType(EnumInputType inputType) {
        this.inputType = inputType;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public boolean isAdvanced() {
        return advanced;
    }

    public void setAdvanced(boolean advanced) {
        this.advanced = advanced;
    }

    public boolean isForced() {
        return forced;
    }

    public void setForced(boolean forced) {
        this.forced = forced;
    }
}
