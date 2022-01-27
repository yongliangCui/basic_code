package Day2;

import java.util.ArrayList;

public class Arrayliststudent {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("a"));
        list.add(new Person("b"));
        list.add(new Person("c"));
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
