package arvin.java.util.demo;

import java.util.concurrent.CompletableFuture;

/*
    * @desc CompletableFuture
    * 1.创建异步执行任务
    * 2.处理任务结果
    * 3.串行化任务
    * 4.组合多个CompletableFuture
    * 5.异常处理
    * 6.响应CompletableFuture的完成事件
    * 7.取消CompletableFuture的执行
    * 8.对多个CompletableFuture进行流式操作
    * 9.对多个CompletableFuture进行并行操作
    * 10.对多个CompletableFuture进行响应式操作
    * 11.对多个CompletableFuture进行分组操作
    * 12.对多个CompletableFuture进行聚合操作
    * 13.对多个CompletableFuture进行选择操作
    * 14.对多个CompletableFuture进行完成操作
    * 15.对多个CompletableFuture进行合并操作
    * 16.对多个CompletableFuture进行补偿操作
    * 17.对多个CompletableFuture进行完成操作
 */
public class ThreadDemo9{
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("This is a thread. And implements runnable.");
            return 100;
        });
        //处理任务的结果
        future.thenAccept(System.out::println);
    }
}
