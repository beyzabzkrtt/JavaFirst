import java.util.Scanner;

public class ZDiziOrn4 {
    public static void main(String[] args) {
        
        // verilen iki sayinin en kucuk ortak katini bul
        
        Scanner scan = new Scanner(System.in);

        System.out.println("sayilari girin");
        int s1=scan.nextInt();
        int s2=scan.nextInt();

        int min=s1,max=s2;

        //Math.max() methodu kullanabilirsin

        if(s1>s2){
            max=s1;
            min=s2;
        }else if (s1==s2){
            System.out.println("ekoklari : " + s1);
        }else {
            max=s2;
            min=s1;
        }

        if(max%min==0){

            System.out.println("ekoklari : "+max);
        }else{

            boolean x = true;
            int ekok = max+1;

            while(x){

                if(ekok%max== 0 && ekok%min==0){
                    System.out.println("ekoklari : "+ekok);
                    x=false;
                }else{
                    ekok+=1;
                }


            }

            
        }

        //while yerine for ile de yazilabilir 
        //ekoklari max ikisinin carpimi olacagi icin
        // for int i = maxsayi ; i <= s1*s2; i ++ 


        




    }
    
}
