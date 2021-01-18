import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class DokumentContainer {
    private final List<Recepta> recepty;
    private final List<Zwolnienie> zwolnienia;

    public DokumentContainer() {
        this.recepty = new ArrayList<>();
         this.recepty.add(new Recepta("001", "101", "jakies lekarstwo, 3 dawki na dzien", Main.StringToDate("2000-01-01")));
         this.recepty.add(new Recepta("002", "101", "jakies lekarstwo2, 2 dawki na dzien", Main.StringToDate("2001-02-02")));
         this.recepty.add(new Recepta("001", "102", "jakies lekarstwo3, 1 dawki na dzien", Main.StringToDate("2002-03-03")));
         this.recepty.add(new Recepta("002", "102", "jakies lekarstwo4, 0.5 dawki na dzien", Main.StringToDate("2003-04-04")));

        this.zwolnienia = new ArrayList<>();
        this.zwolnienia.add(new Zwolnienie("001", "101", "jakies lekarstwo, 3 dawki na dzien",  Main.StringToDate("2020-12-18"), Main.StringToDate("2020-12-19"), Main.StringToDate("2021-01-18")));
        this.zwolnienia.add(new Zwolnienie("002", "101", "jakies lekarstwo2, 2 dawki na dzien", Main.StringToDate("2020-11-18"), Main.StringToDate("2020-11-18"), Main.StringToDate("2021-01-29")));
        this.zwolnienia.add(new Zwolnienie("001", "102", "jakies lekarstwo3, 1 dawki na dzien", Main.StringToDate("2021-01-18"), Main.StringToDate("2021-01-18"), Main.StringToDate("2021-02-18")));
        this.zwolnienia.add(new Zwolnienie("002", "102", "jakies lekarstwo4, 0.5 dawki na dzien", Main.StringToDate("2021-01-10"), Main.StringToDate("2021-01-18"), Main.StringToDate("2021-03-18")));
    }

    public List<Recepta> getReceptyByLekarz(String pesel) {
        return recepty.stream()
                .filter(recepta -> recepta.getLekarzPesel().equals(pesel))
                .collect(Collectors.toList());
    }

    public List<Recepta> getReceptyByPacjent(String pesel) {
        return recepty.stream()
                .filter(recepta -> recepta.getPacjentPesel().equals(pesel))
                .collect(Collectors.toList());
    }

    public List<Zwolnienie> getZwolnieniaByLekarz(String pesel) {
        return zwolnienia.stream()
                .filter(zwolnienie -> zwolnienie.getLekarzPesel().equals(pesel))
                .collect(Collectors.toList());
    }

    public List<Zwolnienie> getZwolnieniaByPacjent(String pesel) {
        return zwolnienia.stream()
                .filter(zwolnienie -> zwolnienie.getPacjentPesel().equals(pesel))
                .collect(Collectors.toList());
    }

    public void dodajRecepte(Recepta recepta) {
        this.recepty.add(recepta);
    }

    public void dodajZwolnienie(Zwolnienie zwolnienie) {
        this.zwolnienia.add(zwolnienie);
    }


}
