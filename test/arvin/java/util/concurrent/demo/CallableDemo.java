package arvin.java.util.concurrent.demo;

import java.util.concurrent.*;

/**
 * 实现Callable，从而实现多线程，其本质仍是实现Runnable
 */
public class CallableDemo implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        // 线程执行体
        for (int i = 0; i < 10; i++) {
            System.out.println("我是自定义" + Thread.currentThread().getName() + "--" + i);
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableDemo thread = new CallableDemo();
        CallableDemo thread2 = new CallableDemo();

        ExecutorService ser = Executors.newFixedThreadPool(2);

        Future<Boolean> res = ser.submit(thread);
        Future<Boolean> res2 = ser.submit(thread2);

        boolean r1 = res.get();
        boolean r2 = res2.get();

        ser.shutdown();
    }
}
