package javaapi1;

public class pinjie {
    public static void main(String[] args) {
        String str3 = "09";
        int[] array = {1,2,3};
        String str = "[";
        String str1 = "]";
        for (int i = 0; i < array.length; i++) {
            str = str.concat("world");
            str = str.concat(String.valueOf(array[i]));
            if (i < array.length - 1){
                str = str.concat("#");
            }
        }
        str = str.concat(str1);
        System.out.println(str);
        System.out.println(str3.getBytes()[1]);
    }
}
