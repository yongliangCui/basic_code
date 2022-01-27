package javaapi1;
// Arrays类的使用

import java.util.Arrays;

public class Arraysclas {
    public static void main(String[] args) {
        String str = "fasfhjahdjfhakjdfhajguhjujf";
        char[] ch = str.toCharArray();// 字符串转数组
        Arrays.sort(ch);// 排序正序
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
