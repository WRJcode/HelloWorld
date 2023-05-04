package arvin.java.util.regex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class MatcherTest {

    private static final Matcher MATCHER = Pattern.compile("dog").matcher("The dog says meow " + "All dogs say meow.");

    //QQ邮箱正则表达式
    private static final Pattern QQ_EMAIL_PATTERN = Pattern.compile("\\d{6,}@qq.com");

    //手机号码正则表达式
    private static final Pattern PHONE_PATTERN = Pattern.compile("\\d{11}");

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pattern() {
        Pattern pattern = MATCHER.pattern();
        System.out.println(pattern);
    }

    @Test
    void toMatchResult() {

       Matcher matcher = (Matcher) MATCHER.toMatchResult();
       System.out.println(matcher);

    }

    @Test
    void usePattern() {
        MATCHER.usePattern(Pattern.compile("The.*"));
        System.out.println(MATCHER.matches());
    }

    @Test
    void reset() {
        MATCHER.usePattern(Pattern.compile("The.*"));
        System.out.println(MATCHER.matches());
        System.out.println(MATCHER);
        MATCHER.reset();
        System.out.println(MATCHER);
    }

    @Test
    void start() {
        MATCHER.usePattern(Pattern.compile("The.*"));
        MATCHER.matches();
        int index = MATCHER.start();
        System.out.println(index);
    }


    @Test
    void testStart1() {
    }

    @Test
    void end() {
        MATCHER.usePattern(Pattern.compile("The.*"));
        MATCHER.matches();
        int index = MATCHER.end();
        System.out.println(index);
    }

    @Test
    void testEnd() {
        MATCHER.usePattern(Pattern.compile("The.*"));
        MATCHER.matches();
        int index = MATCHER.end(0);
        System.out.println(index);
    }

    @Test
    void testEnd1() {
    }

    @Test
    void group() {

        MATCHER.usePattern(Pattern.compile("The.*"));
        MATCHER.matches();
        String group =  MATCHER.group();
        System.out.println(group);
    }

    @Test
    void testGroup() {
    }

    @Test
    void testGroup1() {
    }

    @Test
    void groupCount() {
        MATCHER.usePattern(Pattern.compile("The.*"));
        MATCHER.matches();
        int count =  MATCHER.groupCount();
        System.out.println(count);
    }

    @Test
    void matches() {
        MATCHER.usePattern(Pattern.compile("The.*"));
        boolean b = MATCHER.matches();
        System.out.println(b);
    }

    @Test
    void find() {
        MATCHER.usePattern(Pattern.compile("The.*"));
        boolean b = MATCHER.find();
        System.out.println(b);
    }

    @Test
    void testFind() {
        MATCHER.usePattern(Pattern.compile("The.*"));
        boolean b = MATCHER.find(1);
        System.out.println(b);

        int count =  MATCHER.groupCount();
        System.out.println(count);
    }

    @Test
    void lookingAt() {
        MATCHER.usePattern(Pattern.compile("The.*"));
        boolean b = MATCHER.lookingAt();
        System.out.println(b);

        int count =  MATCHER.groupCount();
        System.out.println(count);
    }

    @Test
    void quoteReplacement() {
          String regex = "dog";
          String input = "The dog says meow " + "All dogs say meow.";
          String replace = "cat$";

        Pattern pattern = Pattern.compile(regex);

        // get a matcher object
        Matcher matcher = pattern.matcher(input);

        try{
            //Below line will throw exception
            input = matcher.replaceAll(replace);
        } catch(Exception e){
            System.out.println("Exception: "+ e.getMessage());
        }
        input = matcher.replaceAll(Matcher.quoteReplacement(replace));
        System.out.println(input);

    }

    @Test
    void appendReplacement() {
        StringBuffer stringBuffer = new StringBuffer();
        MATCHER.usePattern(Pattern.compile("dog"));
        while (MATCHER.find()){
            System.out.println("replace");
            MATCHER.appendReplacement(stringBuffer, "cat");
        }
        System.out.println(stringBuffer);
        System.out.println(MATCHER);
    }

    @Test
    void appendTail() {
        StringBuffer stringBuffer = new StringBuffer();
        MATCHER.usePattern(Pattern.compile("dog"));
        while (MATCHER.find()){
            System.out.println("replace");
            MATCHER.appendReplacement(stringBuffer, "cat");
        }
        MATCHER.appendTail(stringBuffer);
        System.out.println(stringBuffer);
        System.out.println(MATCHER);
    }

    @Test
    void replaceAll() {
        MATCHER.usePattern(Pattern.compile("dog"));
        String s = MATCHER.replaceAll("cat");
        System.out.println(s);
    }

    @Test
    void replaceFirst() {
        MATCHER.usePattern(Pattern.compile("dog"));
        String s = MATCHER.replaceFirst("cat");
        System.out.println(s);
    }

    @Test
    void region() {
        MATCHER.usePattern(Pattern.compile("dog"));
        Matcher matcher = MATCHER.region(0,3);
        System.out.println(matcher.find());
    }

    @Test
    void regionStart() {
        MATCHER.usePattern(Pattern.compile("dog"));
        int regionStart = MATCHER.regionStart();
        System.out.println(regionStart);
    }

    @Test
    void regionEnd() {
        MATCHER.usePattern(Pattern.compile("dog"));
        int regionEnd = MATCHER.regionEnd();
        System.out.println(regionEnd);
    }

    @Test
    void hasTransparentBounds() {
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("abcde");
        m.region(1, 4);
        m.useTransparentBounds(true);
        System.out.println(m.find());//false
         p = Pattern.compile("(?<=a)b");
         m = p.matcher("abcde");
        m.region(1, 4);
        m.useTransparentBounds(true);
        System.out.println(m.find());//true
//注意重置匹配器不是重置透明度
         p = Pattern.compile("(?<=a)b");
         m = p.matcher("abcde");
        m.useTransparentBounds(true);
        m.reset();
        System.out.println(m.hasTransparentBounds());//true

    }

    @Test
    void useTransparentBounds() {
        Pattern p = Pattern.compile("(?<=a)b");
        Matcher m = p.matcher("abcde");
        m.region(1, 4);
        m.useTransparentBounds(true);
        System.out.println(m.find());//true
    }

    @Test
    void hasAnchoringBounds() {
        boolean b = MATCHER.hasAnchoringBounds();
        System.out.println(b);
    }

    @Test
    void useAnchoringBounds() {
        MATCHER.useAnchoringBounds(false);
    }

    @Test
    void testToString() {
        Matcher matcher = PHONE_PATTERN.matcher("13172280866");
        System.out.println(matcher.matches());
        String s = matcher.toString();
        System.out.println(s);
    }

    @Test
    void hitEnd() {
        // Get the regex to be checked

        String regex = "(Geeks)";

// Create a pattern from regex

        Pattern pattern

                = Pattern.compile(regex);

// Get the String to be matched

        String stringToBeMatched

                = "GeeksForGeeks Geeks for For Geeks Geek";

// Create a matcher for the input String

        Matcher matcher

                = pattern.matcher(stringToBeMatched);

        while (matcher.find()) {

            System.out.println("Group matched: "

                    + matcher.group());

// Check if the matching has ended

// using hitEnd() method

            System.out.println("Has matching hit end: "

                    + matcher.hitEnd());

        }

// Check if the matching has ended

// using hitEnd() method

        System.out.println("Has matching hit end: "

                + matcher.hitEnd());
    }

    @Test
    void requireEnd() {
    }

    @Test
    void search() {
    }

    @Test
    void match() {
    }

    @Test
    void getTextLength() {
    }

    @Test
    void getSubSequence() {
    }

    @Test
    void charAt() {
    }

    @Test
    void getMatchedGroupIndex() {
    }
}