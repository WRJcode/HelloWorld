package arvin.java.util.concurrent.demo;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

        // 添加键值对
        for (int i = 0; i < 10; i++) {
            map.put(i, "value" + i);
        }

        // 创建5个线程进行并发操作
        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                // 添加键值对
                for (int j = 10; j < 15; j++) {
                    map.put(j, "value" + j);
                }

                // 删除键值对
                for (int j = 0; j < 5; j++) {
                    map.remove(j);
                }

                // 修改键值对
                for (int j = 5; j < 10; j++) {
                    map.put(j, "newValue" + j);
                }

                // 读取映射表
                for (int j = 0; j < 15; j++) {
                    String value = map.get(j);
                    System.out.println(Thread.currentThread().getName() + " gets " + j + " -> " + value);
                }
            });

            threads[i].start();
        }

        // 等待所有线程执行完毕
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        // 输出最终的映射表
        System.out.println("Final Map: " + map);
    }
}
