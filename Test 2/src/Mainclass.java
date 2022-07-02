import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Mainclass {
	public static void main(String[] args) {
		//	start^
		
		//	Intern data inn
		String Intern = "Do1-01,Do1-02,Do1-03";
		System.out.println(Intern);
		//	TEST^
		
		//	Deling av string
		String[] InternDelt = Intern.split(",");
		
		
		//	Array liste internt
		ArrayList<String> InternArray = new ArrayList<>();
		System.out.println(InternArray);
		//	TEST^
		
		//	Legge data inn til arrraylist (jeg holder på å sovne)
		int Intern_i = 0;
		while(Intern_i < InternDelt.length) {
			InternArray.add(InternDelt[Intern_i]);
			Intern_i++;
		}
		
		System.out.println(InternArray);
		//	TEST^
		
		//------------------------------------------------------
		
		//	Intern data inn
		String Ekstern = "Do1-01,Do1-02,Do1-04";
		System.out.println(Ekstern);
		//	TEST^
		
		//	Deling av string
		String[] EksternDelt = Ekstern.split(",");
		
			
		//	Array liste internt
		ArrayList<String> EksternArray = new ArrayList<>();
		System.out.println(EksternArray);
		//	TEST^
		
		//	Legge data inn til arrraylist (jeg holder på å sovne)
		int Ekstern_i = 0;
		while(Ekstern_i < EksternDelt.length) {
			EksternArray.add(EksternDelt[Ekstern_i]);
			Ekstern_i++;
			}
			
		System.out.println(EksternArray);
		//	TEST^
		
		//------------------------------------------------------
		
		// Slå sammen faenskapen
		ArrayList<String> FellesArray = new ArrayList<>();
		System.out.println(FellesArray);
		//	TEST^
		
		// Faktisk slå sammen faenskapen
		FellesArray.addAll(InternArray);
		FellesArray.addAll(EksternArray);
		System.out.println(FellesArray);
		//	TEST^
		
		//	Fjern duplikater fra faenskapen
		Set<String> DuplikatFjerningMagi = new HashSet<>(FellesArray);
		FellesArray.clear();
		FellesArray.addAll(DuplikatFjerningMagi);
		//	^Takk gud for google
		System.out.println(FellesArray);
		//	TEST^
		System.out.println(FellesArray.get(1));
		//	TEST^
		
		//------------------------------------------------------
		
		// felles mot intern Boolean
		HashMap<String, Boolean> InternBoolean = new HashMap<>();
		HashMap<String, Boolean> EksternBoolean = new HashMap<>();
		HashMap<String, Boolean> beggeBoolean = new HashMap<>();
		for(int i = 0; i < FellesArray.size() ; i++) {
			String id = FellesArray.get(i);
			
			boolean eksistererIntern = InternArray.contains(id);
			boolean eksistererEkstern = EksternArray.contains(id);
			
			// sammenlign meed intern array
			if (eksistererIntern) {
				InternBoolean.put(id, true);
			}
			else {
				InternBoolean.put(id, false);
			}
			
			// sammenlign meed ekster array
			if (eksistererEkstern) {
				EksternBoolean.put(id, true);
			}
			else {
				EksternBoolean.put(id, false);
			}
			if (eksistererIntern && eksistererEkstern) {
				beggeBoolean.put(id, true);
			}
			else {
				beggeBoolean.put(id, false);
			}
			// sammenlign med begge
			
		}
		
		
		
		System.out.println("Intern/felles" + InternBoolean);
		System.out.println("Ekstern/felles" + EksternBoolean);
		System.out.println("Ekstern/Intern" + beggeBoolean);
		//------------------------------------------------------
		
				
		
		
		
	}
}
