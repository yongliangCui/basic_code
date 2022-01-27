package No6;
//抽象类的使用要使用子类继承并且重新抽象方法，才可以调用，不可以直接调用抽象类
public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("鱼");
    }
}
