package Veteriner;

import java.util.ArrayList;

public class Musteri extends Kisi {

    private String adres;
    private ArrayList<Hayvan> musterihayvanlari;

    

    public Musteri(String isim, String tcKimlik,String adres) {
        super(isim, tcKimlik);
        this.adres=adres;
        musterihayvanlari = new ArrayList<>();
    }

    public void musteriyeHayvanEkle(Hayvan h){
        musterihayvanlari.add(h);
        System.out.println(h+" "+ getIsim()+ " musterisine eklendi");

    }

    public void musteriHayvanlarıGoster(){
        for(Hayvan h : musterihayvanlari){
            System.out.println(h);
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString()+" Ben bir musteriyim");
    }

    @Override
    public String toString() {
        return super.toString() + " Musteri [adres=" + adres + "]";
    }

    

    

    
}
