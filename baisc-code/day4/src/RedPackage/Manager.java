package RedPackage;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }
    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalmoney,int count){
        ArrayList<Integer> readlist = new ArrayList<>();//创建一集合保存数量
//      查看余额
        int leftmoney = super.getMoney();
        if (leftmoney < totalmoney){
            System.out.println("余额不足");
            return readlist;
        }//判断余额
        super.setMoney(leftmoney - totalmoney);
        int avg = totalmoney / count;
        int mod = totalmoney % count;//不能被整除
        for (int i = 0; i < count-1; i++) {
            readlist.add(avg);
        }
        readlist.add(avg + mod);//最后一个加入余数
        return readlist;
    }
}
