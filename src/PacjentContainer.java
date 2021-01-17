import java.util.ArrayList;
import java.util.List;

public class PacjentContainer {

	private List<Pacjent> pacjenci;

	public PacjentContainer() {
		this.pacjenci = new ArrayList<>();
	}

	public void dodajPacjenta( Pacjent pacjent){
		this.pacjenci.add(pacjent);
	}

	public List<Pacjent> getPacjenci() {
		return pacjenci;
	}
}