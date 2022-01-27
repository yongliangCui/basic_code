package Redpackage;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void recive(ArrayList<Integer> list){
        super.show();
        Random random = new Random();
        int index = random.nextInt(list.size());
        super.setMoney(list.get(index));
        list.remove(index);
        super.show();
    }
}
