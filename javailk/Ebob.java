import java.util.Scanner;

public class Ebob{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("ilk sayiyi giriniz :");
        int ilksayi=scan.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        int ikincisayi=scan.nextInt();
        
        if(ikincisayi%ilksayi==0){

                System.out.println("eboblari : " + ilksayi);
            }else{

                for(int i = ilksayi ; i > 1 ; i-- ){ 
                    if(ikincisayi%i==0 && ilksayi%i== 0){

                        System.out.println("eboblari :" + i);
                        break;
                    }

            
        }
            }
        

    }
}