package weekopdrachtKermis;

import java.util.Scanner;

public class Kermis {
	Scanner sc = new Scanner(System.in);
	
	boolean kermisOpen = true;
	
	static Attractie[] attracties = {new Botsauto(), new Spin(), new Spiegelpaleis(), new Spookhuis(), new Hawaii(), new Ladderklimmen()};
	
	void kermisStarten() {
		while(kermisOpen) {
			toonAttractieMenu();
			keuzeAttractie(sc.nextLine());
		}
	}
	
	void toonAttractieMenu() {
		System.out.println("Kies een attractie: \n");
		System.out.println("1. Botsauto's\n2. Spin\n3. Spiegelpaleis\n4. Spookhuis\n5. Hawaii\n6. Ladderklimmen\n");
		System.out.println("o. Toon omzetten\nk. Toon aantal ritten\nq. Kermis verlaten");
	}
	
	void keuzeAttractie(String invoer) {
		
		switch(invoer) {
		case "1": 
			attracties[0].attractieStarten();
			break;
		case "2": 
			attracties[1].attractieStarten();
			break;
		case "3": 
			attracties[2].attractieStarten();
			break;
		case "4": 
			attracties[3].attractieStarten();
			break;
		case "5": 
			attracties[4].attractieStarten();
			break;
		case "6": 
			attracties[5].attractieStarten();
			break;
		case "o": 
			toonOmzet();
			break;
		case "k": 
			toonAantalRitten();
			break;
		case "q": 
			System.out.println("Je verlaat de kermis.");
			kermisOpen = false;
			break;
		}
		
	}
	
	void toonOmzet() {
		for(int i = 0; i < attracties.length; i++) {
			System.out.println("De omzet van " + attracties[i].attractieNaam + " is \t€" + attracties[i].omzetAttractie);
		}
		System.out.println("\nDe totale omzet is: \t\t€" + Kassa.totaleOmzet);
	}
	
	void toonAantalRitten() {
		for(int i = 0; i < attracties.length; i++) {
			System.out.println("Aantal ritten in " + attracties[i].attractieNaam + " is\t\t" + attracties[i].aantalRitten);
		}
	}

}

