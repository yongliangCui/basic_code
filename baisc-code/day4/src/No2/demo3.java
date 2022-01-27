package No2;
//无论成员变量还是成员方法，当重名时先找子类对象中的，和new的对象中
public class demo3 {
    public static void main(String[] args) {
       demo2 de2 = new demo2();
       de2.method();
    }
}
