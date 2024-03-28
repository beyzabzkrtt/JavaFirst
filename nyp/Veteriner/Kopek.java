package Veteriner;

public class Kopek extends Hayvan {

    private int asiSayisi;
    private String cins;
    private String tur;
    

    public Kopek(String dogumTarihi, boolean kayitli,int asiSayisi,String cins) {
        super(dogumTarihi, kayitli);
        this.asiSayisi=asiSayisi;
        this.tur="Kopek";
        this.cins=cins;
    }

    public int getAsiSayisi() {
        return asiSayisi;
    }

    public void setAsiSayisi(int asiSayisi) {
        this.asiSayisi = asiSayisi;
    }

    @Override
    void bilgileriGoster() {
        System.out.println(toString()+" "+super.toString());
        
    }

    @Override
    public String toString() {
        return "Kopek [asiSayisi=" + asiSayisi + ", cins=" + cins + ", tur=" + tur + "]";
    }

    

    
}
