import java.util.Scanner;

public class SicakSogukOyunu {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int sayi = (int) (Math.random() * 101);

    int tahmin = -1;

    while (sayi != tahmin) {
      System.out.println("tahmininizi girin : ");
      tahmin = scan.nextInt();

      

      if (sayi < tahmin) {
        System.out.println("azaltin");
      } else if (sayi > tahmin) {
        System.out.println("arttirin");
      }
    }

    System.out.println("tebrikler buldunuz :" + sayi);
  }
}
