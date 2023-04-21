package arvin.java.util;

import arvin.java.custom.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class IntSummaryStatisticsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    IntSummaryStatistics summaryStudent(){
        Random rd=new Random();
        List<Student> students = Arrays.asList(
                new Student(rd.nextInt(9000)+1000,"张三",18,"江苏大学","网络工程"),
                new Student(rd.nextInt(9000)+1000,"李四",19,"清湖大学","软件工程"),
                new Student(rd.nextInt(9000)+1000,"王五",20,"北京大学","社会工程"),
                new Student(rd.nextInt(9000)+1000,"刘六",18,"中山大学","交通工程"),
                new Student(rd.nextInt(9000)+1000,"田七",30,"复旦大学","微电子工程"),
                new Student(rd.nextInt(9000)+1000,"陈八",50,"武汉大学","临场医学"),
                new Student(rd.nextInt(9000)+1000,"黄晓九",17,"深圳大学","软件工程")
        );
        return students.stream()
                .collect(Collectors.summarizingInt(Student::getAge));
    }

    @Test
    void accept() {
    }

    @Test
    void combine() {
    }

    @Test
    void getCount() {
        IntSummaryStatistics intSummaryStatistics =  summaryStudent();
        long count = intSummaryStatistics.getCount();
        System.out.println(count);
    }

    @Test
    void getSum() {
        IntSummaryStatistics intSummaryStatistics =  summaryStudent();
        long sum = intSummaryStatistics.getSum();
        System.out.println(sum);
    }

    @Test
    void getMin() {
        IntSummaryStatistics intSummaryStatistics =  summaryStudent();
        long min = intSummaryStatistics.getMin();
        System.out.println(min);
    }

    @Test
    void getMax() {
        IntSummaryStatistics intSummaryStatistics =  summaryStudent();
        long max = intSummaryStatistics.getMax();
        System.out.println(max);
    }

    @Test
    void getAverage() {
        IntSummaryStatistics intSummaryStatistics =  summaryStudent();
        double ave = intSummaryStatistics.getAverage();
        System.out.println(ave);
    }

    @Test
    void testToString() {
    }
}