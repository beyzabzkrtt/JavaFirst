
public class DiziVeMethod {
    public static void main(String[] args) {
        
        int sayilar[]= {1,2,3};

        System.out.print("dizi : \n");
        diziYazdir(sayilar);

        //parametresi int olan methodla dizideki elemanları 1 arttırıp diziyi yazdıralım

        arttir(sayilar[0]);
        arttir(sayilar[1]);
        arttir(sayilar[2]);

        System.out.println("int parametreliden sonra dizi degerleri");
        diziYazdir(sayilar);

        //şimdi parametresi direkt dizi olan bir methodla arttırıp dizinin son haline bakalım

        diziarttir(sayilar);

        System.out.println("dizi parametre olarak gönderilen methoddn sonra");
        diziYazdir(sayilar);


        //parametresi int olan yani primitive tipte olan methodta değerin kendisi değil kopyasıyla
        //işlem yapıldığı için dizideki değerlerr aynı kaldı
        //parametre olarak dizi gönderdiğimizde direkt o değerler üzerinde işlem yapıldı



        
    }

    public static void arttir(int i ){
        i++;
    }

    public static void diziarttir(int dizi[]){
        dizi[0]++;
        dizi[1]++;
        dizi[2]++;
    }


    public static void diziYazdir(int dizi[]){

        for (int i : dizi){ // methoda parametre olarak vereceğimiz veri dizi[] yerine gececek

            System.out.println(i);

        }
    }
    
}
