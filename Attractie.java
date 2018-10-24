package weekopdrachtKermis;

abstract public class Attractie {
	String attractieNaam;
	double attractiePrijs, omzetAttractie, gereserveerdeBelasting;
	int oppervlakte, aantalRitten, draaiLimiet;
	
	void attractieStarten(Attractie attractie) {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		double tempTotaalOmzet = Kermis.kassa.getTotaalOmzet();
		Kermis.kassa.setTotaalOmzet(tempTotaalOmzet += attractiePrijs);
		aantalRitten++;
		
		if(attractie instanceof GokAttractie) {
			((GokAttractie) attractie).kansSpelBelastingBetalen(attractie);
		}
	}
}

class Botsauto extends Attractie{
	Botsauto() {
		attractieNaam = "Botsauto's   ";
		attractiePrijs = 2.50;
	}
}

class Spin extends RisicoRijkeAttractie implements GokAttractie {
	Spin() {
		attractieNaam = "Spin        ";
		attractiePrijs = 2.25;
		draaiLimiet = 5;
	}
}

class Spiegelpaleis extends Attractie{
	Spiegelpaleis() {
		attractieNaam = "Spiegelpaleis";
		attractiePrijs = 2.75;
	}
}

class Spookhuis extends Attractie{
	Spookhuis() {
		attractieNaam = "Spookhuis   ";
		attractiePrijs = 3.20;
	}
}

class Hawaii extends RisicoRijkeAttractie{
	Hawaii() {
		attractieNaam = "Hawaii      ";
		attractiePrijs = 2.90;
		draaiLimiet = 10;
	}
}

class Ladderklimmen extends Attractie implements GokAttractie{
	Ladderklimmen() {
		attractieNaam = "Ladderklimmen";
		attractiePrijs = 5.00;
	}
}
