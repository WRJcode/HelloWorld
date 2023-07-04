package arvin.java.util.concurrent;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Exchanger;

class ExchangerTest {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Thread(() -> {
            try {
                System.out.println("线程1等待接收数据");
                String data = exchanger.exchange("线程1的数据");
                System.out.println("线程1收到数据：" + data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                System.out.println("线程2等待接收数据");
                String data = exchanger.exchange("线程2的数据");
                System.out.println("线程2收到数据：" + data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void exchange() {
    }

    @Test
    void testExchange() {
    }
}