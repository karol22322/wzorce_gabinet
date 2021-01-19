import java.util.ArrayList;
import java.util.List;

public class LekarzContainer {
	private List<Lekarz> lekarze;

	public LekarzContainer() {
		this.lekarze = new ArrayList<>();
		this.lekarze.add(new Lekarz("Tomek","Lekarski", "003", "4634", "admin", "Ortopeda"));
		this.lekarze.add(new Lekarz("Wojtek","Doktorant", "004", "4634", "admin", "Chirurg"));
	}

	public void dodajLekarza( Lekarz lekarz){
		this.lekarze.add(lekarz);
	}

	public List<Lekarz> getLekarze() {
		return lekarze;
	}
}