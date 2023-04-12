package arvin.java.custom;

public class Boy {
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public Boy(String name,int age){
        this.name = name;
        this.age = age;
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

    public Boy(){
        System.out.println("公共构造函数");
    }
}
