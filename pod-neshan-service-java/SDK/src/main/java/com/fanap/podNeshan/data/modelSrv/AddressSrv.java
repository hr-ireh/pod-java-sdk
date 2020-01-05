package com.fanap.podNeshan.data.modelSrv;

import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
 */
public class AddressSrv {


    private String formatted;
    private List<ComponentSrv> components = null;


    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public List<ComponentSrv> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentSrv> components) {
        this.components = components;
    }


}