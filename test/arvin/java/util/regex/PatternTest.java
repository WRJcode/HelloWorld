package arvin.java.util.regex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static org.junit.jupiter.api.Assertions.*;

class PatternTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void compile() {
        Pattern pattern = Pattern.compile("a*b");
        System.out.println(pattern);

        Matcher matcher = pattern.matcher("aaaaab");
        boolean b = matcher.matches();
        System.out.println(b);
    }

    @Test
    void testCompile() {
        Pattern pattern = Pattern.compile("a*b",CASE_INSENSITIVE);
        System.out.println(pattern);

        Matcher matcher = pattern.matcher("aaaaaB");
        boolean b = matcher.matches();
        System.out.println(b);
    }

    @Test
    void pattern() {
        Pattern pattern = Pattern.compile("a*b");

        String p = pattern.pattern();

        System.out.println(p);
    }

    @Test
    void testToString() {
        Pattern pattern = Pattern.compile("a*b");

        String s = pattern.toString();
        System.out.println(s);
    }

    @Test
    void matcher() {
        Pattern pattern = Pattern.compile("a*b",CASE_INSENSITIVE);
        System.out.println(pattern);

        Matcher matcher = pattern.matcher("aaaaaB");
        System.out.println(matcher);
        boolean b = matcher.matches();
        System.out.println(b);
    }

    @Test
    void flags() {
        Pattern pattern = Pattern.compile("a*b",CASE_INSENSITIVE);
        int flags = pattern.flags();
        if (flags==CASE_INSENSITIVE){
            System.out.println("匹配模式不区分大小写");
        }
    }

    @Test
    void matches() {
        Pattern pattern = Pattern.compile("a*b",CASE_INSENSITIVE);
        System.out.println(pattern);

        Matcher matcher = pattern.matcher("aaaaaB");
        boolean b = matcher.matches();
        System.out.println(b);
    }

    @Test
    void split() {
        Pattern pattern = Pattern.compile(":",CASE_INSENSITIVE);
        String[] strings = pattern.split("a:bbba:aaab:aaaabbbb",4);
        for (String s:strings) {
            System.out.println(s);
        }
    }

    @Test
    void testSplit() {
        Pattern pattern = Pattern.compile(":",CASE_INSENSITIVE);
        String[] strings = pattern.split("apple:banana:orange:peach");
        for (String s:strings) {
            System.out.println(s);
        }
    }

    @Test
    void quote() {
        String s1 = Pattern.quote("a*b");
        Pattern pattern = Pattern.compile(s1);
        System.out.println(pattern);

        Matcher matcher = pattern.matcher("aaaaaB");
        boolean b1 = matcher.matches();
        System.out.println(b1);

        Matcher matcher2 = pattern.matcher("a*b");
        boolean b2 = matcher2.matches();
        System.out.println(b2);

    }

    @Test
    void namedGroups() {
        //default方法
    }

    @Test
    void asPredicate() {
        Pattern pattern = Pattern.compile("a*b",CASE_INSENSITIVE);
        Predicate<String> p = pattern.asPredicate();
        System.out.println(p.test("aaaB"));
        String[] strings = new String[5];
        strings[0] = "aaaabbbb";
        strings[1] = "aB";
        strings[2] = "a";
        strings[3] = "Abbbbabb";
        strings[4] = "Ac";
        System.out.println("==========根据正则匹配式筛选出合适元素==========");
        Arrays.stream(strings).filter(p).forEach(System.out::println);
        System.out.println("==========根据正则匹配式筛选完成===============");
    }

    @Test
    void splitAsStream() {
        Pattern pattern = Pattern.compile(":",CASE_INSENSITIVE);
        Stream<String> strings = pattern.splitAsStream("apple:banana:orange:peach");
        strings.forEach(System.out::println);
    }
}