package test.jichu;

public enum InfoEnum {
    START(1,"start"),
    END(2,"end");

    private String id;
    private String name;


    InfoEnum(int id, String name) {

    }

    InfoEnum(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
