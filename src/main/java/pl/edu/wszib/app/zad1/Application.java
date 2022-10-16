package pl.edu.wszib.app.zad1;

public class Application {

    public static void main(String[] args) {

        KoktajlTruskawkowy k = new KoktajlTruskawkowy(10, RodzajTruskawki.ANANASOWA);

        k.pij();
        System.out.println(k.smak());

    }
}