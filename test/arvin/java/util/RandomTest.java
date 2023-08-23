package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

class RandomTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setSeed() {
        Random random = new Random(2);
        int i = random.nextInt();
        System.out.println("i = " + i);

        int j = 3;
        Random r2 = new Random(j);//�Զ���������
        Random r3 = new Random(j);//������Ϊ����֤�Ϸ���ע�����Random����α�������ͬ��������ͬ�����������������ͬ
        int num1  = r2.nextInt();
        int num2 = r3.nextInt();
        int num11  = r2.nextInt();
        int num21 = r3.nextInt();
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        System.out.println("num11 = "+num11);
        System.out.println("num21 = "+num21);
    }

    @Test
    void nextBytes() {
        AtomicLong atomicLong = new AtomicLong();
        System.out.println(atomicLong);
    }

    @Test
    void nextInt() {
        Random random = new Random();
        System.out.println(random.nextInt());
    }

    @Test
    void testNextInt() {
    }

    @Test
    void nextLong() {
    }

    @Test
    void nextBoolean() {
    }

    @Test
    void nextFloat() {
    }

    @Test
    void nextDouble() {
    }

    @Test
    void nextGaussian() {
    }

    @Test
    void ints() {
        //����ints()����IntStream��������10�������
        Random random = new Random();
        IntStream intStream = random.ints();
        intStream.limit(10).forEach(System.out::println);
    }

    @Test
    void testInts() {
        //����ints()����IntStream��������10�������
        Random random = new Random();
        IntStream intStream = random.ints(10);
        intStream.forEach(System.out::println);
    }

    @Test
    void testInts1() {
        //����10��[0,10)������
        Random random = new Random();
        IntStream intStream = random.ints(0,10);
        intStream.limit(10).forEach(System.out::println);
    }

    @Test
    void testInts2() {
        //����10��[0,10)������
        Random random = new Random();
        IntStream intStream = random.ints(10,0,10);
        intStream.forEach(System.out::println);
    }

    @Test
    void longs() {
    }

    @Test
    void testLongs() {
    }

    @Test
    void testLongs1() {
    }

    @Test
    void testLongs2() {
    }

    @Test
    void doubles() {
    }

    @Test
    void testDoubles() {
    }

    @Test
    void testDoubles1() {
    }

    @Test
    void testDoubles2() {
    }
}