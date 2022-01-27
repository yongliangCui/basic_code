package Redpackage;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int total, int num){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int money = super.getMoney();
        if (money < total){
            System.out.println("余额不足！");
            return arrayList;
        }else {
            int pack = total / num;
            int mod = total % num;
            for (int i = 0; i < num - 1; i++) {
                arrayList.add(pack);
            }
            arrayList.add(pack + mod);
            super.setMoney(money - total);
            return arrayList;
        }
    }

}
