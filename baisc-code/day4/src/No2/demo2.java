package No2;
//子类
public class demo2 extends demo1{
    int num = 2;//成员变量
    public void method(){
        int num = 3;//局部变量
        System.out.println(num);//输出局部变量
        System.out.println(this.num);//输出本类成员变量
        System.out.println(super.num);//输出父类成员变量
    }
}
