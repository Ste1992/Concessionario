package dipendenti;

public class AddettiVendite extends DatiDipendenti {

	public AddettiVendite(String nome, String cognome, String mansione, double oreStraordinario, int autoVendute) {
		super(nome, cognome, mansione);
		this.oreStraordinario = oreStraordinario;
		this.autoVendute = autoVendute;
	}
	
	private double stipendio = 900.0;
	private double pagaOraStraordinario = 6.00;
	private double pagaTotStipendio;
	private double oreStraordinario;
	private int autoVendute;
	private double bonus = 100.0;


	public double getStipendio() {
		return stipendio;
	}

	public double getOreStraordinario() {
		return oreStraordinario;
	}

	public int getAutoVendute() {
		return autoVendute;
	}

	public double getBonus() {
		bonus = bonus * autoVendute;
		return bonus;
	}

	public double getPagaTotStipendio() {
		pagaTotStipendio = this.bonus + stipendio + (pagaOraStraordinario * oreStraordinario);
		return pagaTotStipendio;
	}
	
	public String dettagli() {
		return this.getNome() + " " + this.getCognome() + ", auto vendute: " + this.getAutoVendute() + ", bonus: €" + this.getBonus() + ", straordinario/h: " + this.getOreStraordinario() + " Paga: €" + this.getPagaTotStipendio();
	}
	
}
