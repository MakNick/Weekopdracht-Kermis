package weekopdrachtKermis;

abstract public class Attractie {
	String attractieNaam;
	double attractiePrijs, omzetAttractie, gereserveerdeBelasting;
	int oppervlakte, aantalRitten, draaiLimiet;
	
	void attractieStarten() {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		Kassa.totaleOmzet += attractiePrijs;
		aantalRitten++;
		
		for(int i = 0; i < Kermis.attracties.length; i++) {
			if(Kermis.attracties[i] instanceof GokAttractie) {
				kansSpelBelastingBetalen();
			}
		}
	}
	
	void opstellingsKeuring() {};
	void kansSpelBelastingBetalen() {};
}

class Botsauto extends Attractie{
	Botsauto() {
		attractieNaam = "Botsauto's   ";
		attractiePrijs = 2.50;
	}
}

class Spin extends RisicoRijkeAttractie{
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
	public void kansSpelBelastingBetalen() {
		gereserveerdeBelasting += (attractiePrijs * 0.3);
	}
}
