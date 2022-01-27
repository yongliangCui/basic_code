package MyUsb;

public class demo {
    public static void main(String[] args) {
        MyComputer myComputer = new MyComputer();
        Usb usb = new Mouse();
        myComputer.usb(usb);
    }
}
