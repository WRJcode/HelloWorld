package arvin.java.util.concurrent.demo;

import java.util.concurrent.RecursiveAction;

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
