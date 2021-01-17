public abstract class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String nrTel;
    private String haslo;

    public Osoba(String imie, String nazwisko, String pesel, String nrTel, String haslo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.nrTel = nrTel;
        this.haslo = haslo;
    }

    public abstract void anulujWizyte();

    public abstract void ustawWizyte();

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", nrTel='" + nrTel + '\'' +
                '}';
    }
}
