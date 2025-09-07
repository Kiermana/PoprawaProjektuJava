import java.util.ArrayList;

public class Biblioteka {
    private ArrayList<Gra> gras = new ArrayList<>();
    private ArrayList<Uzytkownik> uzytkowniks = new ArrayList<>();
    private ArrayList<Wypozyczalnia> wypozyczalnias = new ArrayList<>();

    public void DodajGre(Gra gra) {
        gras.add(gra);
    }
    public void DodajUzytkownika(Uzytkownik uzytkownik){
        uzytkowniks.add(uzytkownik);
    }

    public ArrayList<Gra> getGras() {
        return gras;
    }

    public ArrayList<Uzytkownik> getUzytkowniks() {
        return uzytkowniks;
    }

    public void WypozyczenieGry(int IdUzytkownika, int IdGry){
        try{
            Uzytkownik uzytkownik = uzytkowniks.get(IdUzytkownika);
            Gra gra = gras.get(IdGry);
            wypozyczalnias.add(new Wypozyczalnia(uzytkownik, gra));
            System.out.println("Wypozyczono: "+gra.getTytul());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Podano nieprawidłowe ID uzytkownika lub gry.");
        }
    }
    public void ListaGier(){
        for (Wypozyczalnia i : wypozyczalnias){
            System.out.println(i);
        }
    }
}
