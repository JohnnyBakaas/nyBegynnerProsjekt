import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String kontaktNr = "1";
		String imputUser = "0";
		
		List<Kontakt> imputKontaktListe = new ArrayList<>();
		
		Kontakt johnny = new Kontakt ("johnny", "bakaas", "90734t03945");
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1 legg til kontakt");
			System.out.println("2 se på kontakter");
			imputUser = sc.nextLine();
			
			if(imputUser.equals("1")) {
				imputKontaktListe.clear();
				System.out.println("Fornavn");
				String imputFornan = sc.nextLine();
				
				System.out.println("Etternavn");
				String imputEtternavn = sc.nextLine();
				
				System.out.println("Tlf");
				String imputTlf = sc.nextLine();
				Kontakt nyKontakt = new Kontakt(imputFornan, imputEtternavn, imputTlf);
				imputKontaktListe.add(nyKontakt);
				System.out.println(nyKontakt.getNavn());
				} else {
					System.out.println(imputKontaktListe);
					System.out.println(Kontakt.class);
				}
			} 
		}
	}
