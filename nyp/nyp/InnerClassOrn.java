package nyp;

public class InnerClassOrn{
    public static void main(String[] args) {


        //baska bir sinifin icinden inner sinifa direkt erisemeyiz
        //ana sinif üzerinden erisebilir bunu da yapabilmek icin inner sinifin private olmamasi gerek

        AnaClass.InnerClass i = new AnaClass().new InnerClass();
        //System.out.println(i.privateinnerdegisken); privatea erisemedi
        System.out.println(i.protectedinnerdegisken); //digerlerine erisebilir

    }

    


}

class AnaClass {

    private int privateDegisken;

    //anasinifla inner sinif arasinda gizlilk yoktur birbirlerinin privatelarina da erisebilirler
    //yalnizca inner sinifin degiskenlerine erisebilmek icin nesne üretmek gerekir

    private void metot(){
       // System.out.println(privateinnerdegisken); alt siniftan nesne üretilmedigi icin erisemedi
       InnerClass i = new InnerClass();
       System.out.println(i.privateinnerdegisken); //simdi erisebilir
    }

   class InnerClass{

        private int privateinnerdegisken;
        protected int protectedinnerdegisken;

        private void yazdir(){

            

            System.out.println(privateDegisken); //inner clas üretildiği sinifin privatelarina erisebilir

        }

        
    }
    
}
