import java.util.Scanner;

public class MethodlaMenu {

    public static void main(String[] args) {

        int kullaniciSecimi=-1;

        while(kullaniciSecimi!=0){

            kullaniciSecimi=menuGoster();

            Scanner scan= new Scanner(System.in);

            System.out.println("birinci sayiyi girin");
            int birincisayi=scan.nextInt();
            System.out.println("ikinci sayiyi girin");
            int ikincisayi=scan.nextInt();

           

            switch (kullaniciSecimi){

                case 1 :
                    carp(birincisayi,ikincisayi);
                    break;
                 
                case 2 :
                    int x=topla(birincisayi,ikincisayi);  
                    System.out.println("sayilarin toplami : "+x);
                    break; 

                case 3 : 
                    kuvvet(birincisayi,ikincisayi);

            }

        }

    }

    private static void kuvvet(double birincisayi, double ikincisayi) {
        double p=Math.pow(birincisayi,ikincisayi);
        System.out.println("sayilarin kuvveti: "+p);

    }

    public static void carp(int birincisayi, int ikincisayi) {
        System.out.println("sayilarin carpimi : " + birincisayi*ikincisayi);

    }

    public static int topla(int a,int b){
        return a+b;
    }

    public static int menuGoster(){

        System.out.println("***************MENU****************");
        System.out.println("1- iki sayinin carpimi");
        System.out.println("2- iki sayinin toplami");
        System.out.println("3- iki sayinin kuvveti");
        System.out.println("0- cikis");

        Scanner scan = new Scanner(System.in);

        int secim = scan.nextInt();

         
        return secim;

    }

}