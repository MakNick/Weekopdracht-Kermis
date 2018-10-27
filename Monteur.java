package weekopdrachtKermis;

public class Monteur {
	String naam;
	Monteur(String naam){
		this.naam = naam;
	}
	
	public void opstellingsKeuring(Attractie attractie) {
		if(attractie.aantalRitten == 0) {
			System.out.println("De kermis is opgebouwd, " + attractie.attractieNaam + " is gekeurd door " + naam + " en klaar voor gebruik.");
		}
	} 
	
	public void repareren(Attractie attractie) {
		if(((RisicoRijkeAttractie) attractie).defect == true) {
			((RisicoRijkeAttractie) attractie).defect = false;
			System.out.println("De " + attractie.attractieNaam + " is gerepareerd door " + naam + " en kan weer starten.");		
		} else {
			System.out.println("De " + attractie.attractieNaam + " werkt naar behoren. Er is geen reparatie nodig.");
		}
	}
}
