package com.heima.TaskExtended01;

import java.util.Objects;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 定义一个学生类Student，
 * 包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
 * A：遍历集合遍历输出。
 * B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
 * @time 2018/12/21 17:38
 * @see
 */
public class Student {
    private String name;
    private String age;
    private String sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(sex, student.sex);
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public Student(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
