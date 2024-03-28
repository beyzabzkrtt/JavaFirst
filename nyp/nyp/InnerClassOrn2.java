package nyp;

public class InnerClassOrn2 {
    public static void main(String[] args) {

        A.B.C x = new A().new B().new C();
        x.metotC();
        //x.metotB() ye erisemedi

        A.B y = new A().new B();
        y.metotB();
        //b.metotC(); erisemedi

        y.new C().metotC(); //seklinde erisebiliriz

        A.B.C c = y.new C();
        c.metotC();




        //siniflarin dosyalari class B icin A$B class C icin A$B$C adlariyla tutulur


        
    }
    
}

class A{

    class B{

        void metotB(){

        }

        class C{

            void metotC(){

            }
        }
    }
}
