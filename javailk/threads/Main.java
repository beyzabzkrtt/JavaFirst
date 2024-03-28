package threads;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Program baslatildi " + Thread.currentThread().getName());

        Isci isci1 = new Isci(ThreadRenkler.Blue);
        isci1.run();

        System.out.println("Program bitti");

        IsciRunnable isciRunnable = new IsciRunnable(ThreadRenkler.Magenta);
        Thread isci2 = new Thread(isciRunnable);
        isci2.start();

        System.out.println("main sonu");

        new Thread(new Runnable() {
            @Override
            public void run(){
                
            }
        }).start();

       

    }
    
}
