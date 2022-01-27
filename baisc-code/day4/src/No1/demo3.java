package No1;

public class demo3 {
    public static void main(String[] args) {
        demo1 de = new demo1();
        System.out.println(de.num);

        demo2 de2 = new demo2();
        System.out.println(de2.num1);
        System.out.println(de2.num);//首先找本类中的成员变量，后再父类寻找

    }
}
