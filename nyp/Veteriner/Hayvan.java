package Veteriner;

abstract public class Hayvan {

    private String dogumTarihi;
    private boolean kayitli;

    public Hayvan(String dogumTarihi, boolean kayitli) { // alt siniflarin kullanmasi icin consturctor
        this.dogumTarihi = dogumTarihi;
        this.kayitli = kayitli;
    }
    
    public String getDogumTarihi() {
        return dogumTarihi;
    }
    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
    public boolean isKayitli() {
        return kayitli;
    }
    public void setKayitli(boolean kayitli) {
        this.kayitli = kayitli;
    }

    abstract void bilgileriGoster();


    @Override
    public String toString() {
        return "Hayvan dogum tarihi:"+ dogumTarihi + " kayitli:" + kayitli;
    }
    
}
