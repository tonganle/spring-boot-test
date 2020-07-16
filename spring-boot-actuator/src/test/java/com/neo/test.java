package com.neo;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2019/10/7
 */
public class test {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = ++i;

        int k = j + ++i * i++;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
