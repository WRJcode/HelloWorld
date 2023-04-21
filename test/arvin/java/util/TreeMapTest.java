package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

class TreeMapTest {

    private final TreeMap<String,String> TREE_MAP_1 = new TreeMap<>();
    private TreeMap<String,String> TREE_MAP_2 = new TreeMap<>(Comparator.reverseOrder());




    @BeforeEach
    void setUp() {
        System.out.println("============开始测试=========");
    }

    @AfterEach
    void tearDown() {
        System.out.println("============测试结束=========");
    }

    @Test
    void size() {
        TREE_MAP_1.put("a","a string");
        System.out.println(TREE_MAP_1.get("a"));
    }

    @Test
    void containsKey() {
        TREE_MAP_1.put("a","a string");
        System.out.println(TREE_MAP_1.containsKey("a"));
    }

    @Test
    void containsValue() {
        TREE_MAP_1.put("a","a string");
        System.out.println(TREE_MAP_1.containsValue("a string"));
    }

    @Test
    void get() {
        TREE_MAP_1.put("a","a string");
        System.out.println(TREE_MAP_1.get("a"));
    }

    @Test
    void comparator() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");

        TREE_MAP_2.put("a","a string");
        TREE_MAP_2.put("b","b string");

        Comparator<? super String> c1 =  TREE_MAP_1.comparator();
        Comparator<? super String> c2 =  TREE_MAP_2.comparator();

        System.out.println(c1);
        System.out.println(c2);
    }

    @Test
    void firstKey() {
        TREE_MAP_1.put("a","a string");
        System.out.println(TREE_MAP_1.firstKey());
    }

    @Test
    void lastKey() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        System.out.println(TREE_MAP_1.lastKey());
    }

    @Test
    void putAll() {
        Map<String,String> map = new HashMap<>();
        map.put("a","a string");
        map.put("b","b string");
        map.put("ab","ab string");
        TREE_MAP_1.putAll(map);
        System.out.println(TREE_MAP_1);
    }

    @Test
    void getEntry() {

        //default方法

        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");


    }

    @Test
    void getEntryUsingComparator() {
        //default方法

    }

    @Test
    void getCeilingEntry() {
        //default方法
    }

    @Test
    void getFloorEntry() {
        //default方法
    }

    @Test
    void getHigherEntry() {
        //default方法
    }

    @Test
    void getLowerEntry() {
        //default方法
    }

    @Test
    void put() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");
    }

    @Test
    void remove() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        System.out.println(TREE_MAP_1);

        String s = TREE_MAP_1.remove("b");

        System.out.println(TREE_MAP_1);
    }

    @Test
    void clear() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        TREE_MAP_1.clear();

        System.out.println(TREE_MAP_1);
    }

    @Test
    void testClone() {

        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        TreeMap<String,String> clone = (TreeMap<String, String>) TREE_MAP_1.clone();

        System.out.println(clone);

        System.out.println(clone.equals(TREE_MAP_1));
    }

    @Test
    void firstEntry() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        Map.Entry<String,String> entry = TREE_MAP_1.firstEntry();

        System.out.println(entry);
    }

    @Test
    void lastEntry() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        Map.Entry<String,String> entry = TREE_MAP_1.lastEntry();

        System.out.println(entry);
    }

    @Test
    void pollFirstEntry() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        Map.Entry<String,String> entry = TREE_MAP_1.pollFirstEntry();

        System.out.println(entry);

        System.out.println(TREE_MAP_1);
    }

    @Test
    void pollLastEntry() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        Map.Entry<String,String> entry = TREE_MAP_1.pollLastEntry();

        System.out.println(entry);

        System.out.println(TREE_MAP_1);
    }

    @Test
    void lowerEntry() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        Map.Entry<String,String> entry = TREE_MAP_1.lowerEntry("ac");

        System.out.println(entry);

        System.out.println(TREE_MAP_1);
    }

    @Test
    void lowerKey() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        String key = TREE_MAP_1.lowerKey("ac");

        System.out.println(key);

        System.out.println(TREE_MAP_1);
    }

    @Test
    void floorEntry() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        Map.Entry<String,String> entry = TREE_MAP_1.floorEntry("ab");

        System.out.println(entry);

        System.out.println(TREE_MAP_1);
    }

    @Test
    void floorKey() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        String key = TREE_MAP_1.lowerKey("a");

        System.out.println(key);

        System.out.println(TREE_MAP_1);
    }

    @Test
    void ceilingEntry() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        Map.Entry<String,String> entry = TREE_MAP_1.ceilingEntry("b");

        System.out.println(entry);

        System.out.println(TREE_MAP_1);
    }

    @Test
    void ceilingKey() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        String key = TREE_MAP_1.ceilingKey("a");

        System.out.println(key);

        System.out.println(TREE_MAP_1);
    }

    @Test
    void higherEntry() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        Map.Entry<String,String> entry = TREE_MAP_1.higherEntry("ab");

        System.out.println(entry);

        System.out.println(TREE_MAP_1);
    }

    @Test
    void higherKey() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        String key = TREE_MAP_1.higherKey("a");

        System.out.println(key);

        System.out.println(TREE_MAP_1);
    }

    @Test
    void keySet() {

        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        System.out.println(TREE_MAP_1.keySet().getClass());

        for (String key:TREE_MAP_1.keySet()
             ) {
            System.out.println(key);
        }

    }

    @Test
    void navigableKeySet() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        NavigableSet<String> set = TREE_MAP_1.navigableKeySet();

        for (String s:set
             ) {
            System.out.println(s);
        }
    }

    @Test
    void descendingKeySet() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        NavigableSet<String> set = TREE_MAP_1.descendingKeySet();

        for (String s:set
        ) {
            System.out.println(s);
        }
    }

    @Test
    void values() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        System.out.println(TREE_MAP_1.values());

        System.out.println(TREE_MAP_1.values().getClass());

        for (String value:TREE_MAP_1.values()
             ) {
            System.out.println(value);
        }
    }

    @Test
    void entrySet() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        Set<Map.Entry<String,String>> entrySet = TREE_MAP_1.entrySet();
        for (Map.Entry<String,String> entry:entrySet
        ) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key = " + key + ",value = " + value);
        }
    }

    @Test
    void descendingMap() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        System.out.println(TREE_MAP_1.descendingMap().getClass());

        Map<String,String> map = TREE_MAP_1.descendingMap();
        for (Map.Entry<String,String> entry:map.entrySet()
             ) {
            System.out.println(entry.getValue());
        }
    }

    @Test
    void subMap() {

        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        System.out.println(TREE_MAP_1);
        Map<String,String> subMap = TREE_MAP_1.subMap("ab","c");
        System.out.println(subMap);
    }

    @Test
    void headMap() {

        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        System.out.println(TREE_MAP_1);
        Map<String,String> headMap = TREE_MAP_1.headMap("c");
        System.out.println(headMap);
    }

    @Test
    void tailMap() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        System.out.println(TREE_MAP_1);
        Map<String,String> tailMap = TREE_MAP_1.tailMap("b");
        System.out.println(tailMap);
    }


    @Test
    void replace() {

        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        String replacedValue = TREE_MAP_1.replace("a","replace a string");

        System.out.println("value replaced :" + replacedValue);
        System.out.println(TREE_MAP_1);
    }

    @Test
    void forEach() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        System.out.println(TREE_MAP_1);

        TREE_MAP_1.forEach((s, s2) -> System.out.println("key = " + s + ",value = " + s2));
    }

    @Test
    void replaceAll() {
        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        System.out.println(TREE_MAP_1);
        TREE_MAP_1.replaceAll((s, s2) -> "{"+"key:"+s+",value:"+s2+"}");
        System.out.println(TREE_MAP_1);
    }

    @Test
    void keyIterator() {

        //default方法

    }

    @Test
    void descendingKeyIterator() {

        //default方法

    }

    @Test
    void compare() {

        //default方法

    }

    @Test
    void valEquals() {

        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        TREE_MAP_2 = (TreeMap<String, String>) TREE_MAP_1.clone();
        boolean b = TREE_MAP_1.equals(TREE_MAP_2);
        System.out.println(b);
    }

    @Test
    void exportEntry() {


        //default方法

    }

    @Test
    void keyOrNull() {

        //default方法
    }

    @Test
    void key() {

        //default方法


    }

    @Test
    void getFirstEntry() {

        TREE_MAP_1.put("a","a string");
        TREE_MAP_1.put("b","b string");
        TREE_MAP_1.put("ab","ab string");

        //default方法
    }

    @Test
    void getLastEntry() {

        //default方法
    }

    @Test
    void successor() {

        //default方法

    }

    @Test
    void predecessor() {

        //default方法

    }

    @Test
    void readTreeSet() {

        //default方法


    }

    @Test
    void addAllForTreeSet() {

        //default方法

    }

    @Test
    void keySpliteratorFor() {

        //default方法

    }

    @Test
    void keySpliterator() {

        //default方法

    }

    @Test
    void descendingKeySpliterator() {

        //default方法

    }
}