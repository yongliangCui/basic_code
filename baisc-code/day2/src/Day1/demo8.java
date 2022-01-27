package Day1;

import java.util.Random;
import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int Num = rnd.nextInt(100);
        int record = 0;
        while (true){
            int Numin = new Scanner(System.in).nextInt();
            if (Numin == Num && record < 3){
                record++;
                System.out.println("恭喜你猜对了！使用了"+record+"次！");
                break;
            }
            else if (Numin > Num && record < 3){
                record++;
                System.out.println("猜大了，请再次输入");
                continue;
            }
            else if (Numin <Num && record < 3){
                record++;
                System.out.println("猜小了，请再次输入");
                continue;
            }else{
                System.out.println("次数超过！");
                break;
            }
        }
    }
}
