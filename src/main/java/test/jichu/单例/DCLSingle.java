package test.jichu.单例;

public class DCLSingle {
    /**
     * 私有实例，volatile修饰的变量是具有可见性的（即被一个线程修改后，其他线程立即可见）
     */
    private volatile static DCLSingle instance = null;

    private DCLSingle(){};

    public static DCLSingle getInstance(){
        //防止多个线程去获取锁，造成阻塞
        if (instance == null){
            synchronized (DCLSingle.class){
                //确保单例
                if (instance == null){
                    instance = new DCLSingle();
                }
            }
        }
        return instance;
    }
}
