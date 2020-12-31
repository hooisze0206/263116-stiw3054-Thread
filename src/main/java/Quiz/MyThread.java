package Quiz;

public class MyThread implements Runnable{
    static int i = 0;

    @Override
    public void run() {
        System.out.println("running..." + i++);
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        System.out.println("Name of t1:" + thread1.getName()+ i++);
        System.out.println("Name of t2:" + thread2.getName()+ i++);
        System.out.println("Id of t1:" + thread1.getId()+ i++);

        thread1.start();
        thread2.start();

        thread1.setName("STIW3054");
        System.out.println("After changing name of t1:" + thread1.getName() + --i);
        System.out.println("i = "+i);
    }
}
