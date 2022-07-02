import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		kunde kunde1 = new kunde("Johnny", "120999", "001", 69420);
		kunde kunde2 = new kunde("Sting", "Vet ikke", "002", 1000000);
		
		System.out.println(kunde1.getSaldo()+kunde2.getSaldo());
		
		
		System.out.println("Login: ");
		
		if (kunde1.getPersonnummer().equals(sc.next())) {
			System.out.println("Hei Johnny");
			System.out.println("Du har " + kunde1.getSaldo() + "kr på konto");
			System.out.println("Trykk 1 for å sette inn penger fra staten");
			System.out.println("Trykk 2 for å sende penger til en annen person");
			
			int selvsagtErDetteLøsningen = sc.nextInt();
			if (selvsagtErDetteLøsningen == 1) {
				System.out.println("Hvor mye penger vil du få");
				kunde1.setSaldo(kunde1.getSaldo() + sc.nextDouble());
				
			} else if (selvsagtErDetteLøsningen == 2) {
				System.out.println("Det er bare en annen kunde i denne banken og det er stig");
				
				System.out.println("Hvor mye penger skal du overføre?");
				double mengdePenger = sc.nextDouble();
				
				if (mengdePenger < kunde1.getSaldo()) {
					kunde2.setSaldo(kunde2.getSaldo() + mengdePenger);
					kunde1.setSaldo(kunde1.getSaldo() + mengdePenger);
					System.out.println(kunde1.getSaldo());
					System.out.println(kunde2.getSaldo());
				} else {
					System.out.println("neiiiiiiiiiiiii");
				}
				
			}
			
			System.out.println(kunde1.getSaldo());
		} else if (kunde2.getPersonnummer().equals(sc.next())) {
			System.out.println("Hei Stig");
		}
	}
}
