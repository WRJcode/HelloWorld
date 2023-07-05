package arvin.java.util.concurrent.demo;

import java.util.concurrent.RecursiveTask;

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
