package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDequeTest {

    private static final ArrayDeque<Integer> ARRAY_DEQUE = new ArrayDeque<>();
    private static final ArrayDeque<Integer> ARRAY_DEQUE_10 = new ArrayDeque<>(10);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addFirst() {
        ARRAY_DEQUE.addFirst(3);
        System.out.println(ARRAY_DEQUE);
    }

    @Test
    void addLast() {
    }

    @Test
    void offerFirst() {
    }

    @Test
    void offerLast() {
    }

    @Test
    void removeFirst() {
    }

    @Test
    void removeLast() {
    }

    @Test
    void pollFirst() {
    }

    @Test
    void pollLast() {
    }

    @Test
    void getFirst() {
    }

    @Test
    void getLast() {
    }

    @Test
    void peekFirst() {
    }

    @Test
    void peekLast() {
    }

    @Test
    void removeFirstOccurrence() {
    }

    @Test
    void removeLastOccurrence() {
    }

    @Test
    void add() {
    }

    @Test
    void offer() {
    }

    @Test
    void remove() {
    }

    @Test
    void poll() {
    }

    @Test
    void element() {
    }

    @Test
    void peek() {
    }

    @Test
    void push() {
    }

    @Test
    void pop() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void iterator() {
    }

    @Test
    void descendingIterator() {
    }

    @Test
    void contains() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void clear() {
    }

    @Test
    void toArray() {
    }

    @Test
    void testToArray() {
    }

    @Test
    void testClone() {
    }

    @Test
    void spliterator() {
    }
}