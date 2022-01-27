package javaapi1;

public class staticword {
    private String word = "ziji";
    private int num = 1;
    private static int room = 001;
    static {
        System.out.println("静态代码块执行！！");
    } // 静态代码块，唯一执行一次


    public static int getRoom() {
        return room;
    }

    public static void setRoom(int room) {
        staticword.room = room;
    }

    public staticword(String word, int num) {
        this.word = word;
        this.num = num;
    }// 构建方法

    public staticword() {
        System.out.println("构建方法执行！！");
    }//构造方法，无参构造

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
