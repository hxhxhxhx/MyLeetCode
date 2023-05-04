package test.jichu.单例;

public class hangerSingle {
    private static final hangerSingle instance = new hangerSingle();

    private hangerSingle(){};

    public static hangerSingle getInstance(){
        return instance;
    }
}
