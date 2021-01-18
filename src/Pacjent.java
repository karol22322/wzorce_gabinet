public class Pacjent extends Osoba {

    private String adres;
    private double saldo;
    private boolean ubezpieczenie;

    public Pacjent(String imie, String nazwisko, String pesel, String nrTel, String haslo, String adres, double saldo, boolean ubezpieczenie) {
        super(imie, nazwisko, pesel, nrTel, haslo);
        this.adres = adres;
        this.saldo = saldo;
        this.ubezpieczenie = ubezpieczenie;
    }

    public void printSaldo() {
        System.out.println("Towje saldo: " + saldo + "zl");
    }

    public void plusSaldo(float kwota) {
        this.saldo += kwota;
    }

    public void minusSaldo(float kwota) {
        if (kwota > saldo) {
            System.out.println("Za mało środków na koncie");
        } else {
            this.saldo -= kwota;
        }
    }

    @Override
    public void anulujWizyte() {

    }

    @Override
    public void ustawWizyte() {

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isUbezpieczenie() {
        return ubezpieczenie;
    }

    public void setUbezpieczenie(boolean ubezpieczenie) {
        this.ubezpieczenie = ubezpieczenie;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Pacjent{" +
                "adres='" + adres + '\'' +
                "} " + super.toString();
    }
}