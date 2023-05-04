package test.jichu.线程;

public class testThread{
    public static void main(String[] args) {
        new Father().start();
    }

    static class Father extends Thread{
        @Override
        public void run() {
            System.out.println("this is a thread");
        }
    }
}
