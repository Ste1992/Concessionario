package concessionario;

import java.util.ArrayList;
import java.util.Scanner;
import dipendenti.AddettiVendite;
import dipendenti.DatiDipendenti;
import dipendenti.Impiegati;
import parcoAuto.Auto;

public class Concessionario {

	private ArrayList <Auto> listaAuto;
	private ArrayList <DatiDipendenti> impiegati;
	private ArrayList <DatiDipendenti> addettiVendite;
	private Concessionario concessionario;
	private int capacitàParco = 50;
	private int id;
	private static int ultimoID = 1;
	
	public ArrayList<Auto> elencoAuto() {
		listaAuto = new ArrayList<>();
		listaAuto.add(new Auto("Opel", "Corsa", "benzina", 120, 15000.0, 18000.0, false));
		listaAuto.add(new Auto("Mercedes", "Classe A", "diesel", 150, 17000.0, 21000.0, true));
		return listaAuto;
	}

	
	public void elencoDisponibili() {
		concessionario = new Concessionario();
		for(int i = 0; i < concessionario.elencoAuto().size(); i++) {
			if(concessionario.elencoAuto().get(i).isSold() == false) {
				System.out.println("Auto disponibili alla vendita:");
				this.id = this.ultimoID;
				System.out.println(concessionario.elencoAuto().get(i).getBrand() + " " + concessionario.elencoAuto().get(i).getModello() + ", alimentazione: " + concessionario.elencoAuto().get(i).getAlimentazione() +
						", Cv: " + concessionario.elencoAuto().get(i).getCv() + ", prezzo vendita: €" + concessionario.elencoAuto().get(i).getPrezzoVendita() + ", ID: " + ultimoID++);
			}
		}
	}
	
	public void elencoVendute() {
		concessionario = new Concessionario();
		for(int i = 0; i < concessionario.elencoAuto().size(); i++) {
			if(concessionario.elencoAuto().get(i).isSold() == true) {
				System.out.println("Auto vendute:");
				this.id = ultimoID;
				System.out.println(concessionario.elencoAuto().get(i).getBrand() + " " + concessionario.elencoAuto().get(i).getModello() + ", alimentazione: " + concessionario.elencoAuto().get(i).getAlimentazione() +
						", Cv: " + concessionario.elencoAuto().get(i).getCv() + ", prezzo vendita: €" + concessionario.elencoAuto().get(i).getPrezzoVendita() + ", ID: " + ultimoID++);
			}
		}
	}
	
	public void aggiungiAuto(Scanner input) {
		listaAuto = new ArrayList<>();
		Auto auto = new Auto(null, null, null, capacitàParco, capacitàParco, capacitàParco, false);
		String selezione;
		do {
			System.out.print("Aggiungere un nuovo veicolo? Y/N ");
			selezione = input.next();			
			if(selezione.equals("Y")) {
				System.out.print("Brand: ");
				auto.setBrand(input.next());
				System.out.print("Modello: ");
				auto.setModello(input.next());
				System.out.print("Cv: ");
				auto.setCv(input.nextInt());
				System.out.print("Prezzo acquisto: ");
				// Gestire errore generato dall'inserimento del punto anziché la virgola per separare i decimali
				auto.setPrezzoAcquisto(input.nextDouble());
				System.out.print("Prezzo vendita: ");
				// Gestire errore generato dall'inserimento del punto anziché la virgola per separare i decimali
				auto.setPrezzoVendita(input.nextDouble());
				System.out.print("Confermare? Y/N ");
				selezione = input.next();
				listaAuto.add(auto);
				System.out.println("Dati salvati!");
				for(Auto a: listaAuto) {
					a.dettagli();
				}
			} else if(selezione.equals("N")) {
				System.out.println("Auto non aggiunta!");
			} else {
				System.out.println("Selezione errata!");
			}
		} while(selezione.equals("Y"));
	}
	
	
	public void personale() {		
		impiegati = new ArrayList<>();
		impiegati.add(new Impiegati("Roberto", "Sichera", "impiegato", 10.0));
		impiegati.add(new Impiegati("Davide", "Collocola", "impiegato", 8.30));
		System.out.println("Impiegati:");
		for(int i = 0; i < impiegati.size(); i++) {
			System.out.println(impiegati.get(i).getNome() + " " + impiegati.get(i).getCognome() + ", mansione: " + impiegati.get(i).getMansione() + ", ID: " + impiegati.get(i).getId());
		}

		addettiVendite = new ArrayList<>();
		addettiVendite.add(new AddettiVendite("Obtorto", "Collo", "addetto vendite", 5.00, 2));
		addettiVendite.add(new AddettiVendite("Hugo", "La Puttana", "addetto vendite", 9.00, 3));
		System.out.println("\nAddetti vendite:");
		for(int i = 0; i < addettiVendite.size(); i++) {
			System.out.println(addettiVendite.get(i).getNome() + " " + addettiVendite.get(i).getCognome() + ", maneisone: " + addettiVendite.get(i).getMansione() + 
					", ID: " + addettiVendite.get(i).getId());
		}
	}
	
	
	public void nuovoImpiegato(Scanner input) {		
		System.out.println("Aggiungi i dati del dipendente.");
		System.out.print("Nome: ");
		String nome = input.next();
		System.out.print("Cognome: ");
		String cognome = input.next();
		System.out.print("Mansione: ");
		String mansione = input.next();
		System.out.print("Straordinario h: ");
		int ore = input.nextInt();
		Impiegati impiegato = new Impiegati(nome, cognome, mansione, ore);
		impiegati = new ArrayList<>();
		impiegati.add(impiegato);
		for(DatiDipendenti i: impiegati) {
			System.out.println(impiegato.dettagli());
		}
	}
	
	public void nuovoAddettoVendite(Scanner input) {
		System.out.println("Aggiungi i dati del dipendente.");
		System.out.print("Nome: ");
		String nome = input.next();
		System.out.print("Cognome: ");
		String cognome = input.next();
		System.out.print("Mansione: ");
		String mansione = input.next();
		System.out.print("Straordinario h: ");
		double ore = input.nextDouble();
		System.out.print("Auto vendute: ");
		int vendute = input.nextInt();
		AddettiVendite av = new AddettiVendite(nome, cognome, mansione, ore, vendute);
		addettiVendite = new ArrayList<>();
		addettiVendite.add(av);
		for(DatiDipendenti a: addettiVendite) {
			System.out.println(av.dettagli());
		}
	}
	
	public void exit(Scanner input) {
		String selezione;
			System.out.print("Uscire dal programma? Y/N ");
			selezione = input.next();
			if(selezione.equals("Y")) {
				System.out.println("Programma terminato.");
			} else if(selezione.equals("N")) {
				System.out.println();
			} else {
				System.out.println("Selezione errata!");
		}
		return;
	}

}
