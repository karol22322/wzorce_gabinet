import java.util.ArrayList;
import java.util.List;

public class PajentContainer {

	private List<Pacjent> pacjenci;

	public PajentContainer() {
		this.pacjenci = new ArrayList<>();
	}

	public void dodajPacjenta( Pacjent pacjent){
		this.pacjenci.add(pacjent);
	}

}