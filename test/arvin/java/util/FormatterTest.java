package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Formatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class FormatterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void locale() {
        Formatter formatter = new Formatter();
        Locale locale = formatter.locale();
        System.out.println(locale);
    }

    @Test
    void out() {
        Formatter formatter = new Formatter();

    }

    @Test
    void testToString() {
        // 无参数构造Formatter对象
        Formatter formatter = new Formatter();
       // 格式化操作
        formatter.format("The result number is %d.", 7);
        // 获得格式化后的字符串
        String str = formatter.toString();
        // 控制台输出内容：The result number is 7.
        System.out.println(str);

    }

    @Test
    void flush() {
    }

    @Test
    void close() {
    }

    @Test
    void ioException() {
    }

    @Test
    void format() {
    }

    @Test
    void testFormat() {
    }
}