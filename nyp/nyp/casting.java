package nyp;

public class casting {

    public static void main(String[] args) {

        
        Hayvan x = new Kartal();

        ((Kartal)x).uc();

       
    }
    
}

class Hayvan{}

class Kartal extends Hayvan{

    public void uc(){
        System.out.println("ucuyorum");
    }
}