package weekopdrachtKermis;

abstract public class RisicoRijkeAttractie extends Attractie {
	int draaiLimiet;

	void attractieStarten() {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		Kassa.totaleOmzet += attractiePrijs;
		aantalRitten++;
		opstellingsKeuring();
	}
	
	void opstellingsKeuring() {
		if((aantalRitten % draaiLimiet) == 0) {
			System.out.println("De monteur is geweest, " + attractieNaam + " is gekeurd.");
		}
	} 
}