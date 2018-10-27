package weekopdrachtKermis;

abstract public class Attractie {
	String attractieNaam;
	double attractiePrijs, omzetAttractie, gereserveerdeBelasting;
	int oppervlakte, aantalRitten, draaiLimiet;
	
	void attractieStarten(Attractie attractie) throws defectException {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		double tempTotaalOmzet = Kermis.kassa.getTotaalOmzet();
		Kermis.kassa.setTotaalOmzet(tempTotaalOmzet += attractiePrijs);
		aantalRitten++;
		
		if(attractie instanceof GokAttractie) {
			((GokAttractie) attractie).kansSpelBelastingBetalen(attractie);
		}
	}
	
	static int totaalAantalRitten() {
		int totaalRitten = 0;
		for(int j = 0; j < Kermis.attracties.length; j++) {
			totaalRitten += Kermis.attracties[j].aantalRitten;
		}
		return totaalRitten;
	}
}

class Botsauto extends Attractie{
	Botsauto() {
		attractieNaam = "Botsauto's   ";
		attractiePrijs = 2.50;
		oppervlakte = 30;
	}
}

class Spin extends RisicoRijkeAttractie implements GokAttractie {
	Spin() {
		attractieNaam = "Spin        ";
		attractiePrijs = 2.25;
		oppervlakte = 50;
		draaiLimiet = 5;
	}
}

class Spiegelpaleis extends Attractie{
	Spiegelpaleis() {
		attractieNaam = "Spiegelpaleis";
		attractiePrijs = 2.75;
		oppervlakte = 45;
	}
}

class Spookhuis extends Attractie{
	Spookhuis() {
		attractieNaam = "Spookhuis   ";
		attractiePrijs = 3.20;
		oppervlakte = 15;
	}
}

class Hawaii extends RisicoRijkeAttractie{
	Hawaii() {
		attractieNaam = "Hawaii      ";
		attractiePrijs = 2.90;
		oppervlakte = 27;
		draaiLimiet = 10;
	}
}

class Ladderklimmen extends Attractie implements GokAttractie{
	Ladderklimmen() {
		attractieNaam = "Ladderklimmen";
		attractiePrijs = 5.00;
		oppervlakte = 5;
	}
}
