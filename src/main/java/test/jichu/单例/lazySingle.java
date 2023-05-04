package test.jichu.单例;

public class lazySingle {
    private static lazySingle instance = null;

    private lazySingle(){};

    public static synchronized lazySingle getInstance(){
        if (instance == null){
            instance = new lazySingle();
        }
        return instance;
    }

}
