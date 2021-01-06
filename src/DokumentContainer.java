import java.util.ArrayList;
import java.util.List;

public class DokumentContainer {
    private List<Recepta> recepty;
    private List<Zwolnienie> zwolnienia;

    public DokumentContainer() {
        this.recepty = new ArrayList<>();
        this.zwolnienia = new ArrayList<>();
    }

    public List<Recepta> getReceptyByLekarz(String pesel) {
        return recepty;
    }

    public List<Recepta> getReceptyByPacjent(String pesel) {
        return recepty;
    }

    public List<Zwolnienie> getZwolnieniaByLekarz(String pesel) {
        return zwolnienia;
    }

    public List<Zwolnienie> getZwolnieniaByPacjent(String pesel) {
        return zwolnienia;
    }

    public void dodajRecepte( Recepta recepta){
        this.recepty.add(recepta);
    }

    public void dodajZwolnienie( Zwolnienie zwolnienie){
        this.zwolnienia.add(zwolnienie);
    }


}
