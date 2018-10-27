package weekopdrachtKermis;

@SuppressWarnings("serial")
public class defectException extends Exception {

	public defectException(Attractie attractie) {
		super("De attractie " + attractie.attractieNaam + " is defect en kan niet gestart worden. Druk op 'm' om een monteur te sturen.");
	}
}
