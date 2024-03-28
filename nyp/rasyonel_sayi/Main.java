package rasyonel_sayi;

import java.util.Arrays;

public class Main {
   
    public static void main(String[] args) {
        
        RasyonelSayi rs = new RasyonelSayi(20,10);
        System.out.println(rs);

        RasyonelSayi rs2 = new RasyonelSayi(20,10);
        System.out.println(rs2);
        RasyonelSayi rs3 = new RasyonelSayi(-1,5);
        System.out.println(rs3);

        System.out.println(rs2.topla(rs3));

        System.out.println("bölüm:"+rs2.bol(rs3));

        RasyonelSayi dizi[] = {rs,rs2,rs3};
        Arrays.sort(dizi);

        for(RasyonelSayi temp : dizi){
            System.out.print(temp + " ");
        }
        System.out.println(" ");

        System.out.println(rs==rs2);

        

        


        

        
    }
    
}
