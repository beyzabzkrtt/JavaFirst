package kurs_sitesi;

public abstract class Kisi {

    private String kullaniciAdi;
    private String isim;
    private String tanitimYazisi;
    
    public Kisi(String kullaniciAdi, String isim, String tanitimYazisi) {
        this.kullaniciAdi = kullaniciAdi;
        this.isim = isim;
        this.tanitimYazisi = tanitimYazisi;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getIsim() {
        return isim;
    }

    public String getTanitimYazisi() {
        return tanitimYazisi;
    }

    @Override
    public String toString() {
        return "Kisi [kullaniciAdi=" + kullaniciAdi + ", isim=" + isim + ", tanitimYazisi=" + tanitimYazisi + "]";
    }
    
    
}
