package test.jichu;

/**
 * @author kabi
 * @date: 2024-09-26
 * @description: 项目进度里程碑-项目状态 枚举类
 */
@SuppressWarnings("unused")
public enum ProjectDeliverStatusEnum {

    UN_STARTED(0, "未开始"),
    IN_PROCESSING(1, "实施中"),
    FINISHED(2, "已交付"),
    HAS_CHECKED(3, "已验收");

    private final Integer code;
    private final String desc;

    ProjectDeliverStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
