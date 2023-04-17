package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Spliterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @BeforeEach
    void setUp() {
        System.out.println("============开始测试=========");
    }

    @AfterEach
    void tearDown() {
        System.out.println("============测试结束=========");
    }

    @Test
    void sort() {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(ints));
        long time1  = System.currentTimeMillis();
        //Arrays.sort(ints);
        Arrays.sort(ints,0,5);
        long time2  = System.currentTimeMillis();
        System.out.println(time2 - time1);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    void parallelSort() {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(ints));
        long time1  = System.currentTimeMillis();
        //Arrays.parallelSort(ints);
        Arrays.parallelSort(ints,0,5);
        long time2  = System.currentTimeMillis();
        System.out.println(time2 - time1);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    void parallelPrefix() {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(ints));
        Arrays.parallelPrefix(ints, Integer::sum);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    void binarySearch() {
        //二分查找
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = i;
        }
        System.out.println(Arrays.binarySearch(ints,5));
    }

    @Test
    void testEquals() {
        int[] ints = new int[10];
        int[] ints1 = new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = i;
            ints1[i] = i;
        }
        long[] l1 = null;
        long[] l2 = null;
        System.out.println(Arrays.equals(ints,ints1));
        System.out.println(Arrays.equals(l1,l2));
    }

    @Test
    void fill() {
        Integer[] integers = new Integer[10];
        Arrays.fill(integers,5);
        System.out.println(Arrays.toString(integers));
    }

    @Test
    void copyOf() {
        int[] oldInts = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            oldInts[i] = random.nextInt(10);
        }

        int[] newInts = Arrays.copyOf(oldInts,6);
        System.out.println(Arrays.toString(oldInts));
        System.out.println(Arrays.toString(newInts));
    }

    @Test
    void asList() {
        Integer[] oldInts = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            oldInts[i] = random.nextInt(10);
        }

        List<Integer> list =   Arrays.asList(oldInts);
        //返回的对象类型是java.util.Arrays$ArrayList
        System.out.println(list.getClass().getName());
        //System.out.println(Arrays.toString(list.getClass().getMethods()));
    }

    @Test
    void testHashCode() {
        Integer[] ints = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(10);
        }

        System.out.println(Arrays.hashCode(ints));
    }

    @Test
    void deepHashCode() {
        Integer[] ints = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(10);
        }

        int deepHash = Arrays.deepHashCode(ints);
        System.out.println(deepHash);
    }

    @Test
    void testToString() {
        Integer[] ints = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(ints));
    }

    @Test
    void deepToString() {
        Integer[] ints = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println(Arrays.deepToString(ints));
    }

    @Test
    void setAll() {
        Integer[] ints = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(10);
        }

        Arrays.setAll(ints,i -> i+2);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    void parallelSetAll() {
        Integer[] ints = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(10);
        }

        Arrays.parallelSetAll(ints,i -> i+2);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    void spliterator() {
        Integer[] ints = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(10);
        }

        Spliterator<Integer> s1 = Arrays.spliterator(ints);
        Spliterator<Integer> s2 = s1.trySplit();

//        System.out.println(Arrays.spliterator(ints).characteristics());
//        System.out.println(Arrays.spliterator(ints).tryAdvance(System.out::println));
//        Arrays.spliterator(ints).forEachRemaining(System.out::println);

        if(s1.hasCharacteristics(Spliterator.ORDERED)){
            System.out.println("ORDERED");
        }
        if(s1.hasCharacteristics(Spliterator.DISTINCT)){
            System.out.println("DISTINCT");
        }
        if(s1.hasCharacteristics(Spliterator.SORTED)){
            System.out.println("SORTED");
        }
        if(s1.hasCharacteristics(Spliterator.SIZED)){
            System.out.println("SIZED");
        }

        if(s1.hasCharacteristics(Spliterator.CONCURRENT)){
            System.out.println("CONCURRENT");
        }
        if(s1.hasCharacteristics(Spliterator.IMMUTABLE)){
            System.out.println("IMMUTABLE");
        }
        if(s1.hasCharacteristics(Spliterator.NONNULL)){
            System.out.println("NONNULL");
        }
        if(s1.hasCharacteristics(Spliterator.SUBSIZED)){
            System.out.println("SUBSIZED");
        }


        s1.forEachRemaining(System.out::println);
        System.out.println("-- traversing the other half of the spliterator --- ");
        s2.forEachRemaining(System.out::println);



    }

    @Test
    void stream() {

        Integer[] ints = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(10);
        }

        Stream<Integer> stream = Arrays.stream(ints);

        System.out.println(stream.max(Integer::compareTo).orElse(null));
    }
}