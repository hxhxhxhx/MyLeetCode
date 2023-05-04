package test.jichu;

import java.util.List;

public class School {
    private String id;
    private String name;
    private List<String> examIdList;
    private List<Info> infoList;
    private Info info;

    public List<String> getExamIdList() {
        return examIdList;
    }

    public void setExamIdList(List<String> examIdList) {
        this.examIdList = examIdList;
    }

    public List<Info> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<Info> infoList) {
        this.infoList = infoList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

}
