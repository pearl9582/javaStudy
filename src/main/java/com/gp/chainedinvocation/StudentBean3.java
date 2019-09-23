package com.gp.chainedinvocation;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author: Pearl
 * @DATE: 2019/9/23 上午 10:57
 * @Description:
 */
@Data
@Accessors(chain = true)
@RequiredArgsConstructor(staticName = "of")
public class StudentBean3 {
    @NonNull
    private String name;
    private int age;

    @Override
    public String toString() {
        return "StudentBean3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
