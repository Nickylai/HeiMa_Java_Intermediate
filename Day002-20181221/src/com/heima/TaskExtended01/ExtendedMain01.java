package com.heima.TaskExtended01;

import java.util.ArrayList;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 定义一个学生类Student，
 *  * 包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
 *  * A：遍历集合遍历输出。
 *  * B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
 * @time 2018/12/21 17:41
 * @see
 */
public class ExtendedMain01 {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student("张三", "21", "男"));
        stuList.add(new Student("李四", "19", "男"));
        stuList.add(new Student("王五", "20", "男"));

       interator(stuList);
       changeName(stuList);

    }
    public static <E>void interator(ArrayList<E> es){
        for (E e : es) {
            System.out.println(e);
        }
    }
    public static void changeName(ArrayList<Student> students){
        int index=0;
        int temp=0;
        for (int i = 0; i < students.size(); i++) {
            int a=Integer.parseInt(students.get(i).getAge());
            if (a>=temp){
                index=i;
                temp=a;
            }
        }
        students.get(index).setName("小猪佩奇");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
