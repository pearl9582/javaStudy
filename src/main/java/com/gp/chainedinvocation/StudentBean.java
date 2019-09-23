package com.gp.chainedinvocation;

/**
 * @Author: Pearl
 * @DATE: 2019/9/23 上午 10:23
 * @Description:  度小满问了点点点，没回答出来。学习一下，链式编程
 */
public class StudentBean {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public StudentBean setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBean setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

