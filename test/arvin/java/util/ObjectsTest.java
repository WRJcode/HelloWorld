package arvin.java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ObjectsTest {

    static class Student{
        private String name;
        private int age;
        private String teacher;

        public Student(){

        }

        public Student(String name, int age, String teacher) {
            this.name = name;
            this.age = age;
            this.teacher = teacher;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", teacher='" + teacher + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return age == student.age && name.equals(student.name) && teacher.equals(student.teacher);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, teacher);
        }

        public String getTeacher() {
            return teacher;
        }

        public void setTeacher(String teacher) {
            this.teacher = teacher;
        }
    }

    @BeforeEach
    void setUp() {
        System.out.println("============开始测试=========");
    }

    @AfterEach
    void tearDown() {
        System.out.println("============测试结束=========");
    }

    @Test
    void testEquals() {
        //Integer i = 10;
        Integer i2 = 10;
        System.out.println(Objects.equals(10,i2));

        Student s1 = new Student("alvin",18,"longzeluola");
        Student s2 = new Student("alvin",18,"longzeluola");
        System.out.println(Objects.equals(s1,s2));
    }

    @Test
    void deepEquals() {

        Student s1 = new Student("alvin",18,"longzeluola");
        Student s2 = new Student("alvin",18,"longzeluola");
        //调用第一个参数的equals方法比较
        System.out.println(Objects.deepEquals(s1,s2));

        int[] ints1 = new int[5];
        int[] ints2 = new int[5];

        for (int i = 0; i < 5; i++) {
            ints1[i] = i + 1;
            ints2[i] = i + 1;
        }
        //两个参数都是数组，调用Arrays.deepEquals算法用于确定相等性
        System.out.println(Objects.deepEquals(ints1,ints2));
    }

    @Test
    void testHashCode() {
        String s = "hello , wolrd!";
        int hash = Objects.hashCode(s);
        System.out.println(hash);
    }

    @Test
    void hash() {
        String s = "hello , wolrd!";
        int hash = Objects.hash(s);
        System.out.println(hash);
    }

    @Test
    void testToString() {

    }

    @Test
    void testToString1() {
        Student s1 = new Student("alvin",18,"longzeluola");
        System.out.println(s1.toString());
        System.out.println(Objects.toString(s1));
    }

    @Test
    void compare() {
    }

    @Test
    void requireNonNull() {
        Student s1 = new Student("alvin",18,"longzeluola");
        Student s2 = null;
        try {
            System.out.println(Objects.requireNonNull(s1));
            System.out.println(Objects.requireNonNull(s2));
        } catch (NullPointerException e){
            e.printStackTrace();
        }

    }

    @Test
    void testRequireNonNull() {
        Student s1 = new Student("alvin",18,"longzeluola");
        Student s2 = null;
        try {
            System.out.println(Objects.requireNonNull(s1,"student must be not null"));
            System.out.println(Objects.requireNonNull(s2,"student must be not null"));
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Test
    void testRequireNonNull1() {
        Student s1 = new Student("alvin",18,"longzeluola");
        Student s2 = null;
        try {
            System.out.println(Objects.requireNonNull(s1,() -> "student must be not null"));
            System.out.println(Objects.requireNonNull(s2,() -> "student must be not null"));
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Test
    void isNull() {
        Student s1 = new Student("alvin",18,"longzeluola");
        Student s2 = null;
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));
    }

    @Test
    void nonNull() {
        Student s1 = new Student("alvin",18,"longzeluola");
        Student s2 = null;
        System.out.println(Objects.nonNull(s1));
        System.out.println(Objects.nonNull(s2));
    }


}