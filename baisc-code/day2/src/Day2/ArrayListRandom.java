package Day2;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(random.nextInt(33));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
