
public class Kontakt {
	
	private String navn;
	private String etternavn;
	private String tlf;
	public Kontakt(String navn, String etternavn, String tlf) {
		this.navn = navn;
		this.etternavn = etternavn;
		this.tlf = tlf;	
	}
	
	public String getNavn() {
		return navn;
		
	}
	public String getEtterNavn() {
		return etternavn;
	}
	public String getTlf() {
		return tlf;
	}
	public String toString() {
		return this.navn + " " + this.etternavn + " " + this.tlf;
		
	}
	
	
}

