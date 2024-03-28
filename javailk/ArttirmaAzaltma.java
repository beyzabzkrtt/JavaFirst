public class ArttirmaAzaltma {

  public static void main(String[] args) {
    int sayi1 = 10;
    int sayi2 = ++sayi1;
    int sayi3 = sayi1--;

    System.out.println("sayi1 : " + sayi1);
    System.out.println("sayi2 : " + sayi2);
    System.out.println("sayi3 : " + sayi3);

    // sayi1 i 1 arttır sayi2= 11 sayi1 de artık 11
    //sayi3 = sayi1 yani sayi3 de 11 sonra sayi1 i azalt
    // sayi 1 en son 10

    System.out.println("\n*********************************\n");

    System.out.println("sayi3 : " + sayi3++);
    System.out.println("sayi3 : " + sayi3);
    System.out.println("sayi3 : " + (++sayi3));
    System.out.println("sayi3 : " + sayi3);

    // başta sayi3 11 birinci de sayi3 ü yazdırdı sonra arttırdı sonuc 11 ama artık değeri 12
    //ikinci de (satır 20) önce arttırdı sonra yazdı sonuc 13 değeri 13

    System.out.println("\n**************************************\n");
    int beyza = 5;
    int ozan = 6;

    int x = beyza++ * ozan;

    System.out.println(x);
    System.out.println(beyza);

    //x in değeri 30 dur operatör değişkenden sonra olduğu için önce çarptı sonra arttırdı

  }
}
