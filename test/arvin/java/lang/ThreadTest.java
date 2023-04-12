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
    }

    @Test
    void countStackFrames() {
    }

    @Test
    void join() {
    }

    @Test
    void testJoin() {
    }

    @Test
    void testJoin1() {
    }

    @Test
    void dumpStack() {
    }

    @Test
    void setDaemon() {
    }

    @Test
    void isDaemon() {
    }

    @Test
    void checkAccess() {
    }

    @Test
    void testToString() {
    }

    @Test
    void getContextClassLoader() {
    }

    @Test
    void setContextClassLoader() {
    }

    @Test
    void holdsLock() {
    }

    @Test
    void getStackTrace() {
    }

    @Test
    void getAllStackTraces() {
    }

    @Test
    void getId() {
    }

    @Test
    void getState() {
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