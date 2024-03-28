package nyp;

public class ParseInt {

    public static void main(String[] args) {
       
        String x ="56";
        System.out.println(Integer.parseInt(x)+4);
    }
    
}

class BB{
    static int x;
    static int y;
    static int topla(int x,int y ){
        return x+y;

    }
}

class CC{

    public void toplama(){
        System.out.println(BB.topla(3,4));
    }

    public void yazdir(){
        System.out.println(BB.x);
    }
}
