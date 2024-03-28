import java.util.Scanner;

public class PiyangoOyunu {

  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in) ;
      System.out.println("Tahmininizi giriniz : ");
      int tahmin = scan.nextInt();

      int a=tahmin/10;
      int b =tahmin%10;


      int sonuc = (int) (Math.random() * 91 + 9);

      int c=sonuc/10;
      int d = sonuc%10;


      if (tahmin == sonuc) {
        System.out.println("Tebrikler 1000 lira kazandiniz.");
      }else if (a==c || b == d) {
        System.out.println("Tebrikler 500 lira kazandiniz");
      }else if (a==d || b==c){
        System.out.println("Tebrikler 100 lira kazandiniz");
      }else {
        System.out.println("Tekrar deneyiniz");

      }

     

      System.out.println("Sansli sayi : "+ sonuc);
    }

}