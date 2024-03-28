package kurs_sitesi;

import java.util.ArrayList;

public class Kurs {

    private String kursAdi;
    private ArrayList<Ders> kurstakiDersler;
    private ArrayList<Egitmen> kurstakiEgitmenler;
    private ArrayList<Ogrenci> kursOgrencileri;
    private boolean yayinla;

    public Kurs(String kursAdi, Egitmen basEgitmen) {
        this.kursAdi = kursAdi;
        this.kurstakiDersler = new ArrayList<>();
        this.kurstakiEgitmenler = new ArrayList<>();
        kurstakiEgitmenler.add(basEgitmen);
        this.kursOgrencileri = new ArrayList<>();
        this.yayinla=false;
    }

    

    public ArrayList<Ders> getKurstakiDersler() {
        return kurstakiDersler;
    }



    public ArrayList<Ogrenci> getKursOgrencileri() {
        return kursOgrencileri;
    }
    

    public String getKursAdi() {
        return kursAdi;
    }



    public void egitmenEkle(Egitmen egitmen){

        if(!kurstakiEgitmenler.contains(egitmen)){
            kurstakiEgitmenler.add(egitmen);
        }else{
            System.out.println(egitmen.getIsim() + "zaten tanimli bir egitmendir.");
        }
        
    }

    public void egitmenSil(Egitmen egitmen){

        if(egitmen.getIsim().equals(kurstakiEgitmenler.get(0).getIsim())){
            System.out.println("bas egitmen silinemez");
        }else{
            kurstakiEgitmenler.remove(egitmen);
        }
        
    }

    public void kursaDersEkle(Ders ders){
        kurstakiDersler.add(ders);
    }

    public void kurstanDersSil(Ders ders){
        kurstakiDersler.remove(ders);
    }

    public void kursaOgrenciEkle(Ogrenci o ){

        if(kursYayindami()){
            kursOgrencileri.add(o);
        }

        
    }

    public boolean kursYayindami(){
        if(kurstakiDersler.size() >= 5 && kursunToplamDakikasi() >=60){
            yayinla = true;
            return true;
        }else return false;
    }

    public int kurstakiDersSayisi(){

        return kurstakiDersler.size();
    }

    public int kursunToplamDakikasi(){
        double toplamSure = 0;
        for(Ders ders : kurstakiDersler){
            
            toplamSure+=ders.getDakika();
        }

        return (int)toplamSure;
    }

    

    
    
}
