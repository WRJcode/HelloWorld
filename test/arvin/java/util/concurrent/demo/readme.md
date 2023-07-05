### 创建/使用多线程

#### 1. 创建线程的方式

##### 1.1 继承Thread类

```java
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread");
    }
}
```

##### 1.2 实现Runnable接口

```java
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable");
    }
}
```

##### 1.3 实现Callable接口

```java
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "MyCallable";
    }
}
```

##### 1.4 CompletableFuture

```java
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
```

##### 1.5 线程池

```java
public class ThreadDemo10 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(() -> {
            System.out.println("This is a thread. And implements runnable.");
        });
        executorService.shutdown();
    }
}
```

##### 1.6 Fork/Join

```java
/*
Fork/Join框架
 */
public class ThreadDemo7 extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 2;
    private int start;
    private int end;

    public ThreadDemo7(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute(){
        int sum = 0;
        boolean canCompute = (end - start) <= THRESHOLD;
        if(canCompute){
            for(int i = start; i <= end; i++){
                sum += i;
            }
        }else{
            int middle = (start + end) / 2;
            ThreadDemo7 leftTask = new ThreadDemo7(start, middle);
            ThreadDemo7 rightTask = new ThreadDemo7(middle + 1, end);
            leftTask.fork();
            rightTask.fork();
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();
            sum = leftResult + rightResult;
        }
        return sum;
    }

    public static void main(String[] args) {
        ThreadDemo7 task = new ThreadDemo7(1, 100);
        task.fork();
        int result = task.join();
        System.out.println(result);
    }
}
```

```java
public class ThreadDemo8 extends RecursiveAction {
    private static final int THRESHOLD = 10; // 阈值，用于控制任务拆分的条件
    private int start;
    private int end;
    public ThreadDemo8(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    protected void compute() {
        if (end - start <= THRESHOLD) {
            // 当任务大小小于等于阈值时，直接执行任务逻辑
            for (int i = start; i <= end; i++) {
                // 任务逻辑
                System.out.println("Task executed: " + i);
            }
        } else {
            // 当任务大小大于阈值时，拆分任务并递归调用
            int mid = (start + end) / 2;
            ThreadDemo8 leftAction = new ThreadDemo8(start, mid);
            ThreadDemo8 rightAction = new ThreadDemo8(mid + 1, end);
            invokeAll(leftAction, rightAction);
        }

    }

    public static void main(String[] args) {
        ThreadDemo8 task = new ThreadDemo8(1, 20);
        task.fork();
        task.join();
    }
}
```

##### 1.7 实现ThreadFactory接口

```java
/*
实现ThreadFactory接口
 */
public class ThreadDemo6 implements ThreadFactory {

    private int counter;
    private String prefix;

    public ThreadDemo6(int counter, String prefix) {
        this.counter = counter;
        this.prefix = prefix;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName(prefix + "-" + counter++);
        return thread;
    }

    public static void main(String[] args) {
        ThreadDemo6 threadDemo6 = new ThreadDemo6(1, "ThreadDemo6");
        Thread thread = threadDemo6.newThread(() -> {
            System.out.println(Thread.currentThread() + "This is a thread. And implements runnable.");
        });
        thread.start();

        Thread thread1 = threadDemo6.newThread(() -> {
            System.out.println(Thread.currentThread() + "This is a thread. And implements runnable.");
        });
        thread1.start();

    }
}
```

##### 1.8 ExecutorService（Runnable异步任务）

```java
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
```

#### 2. 线程的状态

##### 2.1 新建状态

```java
public class NewStateDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println(thread.getState());
    }
}
```

##### 2.2 就绪状态

```java
public class RunnableStateDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        System.out.println(thread.getState());
    }
}
```

#### 3. 线程的常用方法

##### 3.1 start()

```java
public class StartDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
    }
}
```

##### 3.2 join()

```java
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        thread.start();
        thread.join();
    }
}
```

##### 3.3 sleep()

```java
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
    }
}
```

##### 3.4 yield()

```java
public class YieldDemo {
    public static void main(String[] args) {
        Thread.yield();
    }
}
```

##### 3.5 interrupt()

```java
public class InterruptDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.interrupt();
    }
}
```

##### 3.6 isInterrupted()

```java
public class IsInterruptedDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.isInterrupted();
    }
}
```

##### 3.7 currentThread()

```java
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
    }
}
```

##### 3.8 setDaemon()

```java
public class SetDaemonDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setDaemon(true);
    }
}
```

##### 3.9 setPriority()

```java
public class SetPriorityDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setPriority(Thread.MAX_PRIORITY);
    }
}
```

##### 3.10 getPriority()

```java
public class GetPriorityDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println(thread.getPriority());
    }
}
```

#### 4. 线程互斥

##### 4.1 synchronized

```java
public class SynchronizedDemo {
    public static void main(String[] args) {
        synchronized (SynchronizedDemo.class) {
            System.out.println("This is a synchronized block.");
        }
    }
}
```

##### 4.2 ReentrantLock

```java
public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println("This is a ReentrantLock.");
        } finally {
            lock.unlock();
        }
    }
}
```

##### 4.3 ReentrantReadWriteLock

```java
public class ReentrantReadWriteLockDemo {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        lock.readLock().lock();
        try {
            System.out.println("This is a ReentrantReadWriteLock.");
        } finally {
            lock.readLock().unlock();
        }
    }
}
```

##### 4.4 Semaphore

```java
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
            System.out.println("This is a Semaphore.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
```

##### 4.5 CountDownLatch

```java
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            countDownLatch.await();
            System.out.println("This is a CountDownLatch.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

##### 4.6 CyclicBarrier

```java
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(1);
        try {
            cyclicBarrier.await();
            System.out.println("This is a CyclicBarrier.");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
```

##### 4.7 Exchanger

```java
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        try {
            String exchange = exchanger.exchange("This is a Exchanger.");
            System.out.println(exchange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

##### 4.8 LockSupport

```java
public class LockSupportDemo {
    public static void main(String[] args) {
        LockSupport.park();
        System.out.println("This is a LockSupport.");
    }
}
```

#### 5. 线程通信

##### 5.1 wait() / notify()

```java
public class WaitNotifyDemo {
    public static void main(String[] args) {
        Object lock = new Object();
        new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("This is a wait/notify.");
            }
        }).start();
        new Thread(() -> {
            synchronized (lock) {
                lock.notify();
            }
        }).start();
    }
}
```

##### 5.2 await() / signal()

```java
public class AwaitSignalDemo {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        new Thread(() -> {
            lock.lock();
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("This is a await/signal.");
            lock.unlock();
        }).start();
        new Thread(() -> {
            lock.lock();
            condition.signal();
            lock.unlock();
        }).start();
    }
}
```

##### 5.3 join()

```java
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> System.out.println("This is a join."));
        thread.start();
        thread.join();
    }
}
```

##### 5.4 sleep()

```java
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("This is a sleep.");
    }
}
```

##### 5.5 yield()

```java

public class YieldDemo {
    public static void main(String[] args) {
        Thread.yield();
        System.out.println("This is a yield.");
    }
}
```

##### 5.6 park() / unpark()

```java
public class ParkUnparkDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            LockSupport.park();
            System.out.println("This is a park/unpark.");
        });
        thread.start();
        LockSupport.unpark(thread);
    }
}
```

##### 5.7 Condition

```java
public class ConditionDemo {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        new Thread(() -> {
            lock.lock();
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("This is a Condition.");
            lock.unlock();
        }).start();
        new Thread(() -> {
            lock.lock();
            condition.signal();
            lock.unlock();
        }).start();
    }
}
```

#### 6. 线程池

##### 6.1 ThreadPoolExecutor

```java
public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        threadPoolExecutor.execute(() -> System.out.println("This is a ThreadPoolExecutor."));
        threadPoolExecutor.shutdown();
    }
}
```

##### 6.2 ScheduledThreadPoolExecutor

```java
public class ScheduledThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.schedule(() -> System.out.println("This is a ScheduledThreadPoolExecutor."), 1, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.shutdown();
    }
}
```

##### 6.3 ForkJoinPool

```java
public class ForkJoinPoolDemo {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(1);
        forkJoinPool.execute(() -> System.out.println("This is a ForkJoinPool."));
        forkJoinPool.shutdown();
    }
}
```

##### 6.4 SingleThreadExecutor

```java
public class SingleThreadExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> System.out.println("This is a SingleThreadExecutor."));
        executorService.shutdown();
    }
}
```

##### 6.5 CachedThreadPool

```java
public class CachedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> System.out.println("This is a CachedThreadPool."));
        executorService.shutdown();
    }
}
```

##### 6.6 FixedThreadPool

```java
public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(() -> System.out.println("This is a FixedThreadPool."));
        executorService.shutdown();
    }
}
```

##### 6.7 ScheduledExecutorService

```java

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.schedule(() -> System.out.println("This is a ScheduledExecutorService."), 1, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}
```

#### 7. 线程安全

##### 7.1 synchronized

```java
public class SynchronizedDemo {
    public static void main(String[] args) {
        synchronized (SynchronizedDemo.class) {
            System.out.println("This is a synchronized.");
        }
    }
}
```

##### 7.2 volatile

```java
public class VolatileDemo {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        new Thread(() -> {
            while (!flag) {
            }
            System.out.println("This is a volatile.");
        }).start();
        new Thread(() -> {
            flag = true;
        }).start();
    }
}
```

##### 7.3 ReentrantLock

```java
public class ReentrantLockDemo {
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();
        System.out.println("This is a ReentrantLock.");
        lock.unlock();
    }
}
```

##### 7.4 ReentrantReadWriteLock

```java
public class ReentrantReadWriteLockDemo {
    private static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        readWriteLock.readLock().lock();
        System.out.println("This is a ReentrantReadWriteLock.");
        readWriteLock.readLock().unlock();
    }
}
```

##### 7.5 StampedLock

```java
public class StampedLockDemo {
    private static StampedLock stampedLock = new StampedLock();

    public static void main(String[] args) {
        long stamp = stampedLock.writeLock();
        System.out.println("This is a StampedLock.");
        stampedLock.unlockWrite(stamp);
    }
}
```

##### 7.6 CopyOnWriteArrayList

```java
public class CopyOnWriteArrayListDemo {
    private static List<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        list.add("This is a CopyOnWriteArrayList.");
        System.out.println(list.get(0));
    }
}
```

##### 7.7 ConcurrentHashMap

```java
public class ConcurrentHashMapDemo {
    private static Map<String, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        map.put("key", "This is a ConcurrentHashMap.");
        System.out.println(map.get("key"));
    }
}
```

##### 7.8 ConcurrentLinkedQueue

```java
public class ConcurrentLinkedQueueDemo {
    private static Queue<String> queue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {
        queue.offer("This is a ConcurrentLinkedQueue.");
        System.out.println(queue.poll());
    }
}
```

##### 7.9 BlockingQueue

```java
public class BlockingQueueDemo {
    private static BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        blockingQueue.offer("This is a BlockingQueue.");
        System.out.println(blockingQueue.poll());
    }
}
```

##### 7.10 CountDownLatch

```java
public class CountDownLatchDemo {
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            System.out.println("This is a CountDownLatch.");
            countDownLatch.countDown();
        }).start();
        countDownLatch.await();
    }
}
```

##### 7.11 CyclicBarrier

```java
public class CyclicBarrierDemo {
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        new Thread(() -> {
            try {
                System.out.println("This is a CyclicBarrier.");
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();
        cyclicBarrier.await();
    }
}
```

[//]: # (分析CyclicBarrier的源码)

###### CyclicBarrier原理

>CyclicBarrier是一个同步辅助类，它允许一组线程相互等待，直到到达某个公共屏障点。CyclicBarrier可以用于多线程计算数据，最后合并计算结果的应用场景。例如，用一个Excel保存了用户所有银行流水，每个Sheet保存一个账户近一年的每笔银行流水，现在需要统计用户的日均银行流水，先用多线程处理每个sheet里的银行流水，都执行完之后，得到每个sheet的日均银行流水，最后，再用barrierAction用这些线程的计算结果，计算出整个Excel的日均银行流水。

> CyclicBarrier初始时还可带一个Runnable的barrierAction，此barrierAction会在所有线程都到达Barrier时执行。CyclicBarrier的计数器可以重置，所以它能处理循环的情况。CyclicBarrier提供的await()方法用来挂起当前线程，直至所有线程都到达Barrier状态再同时执行后续任务；await(long timeout, TimeUnit unit)用于挂起当前线程，直至所有线程都到达Barrier状态或者达到timeout时，才会继续执行后续任务。

> CyclicBarrier与CountDownLatch的区别
> CyclicBarrier的计数器可以重置，而CountDownLatch不行，所以CyclicBarrier能处理循环的情况，而CountDownLatch不能。<br/>
> CyclicBarrier提供的await()方法用来挂起当前线程，直至所有线程都到达Barrier状态再同时执行后续任务；await(long timeout, TimeUnit unit)用于挂起当前线程，直至所有线程都到达Barrier状态或者达到timeout时，才会继续执行后续任务；CountDownLatch提供的await()方法用来挂起当前线程，直至所有线程都到达Barrier状态再同时执行后续任务；await(long timeout, TimeUnit unit)用于挂起当前线程，直至所有线程都到达Barrier状态或者达到timeout时，才会继续执行后续任务。

> CyclicBarrier还提供其他有用的方法，比如getNumberWaiting方法可以获得CyclicBarrier阻塞的线程数量；isBroken方法用来知道阻塞的线程是否被中断；reset方法用来重置Barrier。

> CyclicBarrier的构造方法CyclicBarrier(int parties, Runnable barrierAction)参数parties指让多少个线程或者任务等待至barrier状态；参数barrierAction为当这些线程都达到barrier状态时会执行的内容。






