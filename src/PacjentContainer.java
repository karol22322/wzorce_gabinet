import java.util.ArrayList;
import java.util.List;

public class PacjentContainer {

	private List<Pacjent> pacjenci;

	public PacjentContainer() {
		this.pacjenci = new ArrayList<>();
		this.pacjenci.add(new Pacjent("Jan","Kowalski", "001", "252342", "admin", "adres1",  100.33, true));
		this.pacjenci.add(new Pacjent("Adam","Nowak", "002", "4634", "admin", "adres2",  50.33, false));
	}

	public void dodajPacjenta( Pacjent pacjent){
		this.pacjenci.add(pacjent);
	}

	public List<Pacjent> getPacjenci() {
		return pacjenci;
	}
}