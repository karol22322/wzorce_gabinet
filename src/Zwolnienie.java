import java.util.Date;

public class Zwolnienie {
    private String pacjentPesel;
    private String lekarzPesel;
    private String opis;
    private Date dataWystawienia;
    private Date dataRozpoczecia;
    private Date dataZakonczenia;

    public Zwolnienie(String pacjentPesel, String lekarzPesel, String opis, Date dataWystawienia, Date dataRozpoczecia, Date dataZakonczenia) {
        this.pacjentPesel = pacjentPesel;
        this.lekarzPesel = lekarzPesel;
        this.opis = opis;
        this.dataWystawienia = dataWystawienia;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataZakonczenia = dataZakonczenia;
    }

    public String getPacjentPesel() {
        return pacjentPesel;
    }

    public void setPacjentPesel(String pacjentPesel) {
        this.pacjentPesel = pacjentPesel;
    }

    public String getLekarzPesel() {
        return lekarzPesel;
    }

    public void setLekarzPesel(String lekarzPesel) {
        this.lekarzPesel = lekarzPesel;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public Date getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(Date dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public Date getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(Date dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
    }

    @Override
    public String toString() {
        return "Zwolnienie{" +
                "pacjentPesel='" + pacjentPesel + '\'' +
                ", lekarzPesel='" + lekarzPesel + '\'' +
                ", opis='" + opis + '\'' +
                ", dataWystawienia=" + dataWystawienia +
                ", dataRozpoczecia=" + dataRozpoczecia +
                ", dataZakonczenia=" + dataZakonczenia +
                '}' + "\n";
    }
}
