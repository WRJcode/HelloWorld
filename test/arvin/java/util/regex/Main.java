package arvin.java.util.regex;

import com.sun.tools.javac.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 练习应用regex包
 *
 * 正则规则：
 * 字符匹配：.——任意字符；\\d——数字，\\D——非数字，\\w——字母、数字、下划线，\\W——\\w取反，\\s——空格字符、tab字符（java中\t表示），\\S——\\s取反；
 * 重复匹配：*——任意个字符；+——至少一个字符；?——0或1个字符；n个字符——{1，3}，{n},{n,}
 * 匹配开头与结尾：^——开头；$——结尾；例如^A\d{3}$
 * 匹配指定范围：[...],例如[1-9]、[a-f]、[A-F]、[^0-9]
 * 或规则匹配:|,例如AB|CD
 * 括号表达式：()，例如learn\\s(java|go|vue)
 *
 * 分组匹配：借助regex包
 * 例如：Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
 */
public class Main {

    //QQ邮箱正则表达式
    private static final Pattern QQ_EMAIL_PATTERN = Pattern.compile("\\d{6,}@qq.com");

    //手机号码正则表达式
    private static final Pattern PHONE_PATTERN = Pattern.compile("\\d{11}");

    //出生日期正则表达式
    public static final Pattern BIRTH_DATA_PATTERN = Pattern.compile("^((?:19[2-9]\\d{1})|(?:20(?:(?:0[0-9])|(?:1[0-8]))))\\-((?:0?[1-9])|(?:1[0-2]))\\-((?:0?[1-9])|(?:[1-2][0-9])|30|31)$");



    public static void main(String[] args) {
//        String number = "13172280866";
//        String number2 = "1317228086";
//        System.out.println(isValidMobileNumber(number));
//        System.out.println(isValidMobileNumber(number2));
//
//        String re = "\\d{3,4}-\\d{7,8}";
//        for (String s : List.of("010-12345678", "020-9999999", "0755-7654321")) {
//            if (!s.matches(re)) {
//                System.out.println("测试失败: " + s);
//                return;
//            }
//        }
//        for (String s : List.of("010-12345678", "520-9999999", "0755-7654.321")) {
//            if (!s.matches(re)) {
//                System.out.println("测试失败: " + s);
//                return;
//            }
//        }
//        System.out.println("测试成功!");
          Pattern pattern = Pattern.compile("\\d{6,}@qq.com");
          System.out.println(pattern.matcher("1760148765@qq.com").matches());

          System.out.println(BIRTH_DATA_PATTERN.matcher("2018-04-18").matches());

    }

    //电话号码11
    static boolean isValidMobileNumber(String s) {

        return s.matches("\\d{11}");
    }

    //座机号码，如0769-83489139


    //邮箱，如qq，163


    //出生日期


    //带规则的电话号码

    //带规则的各种字符串
}
