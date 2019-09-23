package com.gp.chainedinvocation;

/**
 * @Author: Pearl
 * @DATE: 2019/9/23 上午 10:43
 * @Description:
 */
public class test {

    public static void main(String[] args) {

        StudentBean studentBean = new StudentBean().setAge(22).setName("ly");
        System.out.println(studentBean.toString());

        StudentBean2 studentBean2 = new StudentBean2("pearl").setAge(24);
        System.out.println(studentBean2.toString());

        StudentBean3 studentBean3 = StudentBean3.of("pearl").setAge(22);
        System.out.println(studentBean3.toString());

    }
}
