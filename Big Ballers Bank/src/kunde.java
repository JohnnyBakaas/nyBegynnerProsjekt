
public class kunde {
		
	private String navn;
	private String personnummer;
	private String kontoNr;
	private double saldo;
	
	public kunde(String navn, String personnummer, String kontoNr, double saldo) 
	{
		this.navn = navn;
		this.personnummer = personnummer;
		this.kontoNr = kontoNr;
		this.saldo = saldo;
	}
	public String getNavn() {
		return navn;
	}
	public String getPersonnummer() {
		return personnummer;
	}
	public String getKontoNr() {
		return kontoNr;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void overførSaldo(double saldi) {
		
	}
}
