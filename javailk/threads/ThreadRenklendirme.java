package threads;

public class ThreadRenklendirme {
    public static void main(String[] args) {
        
        Isci i1 = new Isci(ThreadRenkler.Magenta);
        i1.start();

        Isci i2 = new Isci(ThreadRenkler.Cyan);
        i2.start();
    }
    
}
