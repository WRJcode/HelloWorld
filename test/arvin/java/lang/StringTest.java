package arvin.java.lang;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.nio.cs.UTF_32;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.UTF_16;
import static org.junit.jupiter.api.Assertions.*;

class StringTest {

    private static final String AUTHOR = "alvin";

    private String s1 = "hello , world !";

    @BeforeEach
    void setUp() {
        System.out.println("============开始测试=========");

    }

    @AfterEach
    void tearDown() {
        System.out.println("============测试结束=========");
    }

    @Test
    void length() {
        int length = AUTHOR.length();
        System.out.println(length);
        String test = new String("hello");
        System.out.println(test);
    }

    @Test
    void isEmpty() {
    }

    @Test
    void charAt() {
        char c = AUTHOR.charAt(1);
        System.out.println(c);
    }

    @Test
    void codePointAt() {
        int code = AUTHOR.codePointAt(0);
        System.out.println(code);
    }

    @Test
    void codePointBefore() {
        int code = AUTHOR.codePointBefore(1);
        System.out.println(code);
    }

    @Test
    void codePointCount() {
        int code = AUTHOR.codePointCount(0,2);
        System.out.println(code);
    }

    @Test
    void offsetByCodePoints() {
       int code =  AUTHOR.offsetByCodePoints(0,1);
        System.out.println(code);
    }

    @Test
    void getChars() {
        char[] chars = new char[10];
        Arrays.fill(chars,'0');
        AUTHOR.getChars(0,5,chars,4);
        System.out.println(Arrays.toString(chars));
    }

    @Test
    void getBytes() {
        byte[] bytes = new byte[10];
        Arrays.fill(bytes,(byte) 0);
        AUTHOR.getBytes(0,5,bytes,4);
        System.out.println(Arrays.toString(bytes));
    }

    @Test
    void testGetBytes() {
        byte[] bytes = new byte[10];
        //Arrays.fill(bytes,(byte) 0);
        bytes = AUTHOR.getBytes();
        System.out.println(Arrays.toString(bytes));
    }

    @Test
    void testGetBytes1() {
        byte[] bytes = AUTHOR.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
    }

    @Test
    void testGetBytes2() {
        byte[] bytes = AUTHOR.getBytes(UTF_16);
        System.out.println(Arrays.toString(bytes));
    }

    @Test
    void testEquals() {
    }

    @Test
    void contentEquals() {
    }

    @Test
    void testContentEquals() {
    }

    @Test
    void equalsIgnoreCase() {
    }

    @Test
    void compareTo() {
    }

    @Test
    void compareToIgnoreCase() {
    }

    @Test
    void regionMatches() {
    }

    @Test
    void testRegionMatches() {
    }

    @Test
    void startsWith() {
    }

    @Test
    void testStartsWith() {
    }

    @Test
    void endsWith() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void testIndexOf() {
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void testLastIndexOf() {
    }

    @Test
    void testIndexOf1() {
    }

    @Test
    void testIndexOf2() {
    }

    @Test
    void testIndexOf3() {
    }

    @Test
    void testIndexOf4() {
    }

    @Test
    void testLastIndexOf1() {
    }

    @Test
    void testLastIndexOf2() {
    }

    @Test
    void testLastIndexOf3() {
    }

    @Test
    void testLastIndexOf4() {
    }

    @Test
    void substring() {
    }

    @Test
    void testSubstring() {
    }

    @Test
    void subSequence() {
    }

    @Test
    void concat() {
    }

    @Test
    void replace() {
    }

    @Test
    void matches() {
        String s = "13172280866";
        boolean b = s.matches("\\d{11}");
        System.out.println(b);
    }

    @Test
    void contains() {
    }

    @Test
    void replaceFirst() {
    }

    @Test
    void replaceAll() {
    }

    @Test
    void testReplace() {
    }

    @Test
    void split() {
    }

    @Test
    void testSplit() {
    }

    @Test
    void join() {
    }

    @Test
    void testJoin() {
    }

    @Test
    void toLowerCase() {
    }

    @Test
    void testToLowerCase() {
    }

    @Test
    void toUpperCase() {
    }

    @Test
    void testToUpperCase() {
    }

    @Test
    void trim() {
    }

    @Test
    void testToString() {
    }

    @Test
    void toCharArray() {
    }

    @Test
    void format() {
    }

    @Test
    void testFormat() {
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
    void copyValueOf() {
    }

    @Test
    void testCopyValueOf() {
    }

    @Test
    void testValueOf2() {
    }

    @Test
    void testValueOf3() {
    }

    @Test
    void testValueOf4() {
    }

    @Test
    void testValueOf5() {
    }

    @Test
    void testValueOf6() {
    }

    @Test
    void testValueOf7() {
    }

    @Test
    void intern() {
    }
}