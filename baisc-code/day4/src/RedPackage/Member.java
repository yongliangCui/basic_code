package RedPackage;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
//    收红包的类
    public void recieve(ArrayList<Integer> readlist){
        int index;
        index = new Random().nextInt(readlist.size());
        int delt = readlist.remove(index);
        super.setMoney(super.getMoney() + delt);

    }
}
