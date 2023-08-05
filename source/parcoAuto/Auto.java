package parcoAuto;

public class Auto {
	
	private String brand;
	private String modello;
	private String alimentazione;
	private int cv;
	private double prezzoAcquisto;
	private double prezzoVendita;
	private boolean sold = true;
	
	public Auto(String brand, String modello, String alimentazione, int cv, double prezzoAcquisto, double prezzoVendita, boolean sold) {
		this.brand = brand;
		this.modello = modello;
		this.alimentazione = alimentazione;
		this.cv = cv;
		this.prezzoAcquisto = prezzoAcquisto;
		this.prezzoVendita = prezzoVendita;
		this.sold = sold;
	}
	

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public String getAlimentazione() {
		return alimentazione;
	}
	
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	
	public int getCv() {
		return cv;
	}
	
	public void setCv(int cv) {
		this.cv = cv;
	}
	
	public double getPrezzoAcquisto() {
		return prezzoAcquisto;
	}
	
	public void setPrezzoAcquisto(double prezzoAcquisto) {
		this.prezzoAcquisto = prezzoAcquisto;
	}
	
	public double getPrezzoVendita() {
		return prezzoVendita;
	}
	
	public void setPrezzoVendita(double prezzoVendita) {
		this.prezzoVendita = prezzoVendita;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}
	
	public void dettagli() {
		System.out.println(this.getBrand() + " " + this.getModello() + ", Cv: " + this.getCv() + ", alimentazione: " + this.getAlimentazione() + ", prezzo: " + this.getPrezzoVendita());
	}
	
	
}
