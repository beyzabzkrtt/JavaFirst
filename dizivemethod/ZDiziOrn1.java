
import java.util.Scanner;
public class ZDiziOrn1 {

    // kullanıcıdan kaç tane sayinin ortalamasını bulmanızı istediğini sorun
    //aldığınız değerleri bir dizide saklayın
    //veri alma işlemi bittikten sonra tüm sayilari ve ortalamayı ekrana yazdırın

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int toplam=0;
        double ortalama;

        System.out.println("kac adet sayinin ortalamasi hesaplanacak? ");
        int adet = scan.nextInt();

        int dizi[] = new int[adet];

        for(int i = 0; i < adet ; i ++){

            System.out.println("sayiyi girin");
            int sayi= scan.nextInt();
            dizi[i]=sayi;

            toplam+=sayi;
        }

        for(int j = 0; j < adet ; j++){

            System.out.print((j+1)+". eleman : "+dizi[j]+"\n");
        }

        ortalama=toplam/(double)adet;

        System.out.println("");
        System.out.println("ortalama : " + ortalama);
        

       
    }
    
}


