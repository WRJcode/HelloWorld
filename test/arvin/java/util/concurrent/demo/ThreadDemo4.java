package arvin.java.util.concurrent.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
ExecutorService 线程池
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() ->{
            System.out.println("This is a thread. And implements runnable.");
        });
        executorService.shutdown();
    }
}
