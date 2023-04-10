package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class ArrayListTest {

    ArrayList<Integer> list = new ArrayList<>();

    @BeforeEach
    void setUp() {
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void trimToSize() {
    }

    @Test
    void ensureCapacity() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void testClone() {
    }

    @Test
    void toArray() {
    }

    @Test
    void testToArray() {
    }

    @Test
    void elementData() {
    }

    @Test
    void get() {
        list.add(1);
        Integer i = list.get(0);
        System.out.println(i);
    }

    /**
     * 修改值
     */
    @Test
    void set() {
        list.add(3);
        list.set(0,5);
        System.out.println(list.get(0));
    }

    @Test
    void add() {
        list.add(1);
    }

    @Test
    void remove() {
    }


    @Test
    void clear() {
    }

    @Test
    void addAll() {
    }


    @Test
    void removeRange() {
    }

    @Test
    void removeAll() {
    }

    @Test
    void retainAll() {
    }

    @Test
    void listIterator() {
    }


    @Test
    void iterator() {
    }

    @Test
    void subList() {
    }

    @Test
    void subListRangeCheck() {
    }

    @Test
    void forEach() {
    }

    @Test
    void spliterator() {
    }

    @Test
    void removeIf() {
    }

    @Test
    void replaceAll() {
    }

    @Test
    void sort() {
    }
}