package Day1;

import java.util.Scanner;

/*
对象作为方法的参数和返回
 */
public class demo {
    public static void main(String[] args) {
         String name=methodparam(new Person());
        System.out.println(name);


    }
//匿名对象作为方法的参数
    public static String methodparam(Person person) {
        person.name = "赵丽颖";
        return person.name;
    }
//匿名对象作为方法的返回
    public static Scanner method(){
        return new Scanner(System.in);

    }
}
