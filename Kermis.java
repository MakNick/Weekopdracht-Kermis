package weekopdrachtKermis;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Kermis {
	static LocalDateTime ldt = LocalDateTime.now();
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	Scanner sc = new Scanner(System.in);
	static Kassa kassa = new Kassa();
	BelastingInspecteur bi = new BelastingInspecteur();
	Monteur monteur = new Monteur("Piet");
	
	static Attractie[] attracties = {new Botsauto(), new Spin(), new Spiegelpaleis(), new Spookhuis(), new Hawaii(), new Ladderklimmen()};
	
	boolean kermisOpen = true;
	
	void kermisStarten() {
		keuringOpzettenAttracties();
		while(kermisOpen) {
			toonAttractieMenu();
			try {
				keuzeAttractie(sc.nextLine());
			} catch (defectException de) {
				System.out.println(de);
			}
			bi.belastingInnen(kassa.getTotaalBelasting());
		}	
	}
	
	void toonAttractieMenu() {
		System.out.println("\nWelkom op de Kermis!\nKies een attractie: \n");
		System.out.println("1. Botsauto's\n2. Spin\n3. Spiegelpaleis\n4. Spookhuis\n5. Hawaii\n6. Ladderklimmen\n");
		System.out.println("m. Stuur monteur\no. Toon omzetten\nk. Toon aantal ritten\nq. Kermis verlaten");
	}
		
	void keuzeAttractie(String invoer) throws defectException {
		
		switch(invoer) {
		case "1": 
			attracties[0].attractieStarten(attracties[0]);
			break;
		case "2": 
			attracties[1].attractieStarten(attracties[1]);
			break;
		case "3": 
			attracties[2].attractieStarten(attracties[2]);
			break;
		case "4": 
			attracties[3].attractieStarten(attracties[3]);
			break;
		case "5": 
			attracties[4].attractieStarten(attracties[4]);
			break;
		case "6": 
			attracties[5].attractieStarten(attracties[5]);
			break;
		case "m":
			stuurMonteur(monteur);
			break;
		case "o": 
			toonFinancien();
			break;
		case "k": 
			toonAantalRitten();
			break;
		case "q": 
			System.out.println("Je verlaat de kermis.");
			kermisOpen = false;
			break;
		default:
			System.out.println("Verkeerde input.");
			toonAttractieMenu();
			keuzeAttractie(sc.nextLine());	
		}
	}
	
	void toonFinancien() {
		for(int i = 0; i < attracties.length; i++) {
			System.out.printf("De omzet van " + attracties[i].attractieNaam + "    \t\t€" + "%.2f",attracties[i].omzetAttractie);
			System.out.println();
		}
		System.out.printf("\nDe totale omzet is: \t\t\t€" + "%.2f", kassa.getTotaalOmzet());
		System.out.printf("\nGereserveerde kansspelbelasting is: \t€" + "%.2f", kassa.getTotaalBelasting());
		System.out.println("\n");
		bi.toonInnenGeschiedenis();
		System.out.printf("\nDe totale winst van de kermis is: \t€" + "%.2f", kassa.getTotaalOmzet() - bi.getKasBelastingdienst());
		System.out.println();
	}
	
	
	void toonAantalRitten() {
		for(int i = 0; i < attracties.length; i++) {
			System.out.println("Aantal ritten in " + attracties[i].attractieNaam + "   \t" + attracties[i].aantalRitten);
		}
		System.out.println("\nTotaal aantal ritten is: \t\t" + Attractie.totaalAantalRitten());
	}
	
	void keuringOpzettenAttracties() {
		for(int i = 0; i < attracties.length; i++) {
			if(attracties[i] instanceof RisicoRijkeAttractie) {
				monteur.opstellingsKeuring(attracties[i]);
			}
		}
	}
	
	void stuurMonteur(Monteur monteur) {
		for(int i = 0; i < attracties.length; i ++) {
			if(attracties[i] instanceof RisicoRijkeAttractie) {
				monteur.repareren(attracties[i]);
			}
		}	
	}
}

