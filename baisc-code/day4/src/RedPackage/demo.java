package RedPackage;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member member1 = new Member("成员A",0);
        Member member2 = new Member("成员B",0);
        Member member3 = new Member("成员C",0);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("======================");

        //群主发20块
        ArrayList<Integer> list = manager.send(20,3);
        member1.recieve(list);
        member2.recieve(list);
        member3.recieve(list);

        manager.show();
        member1.show();
        member2.show();
        member3.show();

    }
}
