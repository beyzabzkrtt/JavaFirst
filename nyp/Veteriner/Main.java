package Veteriner;

public class Main {
    public static void main(String[] args) {
        
        ilkNesneleriOlustur();   //mainin ici karmasiklasmasin diye nesneleri burada olustur

        



        
    }

    private static void ilkNesneleriOlustur() {
        Kedi kedi1 = new Kedi("01-01-2016", true, "Van Kedisi");
        Kedi kedi2 = new Kedi("01-04-2016", false, "Siyam Kedisi");
        Kedi kedi3=new Kedi("05-05-2016", true, "Tekir");

        Kopek kopek1 = new Kopek("02-06-2018", true, 1,"Golden");
        Kopek kopek2 = new Kopek("02-76-2018", true, 2,"Dalmacyali");
        Kopek kopek3 = new Kopek("12-06-2018", true, 4,"Pitbull");

        Musteri m1 = new Musteri("emre", "123", "Ankara");
        Musteri m2 = new Musteri("beyza", "234", "Kayseri");
        Musteri m3 = new Musteri("esra", "345", "Sivas");

        Veteriner v1 = new Veteriner("ayse", "789", "Gazi",2);
        Veteriner v2 = new Veteriner("fatma", "879", "Marmara",4);
        Veteriner v3 = new Veteriner("nurdan", "978", "Ege",6);

       

        m1.musteriyeHayvanEkle(kedi1);
        m1.musteriyeHayvanEkle(kopek1);
        m2.musteriyeHayvanEkle(kopek1);

        v1.musteriEkle(m3);
        v1.musteriEkle(m2);
        v1.musterileriListele();

        SehirVeterinerlikleri ankara = new SehirVeterinerlikleri("Ankara");

        ankara.sehireVeterinerEkle(v1);
        ankara.sehireVeterinerEkle(v2);

        SehirVeterinerlikleri kayseri = new SehirVeterinerlikleri("Kayseri");

        kayseri.sehireVeterinerEkle(v3);

        ankara.sehirdekiVetSayisi();
        kayseri.sehirdekiVetSayisi();

        System.out.println("Yönetim Paneli");

        YonetimPaneli<Hayvan> hayvanyonetim = new YonetimPaneli<Hayvan>();
        hayvanyonetim.bilgileriGoster(kopek1);

        YonetimPaneli<Veteriner> veterineryonetim = new YonetimPaneli<Veteriner>();
        veterineryonetim.bilgileriGoster(v1);

        YonetimPaneli<Musteri> musteriyonetim = new YonetimPaneli<Musteri>();
        System.out.println(m1 + " nin hayvanlari:");
        musteriyonetim.sahipOlduguHayvanlariGoster(m1);


    }
    
}
