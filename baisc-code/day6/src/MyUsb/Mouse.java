package MyUsb;

public class Mouse implements Usb{
    @Override
    public void powerOn() {
        System.out.println("鼠标开");
    }

    @Override
    public void powerOff() {
        System.out.println("鼠标关");
    }
    void click(){
        System.out.println("鼠标点击");
    }
}
