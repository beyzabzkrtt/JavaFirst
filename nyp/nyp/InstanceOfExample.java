package nyp;

public class InstanceOfExample {
    public static void main(String[] args) {

        Animal animal = new Dog();

        if (animal instanceof Dog) {
            System.out.println("Bu nesne bir Dog sınıfının örneğidir.");
        
        //  else if (animal instanceof Cat) {
        //     System.out.println("Bu nesne bir Cat sınıfının örneğidir.");
        } else  {
            System.out.println("Bu nesne Hayvan sınıfının bir örneğidir.");
        }
    }

}

    
class Animal {

}

class Cat extends Animal{

}

class Dog extends Animal{

}


