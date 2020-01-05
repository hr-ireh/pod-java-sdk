package com.fanap.podProduct.data.modelSrv;


import java.io.Serializable;
import java.util.List;

/**
 * Created by h.mehrara on 3/3/2015.
 */
/*@ApiObject(
        name = "AttributeTemplateSrv",
        description = "desc"
)*/
public class AttributeTemplateSrv implements Serializable {
    private String name;
    private String code;
    private List<AttributeSrv> attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<AttributeSrv> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeSrv> attributes) {
        this.attributes = attributes;
    }
}
