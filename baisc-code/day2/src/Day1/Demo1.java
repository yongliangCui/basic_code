package Day1;

import java.util.ArrayList;

/*
练习题目
 */
public class Demo1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println(Num(num1,num2));
        int[] arry = {1,1,2,2,3,3,3,4,4,4,4,45,5,5,5,5,5,5,5};
//        System.out.println(maxCount(arry));
        int[] arry2 = Del(arry);
        for (int i = 0; i < arry2.length; i++) {
            System.out.println(arry2[i]);
        }
    }
// 寻找最大公约数
//    public static int Num(int num1,int num2) {
//        int big = num1 >= num2 ? num1 : num2;// 找到较大的数字
//        int small = num1 <= num2 ? num1 : num2; // 找到较小的数字
//        if (big % small == 0) { // 校验最大的公约数是不是small本身
//            return small;
//        } else {
//            int num3 = small;
//            while (num3 > 0) {// 遍历比small小的数字
//                if (big % num3 == 0 && small % num3 == 0) { // 找到能被两个数整除的数字
//                    return num3;// 返回数字
//                }
//                num3--;
//            }
//        }
//        return 1;
//    }
//  找到数组中出现次数最多的数据
//    public static int maxCount(int[] arry){
//        int num1 = 1,num2 = 0,maxnum = arry[0];
//        for (int i = 0;i < arry.length;i++){ // 外循环遍历每个数
//            for (int j = i + 1;j < arry.length;j++){ // 内循环数组和以上数据作比较
//                if (arry[i] == arry[j]){ // 相等的数据计数器num+1次
//                    num1++;
//                }else continue;
//            }
//            if (num1 >= num2){ // 本次循环数字出现次数大于上次
//                maxnum = arry[i];// 出现最多次数的数字赋值给max
//                num2 = num1; // 最大计数器更新
//            }
//        }
//        return maxnum;// 返回最大的数字
//    }
//   数组去重
    public static int[] Del(int[] arry){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arry.length; i++) {
            if (arrayList.contains(arry[i])){
                continue;
            }
            else {
                arrayList.add(arry[i]);
            }
        }
        int[] list = new int[arrayList.size()];
        for (int i = 0; i < list.length; i++) {
            list[i] = arrayList.get(i);
        }
        return list;
    }
}
