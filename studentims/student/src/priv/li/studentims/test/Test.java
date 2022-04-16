package priv.li.studentims.test;


import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("**********************************");
        System.out.println("1.创建学生信息！");
        System.out.println("2.查看学生信息！");
        System.out.println("3.修改学生信息！");
        System.out.println("4.删除学生信息！");
        System.out.println("4.退出管理系统！");
        System.out.println("***********************************");
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
        int i=0;
        do {
            int option=sc.nextInt();
            switch (option){
                case 1:{
                    System.out.println("opt1");
                    establish(students);
                    break;
                }
                case 2:{
                    System.out.println("opt2");
                    look(students);
                    break;
                }
                case 3:{
                    System.out.println("opt3");
                    break;
                }
                case 4:{
                    System.out.println("结束！");
                    i=1;
                    break;
                }
            }
        }while (i==0);
    }
    public static void establish(ArrayList<Student> students){
        //ArrayList<Student>  students=new ArrayList<>();
        Scanner scr =new Scanner(System.in);
        Student student=new Student();
        System.out.println("请输入学生姓名！");
        String name = scr.nextLine();
        student.setName(name);
        System.out.println("请输入学生年龄！");
        int age = scr.nextInt();
        scr.nextLine();
        student.setAge(age);
        System.out.println("请输入学生性别！");
        String sex = scr.nextLine();
        student.setSex(sex);
        System.out.println("请输入学生学号！");
        int studentNum = scr.nextInt();
        student.setStudentNum(studentNum);
        students.add(student);

    }
    public static void look(ArrayList<Student> students){
        for (int i = 0; i < students.size(); i++) {
            Student student=students.get(i);
            System.out.println(student.getName()+"..."+student.getAge()+"..."+student.getSex()+"..."+student.getStudentNum());
        }
    }
}
