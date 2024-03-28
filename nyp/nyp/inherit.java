package nyp;

public class inherit {
    public static void main(String[] args) {

        
        
        Dikdortgen d1 = new Dikdortgen(5,5 , 2);
        System.out.println(d1.toString());
        System.out.println(d1.carp(5,5));
        
    }
    
}

class sekil{
    private int en;
    private int boy;

    public sekil(){
        System.out.println("sekil olusturuldu");
    }

   

    
    public void setEn(int en){
        this.en=en;
    }

    public void setBoy(int boy){
        this.boy=boy;
    }

    public int carp(int en,int boy){
        return en*boy;
    }

    @Override
    public String toString() {
        
        return "en: " + en + "boy: " + boy;
    }
}

class Dikdortgen extends sekil{

    int kosegen;
    public Dikdortgen(int en , int boy,int kosegen){
        System.out.println("dikdortgen olusturuldu");
        setEn(en);
        setBoy(boy);
        this.kosegen=kosegen;
        
    }

    

    @Override
    public String toString() {
        
        return "kosegen: " + kosegen;
    }
}
