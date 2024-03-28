public class BinarySearch {
    //binary search için dizi sirali olmali

    public static void main(String[] args) {

        int[] sayilar = {1,2,3,4,5,6,7,78,90};

        int sonuc = binarySearch(sayilar,5);

        System.out.println("sonuc : " + sonuc);

    }

    public static int binarySearch(int[] dizi , int sayi){

        int yuksekIndex=dizi.length-1;
        int dusukIndex = 0;

         

        while (yuksekIndex>=dusukIndex){

           int ortaIndex = (dusukIndex+yuksekIndex)/2;


            if(sayi>dizi[ortaIndex]){
                dusukIndex=ortaIndex+1;

            }else if (sayi == dizi[ortaIndex] ){
                return ortaIndex;
            }else {
                yuksekIndex=ortaIndex-1;
            }

         
        }
        return -dusukIndex-1;


    }


}