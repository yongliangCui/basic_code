package Redpackage;

public class User {
    private String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void show(){
        System.out.println("余额是：" + this.money);
        System.out.println("姓名:"+ this.name);
    }
}
