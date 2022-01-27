package Redpackage;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        Manager manager = new Manager("用户",100);
        Member member = new Member("领",0);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = manager.send(100,3);
        member.recive(arrayList);
    }
}
