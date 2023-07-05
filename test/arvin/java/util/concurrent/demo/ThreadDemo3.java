package arvin.java.util.concurrent.demo;

/*
 实现Runnable接口
 lambda表达式
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Runnable r = () ->{
            System.out.println("This is a thread. And implements runnable.");
        };
        Thread myThread = new Thread(r);
        myThread.start();
    }
}
