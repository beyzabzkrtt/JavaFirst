public class ZDiziOrn3 {

    public static void main(String[] args) {

        //iskambil destesi olustur
        //kartlari kar ve desteyi yazdir

        String kartTuru[] = {"Maca","Karo","Kupa","Sinek"};
        String kartlarSayi[] = {"As","2","3","4","5","6","7","8","9","10","J","Q","K"};
        
        int deste[] = new int[52];

        olustur(deste);
        
        desteKaristir(deste);

        diziYazdir(deste,kartTuru,kartlarSayi);

        
    }

    public static void desteKaristir(int[] deste) {

        for (int i = 0; i< deste.length ;i++ ){

            int index = (int)(Math.random()*deste.length-1);

            int gecici = deste[index];
            deste[index] = deste[i];
            deste[i]= gecici;
        }
    }

    public static void diziYazdir(int[] deste, String[] kartTuru, String[] kartlarSayi) {

        for(int i = 0 ; i < deste.length;i++){

            String yazilacakKartTuru = kartTuru[deste[i]/13];
            String yazilacakKartSayi = kartlarSayi[deste[i]%13];

            System.out.println(yazilacakKartTuru + " " + yazilacakKartSayi);

           
        }

    }

    public static void olustur(int[] deste) {

        for(int i =0; i<deste.length;i++){

            deste[i]= i;
        }
        


    }
    
}
