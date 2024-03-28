package kurs_sitesi;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    //Egitmenler kurs olusturabilmeli,ogrenciler kurslara katilabilmeli
    //bir kurs derslerden olusmali kursun aktif olabilmesi icin min 5 ders ve toplam uzunlugun 60 dk ustu olmali
    //ogrenci birden fazla kursa kayit olabilir farkli kurslardaki dersleri bir listeye eklebilmeli
    //bu listede ileri geri yaparak dersler arasinda gezebilmeli
    //ogrenci listeye ekleyecegi dersin kursuna mutlaka katilmis olmali
    //ogrencinin katilacagi kursun aktif olmasi gerekli
    //bir kursun birden fazla egitmeni olabilir

    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci("beyza_udemy", "beyza", "ogrenci");
        Egitmen emre = new Egitmen("egitmen_emre", "emre", "kurs egitmeni");

        System.out.println(ogr1);
        System.out.println(emre);

        Ders d1 = new Ders(1, "Java Nedir", 3.5);
        Ders d2 = new Ders(2, "VS kurulum", 9.2);
        Ders d3 = new Ders(3, "Veri tipleri", 22.9);
        Ders d4 = new Ders(4, "Diziler", 15.9);
        Ders d5 = new Ders(5, "Donguler", 12.4);
        Ders d6 = new Ders(5, "Nesneler", 11.0);



        Kurs javaKursu = new Kurs("Java Kursu", emre);
        javaKursu.kursaDersEkle(d1);
        javaKursu.kursaDersEkle(d2);
        javaKursu.kursaDersEkle(d3);
        javaKursu.kursaDersEkle(d4);
        javaKursu.kursaDersEkle(d5);
        
        Kurs cKursu = new Kurs("C Kursu", emre);
        cKursu.kursaDersEkle(d6);
        


        javaKursu.egitmenSil(emre);

        ogr1.kursaKatil(javaKursu);

        ogr1.izlenecekDersEkle(d6);
        ogr1.izlenecekDersEkle(d1);
        ogr1.izlenecekDersEkle(d2);
        ogr1.izlenecekDersEkle(d3);



        listeyiOynat(ogr1.getIzlenecekDersListesi());

       
        
    }



public static void listeyiOynat(LinkedList<Ders> izlenecekDersler){

    Scanner scan = new Scanner(System.in);
    boolean cikis = false;
    boolean ileriDogruHareket = true;

    ListIterator<Ders> iterator = izlenecekDersler.listIterator();

    if(izlenecekDersler.size()== 0){
        System.out.println("liste bos");
    }else{
        Ders ilkDers = iterator.next();
        System.out.println("su an izlenen ders "+ilkDers.getDersAdi() + " suresi:" +ilkDers.getDakika() );
    }

     menuGoster();
     while(!cikis){
        System.out.println("seciminiz:");
        int secim = scan.nextInt();

        switch (secim){

            case 0:
                System.out.println("uygulamadan cikiliyor");
                cikis=true;
                break;

            case 1:
            if(!ileriDogruHareket){
                ileriDogruHareket=true;
                if(iterator.hasNext()){
                    iterator.next();
                }
            }

                if(iterator.hasNext()){
                    Ders ilkDers = iterator.next();
                    System.out.println("Oynatilan dersin adi "+ilkDers.getDersAdi() + " suresi:" +ilkDers.getDakika() );
                }else{
                    System.out.println("listenin sonuna geldiniz");
                }
                break;

            case 2:
                if(ileriDogruHareket){
                    ileriDogruHareket=false;
                    if(iterator.hasPrevious()){
                        iterator.previous();
                    }
                }
                
                if(iterator.hasPrevious()){
                    Ders sonDers = iterator.previous();
                    System.out.println("Oynatilan dersin adi "+sonDers.getDersAdi() + " suresi:" +sonDers.getDakika() );

                }else{
                    System.out.println("listenin basina geldiniz");
                }
                break;

                

            case 3:
                izlenecekDersleriListele(izlenecekDersler);
                break;

            case 9:
                menuGoster();
                break;
        }
     }


}

private static void izlenecekDersleriListele(LinkedList<Ders> izlenecekDersler) {

    ListIterator<Ders> iterator = izlenecekDersler.listIterator();

    if(izlenecekDersler.size()== 0){
        System.out.println("liste bos");
        return;
    }else{
        
        while(iterator.hasNext()){
            Ders ilkDers = iterator.next();
        System.out.println("Ders adi "+ilkDers.getDersAdi() + " suresi:" +ilkDers.getDakika() );

        }
    }
   
}



private static void menuGoster() {

    System.out.println("************MENU*************");
    System.out.println("0-cikis");
    System.out.println("1-bir sonraki derse git");
    System.out.println("2-bir onceki derse git");
    System.out.println("3-tum listeyi goster");
    System.out.println("9-Menu");


        
}
    
}


