public class Lekarz extends Osoba {
    private String specjalizacja;

    public Lekarz(String imie, String nazwisko, String pesel, String nrTel, String haslo, String specjalizacja) {
        super(imie, nazwisko, pesel, nrTel, haslo);
        this.specjalizacja = specjalizacja;
    }

    public void wystawRecepte() {

    }

    public void wystawZwolnienie() {

    }

    @Override
    public void anulujWizyte() {

    }

    @Override
    public void ustawWizyte() {

    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    @Override
    public String toString() {
        return "Lekarz{" +
                "specjalizacja='" + specjalizacja + '\'' +
                "} " + super.toString();
    }
}
