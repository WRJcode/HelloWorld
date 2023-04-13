package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.*;


class HashMapTest {

    private HashMap<String,String> hm1 = new HashMap<>();
    private HashMap<String,String> hm2 = new HashMap<>(15);


    @BeforeEach
    void setUp() {
        System.out.println("============开始测试=========");
    }

    @AfterEach
    void tearDown() {
        System.out.println("============测试结束=========");
    }

    @Test
    void hash() {
        //default
    }

    @Test
    void comparableClassFor() {
        //default
    }

    @Test
    void compareComparables() {
        //default
    }

    @Test
    void tableSizeFor() {
        //default
    }

    @Test
    void putMapEntries() {
        //default
    }

    @Test
    void size() {
        hm1.put("name","alvin");
        System.out.println(hm1.size());
    }

    @Test
    void isEmpty() {
        System.out.println(hm1.isEmpty());
    }

    @Test
    void get() {
        hm1.put("name","alvin");
        String name = hm1.get("name");
        System.out.println(name);
    }

    @Test
    void getNode() {
        //default

    }

    @Test
    void containsKey() {
        hm1.put("name","alvin");
        System.out.println(hm1.containsKey("name"));
        System.out.println(hm1.containsKey("age"));
    }

    @Test
    void put() {
        hm1.put("name","alvin");
        System.out.println(hm1);
    }

    @Test
    void putVal() {
        //default
    }

    @Test
    void resize() {
        //default
    }

    @Test
    void treeifyBin() {
        //链表变红黑树，default
    }

    @Test
    void putAll() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");
        hm1.putAll(hm2);
        System.out.println(hm2);
        System.out.println(hm1.equals(hm2));

    }

    @Test
    void remove() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");
        System.out.println(hm2);
        hm2.remove("name");
        hm2.remove("age","19");
        System.out.println(hm2);
    }

    @Test
    void removeNode() {
        //default
    }

    @Test
    void clear() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");
        System.out.println(hm2);
        hm2.clear();
        System.out.println(hm2);
    }

    @Test
    void containsValue() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");
        System.out.println(hm2.containsValue("WuYi"));
    }

    @Test
    void keySet() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");

        Set<String> set =  hm2.keySet();
        System.out.println(set);
    }

    @Test
    void values() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");

        Collection<String> collection =  hm2.values();
        System.out.println(collection);
    }

    @Test
    void entrySet() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");

        Set<Map.Entry<String,String>> entries = hm2.entrySet();
        for (Map.Entry<String,String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }



    }

    @Test
    void getOrDefault() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");
        System.out.println(hm2);

        System.out.println(hm2.getOrDefault("name","a handsome boy"));
        System.out.println(hm2.getOrDefault("wife","a beautiful girl"));
    }

    @Test
    void putIfAbsent() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");
        System.out.println(hm2);

        hm2.putIfAbsent("name","a handsome boy");
        System.out.println(hm2);
    }

    @Test
    void testRemove() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");
        System.out.println(hm2);

        System.out.println(hm2.remove("name1"));
        System.out.println(hm2.remove("school"));

        System.out.println(hm2);
    }

    @Test
    void replace() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");
        System.out.println(hm2);

        hm2.replace("name","a handsome boy-alvin");
        System.out.println(hm2);
    }

    @Test
    void testReplace() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");
        System.out.println(hm2);

        hm2.replace("name","alvin","a handsome boy-alvin");
        hm2.replace("school","other","WuYi");
        System.out.println(hm2);
    }

    @Test
    void computeIfAbsent() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");
        System.out.println(hm2);

        hm2.computeIfAbsent("alvin",s -> s + " is a handsome boy");
        System.out.println(hm2);
    }

    @Test
    void computeIfPresent() {
        hm2.put("name","alvin");
        hm2.put("age","18");
        hm2.put("school","WuYi");
        System.out.println(hm2);

        //args:key,biFunction
        hm2.computeIfPresent("name",(k,v)-> v + " is a handsome boy" );
        System.out.println(hm2);
    }

    @Test
    void compute() {
        hm2.put("name","alvin");
        //hm2.put("age",null);
        hm2.put("school","WuYi");
        System.out.println(hm2);

        hm2.compute("age", (k, v) -> (v == null) ? "age:18" : k.concat(":18"));
        System.out.println(hm2);
    }

    @Test
    void merge() {


        hm1.put("name","alvin");
        hm1.put("age","18");
        hm1.put("school","WuYi");
        hm1.put("wife","TaoTao");
        System.out.println(hm1);


        hm1.merge("name","alvin",(k,v)-> v + " is a handsome boy");
        hm1.merge("name1","alvin",(k,v)-> v + " is a handsome boy");
        System.out.println(hm1);

        //console
        //{school=WuYi, wife=TaoTao, name=alvin, age=18}
        //{school=WuYi, wife=TaoTao, name=alvin is a handsome boy, name1=alvin, age=18}

    }

    @Test
    void forEach() {
        hm1.put("name","alvin");
        hm1.put("age","18");
        hm1.put("school","WuYi");
        hm1.put("wife","TaoTao");
        System.out.println(hm1);

        hm1.forEach((k,v) -> {
            System.out.println("key = " + k + ",value = " + v);
        });
    }

    @Test
    void replaceAll() {
    }

    @Test
    void testClone() {
    }

    @Test
    void loadFactor() {
    }

    @Test
    void capacity() {
    }

    @Test
    void newNode() {
    }

    @Test
    void replacementNode() {
    }

    @Test
    void newTreeNode() {
    }

    @Test
    void replacementTreeNode() {
    }

    @Test
    void reinitialize() {
    }

    @Test
    void afterNodeAccess() {
    }

    @Test
    void afterNodeInsertion() {
    }

    @Test
    void afterNodeRemoval() {
    }

    @Test
    void internalWriteEntries() {
    }
}