import java.sql.Time;
import java.util.Date;

public class Wizyta {
    private String pacjentPesel;
    private String lekarzPesel;
    private String opis;
    private Date dataWizyty;
    private Time godzinaWizyty;

    public Wizyta(String pacjentPesel, String lekarzPesel, String opis, Date dataWizyty, Time godzinaWizyty) {
        this.pacjentPesel = pacjentPesel;
        this.lekarzPesel = lekarzPesel;
        this.opis = opis;
        this.dataWizyty = dataWizyty;
        this.godzinaWizyty = godzinaWizyty;
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

    public Date getDataWizyty() {
        return dataWizyty;
    }

    public void setDataWizyty(Date dataWizyty) {
        this.dataWizyty = dataWizyty;
    }

    public Time getGodzinaWizyty() {
        return godzinaWizyty;
    }

    public void setGodzinaWizyty(Time godzinaWizyty) {
        this.godzinaWizyty = godzinaWizyty;
    }

    @Override
    public String toString() {
        return "Wizyta{" +
                ", lekarzPesel='" + lekarzPesel + '\'' +
                ", opis='" + opis + '\'' +
                ", dataWizyty=" + dataWizyty +
                ", godzinaWizyty=" + godzinaWizyty +
                '}';
    }
}
