package weekopdrachtKermis;

abstract public class RisicoRijkeAttractie extends Attractie {
	int draaiLimiet;

	void attractieStarten() {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		Kassa.totaleOmzet += attractiePrijs;
		aantalRitten++;
		onderhoudsKeuring();
	}
	
	void opstellingsKeuring() {
		if(aantalRitten == 0) {
			System.out.println("De kermis is opgebouwd, " + attractieNaam + " is gekeurd en klaar voor gebruik.");
		}
	} 
	
	void onderhoudsKeuring() {
		if((aantalRitten % draaiLimiet) == 0) {
			System.out.println("De monteur is geweest, " + attractieNaam + " is gekeurd en kan weer gebruikt worden.");
		}
	} 
}