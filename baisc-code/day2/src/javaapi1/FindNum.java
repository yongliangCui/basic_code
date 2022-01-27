package javaapi1;
// 寻找集合中的偶数并形成一个新的数组
import java.util.ArrayList;
import java.util.Random;

public class FindNum {
    public static void main(String[] args) {
        System.out.println(Findlist(List()));
    }
    public static ArrayList<Integer> List(){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(20)+1);
        }
        return list;
    }
    public static ArrayList<Integer> Findlist(ArrayList<Integer> list){
        ArrayList<Integer> list2  = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list2.add(list.get(i));
            }
        }
        return list2;
    }
}
