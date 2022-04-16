package priv.li.studentims.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Look {
    public void look(ArrayList<Student> students) {
    /*for (int i = 0; i < students.size(); i++) {
        Student student=students.get(i) ;
        System.out.println(student.getName()+"..."+student.getAge()+"..."+student.getSex()+"..."+student.getStudentNum());
    }*/
    /*for (Student student:students){
        System.out.println(student.getName()+"..."+student.getAge()+"..."+student.getSex()+"..."+student.getStudentNum());
    }*/
        Scanner sc = new Scanner(System.in);
        int option;
        mainInterface();
        do {
            option = sc.nextInt();
            switch (option) {
                case 1: {      //查看全部学生信息
                    for (Student student : students) {
                        System.out.println(student.getName() + "..." + student.getAge() + "..." + student.getSex() + "..." + student.getStudentNum());
                    }
                    mainInterface();
                    break;
                }
                case 2: {      //根据学生姓名查看学生信息
                    System.out.println("请输入学生姓名：");
                    String name = sc.next();
                    int i=0;
                    for (Student student : students) {
                        if (name.equals(student.getName())) {
                            i++;
                            System.out.println(student.getName() + "..." + student.getAge() + "..." + student.getSex() + "..." + student.getStudentNum());
                        }
                    }
                    if (i==0){
                        System.out.println("没有该学生！");
                    }
                    else if (i>1){
                        System.out.println("有"+i+"个同名学生！");
                    }
                    mainInterface();
                    break;
                }
                case 3: {
                    System.out.println("请输入学生学号：");
                    int studentNum = sc.nextInt();
                    int i=0;
                    for (Student student : students) {
                        if (studentNum == student.getStudentNum()) {
                            i++;
                            System.out.println(student.getName() + "..." + student.getAge() + "..." + student.getSex() + "..." + student.getStudentNum());
                        }
                    }
                    if (i==0){
                        System.out.println("没有该学生！");
                    }
                    mainInterface();
                    break;
                }
            }
        } while (option != 4);
    /*switch (option){
        case 1:{
            for (Student student:students){
                System.out.println(student.getName()+"..."+student.getAge()+"..."+student.getSex()+"..."+student.getStudentNum());
            }
            break;
        }
        case 2:{
            System.out.println("请输入学生姓名：");
            String name=sc.next();
            for (Student student:students){
                if(name.equals(student.getName())){
                    System.out.println(student.getName()+"..."+student.getAge()+"..."+student.getSex()+"..."+student.getStudentNum());
                }
            }
            break;
        }
        case 3:{
            System.out.println("请输入学生学号：");
            int studentNum=sc.nextInt();
            for (Student student:students){
                if (studentNum==student.getStudentNum()){
                    System.out.println(student.getName()+"..."+student.getAge()+"..."+student.getSex()+"..."+student.getStudentNum());
                }
            }
            break;
        }
        case
    }*/
    }
    public void mainInterface(){
        System.out.println("1.查询全部学生信息");
        System.out.println("2.按姓名查询学生信息");
        System.out.println("3.按学号查询学生信息");
        System.out.println("4.退出查询");
    }
}
