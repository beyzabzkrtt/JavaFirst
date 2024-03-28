package nyp;

public class AnonymusInnerClass {
    public static void main(String[] args) {

        X nesne = new X() {
            
         
            @Override
            public void interfaceMetot() {
                System.out.println("interfaceden geldim");
            }
        };

        nesne.interfaceMetot();

        
        
    
    }
}

interface X {
    void interfaceMetot();
}
