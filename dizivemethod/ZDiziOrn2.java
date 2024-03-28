public class ZDiziOrn2 {
    public static void main(String[] args) {
        //her elemani rastgele olusturulmus 3*2 lik matris olustur
        //elemanlari topla
        //en buyuk ve en kucuk elemani yazdir

        int dizi [][] = new int[3][2];

        int minsayi=10,maxsayi=0;

        int temp=0;

        for(int satir = 0 ; satir<dizi.length;satir++ ){

            for(int sutun = 0 ; sutun < dizi[satir].length; sutun++){

                dizi[satir][sutun] = (int) (Math.random()*10);

                temp+=dizi[satir][sutun];
                System.out.println(temp);

                if(minsayi>dizi[satir][sutun]){
                    minsayi=dizi[satir][sutun];
                }
                if(maxsayi<dizi[satir][sutun]){
                    maxsayi=dizi[satir][sutun];
                }



            }
        }

        double ortalama = temp/6.0;

        System.out.println("ortalama: " + ortalama);

        System.out.println("min sayi: " + minsayi + "max sayi: " + maxsayi);



        


    }
    
}
