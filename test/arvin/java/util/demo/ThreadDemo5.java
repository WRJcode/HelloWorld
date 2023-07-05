package arvin.java.util.demo;

import java.util.concurrent.*;

/*
实现Callable接口
Future 异步任务
 */
public class ThreadDemo5 implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "This is a thread. And implements callable.";
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future1= executorService.submit(new ThreadDemo5());
        //executorService.shutdown();
        Future<String> future2= executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "This is a thread2. And implements callable.";
            }
        });

        future1.cancel(true);
        executorService.shutdown();
        System.out.println(future1.get());
        System.out.println(future2.get());


    }
}
