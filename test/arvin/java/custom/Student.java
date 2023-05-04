package arvin.java.custom;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 167893565467L;

    private long id;

    private String name;

    private int age;

    private String schoolName;

    public Student(long id, String name, int age, String schoolName, String majorName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
        this.majorName = majorName;
    }

    private String majorName;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                ", majorName='" + majorName + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }
}
