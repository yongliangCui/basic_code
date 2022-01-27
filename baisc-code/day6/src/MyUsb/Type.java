package MyUsb;

public class Type implements Usb{
    @Override
    public void powerOn() {
        System.out.println("键盘开");
    }

    @Override
    public void powerOff() {
        System.out.println("键盘关");
    }
    void type(){
        System.out.println("输入");
    }
}
