package Red;

import Redpakage.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class Lucky implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int record = totalCount - 1;
        for (int i = 0; i < record; i++) {
            int num = random.nextInt(totalMoney-totalCount+1);
            System.out.println(num);
            list.add(num);
            totalMoney = totalMoney-num;
            totalCount--;
        }
        list.add(totalMoney);
        return list;
    }
}
