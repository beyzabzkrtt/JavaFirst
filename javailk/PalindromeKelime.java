import java.util.Scanner;

public class PalindromeKelime {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("kelimeyi girin");
        String kelime=scan.nextLine();

        int altsinir=0;
        int ustsinir=kelime.length()-1; //ilk index 0 old için son index length-1 olur

        boolean palindrome=true;

        while(altsinir < ustsinir){ // burası sağlanmadığında ya harf biter ya da 
                                   //ortada tek harf kalmıştır ona da bakmaya gerek yoktur

            if(kelime.charAt(altsinir) != kelime.charAt(ustsinir)){
                palindrome=false;
                break;
            }

            altsinir++;
            ustsinir--;

        }

        if(palindrome){
            System.out.println("kelime palindrom");
        }else {
            System.out.println("kelime palindrom degil");
        }


    }
    
}
