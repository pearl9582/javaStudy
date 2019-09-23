package com.gp.chainedinvocation;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * @Author: Pearl
 * @DATE: 2019/9/23 上午 10:49
 * @Description:  使用lombok 注解实现链式编程，@Data, @Accessor(chain = true)
 * @RequiredArgsConstructor  构造函数的入参包括所有 @NonNull的属性
 * @NoArgsConstructor  无参构造函数
 * @AllArgsConstructor  所有参数的构造函数
 */
@Data
@Accessors(chain = true)
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class StudentBean2 {
    @NonNull
    private String name;
    private int age;

    @Override
    public String toString() {
        return "StudentBean2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
