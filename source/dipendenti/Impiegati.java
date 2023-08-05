package dipendenti;

public class Impiegati extends DatiDipendenti {	
	
	private double stipendio = 1600.0;
	private double pagaOreStraordinario = 8.0;
	private double oreStraordinario;
	private double pagaTotStipendio;

	public Impiegati(String nome, String cognome, String mansione, double oreStraordinario) {
		super(nome, cognome, mansione);
		this.oreStraordinario = oreStraordinario;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getOreStraordinario() {
		return oreStraordinario;
	}

	public double getPagaTotStipendio() {
		pagaTotStipendio = stipendio + (pagaOreStraordinario * oreStraordinario);
		return pagaTotStipendio;
	}
	
	public String dettagli() {
			return this.getNome() + " " + this.getCognome() + ", mansione " + this.getMansione() + ", paga: " + this.getStipendio();
	}
	
}
