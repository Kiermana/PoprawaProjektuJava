public class Gra {
    private int id;
    private String tytul;
    private String gatunek;
    private String wydawca;

    public Gra(int id, String tytul, String gatunek) {
        this.id = id;
        this.tytul = tytul;
        this.gatunek = gatunek;
        this.wydawca="Nieznany";
    }

    public Gra(int id, String tytul, String gatunek, String wydawca) {
        this.id = id;
        this.tytul = tytul;
        this.gatunek = gatunek;
        this.wydawca = wydawca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getWydawca() {
        return wydawca;
    }

    public void setWydawca(String wydawca) {
        this.wydawca = wydawca;
    }

    @Override
    public String toString() {
        return "Gra{" +
                "id=" + id +
                ", tytul='" + tytul + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", wydawca='" + wydawca + '\'' +
                '}';
    }
}
