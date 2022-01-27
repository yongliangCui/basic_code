package MyInterface;

public interface Interface {
    public final int num = 0;//常量的定义
    public abstract void shuchu();//抽象方法
    public default void out(){
        System.out.println("默认方法");
    }
    private void method(){
        System.out.println("私有方法");
    }
    private static void methodB(){
        System.out.println("私有静态方法");
    }
    default void methodC(){
        System.out.println("默认方法");
    }
}
