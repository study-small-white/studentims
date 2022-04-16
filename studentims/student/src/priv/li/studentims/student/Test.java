package priv.li.studentims.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        //实验数据
        Student student1=new Student("李天",18,"男",100);
        Student student2=new Student("李地",18,"男",101);
        Student student3=new Student("李玄",18,"男",102);
        Student student4=new Student("李黄",18,"男",103);
        Student student5=new Student("李小花",18,"女",104);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        //Sql sql=new Sql();
        Scanner sc=new Scanner(System.in);
        mainInterface();
        int i=0;
        do {
            int option=sc.nextInt();
            switch (option){
                case 1:{  //创建学生信息
                    Establish establish=new Establish();
                    establish.establish(students);
                    mainInterface();
                    break;
                }
                case 2:{              //查看学生信息
                    Look look=new Look();
                    look.look(students);
                    mainInterface();
                    break;
                }
                case 3:{           //修改学生信息
                    Amend amend =new Amend();
                    amend.amend(students);
                    mainInterface();
                    break;
                }
                case 4:{     //删除学生信息
                    Delete delete=new Delete();
                    delete.delete(students);
                    mainInterface();
                    break;
                }
                case 5:{
                    System.out.println("结束！");
                    i=1;
                    break;
                }
            }
        }while (i==0);
    }
    public static void mainInterface(){
        System.out.println("**********************************");
        System.out.println("1.创建学生信息！");
        System.out.println("2.查看学生信息！");
        System.out.println("3.修改学生信息！");
        System.out.println("4.删除学生信息！");
        System.out.println("5.退出管理系统！");
        System.out.println("***********************************");
    }
}