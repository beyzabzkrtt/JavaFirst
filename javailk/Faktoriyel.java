import java.util.Scanner;
public class Faktoriyel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            System.out.println("sayiyi giriniz");
            int sayi = scan.nextInt();

            int temp=1;

            for (int i = 1; sayi>= i ; i++){ 
                
                temp*=i;
                
            }

            System.out.println("sonuc: " + temp);

        
            
            
        
        
            

            

        
        
    }
    
}
