public class diziesleme {
    public static void main(String[] args) {
        
        int dizi [] = {1,2,3};
        int yenidizi[] = new int [dizi.length];

        // diziyle aynı boyutta ama içi bos

        yenidizi = dizi;

        dizi[0]= 4 ;

        for(int i : yenidizi){
            System.out.println(i);
        }

        // yenidizi = dizi dediğimizde kopyalama yapmadık 
        //yenidizi de dizinin referansındaki adrese bağlanmış oldu
        //yani artık aynı veriyi gösteriyolar



    }
    
}
