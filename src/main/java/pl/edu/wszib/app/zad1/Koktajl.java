package pl.edu.wszib.app.zad1;

public abstract class Koktajl implements Jadalne, Pijalne {

    @Override
    public void jedz() {
        pij();
    }

}
