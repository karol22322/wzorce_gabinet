import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WizytaContainer {

	private List<Wizyta> wizyty;

	public WizytaContainer() {
		this.wizyty = new ArrayList<>();
		this.wizyty.add(new Wizyta("001","101", "Pacjenta boli głowa", Main.StringToDate("2020-12-18"), new Time(1300)));
		this.wizyty.add(new Wizyta("002","101", "Pacjenta boli noga", Main.StringToDate("2020-12-28"), new Time(2000)));
		this.wizyty.add(new Wizyta("001","201", "Goraczka", Main.StringToDate("2021-01-10"), new Time(1700)));
		this.wizyty.add(new Wizyta("002","201", "złamanie reki", Main.StringToDate("2020-01-15"), new Time(800)));
	}

	public void dodajWizyta(Wizyta wizyta){
		this.wizyty.add(wizyta);
	}

	public void usunWizyta(Wizyta wizyta){
		this.wizyty.remove(wizyta);
	}

	public List<Wizyta> getWizyty() {
		return wizyty;
	}
}