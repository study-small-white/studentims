package priv.li.studentims.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
    public void delete(ArrayList<Student> students){
        Scanner sc=new Scanner(System.in);
        int sign=0;
        System.out.println("请输入您要删除学生的学号！");
        int studentNum=sc.nextInt();
        for(int i=0;i<students.size();i++){
            if (studentNum==students.get(i).getStudentNum()){
                students.remove(i);
                sign++;
            }
        }
        if (sign==0){
            System.out.println("没有找到该学号！");
        }
        else if (sign==1){
            System.out.println("删除成功");
        }
        else {
            System.out.println("有错误，请仔细观察源码");
        }
    }
}
