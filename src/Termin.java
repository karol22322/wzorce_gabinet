import java.sql.Time;
import java.util.Date;

public class Termin {
    private String pacjentPesel;
    private String lekarzPesel;
    private String opis;
    private Date dataTerminu;
    private Time godzinaTerminu;

    public Termin(String pacjentPesel, String lekarzPesel, String opis, Date dataTerminu, Time godzinaTerminu) {
        this.pacjentPesel = pacjentPesel;
        this.lekarzPesel = lekarzPesel;
        this.opis = opis;
        this.dataTerminu = dataTerminu;
        this.godzinaTerminu = godzinaTerminu;
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

    public Date getDataTerminu() {
        return dataTerminu;
    }

    public void setDataTerminu(Date dataTerminu) {
        this.dataTerminu = dataTerminu;
    }

    public Time getGodzinaTerminu() {
        return godzinaTerminu;
    }

    public void setGodzinaTerminu(Time godzinaTerminu) {
        this.godzinaTerminu = godzinaTerminu;
    }
}
