package com.heima.Demo05Collection;

import java.util.Objects;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/23 16:25
 * @see
 */
public class Preson implements Comparable<Preson>{
    private String name;
    private Integer age;

    @Override
    public int compareTo(Preson o) {
        //自定义比较规则，比较两人的年龄（this.age）,升序排序
//        return this.getAge()-o.getAge();//自己减去参数，升序
       return o.getAge()-this.getAge();//参数减去自己，降序

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

    @Override
    public String toString() {
        return "Preson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
