import java.util.Date;

public class Recepta {
    private String pacjentPesel;
    private String lekarzPesel;
    private String lekarstwa;
    private Date dataWystawienia;

    public Recepta(String pacjentPesel, String lekarzPesel, String lekarstwa, Date dataWystawienia) {
        this.pacjentPesel = pacjentPesel;
        this.lekarzPesel = lekarzPesel;
        this.lekarstwa = lekarstwa;
        this.dataWystawienia = dataWystawienia;
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

    public String getLekarstwa() {
        return lekarstwa;
    }

    public void setLekarstwa(String lekarstwa) {
        this.lekarstwa = lekarstwa;
    }

    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }
}
