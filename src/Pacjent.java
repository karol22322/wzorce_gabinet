public class Pacjent extends Osoba {

    private float saldo;
    private boolean ubezpieczenie;

    public Pacjent(String imie, String nazwisko, String adres, String pesel, String nrTel, String haslo, float saldo, boolean ubezpieczenie) {
        super(imie, nazwisko, adres, pesel, nrTel, haslo);
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

    public float getSaldo() {
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


}