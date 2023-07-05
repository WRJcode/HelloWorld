package arvin.java.util.concurrent.demo;

/**
 * @author alvin
 * 基本创建多线程demo
 * 1.extend Thread
 * 2.implements runnable
 *
 * 传统方式编码与函数式编程风格的从差异。
 */
public class BasicCreateThreadDemo {
    public static void main(String[] args) {

//        Thread t = new Thread(() -> {
//            System.out.println("start new thread.");
//        }) ;
//
//        t.start();

        Runnable r = () ->{
            System.out.println("This is a thread. And implements runnable.");
        };
        Thread myThread = new Thread(r);
        myThread.start();
    }
}
