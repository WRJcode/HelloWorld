package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

class TreeSetTest {

    @BeforeEach
    void setUp() {
        System.out.println("============开始测试=========");
    }

    @AfterEach
    void tearDown() {
        System.out.println("============测试结束=========");
    }

    private TreeSet<Integer> treeSet1 = new TreeSet<>();
    private TreeSet<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());

    @Test
    void iterator() {

        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);

        Iterator<Integer> iterator = treeSet1.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    void descendingIterator() {

        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);

        Iterator<Integer> iterator = treeSet1.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    void descendingSet() {
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);

        NavigableSet<Integer> set = treeSet1.descendingSet();

        System.out.println(set);

    }

    @Test
    void size() {
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);

        int size = treeSet1.size();

        System.out.println(size);
    }

    @Test
    void isEmpty() {
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);

        boolean b1 = treeSet1.isEmpty();
        boolean b2 = treeSet2.isEmpty();

        System.out.println("treeSet1 is empty? " + b1);
        System.out.println("treeSet2 is empty? " + b2);
    }

    @Test
    void contains() {
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);
        treeSet1.add(3);

        boolean b = treeSet1.contains(3);

        System.out.println(b);
    }

    @Test
    void add() {
        treeSet1.add(3);
        System.out.println(treeSet1);
    }

    @Test
    void remove() {
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);

        System.out.println(treeSet1);
        treeSet1.remove(3);
        System.out.println(treeSet1);
    }

    @Test
    void clear() {
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(8);

        treeSet1.clear();
        System.out.println(treeSet1);
    }

    @Test
    void addAll() {

        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));

        System.out.println(treeSet1);
    }

    @Test
    void subSet() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Set<Integer> subSet = treeSet1.subSet(2,10);
        System.out.println(subSet);
    }

    @Test
    void headSet() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Set<Integer> headSet = treeSet1.headSet(5);
        System.out.println(headSet);
        System.out.println(treeSet1);
    }

    @Test
    void tailSet() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Set<Integer> tailSet = treeSet1.headSet(5);
        System.out.println(tailSet);
        System.out.println(treeSet1);
    }

    @Test
    void testSubSet() {
    }

    @Test
    void testHeadSet() {
    }

    @Test
    void testTailSet() {
    }

    @Test
    void comparator() {
    }

    @Test
    void first() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Integer first = treeSet1.first();
        System.out.println(first);
        System.out.println(treeSet1);
    }

    @Test
    void last() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Integer last = treeSet1.last();
        System.out.println(last);
        System.out.println(treeSet1);
    }

    @Test
    void lower() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Integer lower = treeSet1.lower(5);
        System.out.println(lower);
        System.out.println(treeSet1);
    }

    @Test
    void floor() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Integer floor = treeSet1.floor(5);
        System.out.println(floor);
        System.out.println(treeSet1);
    }

    @Test
    void ceiling() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Integer ceiling = treeSet1.ceiling(5);
        System.out.println(ceiling);
        System.out.println(treeSet1);
    }

    @Test
    void higher() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Integer higher = treeSet1.higher(5);
        System.out.println(higher);
        System.out.println(treeSet1);
    }

    @Test
    void pollFirst() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Integer first = treeSet1.pollFirst();
        System.out.println(first);
        System.out.println(treeSet1);
    }

    @Test
    void pollLast() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Integer last = treeSet1.pollLast();
        System.out.println(last);
        System.out.println(treeSet1);
    }

    @Test
    void testClone() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        treeSet2 = (TreeSet<Integer>) treeSet1.clone();
        System.out.println(treeSet2);
    }

    @Test
    void spliterator() {
        treeSet1.addAll(Arrays.asList(1,3,5,4,3,6,1,3,6,5));
        Spliterator<Integer> spliterator = treeSet1.spliterator();
        spliterator.forEachRemaining(integer -> System.out.println(integer));
    }
}