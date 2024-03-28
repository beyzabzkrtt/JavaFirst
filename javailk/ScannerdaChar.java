import java.util.Scanner;

public class ScannerdaChar {
    public static void main(String[] args) {

        try (Scanner tara = new Scanner(System.in)) {
            
            System.out.println("kelime giriniz :");
            char harf = tara.nextLine().charAt(2);

            System.out.println("girilen kelimenin üçüncü harfi : " + harf);
        }

        //klavyeden direkt char alamadığımız için tek harf için charAt() metodu kullanılabilir
        //tek harf almak için charAt(0) (girilen ilk harfi alır)

    }
    
}
