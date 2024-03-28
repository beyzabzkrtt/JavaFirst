package nyp;

public class MyClass {
    static int staticVariable;

    {
        staticVariable = 42;
        System.out.println("Instance initialization block: " + staticVariable);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(); // Bu satır çalıştığında instance initialization block çalışır
        MyClass obj2 = new MyClass(); // Bu satır çalıştığında instance initialization block çalışmaz

        System.out.println("Static variable value: " + staticVariable);
    }
}