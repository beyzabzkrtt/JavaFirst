public class SelecitonSort {
    public static void main(String[] args) {
        
        int dizi[]={3,2,7,4,9,6};

        

        for(int i =0; i<dizi.length-1;i++){

            int minSayi=dizi[i]; // ilk elemanı en kücük kabul et
            int minIndex=i;

            for(int j =i+1; j<dizi.length;j++ ){

                if(minSayi>dizi[j]){

                    minSayi=dizi[j];
                    minIndex=j;

                }


            }

            if(minIndex != i){

                dizi[minIndex]=dizi[i];
                dizi[i]=minSayi;
            }

            



        }


        for(int i : dizi){

            System.out.print(i +" ");
        }



    }
    
}
