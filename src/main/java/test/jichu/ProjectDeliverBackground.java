package test.jichu;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author kabi
 * @date: 2024-09-26
 * @description: 项目背景
 */
@SuppressWarnings("unused")
public class ProjectDeliverBackground {

    /** 客户 id */
    private String customerId;
    /** 项目/商机 id */
    private String projectId;
    /** project 类型 */
    /** 项目编号 */
    private String projectDeliverNo;
    /** 项目合同 */
    private List<Map<String, String>> projectDeliverContractList = new ArrayList<>();
    /** 项目所属部门 */
    /** 商务对接人列表 */
    private List<String> businessUserIdList = new ArrayList<>();
    /** 项目实施经理列表 */
    private List<String> manageUserIdList = new ArrayList<>();
    /** 项目状态 */
    private ProjectDeliverStatusEnum status;
    /** 交付清单 */
    private String deliverList;
    /** 截止日期 */
    private Long endTime;
    /** 创建人 id */
    private String createUserId;
    /** 更新人 id */
    private String updateUserId;

    public String getCustomerId() {
        return customerId;
    }

    public ProjectDeliverBackground setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getProjectId() {
        return projectId;
    }

    public ProjectDeliverBackground setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getProjectDeliverNo() {
        return projectDeliverNo;
    }

    public ProjectDeliverBackground setProjectDeliverNo(String projectDeliverNo) {
        this.projectDeliverNo = projectDeliverNo;
        return this;
    }

    public List<Map<String, String>> getProjectDeliverContractList() {
        return projectDeliverContractList;
    }

    public ProjectDeliverBackground setProjectDeliverContractList(List<Map<String, String>> projectDeliverContractList) {
        this.projectDeliverContractList = projectDeliverContractList;
        return this;
    }

    public List<String> getBusinessUserIdList() {
        return businessUserIdList;
    }

    public ProjectDeliverBackground setBusinessUserIdList(List<String> businessUserIdList) {
        this.businessUserIdList = businessUserIdList;
        return this;
    }

    public List<String> getManageUserIdList() {
        return manageUserIdList;
    }

    public ProjectDeliverBackground setManageUserIdList(List<String> manageUserIdList) {
        this.manageUserIdList = manageUserIdList;
        return this;
    }

    public ProjectDeliverStatusEnum getStatus() {
        return status;
    }

    public ProjectDeliverBackground setStatus(ProjectDeliverStatusEnum status) {
        this.status = status;
        return this;
    }

    public String getDeliverList() {
        return deliverList;
    }

    public ProjectDeliverBackground setDeliverList(String deliverList) {
        this.deliverList = deliverList;
        return this;
    }

    public Long getEndTime() {
        return endTime;
    }

    public ProjectDeliverBackground setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public ProjectDeliverBackground setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public ProjectDeliverBackground setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
        return this;
    }
}
