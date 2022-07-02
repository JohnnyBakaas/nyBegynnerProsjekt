import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class main {

	public static void main(String[] args) {
		while(true)
		preformLogic();
			
	}
	
	public static void preformLogic() {
		System.out.println();
		System.out.println("What roman number do you not understand?(up to 100)");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		
		//Cheks and balance
		boolean antallKarakterer = false;
		if (x.length() <= 5) {
			antallKarakterer = true;
		}
		boolean inneholderBareTall = false;
		
		//tilgjenglige symboler: I, V, X, L og C
		List<String> alleSymboler = new ArrayList<>();
		alleSymboler.add("I");
		alleSymboler.add("V");
		alleSymboler.add("X");
		alleSymboler.add("L");
		alleSymboler.add("C");
		
		//gjør string til en arraylist
		List<String> xDelt = new ArrayList<>();
		for(int i = 0; i<x.length(); i++) {
			char midlertidigChar = x.charAt(i);
			String midlertidigString = String.valueOf(midlertidigChar);
			xDelt.add(midlertidigString);
		}
		
		// lag en kopi av listen
		List<String> xSkjekk = new ArrayList<>();
		xSkjekk.addAll(xDelt);
		// fjern alle tall
		xSkjekk.removeAll(alleSymboler);
		if (xSkjekk.size() == 0) {
			inneholderBareTall = true;
		}
		
		if (antallKarakterer && inneholderBareTall) {
			System.out.println("detter er ett gyldig tall");
			
			// + sammen alle tall
			//hvis tallet til høyre for meg er større enn meg er jeg negativ
			//konverter alle bokstaver til tall, gjør det som står over og f
			
			for(int i = 0; i<xDelt.size();i++) {
				//gjør bokstaver om til tall
				if(xDelt.get(i).equals("I")) {
					xDelt.set(i, "1");
					
				} else if(xDelt.get(i).equals("V")) {
					xDelt.set(i, "5");
					
				} else if(xDelt.get(i).equals("X")) {
					xDelt.set(i, "10");
					
				} else if(xDelt.get(i).equals("L")) {
					xDelt.set(i, "50");
					
				} else if(xDelt.get(i).equals("C")) {
					xDelt.set(i, "100");
					
				}
			}
			
			//gjør Arraylist til int arraylist
			
			List<Integer> intList = new ArrayList<>();
			for(int i = 0; i < xDelt.size();i++) {
				intList.add(Integer.valueOf(xDelt.get(i)));
			}
			
			//endelig svar
			List<Integer> endeligListe = new ArrayList<>();
			int endeligSum = 0;
			
			for(int i = 0; i < intList.size();i++) {
				if(i < (intList.size() -1) && intList.get(i)<intList.get(i + 1)) {
					//ta int i og gang med -1
					int jalla = intList.get(i);
					int jalla2 = -jalla;
					
					endeligListe.add(i, jalla2);
				} else {
					endeligListe.add(i, intList.get(i));
				}
				endeligSum += endeligListe.get(i);
				
			}
			
			System.out.println(endeligSum + " endelig svar");
				
		} else {
			System.out.println("detter er ikke ett gyldig tall");
		}
	}
}