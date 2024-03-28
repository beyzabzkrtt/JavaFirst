import java.util.Scanner;
public class AsalYazdir {

    // verilen sayı dahil o sayıya kadar olan asal sayıları yazdırır
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayiyi giriniz");
        int sayi = scan.nextInt();

        

        for(int i = 2 ; i <= sayi ; i++){
            boolean asalmi = true;

            for (int j = 2 ; j < i ; j++){

                if(i%j==0){
                    asalmi=false;
                    break;
                }

            }

            if(asalmi){
                System.out.print(i + ",");
            }
        }
        
        
            

            
        }
    }
    

