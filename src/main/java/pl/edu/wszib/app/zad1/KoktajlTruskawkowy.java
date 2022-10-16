package pl.edu.wszib.app.zad1;

public class KoktajlTruskawkowy extends Koktajl implements Smakowalne {
    @Override
    public void pij() {
        System.out.println("Pije koktajl");
    }

    @Override
    public void smak() {
        System.out.println("Truskawkowy");
    }
}
