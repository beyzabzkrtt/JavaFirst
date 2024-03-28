package rasyonel_sayi;

public class RasyonelSayi implements Comparable<RasyonelSayi>{

    private int pay;
    private int payda;

    public RasyonelSayi() {
        pay=0;
        payda=1;
    }

    public RasyonelSayi(int pay, int payda) {
        
        int ebob=ebobBul(pay,payda);
        this.pay=((payda > 0) ? 1 : -1)* (pay/ebob);
        this.payda=Math.abs(payda)/ebob;
        
    }

    private int ebobBul(int pay2, int payda2) {

        int payMutlakDeger=Math.abs(pay2);
        int paydaMutlakDeger=Math.abs(payda2);
        int ebob=1;

        for(int i=1; i<=payMutlakDeger && i <=paydaMutlakDeger; i++){

            if(payMutlakDeger%i == 0 && paydaMutlakDeger % i ==0){
                ebob=i;

            }
        }

        return ebob;

    }

    public RasyonelSayi topla(RasyonelSayi toplacakSayi){

        int toplaminPayi = (this.pay*toplacakSayi.payda) + (this.payda*toplacakSayi.pay);
        int toplaminPaydasi = this.payda * toplacakSayi.payda;

        RasyonelSayi sonuc = new RasyonelSayi(toplaminPayi,toplaminPaydasi);
        return sonuc;

    }

    public RasyonelSayi cikar(RasyonelSayi cikarilacakSayi){

        int toplaminPayi = (this.pay*cikarilacakSayi.payda) - (this.payda*cikarilacakSayi.pay);
        int toplaminPaydasi = this.payda * cikarilacakSayi.payda;

        RasyonelSayi sonuc = new RasyonelSayi(toplaminPayi,toplaminPaydasi);
        return sonuc;

    }

    public RasyonelSayi carp(RasyonelSayi carpilacakSayi){

        int carpiminPayi=this.pay * carpilacakSayi.pay;
        int carpiminPaydasi = this.payda * carpilacakSayi.payda;

        RasyonelSayi sonuc = new RasyonelSayi(carpiminPayi,carpiminPaydasi);
        return sonuc;
    }

    public RasyonelSayi bol(RasyonelSayi bolunecekSayi){
        int bolmepay=bolunecekSayi.payda;
        int bolmepayda=bolunecekSayi.pay;

        int bolmeninpayi = this.pay * bolmepay;
        int bolmeninpaydasi = this.payda * bolmepayda;

        RasyonelSayi sonuc = new RasyonelSayi(bolmeninpayi,bolmeninpaydasi);
        return sonuc;

    }

    @Override
    public String toString() {
        if(payda == 1){
            return pay+"";
        }else{
            return pay + "/" + payda;
        }
    }

    @Override
    public int compareTo(RasyonelSayi o) {

        if(this.cikar(o).pay > 0){
            return 1;
        }else if(this.cikar(o).pay < 0){
            return -1;
        }else{
            return 0;
        }
        
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + pay;
        result = prime * result + payda;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RasyonelSayi other = (RasyonelSayi) obj;
        if (pay != other.pay)
            return false;
        if (payda != other.payda)
            return false;
        return true;
    }
    

    

    
    
}
