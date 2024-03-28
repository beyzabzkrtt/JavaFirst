public class TypeCasting {
    public static void main(String[] args) {
        
        int a = 5;
        double b = 6.666;

        a = (int)b ;

        System.out.println(a);
        System.out.println(b);

           /* b yi 5. satırda veya başka yerde integer yapamayız
           double tanımlı
           aslında b yi hiç değiştirmiyoruz 
           a yı b nin integer haline eşitliyoruz
           b sabit kalıyo */ 
           

           int c = 7;
           String d = "150";

           
           c=Integer.valueOf(d);
   
           System.out.println(c);
   
           /* valueOf() ve parseOf methodları da dönüşüm yapar */
   
           double ortalama;
           ortalama = (1+2)/2;
           System.out.println(ortalama);
   
           // sonuç 1.5 olmasına rağmen 1 çıkar 
           // integer değeri integer değere bölersen
           // sonucu double da tanımlasan int değer çıkar 
   
           double ortalama2;
           ortalama2 = (1+2)/2d;
           System.out.println(ortalama2);
   
           // burda sonuc doğru geldi
           // (1d+2d) ya da 1.0 2.0 ya da ((double)1+2) gibi yazarsak sonuc doğru gelir
           //sadece bir tarafı double göstermemiz de yeterli   


           //(double)(6/4) işleminin sonucu 1.5 iken 1 görürüz 
           //sebebi (6/4) 1.5 iken integer olduğu için 1 alınır 
           // 1 değerini double yaptığında yine 1 dir
           // ((double)6/4) gibi içerden yapmalıyız
    }
}
