package Red;

import Redpakage.OpenMode;

public class Redpacktest {
    public static void main(String[] args) {
        Redpack redpack = new Redpack("发红包");
        OpenMode openMode = new Lucky();
//        redpack.setOpenWay(openMode);
//        redpack.setOpenWay(openMode);
        redpack.setOpenWay(new Common());
    }
}
