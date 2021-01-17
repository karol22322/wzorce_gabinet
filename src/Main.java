import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Scanner keyboard;
    private static final LekarzContainer lekarze = new LekarzContainer();
    private static final PacjentContainer pacjenci = new PacjentContainer();
    private static final WizytaContainer wizyty = new WizytaContainer();
    private static final DokumentContainer dokumnety = new DokumentContainer();

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        start();
    }

    static void start() {
        System.out.println("----MENU----\n");
        System.out.println("1. Logowanie.");
        System.out.println("2. Zaloz konto.\n");
        System.out.println("Podaj numer komendy.\n");

        int wybor = keyboard.nextInt();


        switch (wybor) {
            case 1:
                logowanie();
                break;
            case 2:
//                zalozKonto();
                break;
            default:
                System.out.println("Bledny numer komendy!! Wpisz ponownie.");
                start();
        }

    }

    static void logowanie() {
        System.out.println("----Logowanie----\n");
        System.out.println("Podaj pesel: ");
        String pesel = keyboard.next();
        System.out.println("Podaj haslo: ");
        String password = keyboard.next();

        Optional<Pacjent> pacjent = pacjenci.getPacjenci().stream()
                .filter(pac -> pac.getPesel().equals(pesel))
                .findAny();

        Optional<Lekarz> lekarz = lekarze.getLekarze().stream()
                .filter(lek -> lek.getPesel().equals(pesel))
                .findAny();


        if (pacjent.isPresent()) {
            if (pacjent.get().getHaslo().equals(password)) {
                menuGlowne(pacjent.get().getPesel(), false);
            } else {
                System.out.println("Błędne hasło. Spróbuj jeszcze raz.");
            }
        } else if (lekarz.isPresent()) {
            if (lekarz.get().getHaslo().equals(password)) {
                menuGlowne(lekarz.get().getPesel(), true);
            } else {
                System.out.println("Błędne hasło. Spróbuj jeszcze raz.");
            }
        } else {
            System.out.println("Brak użytkownika o takim loginie. Spróbuj jeszcze raz.");
        }
        logowanie();
    }

    static void menuGlowne(String pesel, boolean isLekarz) {

        System.out.println("----Logowanie----\n");
        System.out.println("1. Wyswietl swoje dane.");
        System.out.println("2. Wyswietl moje wizyty.");
        System.out.println("3. Zaplanuj wizyte.");
        System.out.println("4. Odwołaj wizyte.");
        if (isLekarz) {
            System.out.println("5. Wystaw recepte.");
            System.out.println("6. Wystaw zwolnienie.");
        } else {
            System.out.println("5. Pokaż saldo.");
            System.out.println("6. Sprawdź ubezpiecznie.");
        }
        System.out.println("\nPodaj numer komendy.\n");

        int wybor = keyboard.nextInt();

        if (isLekarz) {
            Lekarz lekarz = lekarze.getLekarze().stream()
                    .filter(lek -> lek.getPesel().equals(pesel))
                    .findAny().orElseThrow(NullPointerException::new);

            switch (wybor) {
                case 1:
                    System.out.println(lekarz.toString());
                    break;
                case 2:
                    List<Wizyta> wizytyLekarza = wizyty.getWizyty().stream()
                            .filter(ter -> ter.getLekarzPesel().equals(pesel))
                            .collect(Collectors.toList());
                    if (!wizytyLekarza.isEmpty()) {
                        System.out.println(Arrays.toString(wizytyLekarza.toArray()));
                    } else {
                        System.out.println("Nie posiadasz żadnych wizyt.");
                    }
                    break;
                case 3:
                    dodajWizyte(pesel, isLekarz);
                    break;
                case 4:
                    usunWizyte(pesel, isLekarz);
                    break;
                case 5:
                    wystawRecepte(pesel);
                    break;
                case 6:
                    wystawZwolnienie(pesel);
                    break;
                default:
                    System.out.println("Bledny numer komendy!! Wpisz ponownie.");
                    break;
            }
            menuGlowne(pesel, isLekarz);
        } else {
            Pacjent pacjent = pacjenci.getPacjenci().stream()
                    .filter(pac -> pac.getPesel().equals(pesel))
                    .findAny().orElseThrow(NullPointerException::new);

            switch (wybor) {
                case 1:
                    System.out.println(pacjent.toString());
                    break;
                case 2:
                    List<Wizyta> wizytyPacjenta = wizyty.getWizyty().stream()
                            .filter(ter -> ter.getPacjentPesel().equals(pesel))
                            .collect(Collectors.toList());
                    if (!wizytyPacjenta.isEmpty()) {
                        System.out.println(Arrays.toString(wizytyPacjenta.toArray()));
                    } else {
                        System.out.println("Nie posiadasz żadnych wizyt.");
                    }
                    break;
                case 3:
                    dodajWizyte(pesel, isLekarz);
                    break;
                case 4:
                    usunWizyte(pesel, isLekarz);
                    break;
                case 5:
                    System.out.println(pacjent.getSaldo());
                    break;
                case 6:
                    if (pacjent.isUbezpieczenie()) {
                        System.out.println("Jesteś ubezpieczony.");
                    } else {
                        System.out.println("Nie jesteś ubezpieczony.");
                    }
                    break;
                default:
                    System.out.println("Bledny numer komendy!! Wpisz ponownie.");
                    break;
            }
            menuGlowne(pesel, isLekarz);
        }

    }

    private static void dodajWizyte(String pesel, boolean isLekarz) {
        System.out.println("----Nowa wizyta----\n");
        System.out.println(isLekarz ? "Podaj pesel pacjenta: " : "Podaj pesel lekarza: ");
        String drugiPesel = keyboard.next();
        System.out.println("Podaj opis: ");
        String opis = keyboard.next();
        System.out.println("Podaj datę wizyty ('01/01/2000'): ");
        String dataString = keyboard.next();
        System.out.println("Podaj godzine wizyty: ");
        String godzinaString = keyboard.next();
        Date data = null;
        Time godzina = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            data = dateFormat.parse(dataString);
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm");
            godzina = new Time(timeFormat.parse(godzinaString).getTime());
        } catch (ParseException e) {
            System.out.println("Błędne dane daty i/lub godziny. Spróbuj jeszcze raz");
            dodajWizyte(pesel, isLekarz);
        }
        Wizyta nowaWizyta;
        if (isLekarz) {
            nowaWizyta = new Wizyta(drugiPesel, pesel, opis, data, godzina);
        } else {
            nowaWizyta = new Wizyta(pesel, drugiPesel, opis, data, godzina);
        }
        wizyty.dodajWizyta(nowaWizyta);
        System.out.println("Dodano wizyte");
    }

    private static void usunWizyte(String pesel, boolean isLekarz) {
        List<Wizyta> wizytyLekarza = wizyty.getWizyty().stream()
                .filter(ter -> ter.getLekarzPesel().equals(pesel))
                .collect(Collectors.toList());

        List<Wizyta> wizytyPacjenta = wizyty.getWizyty().stream()
                .filter(ter -> ter.getPacjentPesel().equals(pesel))
                .collect(Collectors.toList());

        List<Wizyta> temp = isLekarz ? wizytyLekarza : wizytyPacjenta;

        for (int i = 0; i < temp.size(); i++) {
            System.out.println((i + 1) + ".-" + temp.get(i).toString());
        }
        System.out.println("Wybierz numer wizyty do usuniecia");
        int numer = keyboard.nextInt();

        if (isLekarz) {
            wizytyLekarza.remove(numer - 1);
        }else{
            wizytyPacjenta.remove(numer - 1);
        }
        System.out.println("Usunięto wizyte");

    }

    private static void wystawRecepte(String peselLekarza) {
        System.out.println("----Nowa recepta----\n");
        System.out.println("Podaj pesel pacjenta: ");
        String peselPacjenta = keyboard.next();
        System.out.println("Podaj liste lekarstw: ");
        String opis = keyboard.next();

        Recepta nowaRecepta = new Recepta(peselPacjenta, peselLekarza,opis, new Date());
        dokumnety.dodajRecepte(nowaRecepta);
        System.out.println("Wystawiono recepte");

    }

    private static void wystawZwolnienie(String peselLekarza) {
        System.out.println("----Nowa recepta----\n");
        System.out.println("Podaj pesel pacjenta: ");
        String peselPacjenta = keyboard.next();
        System.out.println("Podaj powod zwolnienia: ");
        String opis = keyboard.next();
        System.out.println("Podaj datę rozpoczecia ('01/01/2000'): ");
        String dataStartString = keyboard.next();
        System.out.println("Podaj datę rozpoczecia ('01/01/2000'): ");
        String dataKoniecString = keyboard.next();

        Date dataStart = null;
        Date dataKoniec = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dataStart = dateFormat.parse(dataStartString);
            dataKoniec = dateFormat.parse(dataKoniecString);
        } catch (ParseException e) {
            System.out.println("Błędne dane daty i/lub godziny. Spróbuj jeszcze raz");
            wystawZwolnienie(peselLekarza);
        }
        Zwolnienie noweZwolnienie = new Zwolnienie(peselPacjenta, peselLekarza, opis, dataStart, dataKoniec, new Date());
        dokumnety.dodajZwolnienie(noweZwolnienie);
        System.out.println("Wystawiono zwolnienie");
    }

}

