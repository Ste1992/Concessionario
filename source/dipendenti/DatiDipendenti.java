package dipendenti;

public class DatiDipendenti {
	
	private String nome;
	private String cognome;
	private int id;

	private static int ultimoID = 0;
	private String mansione;

	public DatiDipendenti(String nome, String cognome, String mansione) {
		this.nome = nome;
		this.cognome = cognome;
		this.mansione = mansione;
		this.id = ultimoID;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getId() {
		this.id = ultimoID;
		return ultimoID++;
	}
	
	public String getMansione() {
		return mansione;
	}
	
	public void setMansione(String mansione) {
		this.mansione = mansione;
	}

}
