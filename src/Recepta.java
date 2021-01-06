import java.util.Date;

public class Recepta {
    private String pacjentPesel;
    private String lekarzPesel;
    private String lekarstwo;
    private Date dataWystawienia;

    public Recepta(String pacjentPesel, String lekarzPesel, String lekarstwo, Date dataWystawienia) {
        this.pacjentPesel = pacjentPesel;
        this.lekarzPesel = lekarzPesel;
        this.lekarstwo = lekarstwo;
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

    public String getLekarstwo() {
        return lekarstwo;
    }

    public void setLekarstwo(String lekarstwo) {
        this.lekarstwo = lekarstwo;
    }

    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }
}
