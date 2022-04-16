package priv.li.studentims.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Amend {
    public void amend(ArrayList<Student> students){
        Scanner sc=new Scanner(System.in);
        int sign=0;
        System.out.println("请输入您要修改的学生信息！");
        String name=sc.next();
        int age=sc.nextInt();
        String sex=sc.next();
        int studentNum=sc.nextInt();
        Student student=new Student(name,age,sex,studentNum);
        for (int i=0;i<students.size();i++){
            if (student.getStudentNum()==students.get(i).getStudentNum()){
                sign++;
                System.out.println("请选择您要修改的信息！");
                System.out.println("1.修改学生姓名");
                System.out.println("2.修改学生年龄");
                System.out.println("3.修改学生性别");
                System.out.println("4.修改学生学号");
                System.out.println("5.全部修改");
                System.out.println("6.退出");
                int option=sc.nextInt();
                switch (option){
                    case 1:{
                        System.out.println("请输入修改后的姓名");
                        String newName=sc.next();
                        students.get(i).setName(newName);
                        System.out.println("修改后学生信息为："+students.get(i).getName() + "..." + students.get(i).getAge() + "..." + students.get(i).getSex() + "..." + students.get(i).getStudentNum());
                        break;
                    }
                    case 2:{
                        System.out.println("请输入修改后的年龄");
                        int newAge=sc.nextInt();
                        students.get(i).setAge(newAge);
                        System.out.println("修改后学生信息为："+students.get(i).getName() + "..." + students.get(i).getAge() + "..." + students.get(i).getSex() + "..." + students.get(i).getStudentNum());
                        break;
                    }
                    case 3:{
                        System.out.println("请输入修改后的性别");
                        String newSex=sc.next();
                        students.get(i).setSex(newSex);
                        System.out.println("修改后学生信息为："+students.get(i).getName() + "..." + students.get(i).getAge() + "..." + students.get(i).getSex() + "..." + students.get(i).getStudentNum());
                        break;
                    }
                    case 4:{
                        System.out.println("请输入修改后的学号");
                        int newStudentNum=sc.nextInt();
                        students.get(i).setStudentNum(newStudentNum);
                        System.out.println("修改后学生信息为："+students.get(i).getName() + "..." + students.get(i).getAge() + "..." + students.get(i).getSex() + "..." + students.get(i).getStudentNum());
                        break;
                    }
                    case 5:{
                        System.out.println("请输入修改后的学生信息:");
                        System.out.println("输入学生姓名：");
                        String newName=sc.next();
                        System.out.println("输入学生年龄：");
                        int newAge=sc.nextInt();
                        System.out.println("输入学生性别：");
                        String newSex=sc.next();
                        System.out.println("输入学生学号：");
                        int newStudentNum=sc.nextInt();
                        student=new Student(newName,newAge,newSex,newStudentNum);
                        students.set(i,student);
                        System.out.println("修改后学生信息为："+student.getName() + "..." + student.getAge() + "..." + student.getSex() + "..." + student.getStudentNum());
                        break;
                    }
                    case 6:{
                        break;
                    }
                }
            }
        }
        if (sign==0){
            System.out.println("没有该学生信息");
        }
    }
}
