package test.jichu.login;

import test.jichu.login.logType.login;
import test.jichu.login.logType.login1;
import test.jichu.login.logType.login2;

public class loginDemo {

    private String b;

    public static void main(String[] args) {
        new Thread(() ->{
            try {
                Thread.sleep(100);
                userLogin("u","p","1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                userLogin("u1", "p1", "1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }


    public synchronized static void userLogin(String user, String pass, String loginType) throws InterruptedException {
        Thread.sleep(3000);
        login login = new login2();
        if ("1".equals(loginType)){
            login = new login1();
            System.out.println(login);
        }
        System.out.println(user+pass+loginType);

//        return login.login(user,pass);
    }
}
