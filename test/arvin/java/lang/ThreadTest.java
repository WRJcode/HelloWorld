package arvin.java.lang;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreadTest {

    private final MyThread myThread = new MyThread();

     static class MyThread extends Thread{
         @Override
        public void run() {
             int i;
             try {
                 for (i = 0; i < 10; i++) {
                     System.out.println("MyThreadTest " + Thread.currentThread().getName() + " " + i);
                     //System.out.println(Thread.currentThread().getThreadGroup());
                 }
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
        }
    }

    public static void first()
    {
        second();
    }
    public static void second()
    {
        third();
    }
    public static void third()
    {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println("Displaying Stack trace using StackTraceElement in Java");
        for(StackTraceElement st : stackTrace)
        {
            // print the stack trace
            System.out.println(st);
        }
    }




    @BeforeEach
    void setUp() {
        System.out.println("============开始测试=========");
    }

    @AfterEach
    void tearDown() {
        System.out.println("============测试结束=========");
    }

    @Test
    void blockedOn() {
    }

    @Test
    void currentThread() {
        System.out.println(Thread.currentThread().getName());
    }

    @Test
    void yield() {
        //启发放弃？
    }

    @Test
    void sleep() throws InterruptedException {
         Thread.sleep(1000);
         System.out.println("睡眠了1秒之后");

    }


    @Test
    void testClone() {
         //不可克隆？
    }

    @Test
    void start() {
        myThread.start();
    }

    @Test
    void run() {
         //调用了myThread的run方法，但并未开辟新的线程
         myThread.run();
    }

    @Test
    void stop() {
    }


    @Test
    void interrupt() {
    }

    @Test
    void interrupted() {
    }

    @Test
    void isInterrupted() {
    }

    @Test
    void destroy() {
    }

    @Test
    void isAlive() {
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(myThread.isAlive());
    }

    @Test
    void suspend() {
    }

    @Test
    void resume() {
    }

    @Test
    void setPriority() {
    }

    @Test
    void getPriority() {
    }

    @Test
    void setName() {
    }

    @Test
    void getName() {
    }

    @Test
    void getThreadGroup() throws InterruptedException {
         myThread.start();
         System.out.println(Thread.currentThread().getThreadGroup().activeGroupCount());
    }

    @Test
    void activeCount() {
    }

    @Test
    void enumerate() {
         myThread.start();
         //加上myThread一共3个线程
         Thread[] threads = new Thread[3];
         Thread.enumerate(threads);
        for (Thread t:threads) {
            System.out.println(t.getName());
        }
    }

    @Test
    void countStackFrames() {
         //已弃用
    }

    @Test
    void join() throws InterruptedException {
         myThread.start();
         myThread.join();
         System.out.println("等待死亡");
    }

    @Test
    void testJoin() throws InterruptedException {
        myThread.start();
        myThread.join(1000);
        System.out.println("等待死亡");
    }

    @Test
    void testJoin1() throws InterruptedException {

        //等到线程

        myThread.start();
        myThread.join(1000,1000);
        System.out.println("等待死亡");
    }

    @Test
    void dumpStack() {
        //default
    }

    @Test
    void setDaemon() {
         //设置为守护线程，主要线程结束之后会自动关闭
         myThread.setDaemon(true);
    }

    @Test
    void isDaemon() {
         //判断是否是守护线程
    }

    @Test
    void checkAccess() {
         //确定当前正在运行的线程是否有权修改此线程。
         //如果有安全管理器，则使用此线程作为其参数调用其 checkAccess 方法。这可能会导致引发 SecurityException
         myThread.checkAccess();
    }

    @Test
    void testToString() {
        String s =  myThread.toString();
        System.out.println(s);
    }

    @Test
    void getContextClassLoader() {
         ClassLoader cl= myThread.getContextClassLoader();
         System.out.println(cl.toString());
    }

    @Test
    void setContextClassLoader() {
         //设置类加载器
    }

    @Test
    void holdsLock() throws InterruptedException {

         //检测当前线程是否持有锁

         Object o = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(o) {
                    System.out.println("child thread: holdLock: " +
                            Thread.holdsLock(o));
                }
            }
        }).start();
        System.out.println("main thread: holdLock: " + Thread.holdsLock(o));
        Thread.sleep(2000);

    }

    @Test
    void getStackTrace() {

        first();
    }

    @Test
    void getAllStackTraces() {
    }

    @Test
    void getId() {
        long id = myThread.getId();
        System.out.println(id);
    }

    @Test
    void getState() throws InterruptedException {
        Thread.State state = myThread.getState();
        System.out.println(state); //NEW
        myThread.start();
        System.out.println(myThread.getState());//RUNNABLE
        Thread.sleep(6 * 1000);
        System.out.println(myThread.getState());//TERMINATED
    }

    @Test
    void setDefaultUncaughtExceptionHandler() {
    }

    @Test
    void getDefaultUncaughtExceptionHandler() {
    }

    @Test
    void getUncaughtExceptionHandler() {
    }

    @Test
    void setUncaughtExceptionHandler() {
    }

    @Test
    void processQueue() {

    }
}