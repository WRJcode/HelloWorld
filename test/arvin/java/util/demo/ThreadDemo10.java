package arvin.java.util.demo;

import java.util.Timer;
import java.util.TimerTask;

/*
TimerTask
 */
public class ThreadDemo10 {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("This is a thread. And implements runnable."  + System.currentTimeMillis());
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 1000, 2000);
    }
}
