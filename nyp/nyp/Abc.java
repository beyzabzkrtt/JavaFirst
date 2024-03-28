package nyp;

public class Abc {
    public static void main(String[] args) {

        System.out.println(Beyza.x);
        System.out.println(Beyza.Nur.y);
        System.out.println(Beyza.x);

    }

}

class Beyza {
    static int x = 122;

    static class Nur {
        static int y = x++;
    }
}
