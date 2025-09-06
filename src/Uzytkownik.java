public class Uzytkownik {
    private int id;
    private String nazwa;

    public Uzytkownik(int id, String nazwa) {
        this.id = id;
        this.nazwa = nazwa;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return "Uzytkownik{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
