public class Wypozyczalnia {
    private Uzytkownik uzytkownik;
    private Gra gra;

    public Wypozyczalnia(Uzytkownik uzytkownik, Gra gra) {
        this.uzytkownik = uzytkownik;
        this.gra = gra;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public Gra getGra() {
        return gra;
    }

    @Override
    public String toString() {
        return uzytkownik.getNazwa()+"Wypozyczyl gre: "+gra.getTytul();
    }
}
