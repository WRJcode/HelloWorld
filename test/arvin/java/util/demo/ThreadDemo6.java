package arvin.java.util.demo;

import java.util.concurrent.ThreadFactory;
/*
实现ThreadFactory接口
 */
public class ThreadDemo6 implements ThreadFactory {

    private int counter;
    private String prefix;

    public ThreadDemo6(int counter, String prefix) {
        this.counter = counter;
        this.prefix = prefix;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName(prefix + "-" + counter++);
        return thread;
    }

    public static void main(String[] args) {
        ThreadDemo6 threadDemo6 = new ThreadDemo6(1, "ThreadDemo6");
        Thread thread = threadDemo6.newThread(() -> {
            System.out.println(Thread.currentThread() + "This is a thread. And implements runnable.");
        });
        thread.start();

        Thread thread1 = threadDemo6.newThread(() -> {
            System.out.println(Thread.currentThread() + "This is a thread. And implements runnable.");
        });
        thread1.start();

    }
}
