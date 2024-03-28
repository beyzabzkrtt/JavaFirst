package Veteriner;

public class YonetimPaneli <T>{

    public void bilgileriGoster(T nesne){

        System.out.println(nesne);

    }

    public <T extends Musteri>void sahipOlduguHayvanlariGoster(T musteri){
       musteri.musteriHayvanlarıGoster();

       // T extends musteri dedigimiz icin musteri.musteriHayvanlari.Goster e erisebildik
       //demeseydik casting yapmamız gerekirdi
    }


    
}
