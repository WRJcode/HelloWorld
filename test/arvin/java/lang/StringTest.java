package arvin.java.lang;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    }

    @Test
    void isEmpty() {
    }

    @Test
    void charAt() {
        System.out.println(AUTHOR.charAt(1));
    }

    @Test
    void codePointAt() {
        System.out.println(AUTHOR.codePointAt(0));
    }

    @Test
    void codePointBefore() {
        System.out.println(AUTHOR.codePointBefore(1));
    }

    @Test
    void codePointCount() {
        System.out.println(AUTHOR.codePointCount(0,2));
    }

    @Test
    void offsetByCodePoints() {
    }

    @Test
    void getChars() {
    }

    @Test
    void testGetChars() {
    }

    @Test
    void getBytes() {
    }

    @Test
    void testGetBytes() {
    }

    @Test
    void testGetBytes1() {
    }

    @Test
    void testGetBytes2() {
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