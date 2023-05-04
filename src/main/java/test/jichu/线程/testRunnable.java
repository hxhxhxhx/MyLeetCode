package test.jichu.线程;

public class testRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new myRun1(), "线程1");
        Thread t2 = new Thread(new myRun2(), "线程2");
        Thread t3 = new Thread(new myRun2(), "线程3");
        t1.start();
        t2.start();
        t3.start();
    }

    static class myRun1 implements Runnable{

        @Override
        public void run() {
            System.out.println("this is run1");
        }
    }

    static class myRun2 implements Runnable{

        @Override
        public void run() {
            System.out.println("this is run2");
        }
    }

    static class myRun3 implements Runnable{

        @Override
        public void run() {
            System.out.println("this is run3");
            int i = 2/0;
        }
    }
}
