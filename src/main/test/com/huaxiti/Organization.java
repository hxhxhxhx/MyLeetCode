package com.huaxiti;

import java.io.Serializable;

public class Organization implements Serializable {
    /**
     * 组织id(主键 )
     */
    private String id;

    /**
     * 组织名称
     */
    private String orgName;

    /**
     * 组织分类
     */
    private String orgCategory;

    /**
     * 主要负责人(userId)
     */
    private String orgManager;

    /**
     * 管理部门
     */
    private String managerDept;

    /**
     * 是否可见
     */
    private boolean flag;

    /**
     * 创建时间
     */
    private Long insertTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 删除时间
     */
    private Long deleteTime;

    /**
     * 逻辑删除
     */
    private boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCategory() {
        return orgCategory;
    }

    public void setOrgCategory(String orgCategory) {
        this.orgCategory = orgCategory;
    }

    public String getOrgManager() {
        return orgManager;
    }

    public void setOrgManager(String orgManager) {
        this.orgManager = orgManager;
    }

    public String getManagerDept() {
        return managerDept;
    }

    public void setManagerDept(String managerDept) {
        this.managerDept = managerDept;
    }


    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Long getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Long insertTime) {
        this.insertTime = insertTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id='" + id + '\'' +
                ", orgName='" + orgName + '\'' +
                ", orgCategory='" + orgCategory + '\'' +
                ", orgManager='" + orgManager + '\'' +
                ", managerDept='" + managerDept + '\'' +
                ", flag=" + flag +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                ", deleteTime=" + deleteTime +
                ", deleted=" + deleted +
                '}';
    }


    public static final class Builder {
        private Organization organization;

        private Builder() {
            organization = new Organization();
        }

        public static Builder anOrganization() {
            return new Builder();
        }

        public Builder id(String id) {
            organization.setId(id);
            return this;
        }

        public Builder orgName(String orgName) {
            organization.setOrgName(orgName);
            return this;
        }

        public Builder orgCategory(String orgCategory) {
            organization.setOrgCategory(orgCategory);
            return this;
        }

        public Builder orgManager(String orgManager) {
            organization.setOrgManager(orgManager);
            return this;
        }

        public Builder managerDept(String managerDept) {
            organization.setManagerDept(managerDept);
            return this;
        }

        public Builder flag(boolean flag) {
            organization.setFlag(flag);
            return this;
        }

        public Builder insertTime(Long insertTime) {
            organization.setInsertTime(insertTime);
            return this;
        }

        public Builder updateTime(Long updateTime) {
            organization.setUpdateTime(updateTime);
            return this;
        }

        public Builder deleteTime(Long deleteTime) {
            organization.setDeleteTime(deleteTime);
            return this;
        }

        public Builder deleted(boolean deleted) {
            organization.setDeleted(deleted);
            return this;
        }

        public Organization build() {
            return organization;
        }
    }
}
