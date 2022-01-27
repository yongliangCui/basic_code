package demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
