package pl.edu.wszib.app.zad1;

public class KoktajlTruskawkowy extends KoktajlSmakowy{

    private final RodzajTruskawki rodzajTruskawki;

    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki){
        super(kcal, RodzajSmaku.TRUSKAWKOWY);
        this.rodzajTruskawki = rodzajTruskawki;
    };

    @Override
    public void pij(){
        System.out.println("Pije koktajl o smaku " + smak() + ", ktore cechuje sie " + rodzajTruskawki.cecha() + ".");
    }

    @Override
    public RodzajSmaku smak(){
        return super.smak();
    }
}