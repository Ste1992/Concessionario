package dipendenti;

public class Dirigenti extends DatiDipendenti {
	
	private double stipendio = 2000.0;

	public Dirigenti(String nome, String cognome, String mansione, double stipendio) {
		super(nome, cognome, mansione);
		this.stipendio = stipendio;
	}

}
