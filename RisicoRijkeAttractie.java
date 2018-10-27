package weekopdrachtKermis;

abstract public class RisicoRijkeAttractie extends Attractie {
	int draaiLimiet;
	boolean defect = false;

	void attractieStarten(Attractie attractie) throws defectException{
		if(!defect) {
			System.out.println("De attractie " + attractieNaam + " is gestart.\n");
			omzetAttractie += attractiePrijs;
			double tempTotaalOmzet = Kermis.kassa.getTotaalOmzet();
			Kermis.kassa.setTotaalOmzet(tempTotaalOmzet + attractiePrijs);
			aantalRitten++;
			if(attractie instanceof GokAttractie) {
				((GokAttractie) attractie).kansSpelBelastingBetalen(attractie);
			}
			if(aantalRitten % draaiLimiet == 0) {
				defect = true;
			}
		} else {
			throw new defectException(attractie);
		}
			
	}
}
