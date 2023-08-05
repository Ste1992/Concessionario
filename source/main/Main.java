package main;

import java.util.Scanner;
import concessionario.Concessionario;

public class Main {

	public static void main(String[] args) {

		Concessionario concessionario = new Concessionario();
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\tWelcome to CarHouse");		
		System.out.println("1. Parco Auto\n2. Auto vendute\n3. Aggiungi auto\n4. Nuovo Impiegato\n5. Nuovo addetto vendite\n6. Organico dipendenti\n0. Esci");
		int scelta = input.nextInt();
		switch(scelta) {
		case 1:
			concessionario.elencoDisponibili();
			break;
			
		case 2:
			concessionario.elencoVendute();
			break;
			
		case 3:
			concessionario.aggiungiAuto(input);
			break;
			
		case 4:
			concessionario.nuovoImpiegato(input);
			break;
			
		case 5:
			concessionario.nuovoAddettoVendite(input);
			break;			
			
		case 6:
			concessionario.personale();
			break;
			
		case 0:
			concessionario.exit(input);
			break;
			
		} while(scelta != 0);

	}
}
