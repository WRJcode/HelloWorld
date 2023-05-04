package arvin.java.lang;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ThreadGroupTest {

    private final ThreadGroupTest.MyThread myThread1 = new ThreadGroupTest.MyThread();

    private final ThreadGroupTest.MyThread myThread11 = new ThreadGroupTest.MyThread();
    private final ThreadGroupTest.MyThread2 myThread2 = new ThreadGroupTest.MyThread2();

    private final Long[] TIDS = new Long[100];


    static class MyThread extends Thread{
        @Override
        public void run() {
            int i;
            try {
                for (i = 0; i < 10; i++) {
                    System.out.println("MyThreadTest " + Thread.currentThread().getName() + " " + i);
                    //System.out.println(Thread.currentThread().getThreadGroup());
                }
                Thread.sleep( 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class MyThread2 extends Thread{
        @Override
        public void run() {
            int i;
            try {
                for (i = 0; i < 10; i++) {
                    System.out.println("MyThreadTest2 " + Thread.currentThread().getName() + " " + i);
                    //System.out.println(Thread.currentThread().getThreadGroup());
                }
                Thread.sleep( 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static class MyThread3 extends Thread{
        @Override
        public void run() {
            int i;
            try {
                for (i = 0; i < 10; i++) {
                    System.out.println("MyThreadTest2 " + Thread.currentThread().getName() + " " + i);
                    //System.out.println(Thread.currentThread().getThreadGroup());
                }
                Thread.sleep( 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @BeforeEach
    void setUp() {
        myThread1.start();
        myThread11.start();
        myThread2.start();

        TIDS[0] = myThread1.getId();
        TIDS[1] = myThread11.getId();
        TIDS[2] = myThread2.getId();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
    }

    @Test
    void getParent() {
    }

    @Test
    void getMaxPriority() {
    }

    @Test
    void isDaemon() {
    }

    @Test
    void isDestroyed() {
    }

    @Test
    void setDaemon() {
    }

    @Test
    void setMaxPriority() {
    }

    @Test
    void parentOf() {
    }

    @Test
    void checkAccess() {
    }

    @Test
    void activeCount() {
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        int i = group.activeCount();
        System.out.println(i);
    }

    @Test
    void enumerate() {
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        int i = (int)(group.activeCount()*1.2);
        Thread[] threads = new Thread[i];
        int count = group.enumerate(threads,true);
        System.out.println(count);
        for (int j = 0;j < count;j++){
            if (Arrays.asList(TIDS).contains(threads[j].getId()))
                System.out.println(threads[j].getName());
        }
    }

    @Test
    void testEnumerate() {
    }

    @Test
    void activeGroupCount() {
    }

    @Test
    void testEnumerate1() {
    }

    @Test
    void testEnumerate2() {
    }

    @Test
    void stop() {
    }

    @Test
    void interrupt() {
    }

    @Test
    void suspend() {
    }

    @Test
    void destroy() {
    }

    @Test
    void addUnstarted() {
    }

    @Test
    void add() {
    }

    @Test
    void threadStartFailed() {
    }

    @Test
    void threadTerminated() {
    }

    @Test
    void list() {
    }

    @Test
    void testList() {
    }

    @Test
    void uncaughtException() {
    }

    @Test
    void allowThreadSuspension() {
    }

    @Test
    void testToString() {
    }
}