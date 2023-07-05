package arvin.java.util.demo;

/*
 实现Runnable接口
 */
public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println("This is a thread. And implements runnable.");
    }

    public static void main(String[] args) {
        ThreadDemo2 t = new ThreadDemo2();
        Thread myThread = new Thread(t);
        myThread.start();
    }
}
