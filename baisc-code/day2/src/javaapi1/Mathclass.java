package javaapi1;
//Math类的使用

import java.math.BigDecimal;

public class Mathclass {
    public static void main(String[] args) {
        double num = -5.9;
        int record = 0;
        for (int i = (int) num; i < 2.9; i++) {
            System.out.println(i);
            if (1 < i) {
                record++;
            }
        }
        System.out.println(record);
        System.out.println(Num(1.1111));
    }
//   保留两位小数,Bigdecimal的使用
    public static double Num(double num){
        BigDecimal bigDecimal = new BigDecimal(num);
        bigDecimal = bigDecimal.setScale(2,BigDecimal.ROUND_DOWN);
        num = bigDecimal.doubleValue();
        return num;
    }
}

