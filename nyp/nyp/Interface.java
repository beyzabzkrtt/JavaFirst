package nyp;

public class Interface {
    public static void main(String[] args) {

        MuslumBaba muslum = new MuslumBaba();
        muslum.sahnedeSigaraIc();

        //nesne uretmek icin PopSarkiciOzellikleri p = new PopSarkiciOzellikleri diyemezsin

        PopSarkiciOzellikleri hadise = new Hadise();
        PopSarkiciOzellikleri tarkan = new Tarkan();

        //ayni interfacei implemets etmis birbiriyle alakasi olmayan iki sinif ayni tipte toplandi

        PopSarkiciOzellikleri dizi[] = new PopSarkiciOzellikleri[2];
        dizi[0]= hadise;
        dizi[1]=tarkan;

        
    }
    
}

abstract class Sarkici{
    abstract void sarkiSoyle();
}
interface ArabeskSarkiciOzellikleri{
   void sahnedeSigaraIc();
}
interface PopSarkiciOzellikleri{
    void dansEt();
}



class ArabeskSarkici extends Sarkici{
    @Override
    void sarkiSoyle() {
        System.out.println("Arabesk sarkici sarki soyluyor");
    }
    
}
class PopSarkici extends Sarkici{
    @Override
    void sarkiSoyle() {
        System.out.println("Pop sarkici sarki soyluyo");
   
}
}

class MuslumBaba implements ArabeskSarkiciOzellikleri,PopSarkiciOzellikleri{
    @Override
    public void sahnedeSigaraIc() {
        System.out.println("Arabesk sarkici sahnede sigara iciyor");
    }

    @Override
    public void dansEt() {
        System.out.println("Pop sarkici sahnede dans ediyor");
    }

}

class Hadise implements PopSarkiciOzellikleri{
    @Override
    public void dansEt() {
        System.out.println("Pop sarkici sahnede dans ediyor");
    }
}

class Tarkan implements PopSarkiciOzellikleri{
    @Override
    public void dansEt() {
        System.out.println("Pop sarkici sahnede dans ediyor");
    }
}