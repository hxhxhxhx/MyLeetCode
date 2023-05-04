package test.jichu.单例;

public class staticClassSingle {
    private static class staticSingle{
        private static final staticClassSingle instance = new staticClassSingle();
    }

    private staticClassSingle(){};

    public static staticClassSingle getInstance(){
        return staticSingle.instance;
    }
}
