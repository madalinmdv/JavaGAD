package lab2_codechallange2;

public class Studio {
    private String nume;
    private Film[] film;
    public  Studio(String nume,Film[] film){
        this.nume= nume;
        this.film= film;
    }
    public String getNume() {
        return nume;
    }

    public Film[] getFilm() {
        return film;
    }
}
