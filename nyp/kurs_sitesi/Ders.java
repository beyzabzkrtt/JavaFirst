package kurs_sitesi;

public class Ders {

    private int dersNo;
    private String dersAdi;
    private double dakika;

    public Ders(int dersNo, String dersAdi, double dakika) {
        this.dersNo = dersNo;
        this.dersAdi = dersAdi;
        this.dakika = dakika;
    }
    
    public double getDakika() {
        return dakika;
    }


    public String getDersAdi() {
        return dersAdi;
    }

    @Override
    public String toString() {
        return "Ders [dersNo=" + dersNo + ", dersAdi=" + dersAdi + ", dakika=" + dakika + "]";
    }
    

   
    
}
