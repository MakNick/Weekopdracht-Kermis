package weekopdrachtKermis;

import java.util.*;

public class BelastingInspecteur {
	Random rand = new Random();
	List<Double> innenGeschiedenis = new ArrayList<>();
	final int bezoekInterval = 5;							//Bezoekinterval inspecteur in blokken van int waarde. 1x per blok van 5 in dit geval.
	int bezoekDag = rand.nextInt(bezoekInterval) + 1;
	
	
	double getKasBelastingdienst() {
		double kasBelastingdienst = 0;
		for(int i = 0; i < innenGeschiedenis.size(); i++) {
			kasBelastingdienst += innenGeschiedenis.get(i);
		}
		return kasBelastingdienst;
	}

	void belastingInnen(double a) {
		if(Attractie.totaalAantalRitten() == bezoekDag) {
			System.out.println("De belastinginspecteur komt de kansspelbelasting innen.");
			innenGeschiedenis.add(a);
			Kermis.kassa.setTotaalBelasting(0);
			for(int i = 0; i < Kermis.attracties.length; i++) {
				Kermis.attracties[i].gereserveerdeBelasting = 0;
			}
			toonInnenGeschiedenis();
		}
		if(Attractie.totaalAantalRitten() % bezoekInterval == 0) {
			bezoekDag = (innenGeschiedenis.size() * bezoekInterval) + (rand.nextInt(bezoekInterval) + 1);
		}
	}
	
	void toonInnenGeschiedenis() {
		if(innenGeschiedenis.size() != 0) {
			System.out.println("Bezoekgeschiedenis belastingdienst:");
			for(int j = 0; j < innenGeschiedenis.size(); j++) {
				System.out.printf("Bezoek op " + Kermis.ldt.format(Kermis.formatter) + ": \t\t€" + "%.2f",innenGeschiedenis.get(j));
				System.out.println();
			}
		}
	}
}
