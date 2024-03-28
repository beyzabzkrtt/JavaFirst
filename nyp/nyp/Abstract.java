package nyp;

public class Abstract {
    public static void main(String[] args) {
        GeometrikSekil kare = new Kare(5);
        kare.alanHesapla();
        kare.cevreHesapla();
        ((Kare)kare).adSoyle(); //geometrik olarak olusturuldu casting yapmazsak adsoyleye ulasamaz
        
    }
public static void alanlariKarsilastir(GeometrikSekil gs,GeometrikSekil gs2){
    //dikdortgen kare vs karsilastiracagimiz icin geometrik sekil gonderdik
    //hepsini kullanabiliriz

    




    }
}

abstract class GeometrikSekil{

    private int birinciKenar;

    abstract public void alanHesapla();
    abstract public void cevreHesapla();

    public int getBirinciKenar() {
        return birinciKenar;
    }
    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }
}

class Kare extends GeometrikSekil{

    public Kare(int birinciKenar){
        setBirinciKenar(birinciKenar);
    }

    @Override
    public void alanHesapla() {
        System.out.println("karenin alani:" + getBirinciKenar()*4);
        
    }

    @Override
    public void cevreHesapla() {
        System.out.println("karenin cevresi:" + getBirinciKenar()*4);
    }
    public void adSoyle(){
        System.out.println("kareyim");
    }

}

class Dikdortgen extends GeometrikSekil{

    private int ikinciKenar;

    public Dikdortgen(int birinciKenar,int ikinciKenar){
        setBirinciKenar(birinciKenar);
        this.ikinciKenar=ikinciKenar;
    }
    

    @Override
    public void alanHesapla() {
        System.out.println("Dikdortgenin alani:" + (getBirinciKenar()*getIkinciKenar()));
        
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dikdortgenin cevresi:" + (getBirinciKenar()*2+getIkinciKenar()*2));
        
    }

    public int getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(int ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }
    
}

class Daire extends GeometrikSekil{

    public Daire(int yaricap){ //dairenin yaricapi geometriksekildeki birincikenara atildi
        setBirinciKenar(yaricap);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("dairenin cevresi:"+ 2*Math.PI*getBirinciKenar());
        
    }
    @Override
    public void alanHesapla() {
        System.out.println("dairenin alani:"+2*Math.PI*getBirinciKenar()*getBirinciKenar());
        
    }
}
