package com.huaxiti;

import java.io.Serializable;

public class Organization1 implements Serializable {
    /**
     * 组织id(主键 )
     */
    private String id;

    /**
     * 组织名称
     */
    private String orgName;

    public String getId() {
        return id;
    }

    public Organization1 setId(String id) {
        this.id = id;
        return this;
    }

    public String getOrgName() {
        return orgName;
    }

    public Organization1 setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

}
