package javaapi1;

import java.util.Scanner;
// 统计字符串中的字符出现次数
public class example {
    public static void main(String[] args) {
//        ArrayList<Integer> array = new ArrayList<>();
        int[] arry = countNum(input());
        System.out.println("大写字母："+ arry[0]);
        System.out.println("小写字母："+ arry[1]);
        System.out.println("数字："+ arry[2]);
        System.out.println("其他："+ arry[3]);
        staticword.setRoom(002);
        System.out.println(staticword.getRoom());
        staticword s = new staticword();// 静态代码块以及构建方法的运行，比较前后

    }
//  输入字符串
    public static String input(){
        System.out.println("请输入字符串！");
        String str = new Scanner(System.in).next();
        return str;
    }
//  检索大写字母，小写字母，数字，其他出现次数
    public static int[] countNum(String str){
        char[] str2 = str.toCharArray();
        int[] record = {0,0,0,0};
        for (int i = 0; i < str2.length; i++) {
            if (str2[i] <= 90 && str2[i] >= 65){
                record[0]++;
            }
            else if (str2[i] >= 97 && str2[i] <= 122){
                record[1]++;
            }
            else if (str2[i] >= 48 && str2[i] <= 57){
                record[2]++;
            }
            else{
                record[3]++;
            }
        }
        return record;
    }
}
