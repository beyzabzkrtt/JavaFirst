import java.util.Scanner;

public class ZDiziOrn5 {
    public static void main(String[] args) {
        
        //kullanicinin girdigi ogrenci ve soru sayisina gore 
        //ogrencilerin verdigi cevaplari tutan matris olustur
        //cevaplar a b c d e olacak sekilde rastgele olustur
        //dogru cevaplari tutan dizi olustur dogru cevaplar da rastgele olcak
        //bunlara gore her ogrencinin dogru yanlis sayisini yazdir


        Scanner scan = new Scanner(System.in);

        System.out.println("ogrenci sayisini girin: ");
        int ogrsayisi=scan.nextInt();
        System.out.println("soru sayisi girin:");
        int sorusayisi=scan.nextInt();

        String cevaplar[] = {"A","B","C","D","E"};

        String sorucevap[][]= new String[ogrsayisi][sorusayisi];

        int soru[] = new int[ogrsayisi];

      //  soruolustur(ogrsayisi);
        cevapolustur(cevaplar,sorusayisi);

       // sorucevapolustur(String sorucevap[],int ogrsayisi,int sorusayisi);


        


    }

    private static void sorucevapolustur(String sorucevap[],int ogrsayisi,int sorusayisi) {



    }

    private static void soruolustur(int ogrsayisi,int soru[]) {

        for(int i = 0 ; i<ogrsayisi-1 ; i++){

            soru[i]=i;




        }

    }

    public static void cevapolustur(String cevaplar[],int sorusayisi) {

       for (int i = 0 ; i <= sorusayisi ; i ++){

        int index = (int)(Math.random()*4);
        String cevap=cevaplar[index];
       }
       
        
        


    }
    
}
