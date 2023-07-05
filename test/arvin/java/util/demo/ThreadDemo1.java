package arvin.java.util.demo;

/**
 * 基本创建多线程demo
 * 1. 继承Thread类
 */
public class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        System.out.println("This is a thread. And extends Thread.");
    }

    public static void main(String[] args) {
        ThreadDemo1 t = new ThreadDemo1();
        t.start();
    }
}
