import java.util.ArrayList;
import java.util.List;

public class TerminContainer {

	private List<Termin> terminy;

	public TerminContainer(List<Termin> terminy) {
		this.terminy = new ArrayList<>();
	}

	public void dodajTermin( Termin termin){
		this.terminy.add(termin);
	}
}