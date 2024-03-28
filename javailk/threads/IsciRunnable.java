package threads;

public class IsciRunnable implements Runnable {

    private String renk;

    public IsciRunnable(String renk){

        this.renk=renk;

    }


    @Override
    public void run() {
        try {
            System.out.println(renk +"Iscirunnable sinifi calismaya basladi. Thread: "+ Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(renk +"Iscirunnable sinifi calismasini bitirdi. Thread: "+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }
    
}
