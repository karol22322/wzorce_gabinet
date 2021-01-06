import java.util.ArrayList;
import java.util.List;

public class LekarzContainer {
	private List<Lekarz> lekarze;

	public LekarzContainer() {
		this.lekarze = new ArrayList<>();
	}

	public void dodajLekarza( Lekarz lekarz){
		this.lekarze.add(lekarz);
	}

}