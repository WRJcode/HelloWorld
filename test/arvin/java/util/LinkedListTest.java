package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private final LinkedList<Integer> integers = new LinkedList<>();
    private final LinkedList<Integer> integers2 = new LinkedList<>(Arrays.asList(1,2,6,23,75,2,43,3));

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
        integers.add(4);
        integers.add(8);
        integers.add(10);
        //在index位置开始输入
        integers.addAll(2,Arrays.asList(1,2,6,23,75,2,43,3));
        System.out.println(integers);
    }


    @Test
    void indexOf() {
        System.out.println(integers2);
        int index = integers2.indexOf(2);
        System.out.println(index);
    }

    @Test
    void lastIndexOf() {
        System.out.println(integers2);
        int index = integers2.lastIndexOf(2);
        System.out.println(index);
    }

    @Test
    void clear() {
        System.out.println(integers2);
        integers2.clear();
        System.out.println(integers2.size());
    }

    @Test
    void iterator() {
        Iterator<Integer> iterator = integers2.iterator();
        System.out.println(integers2);
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }

    @Test
    void listIterator() {
        ListIterator<Integer> iterator = integers2.listIterator();
        System.out.println(integers2);
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }
        System.out.println("");
    }



    @Test
    void subList() {
        List<Integer> subList = integers2.subList(3, integers2.size()-1);
        System.out.println(subList);
    }

    @Test
    void testEquals() {
        integers.addAll(Arrays.asList(1,2,6,23,75,2,43,3));
        System.out.println(integers.equals(integers2));
    }

    @Test
    void testHashCode() {
        System.out.println("integers2 hash: " + integers2.hashCode());
        System.out.println("integers hash: " + integers.hashCode());
        integers.addAll(Arrays.asList(1,2,6,23,75,2,43,3));
        System.out.println("integers hash: " + integers.hashCode());
    }

    @Test
    void isEmpty() {
        System.out.println("integers is empty? " + integers.isEmpty());
        System.out.println("integers2 is empty? " + integers2.isEmpty());
    }

    @Test
    void contains() {
        System.out.println(integers2);
        boolean b = integers2.contains(5);
        System.out.println("integers2 contains 5 ? " + b);
    }

    @Test
    void toArray() {
        Integer[] arr = new Integer[integers2.size()];
        arr = integers2.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    void testToArray() {
        System.out.println(Arrays.toString(integers2.toArray()));
    }

    @Test
    void testAdd2() {
        integers2.add(5,9);
        System.out.println(integers2);
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
    void testToString() {
        String s = integers2.toString();
        System.out.println(integers2);
    }

    @Test
    void removeIf() {
        //接收一个断言函数式参数，此处过滤掉偶数
        integers2.removeIf(integer -> (integer%2)==0);
        System.out.println(integers2);
    }

    @Test
    void spliterator() {
        System.out.println(integers2);
        Spliterator<Integer> spliterator =  integers2.spliterator();
        System.out.println(spliterator.characteristics());
    }

    @Test
    void stream() {
        Stream<Integer> stream = integers2.stream();
        System.out.println(stream.max(Integer::compareTo).orElse(null));
    }

    @Test
    void parallelStream() {
        Stream<Integer> parallelStream = integers2.parallelStream();
        System.out.println(parallelStream.min(Integer::compareTo).orElse(null));
    }

    @Test
    void forEach() {
        integers2.forEach(System.out::println);
    }


    @Test
    void replaceAll() {
        System.out.println(integers2);
        integers2.replaceAll(t -> t+5);
        System.out.println(integers2);
    }

    @Test
    void sort() {
        //Integer实现了Comparable接口，
        //下面两个函数效果一样
        integers2.sort(Comparator.reverseOrder());
        integers2.sort((o1, o2) -> o2.compareTo(o1));

        integers2.sort(Comparator.naturalOrder());
        integers2.sort(Integer::compareTo);
        integers2.sort((o1, o2) -> o1.compareTo(o2));
    }

    @Test
    void linkBefore() {
        //default修饰符，不同包不能调用
    }

    @Test
    void unlink() {
        //同上
    }

    @Test
    void getFirst() {
        //
        System.out.println(integers2);
        System.out.println(integers2.getFirst());
    }

    @Test
    void getLast() {
        System.out.println(integers2);
        System.out.println(integers2.getLast());
    }

    @Test
    void removeFirst() {
        System.out.println(integers2);
        System.out.println(integers2.removeFirst());
        System.out.println(integers2);
    }

    @Test
    void removeLast() {
        System.out.println(integers2);
        System.out.println(integers2.removeLast());
        System.out.println(integers2);
    }

    @Test
    void addFirst() {
        System.out.println(integers2);
        integers2.addFirst(3);
        System.out.println(integers2);
    }

    @Test
    void addLast() {
        System.out.println(integers2);
        integers2.addLast(100);
        System.out.println(integers2);
    }

    @Test
    void testContains() {
        System.out.println(integers2);
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(1,2,6,23,75));
        System.out.println(integers2.containsAll(set));
    }

    @Test
    void size() {
        System.out.println(integers2);
        System.out.println(integers2.size());
    }



    @Test
    void node() {

    }

    @Test
    void peek() {
        //找出第一位但不删除，如果为空则返回null
        System.out.println(integers2);
        Integer i = integers2.peek();
        System.out.println(i);
        System.out.println(integers2);
        //null
        System.out.println(integers.peek());
    }

    @Test
    void element() {
        //找出第一位但不删除，如果为空则抛出NoSuchElementException
        System.out.println(integers2.element());
        //抛出NoSuchElementException
        //System.out.println(integers.element());
        System.out.println(integers2);
    }

    @Test
    void poll() {
        System.out.println(integers2);
        System.out.println(integers2.poll());
        System.out.println(integers2);
    }

    @Test
    void offer() {
        //演示入栈
        System.out.println(integers2);
        System.out.println(integers2.offer(100));
        System.out.println(integers2);
    }

    @Test
    void offerFirst() {
        System.out.println(integers2);
        System.out.println(integers2.offerFirst(100));
        System.out.println(integers2);
    }

    @Test
    void offerLast() {
        System.out.println(integers2);
        System.out.println(integers2.offerLast(100));
        System.out.println(integers2);
    }

    @Test
    void peekFirst() {
        System.out.println(integers2);
        System.out.println(integers2.peekFirst());
        System.out.println(integers2);
    }

    @Test
    void peekLast() {
        System.out.println(integers2);
        System.out.println(integers2.peekLast());
        System.out.println(integers2);
    }

    @Test
    void pollFirst() {
        System.out.println(integers2);
        System.out.println(integers2.pollFirst());
        System.out.println(integers2);
    }

    @Test
    void pollLast() {
        System.out.println(integers2);
        System.out.println(integers2.pollLast());
        System.out.println(integers2);
    }

    @Test
    void push() {
        //演示压栈
        System.out.println(integers2);
        integers2.push(100);
        System.out.println(integers2);
    }

    @Test
    void pop() {
        //演示出栈
        System.out.println(integers2);
        System.out.println(integers2.pop());
        System.out.println(integers2);
    }

    @Test
    void removeFirstOccurrence() {
        System.out.println(integers2);
        System.out.println(integers2.removeFirstOccurrence(2));
        System.out.println(integers2);
    }

    @Test
    void removeLastOccurrence() {
        System.out.println(integers2);
        System.out.println(integers2.removeLastOccurrence(2));
        System.out.println(integers2);
    }



    @Test
    void descendingIterator() {
        System.out.println(integers2);
        Iterator<Integer> iterator = integers2.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    void testClone() {
        System.out.println(integers2);
        LinkedList<Integer> clone = (LinkedList<Integer>) integers2.clone();
        System.out.println(clone);
        System.out.println(clone.equals(integers2));
    }

}