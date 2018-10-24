package weekopdrachtKermis;

abstract public class RisicoRijkeAttractie extends Attractie {
	int draaiLimiet;

	void attractieStarten(Attractie attractie) {
		System.out.println("De attractie " + attractieNaam + " is gestart.\n");
		omzetAttractie += attractiePrijs;
		double tempTotaalOmzet = Kermis.kassa.getTotaalOmzet();
		Kermis.kassa.setTotaalOmzet(tempTotaalOmzet += attractiePrijs);
		aantalRitten++;
		onderhoudsKeuring();
		
		if(attractie instanceof GokAttractie) {
			((GokAttractie) attractie).kansSpelBelastingBetalen(attractie);
		}
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