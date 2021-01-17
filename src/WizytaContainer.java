import java.util.ArrayList;
import java.util.List;

public class WizytaContainer {

	private List<Wizyta> wizyty;

	public WizytaContainer() {
		this.wizyty = new ArrayList<>();
	}

	public void dodajWizyta(Wizyta wizyta){
		this.wizyty.add(wizyta);
	}

	public List<Wizyta> getWizyty() {
		return wizyty;
	}
}