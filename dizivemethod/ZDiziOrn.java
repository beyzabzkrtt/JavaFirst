public class ZDiziOrn {
    public static void main(String[] args) {
        //100 elemanlı bir dizi oluştur,rastgele elemanlarla doldur
        //elemanların ortalamasını hesapla ve yazdır
        //ortalamadan kucuk kac adet eleman var sayısını yazdır

        int dizi[] = new int[100];

        for(int i = 0 ; i<dizi.length ; i++){

            dizi[i] = (int)(Math.random()*100);

            //ortalama bulmak için sayıları burada da toplayabilirsin 
            //ayrı bir for yazmana gerek yok
            

        }

        int temp=0;
        for(int i = 0 ; i < dizi.length;i++){
            
            temp+=dizi[i];
            
        }
        

        double sonuc=temp/100.0;

        System.out.println(sonuc);

        int count = 0;

        for(int i=0;i<dizi.length;i++){

            if(dizi[i] < sonuc){
                count++;
            }
        }

        System.out.println("ortalamadan küçük eleman sayisi: " + count);





    


    }

    
}
