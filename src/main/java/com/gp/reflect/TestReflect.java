package com.gp.reflect;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * @Author: Pearl
 * @DATE: 2019/9/23 下午 5:07
 * @Description:
 */
public class TestReflect {

    private static void getConstructor() throws NoSuchMethodException,ClassNotFoundException {
        Student student = new Student("pearl", 24, 0.0);
        //获取该类的构造方法
        Class classOfStu = student.getClass();
        //getDeclaredConstructors可以返回类的所有构造方法
        Constructor[] constructors = classOfStu.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);

            //获取构造方法中的参数
            //getModifiers可以得到构造方法的访问权限类型
            //getParameterTypes可以得到构造方法的所有参数，返回的是一个Class数组
            System.out.print(Modifier.toString(c.getModifiers()) + "参数：");
            Class[] parameterTypes = c.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.print(parameterType.getName() + " ");
            }
            System.out.println();
        }
        //获取无参构造函数
        Constructor constructor = classOfStu.getDeclaredConstructor();
        System.out.println(constructor);
    }

    static void getConstructorHaveParam() throws NoSuchMethodException {
        Student student = new Student("pearl", 24, 0.0);
        //获取该类的构造方法
        Class classOfStu = student.getClass();
        Class[] p = {int.class, String.class};
        Constructor constructor = classOfStu.getDeclaredConstructor(p);

    }
    static void getPrivateFun(){
        Student student = new Student("pearl", 24, 0.0);

    }

    static void createObjByReflect() throws ClassNotFoundException {
        Student student = new Student("pearl", 24, 0.0);
        //获取该类的构造方法
        Class classOfStu = student.getClass();
        //创建一个类对象
        try {
            Object newObj = classOfStu.newInstance();
            System.out.println(newObj.toString());
        } catch (Exception ex) {
            throw new RuntimeException("");
        }

        //根据类名获取类
        Class c = Class.forName("com.gp.reflect.Student");
        System.out.println(c);
    }


    public static void main(String[] args) throws ClassNotFoundException,NoSuchMethodException {
        getConstructor();
//        createObjByReflect();
    }
}
