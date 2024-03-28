package Veteriner;

import java.util.ArrayList;

public class SehirVeterinerlikleri {

    private String sehir;
    private int toplamVeterinerSayisi;
    private ArrayList<Veteriner> sehirdekiVeterinerler;

    public SehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler=new ArrayList<>();
        toplamVeterinerSayisi=0;
    }

    public void sehireVeterinerEkle(Veteriner v){
        sehirdekiVeterinerler.add(v);
    }

    public void sehirdekiVetSayisi(){
        System.out.println("Sehirdeki toplam veteriner sayisi:"+sehirdekiVeterinerler.size());
        //System.out.println("Sehirdeki toplam veteriner sayisi: "+toplamVeterinerSayisi);
    }

    
    
}
