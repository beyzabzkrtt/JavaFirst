package kurs_sitesi;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ogrenci extends Kisi {

    private ArrayList<Kurs> katildigiKurslar;
    private LinkedList<Ders> izlenecekDersListesi;

    public Ogrenci(String kullaniciAdi, String isim, String tanitimYazisi) {
        super(kullaniciAdi, isim, tanitimYazisi);
        this.katildigiKurslar = new ArrayList<>();
        this.izlenecekDersListesi = new LinkedList<>();
        
    }

    public LinkedList<Ders> getIzlenecekDersListesi() {
        return izlenecekDersListesi;
    }

    public void izlenecekDersEkle(Ders izlenecekDers){

        boolean dersBulundu = false;

        if(katildigiKurslar.size()>0){

            for(Kurs temp : katildigiKurslar){

                if(temp.getKurstakiDersler().contains(izlenecekDers)){
                    izlenecekDersListesi.add(izlenecekDers);
                    dersBulundu = true;
                    System.out.println("izlenecekler listesine " + temp.getKursAdi() + " adli kurstaki " + izlenecekDers.getDersAdi() + " adli ders eklendi");
                    break;
                }
            }
            if(!dersBulundu){
                System.out.println("ders kurslar icinde bulunamadi");
            }
        }
    }

    public void kursaKatil(Kurs kurs){

        if(kurs.kursYayindami()){
            kurs.getKursOgrencileri().add(this);
            katildigiKurslar.add(kurs);
            System.out.println(this.getIsim() + " ogrencisi "+ kurs.getKursAdi()+" kursuna katildi");
        }else{
            System.out.println(kurs.getKursAdi() + " yayinda degil");
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Ogrenci [katildigiKurslar=" + katildigiKurslar + "]";
    }

    

    




    
}
