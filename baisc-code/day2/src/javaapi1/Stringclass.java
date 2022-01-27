package javaapi1;

// String类的使用
public class Stringclass {
    public static void main(String[] args) {
        String str1 = "abdfadfasdfas";
        String str2 = "哈哈哈!你不是傻子";
        String str3 = null;

// String的比较
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println("ab".equals(str2));

// String的其他方法：
        System.out.println(str1.length());// 返回字符串长度
        System.out.println(str1.concat("c"));// 拼接字符串
        System.out.println(str1.charAt(0));// 索引对应位置的内容
        System.out.println(str1.indexOf('b'));// 第一次出现该字符的位置，没有返回-1

//  截取字符串的方法
        System.out.println(str1.substring(3));// 从第[3]个位置到最后
        System.out.println(str1.substring(3));// 从[3]到7，左含右不含
        System.out.println(str2.replace("傻子","****"));//替换固定内容
        String[] str = str2.split("!");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }// 按照规定的规则分割字符串形成数组





    }
}
