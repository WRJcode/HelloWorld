package arvin.java.util.concurrent;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Semaphore;

import static org.junit.jupiter.api.Assertions.*;

class SemaphoreTest {

    //定义非公平，默认非公平
    Semaphore nonFairSemaphore = new Semaphore(5);
    //公平
    Semaphore fairSemaphore = new Semaphore(5,true);

    @BeforeEach
    void setUp() {
        System.out.println("============开始测试=========");
    }

    @AfterEach
    void tearDown() {
        System.out.println("============测试结束=========");
    }

    @Test
    void acquire() throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.println("第" + i +"个申请");
            nonFairSemaphore.acquire(1);

        }
        Thread.sleep(1000);
        nonFairSemaphore.release(1);
        nonFairSemaphore.acquire(1);
        System.out.println("申请到第6个");
    }

    @Test
    void acquireUninterruptibly() throws InterruptedException {



        for (int i = 1; i <= 5 ; i++) {
            System.out.println("第" + i +"个申请");
            fairSemaphore.acquireUninterruptibly(1);
        }
        Thread.sleep(1000);
        fairSemaphore.release(1);
        fairSemaphore.acquireUninterruptibly(1);
        System.out.println("会不会结束？");
    }

    @Test
    void tryAcquire() {
    }

    @Test
    void testTryAcquire() {
    }

    @Test
    void release() {
    }

    @Test
    void testAcquire() {
    }

    @Test
    void testAcquireUninterruptibly() {
    }

    @Test
    void testTryAcquire1() {
    }

    @Test
    void testRelease() {
    }

    @Test
    void availablePermits() {
    }

    @Test
    void drainPermits() {
    }

    @Test
    void reducePermits() {
    }

    @Test
    void isFair() {
    }

    @Test
    void hasQueuedThreads() {
    }

    @Test
    void getQueueLength() {
    }

    @Test
    void getQueuedThreads() {
    }

    @Test
    void testToString() {
    }
}