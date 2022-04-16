package priv.li.studentims.test;

public class Student {
    private String name;
    private int age;
    private String sex;
    private int studentNum;

    public Student() {
    }

    public Student(String name, int age, String sex, int studentNum) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.studentNum = studentNum;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }
}


