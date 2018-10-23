package weekopdrachtKermis;

abstract public class Attractie {
	String attractieNaam;
	double attractiePrijs, omzetAttractie;
	int oppervlakte, aantalRitten;
	abstract void attractieStarten();
}

class Botsauto extends Attractie{
	Botsauto() {
		attractieNaam = "Botsauto's";
		attractiePrijs = 2.50;
	}
	void attractieStarten() {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		Kassa.totaleOmzet += attractiePrijs;
		aantalRitten++;
	}
}

class Spin extends Attractie{
	Spin() {
		attractieNaam = "Spin";
		attractiePrijs = 2.25;
	}
	void attractieStarten() {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		Kassa.totaleOmzet += attractiePrijs ;
		aantalRitten++;
	}
}

class Spiegelpaleis extends Attractie{
	Spiegelpaleis() {
		attractieNaam = "Spiegelpaleis";
		attractiePrijs = 2.75;
	}
	void attractieStarten() {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		Kassa.totaleOmzet += attractiePrijs;
		aantalRitten++;
	}
}

class Spookhuis extends Attractie{
	Spookhuis() {
		attractieNaam = "Spookhuis";
		attractiePrijs = 3.20;
	}
	void attractieStarten() {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		Kassa.totaleOmzet += attractiePrijs;
		aantalRitten++;
	}
}

class Hawaii extends Attractie{
	Hawaii() {
		attractieNaam = "Hawaii";
		attractiePrijs = 2.90;
	}
	void attractieStarten() {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		Kassa.totaleOmzet += attractiePrijs;
		aantalRitten++;
	}
}

class Ladderklimmen extends Attractie{
	Ladderklimmen() {
		attractieNaam = "Ladderklimmen";
		attractiePrijs = 5.00;
	}
	void attractieStarten() {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		Kassa.totaleOmzet += attractiePrijs;
		aantalRitten++;
	}
}
