package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.BitSet;

import static org.junit.jupiter.api.Assertions.*;

class BitSetTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void valueOf() {
    }

    @Test
    void testValueOf() {
    }

    @Test
    void testValueOf1() {
    }

    @Test
    void testValueOf2() {
    }

    @Test
    void toByteArray() {
    }

    @Test
    void toLongArray() {
    }

    @Test
    void flip() {
        BitSet bitSet = new BitSet(1000);
        //bitSet.set(1000);
        bitSet.flip(933);
        System.out.println(bitSet.get(933));
    }

    @Test
    void testFlip() {
    }

    @Test
    void set() {
    }

    @Test
    void testSet() {
    }

    @Test
    void testSet1() {
    }

    @Test
    void testSet2() {
    }

    @Test
    void clear() {
    }

    @Test
    void testClear() {
    }

    @Test
    void testClear1() {
    }

    @Test
    void get() {
    }

    @Test
    void testGet() {
    }

    @Test
    void nextSetBit() {
        BitSet bitSet = new BitSet(1000);
        bitSet.set(228);
        bitSet.flip(933);
        int nextIndex = bitSet.nextSetBit(0);
        System.out.println(nextIndex);

        //循环bitSet
        for (int i = bitSet.nextSetBit(0); i >= 0; i = bitSet.nextSetBit(i+1)) {
            if (i == Integer.MAX_VALUE)
                break;
            System.out.println(i);
        }
    }

    @Test
    void nextClearBit() {
        BitSet bitSet = new BitSet(1000);
        bitSet.set(228);
        bitSet.flip(933);

        int index = bitSet.nextClearBit(0);

        System.out.println(index);
    }

    @Test
    void previousSetBit() {
        BitSet bitSet = new BitSet(1000);
        bitSet.set(228);
        bitSet.flip(933);

        int previous = bitSet.previousSetBit(1000);
        System.out.println(previous);

        for (int i = bitSet.length(); (i = bitSet.previousSetBit(i-1)) >= 0 ; ) {
            System.out.println(i);
        }
    }

    @Test
    void previousClearBit() {
        BitSet bitSet = new BitSet(1000);
        bitSet.set(228);
        bitSet.flip(933);

        int index = bitSet.previousClearBit(1000);
        System.out.println(index);
    }

    @Test
    void length() {
        BitSet bitSet = new BitSet(1000);
        bitSet.set(228);
        //bitSet.flip(933);
        //统计已经使用的位长度
        int length = bitSet.length();
        System.out.println(length);
    }

    @Test
    void isEmpty() {
        BitSet bitSet = new BitSet(1000);
        //bitSet.set(228);
        //bitSet.flip(933);

        //判断是否为空，length等于0，那么就为空
        boolean b = bitSet.isEmpty();

        System.out.println(b);
    }

    @Test
    void intersects() {
        BitSet bitSet = new BitSet(1000);
        bitSet.set(1);

        BitSet bitSet1 = new BitSet();
        bitSet1.set(0,5);

        boolean b = bitSet.intersects(bitSet1);

        System.out.println(b);

    }

    @Test
    void cardinality() {
        BitSet bitSet = new BitSet(1000);
        bitSet.set(228);
        bitSet.flip(933);

        int trueNum = bitSet.cardinality();
        System.out.println(trueNum);
    }

    @Test
    void and() {
    }

    @Test
    void or() {
        BitSet bitSet = new BitSet(100);


    }

    @Test
    void xor() {
    }

    @Test
    void andNot() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void size() {
        BitSet bitSet = new BitSet(1000);

        int size = bitSet.size();

        System.out.println(size);
    }

    @Test
    void testEquals() {
    }

    @Test
    void testClone() {
    }

    @Test
    void testToString() {
    }

    @Test
    void stream() {
    }
}