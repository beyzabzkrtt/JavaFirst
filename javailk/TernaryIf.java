public class TernaryIf {

  public static void main(String[] args) {
    int a = 10, b = 6, c = 0;

    if (a > b) {
      c = a - b;
    }else {
      c = a + b;
    }

    System.out.println("c nin degeri: " + c);

    //bu if ifadesi yerine

    int k = 10, l = 6, m = 0;

    m = (k > l) ? (k - l) : (k + l); 

    //soru işaretinden önce girilen kısım koşul
    // true ise ilk ifadeyi değilse iki noktadn sonrakini çalıştırır

    System.out.println("m nin son degeri: " + m);
  }
}
