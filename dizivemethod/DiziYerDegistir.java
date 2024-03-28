public class DiziYerDegistir{

    public static void main(String[] args) {
        
        int sayilar[] = {1,2,3,4,5,6,7,8};

       
        diziKaristir(sayilar);
        diziYazdirr(sayilar);

    }

    public static void diziKaristir(int[] dizi){


        for(int i = dizi.length-1 ; i > 0 ; i--){

            int rastgeleIndex = (int)(Math.random() * (i+1));

            int gecici = dizi[i];
            dizi[i] = dizi[rastgeleIndex];
            dizi[rastgeleIndex]= gecici;

        }
    }

    public static void diziYazdirr(int[] dizi){
        for (int i : dizi){
            System.out.print(i + ", ");
        }
    }
    
}
