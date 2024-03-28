package threads;

public class Isci extends Thread{

    String renk;

    public Isci(String renk){

        this.renk=renk;

    }

    @Override
    public void run() {
        try {
            System.out.println(renk +"Isci sinifi calismaya basladi. Thread: "+ Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(renk +"Isci sinifi calismasini bitirdi. Thread: "+ Thread.currentThread().getName());
           
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }
    
}
