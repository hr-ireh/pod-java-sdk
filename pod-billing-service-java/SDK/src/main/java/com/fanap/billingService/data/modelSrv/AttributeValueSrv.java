package com.fanap.billingService.data.modelSrv;


import java.io.Serializable;

/**
 * Created by h.mehrara on 3/3/2015.
 */
/*@ApiObject(
        name = "AttributeValueSrv",
        description = "desc"
)*/
public class AttributeValueSrv implements Serializable {
    private String code;
    private String name;
    private String value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
