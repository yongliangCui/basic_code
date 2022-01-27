package No5;

public class Zi extends Fu {
    public Zi(int num) {
        super(num);
    }

    public void zi(){
       System.out.println("子类");
   }
   public void zz(){
       zi();
   }
}
