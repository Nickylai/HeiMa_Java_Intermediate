package com.heima.ReviewTest.Test01;

import java.util.Objects;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 一、定义人类，包含姓名和年龄属性。
 * 创建4个人存储到HashSet中，
 * 姓名和年龄相同的人看做同一人不存储。
 * @time 2018/12/23 18:56
 * @see
 */
public class Preson {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Preson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preson preson = (Preson) o;
        return Objects.equals(name, preson.name) &&
                Objects.equals(age, preson.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Preson() {
    }

    public Preson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
