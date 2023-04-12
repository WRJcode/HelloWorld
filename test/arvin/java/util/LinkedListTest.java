package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private final LinkedList<Integer> integers = new LinkedList<>();

    @BeforeEach
    void setUp() {
        System.out.println("============开始测试=========");
    }

    @AfterEach
    void tearDown() {
        System.out.println("============测试结束=========");
    }

    @Test
    void get() {
        integers.add(5);
        Integer i = integers.get(0);
        System.out.println(i);
    }

    @Test
    void set() {
        integers.add(5);
        integers.set(0,10);
        System.out.println(integers.get(0));
    }

    @Test
    void add() {
        integers.add(5);
        System.out.println(integers);
    }

    @Test
    void remove() {


        LinkedList<Integer> integers1 = new LinkedList<>(Arrays.asList(1,2,6,23,75,2,43,3));
        for (int i = 0; i < integers1.size()-1; i++) {
            if (i==1||i==5)
                integers1.remove(i);   //for i中使用虽然没有报错，但是程序结果是错误的
        }
        System.out.println(integers1);
    }

    @Test
    void addAll() {
    }

    @Test
    void iterator() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void testSet() {
    }

    @Test
    void testAdd1() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void clear() {
    }

    @Test
    void testAddAll() {
    }

    @Test
    void testIterator() {
    }

    @Test
    void listIterator() {
    }

    @Test
    void testListIterator() {
    }

    @Test
    void subList() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void toArray() {
    }

    @Test
    void testToArray() {
    }

    @Test
    void testAdd2() {
    }

    @Test
    void testRemove1() {
    }

    @Test
    void testAddAll1() {
    }

    @Test
    void removeAll() {
    }

    @Test
    void retainAll() {
    }

    @Test
    void testClear() {
    }

    @Test
    void testToString() {
    }

    @Test
    void removeIf() {
    }

    @Test
    void spliterator() {
    }

    @Test
    void stream() {
    }

    @Test
    void parallelStream() {
    }

    @Test
    void forEach() {
    }

    @Test
    void testSpliterator() {
    }

    @Test
    void replaceAll() {
    }

    @Test
    void sort() {
    }

    @Test
    void testSpliterator1() {
    }

    @Test
    void linkLast() {
    }

    @Test
    void linkBefore() {
    }

    @Test
    void unlink() {
    }

    @Test
    void getFirst() {
    }

    @Test
    void getLast() {
    }

    @Test
    void removeFirst() {
    }

    @Test
    void removeLast() {
    }

    @Test
    void addFirst() {
    }

    @Test
    void addLast() {
    }

    @Test
    void testContains() {
    }

    @Test
    void size() {
    }

    @Test
    void testAdd3() {
    }

    @Test
    void testRemove2() {
    }

    @Test
    void testAddAll2() {
    }

    @Test
    void testAddAll3() {
    }

    @Test
    void testClear1() {
    }

    @Test
    void testGet() {
    }

    @Test
    void testSet1() {
    }

    @Test
    void testAdd4() {
    }

    @Test
    void testRemove3() {
    }

    @Test
    void node() {
    }

    @Test
    void testIndexOf() {
    }

    @Test
    void testLastIndexOf() {
    }

    @Test
    void peek() {
    }

    @Test
    void element() {
    }

    @Test
    void poll() {
    }

    @Test
    void testRemove4() {
    }

    @Test
    void offer() {
    }

    @Test
    void offerFirst() {
    }

    @Test
    void offerLast() {
    }

    @Test
    void peekFirst() {
    }

    @Test
    void peekLast() {
    }

    @Test
    void pollFirst() {
    }

    @Test
    void pollLast() {
    }

    @Test
    void push() {
    }

    @Test
    void pop() {
    }

    @Test
    void removeFirstOccurrence() {
    }

    @Test
    void removeLastOccurrence() {
    }

    @Test
    void testListIterator1() {
    }

    @Test
    void descendingIterator() {
    }

    @Test
    void testClone() {
    }

    @Test
    void testToArray1() {
    }

    @Test
    void testToArray2() {
    }

    @Test
    void testSpliterator2() {
    }
}