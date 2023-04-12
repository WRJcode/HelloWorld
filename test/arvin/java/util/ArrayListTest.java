package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;


class ArrayListTest {



    @BeforeEach
    void setUp() {
        System.out.println("开始测试");
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * trimToSize
     */
    @Test
    void trimToSize() {
        ArrayList<Integer> list = new ArrayList<>(8);
        for (int i = 1; i <= 10 ; i++) {
            list.add(i);
        }
        list.add(11);
        list.trimToSize();
        list.size();


    }

    @Test
    void ensureCapacity() {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.ensureCapacity(10); //最终capacity为12 = 8 + 8 * 0.5

    }

    @Test
    void size() {
        ArrayList<Integer> list = new ArrayList<>(8);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        int size = list.size();
        System.out.println(size);
    }

    @Test
    void isEmpty() {
        ArrayList<Integer> list = new ArrayList<>(8);
        System.out.println("list is empty? " + list.isEmpty());
        list.add(10);
        System.out.println("list is empty? " + list.isEmpty());
    }

    @Test
    void contains() {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(10);
        System.out.println(list.contains(10));
    }

    @Test
    void indexOf() {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(10);
        list.add(8);
        list.add(8);
        System.out.println(list);
        System.out.println(list.indexOf(8));
    }

    @Test
    void lastIndexOf() {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(10);
        list.add(8);
        list.add(8);
        System.out.println(list);
        System.out.println(list.indexOf(8));
        System.out.println(list.lastIndexOf(8));
    }

    @Test
    void testClone() {
        ArrayList<Integer> list1 = new ArrayList<>(8);
        list1.add(10);
        list1.add(8);
        list1.add(8);
        ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();
        list2.set(0,100);
        System.out.println(list1);
        System.out.println(list2);
    }

    @Test
    void toArray() {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(10);
        list.add(8);
        list.add(8);
        System.out.println(Arrays.toString(list.toArray()));
    }

    @Test
    void elementData() {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(10);
        list.add(8);
        list.add(8);

        //源码中 transient Object[] elementData;能够被同类包访问
    }

    @Test
    void get() {
        ArrayList<Integer> list = new ArrayList<>();
        Integer integer = 1;
        list.add(integer);
        Integer i = list.get(0);
        System.out.println(i);
    }

    /**
     * 修改值
     */
    @Test
    void set() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.set(0,5);
        System.out.println(list.get(0));
    }

    @Test
    void add() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
    }

    @Test
    void remove() {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(10);
        list.add(8);
        list.add(8);
        list.remove(1);

        //正序遍历中不能使用该方法移除元素
        //倒序遍历可以使用，因为后面元素移除不会影响前面元素的下标
    }


    @Test
    void clear() {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(10);
        list.add(8);
        list.add(8);
        list.clear();
        System.out.println(list);
    }

    @Test
    void addAll() {
        ArrayList<Integer> list = new ArrayList<>(8);
        Set<Integer> set = new TreeSet<>(Arrays.asList(1,3,5,7,4,8,3));
        list.addAll(set);

    }


    @Test
    void removeRange() {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(10);
        list.add(8);
        list.add(8);

    }

    @Test
    void removeAll() {
        ArrayList<Integer> list = new ArrayList<>(8);
        Set<Integer> set = new TreeSet<>(Arrays.asList(1,3,5,7,4,8,3));
        list.addAll(set);
        Set<Integer> set1 = new TreeSet<>(Arrays.asList(1,3,5,3));
        list.removeAll(set1);
        System.out.println(list);
    }

    @Test
    void retainAll() {
        Set<Integer> set1 = new TreeSet<>(Arrays.asList(1,3,5,3,10));
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(10);
        list.add(8);
        list.add(5);
        list.retainAll(set1);
        System.out.println(list);
    }

    @Test
    void listIterator() {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(10);
        list.add(8);
        list.add(5);
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ListIterator<Integer> iterator1 = list.listIterator(0);
        while (iterator1.hasNext()){
            Integer i = iterator1.next();
            System.out.println(i);
            if (i.equals(8))
                iterator1.remove();
        }
        while (iterator1.hasPrevious()){
            Integer i = iterator1.previous();
            System.out.println(i);
            if (i.equals(8))
                iterator1.remove();
        }
    }


    @Test
    void iterator() {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(10);
        list.add(8);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (i.equals(8))
                iterator.remove();
        }

        //list.removeIf(i -> i.equals(8));

        System.out.println(list);
    }

    @Test
    void subList() {
        ArrayList<Integer> list = new ArrayList<>(8);
        Set<Integer> set = new TreeSet<>(Arrays.asList(1,3,5,7,4,8,3));
        list.addAll(set);

        //返回的List具体实现类是在ArrayList中定义的SubList
        List<Integer> subList = list.subList(1,4);

        System.out.println(subList);
    }

    @Test
    void forEach() {
        ArrayList<Integer> list = new ArrayList<>(8);
        Set<Integer> set = new TreeSet<>(Arrays.asList(1,3,5,7,4,8,3));
        list.addAll(set);

        list.forEach(o -> System.out.println("ArrayListTest.forEach-value: " + o));
    }

    @Test
    void spliterator() {
        ArrayList<Integer> list = new ArrayList<>(8);
        Set<Integer> set = new TreeSet<>(Arrays.asList(1,3,5,7,4,8,3));
        list.addAll(set);

        Spliterator<Integer> spliterator = list.spliterator();
        System.out.println(spliterator.characteristics());
        System.out.println("estimateSize(): "+spliterator.estimateSize());
        System.out.println("tryAdvance(action)" + spliterator.tryAdvance(System.out::println));
    }

    @Test
    void removeIf() {
        ArrayList<Integer> list = new ArrayList<>(8);
        Set<Integer> set = new TreeSet<>(Arrays.asList(1,3,5,7,4,8,3));
        list.addAll(set);

        list.removeIf(i -> i.equals(5));
        list.removeIf(i -> i.equals(2)|i.equals(10));

        System.out.println(list);
    }

    @Test
    void replaceAll() {
        ArrayList<Integer> list = new ArrayList<>(8);
        Set<Integer> set = new TreeSet<>(Arrays.asList(1,3,5,7,4,8,3));
        list.addAll(set);

        System.out.println(list);
        list.replaceAll(o -> o + 3);
        System.out.println(list);
    }

    @Test
    void sort() {
        ArrayList<Integer> list = new ArrayList<>(8);
        Set<Integer> set = new TreeSet<>(Arrays.asList(1,3,5,7,4,8,3));
        list.addAll(set);

        list.sort((i1,i2) -> {return i2.compareTo(i1);});
        //list.sort(Comparator.reverseOrder());

        System.out.println(list);
    }
}