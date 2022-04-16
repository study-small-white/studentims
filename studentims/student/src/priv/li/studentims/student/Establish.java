package priv.li.studentims.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Establish {
    //Sql sql = new Sql();

    public void establish( ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        int i=0;
        //Sql sql = new Sql();

        System.out.println("请输入学生姓名！");
        String name = sc.nextLine();
        student.setName(name);
        System.out.println("请输入学生年龄！");
        int age = sc.nextInt();
        sc.nextLine();
        student.setAge(age);
        System.out.println("请输入学生性别！");
        String sex = sc.nextLine();
        student.setSex(sex);
        System.out.println("请输入学生学号！");
        int studentNum = sc.nextInt();
        student.setStudentNum(studentNum);
        for (Student student1:students){
            if (studentNum==student1.getStudentNum()){
                i++;
                System.out.println("该学号已存在！");
                System.out.println("创建失败！");
                System.out.println();
            }
        }
        if (i==0){
            students.add(student);
        }
    }
}
