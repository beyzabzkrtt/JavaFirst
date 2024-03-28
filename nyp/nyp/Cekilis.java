package nyp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Cekilis {

    //1 den 60 a kadar sayilari 1.000.000 kere yazdirin
    //bu sayilari map icerisinde sayi - kac kez cikti seklinde saklayin
    //bundan sonra sayilari tekrar etme sayisina gore bir listeye aktarin
    //rastgele olacak sekilde bir set yapisi olusturun ve kucukten buyuge ilk 10 sayiyi ekrana yazdirin

    static final int SAYİ_SİNİR = 60;
    static final int SAYİ_ADEDİ = 1000000;
    public static void main(String[] args) {

       Map<Integer,Integer> olusturulanSayilarMap = new HashMap<>();
       List<Integer> olusturulanSayilar = new ArrayList<>();
       Set<Integer> sansliOnSayi = new TreeSet<>();
        
      

       mapiSayilarlaDoldur(olusturulanSayilarMap);
       mapiListeyeYazdir(olusturulanSayilarMap,olusturulanSayilar);
       sansliOnSayiyiBul(sansliOnSayi,olusturulanSayilar);

       System.out.println("sansli 10 sayi : ");

       for(int temp : sansliOnSayi){
        System.out.print(temp + " ");
       }

       


        }

    private static void sansliOnSayiyiBul(Set<Integer> sansliOnSayi, List<Integer> olusturulanSayilar) {

        Collections.shuffle(olusturulanSayilar);
        
        while(sansliOnSayi.size() < 10){

            int rand = (int)(Math.random()*SAYİ_ADEDİ);
            sansliOnSayi.add(olusturulanSayilar.get(rand));

        }
    }

    private static void mapiListeyeYazdir(Map<Integer, Integer> olusturulanSayilarMap,
            List<Integer> olusturulanSayilar) {

            for(Map.Entry<Integer,Integer> temp : olusturulanSayilarMap.entrySet()){

                int key=temp.getKey(); //sayimiz
                int value = temp.getValue(); //sayinin kac kere ciktigini gosterir

                for(int i = 0; i < value ; i++){
                    olusturulanSayilar.add(key);
                }
                

            }
       
    }

    private static void mapiSayilarlaDoldur(Map<Integer, Integer> olusturulanSayilar) {

        for(int i = 0; i < SAYİ_ADEDİ; i++ ){
            int random = sayiOlustur();
            if(olusturulanSayilar.containsKey(random)){
                int value = olusturulanSayilar.get(random);
                olusturulanSayilar.put(random, ++value);
            }else{
                olusturulanSayilar.put(random, 1);
            }

        }
        

    }

    private static int sayiOlustur(){
        return (int)(Math.random()*SAYİ_SİNİR+1);
    } 
        
    }
    

