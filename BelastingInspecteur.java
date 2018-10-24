package weekopdrachtKermis;

import java.util.*;

public class BelastingInspecteur {
	private double kasBelastingdienst;
	List<Double> innenGeschiedenis = new ArrayList<>();
	
	public double getKasBelastingdienst() {
		return kasBelastingdienst;
	}

	public void setKasBelastingdienst(double kasBelastingdienst) {
		this.kasBelastingdienst = kasBelastingdienst;
	}

	void belastingInnen(double a) {
		System.out.println("De belastinginspecteur komt de kansspelbelasting innen.");
		double tempKasBelastingdienst = getKasBelastingdienst();
		setKasBelastingdienst(tempKasBelastingdienst += a);
		innenGeschiedenis.add(a);
		toonInnenGeschiedenis();
		Kermis.kassa.setTotaalBelasting(0);
		for(int i = 0; i < Kermis.attracties.length; i++) {
			Kermis.attracties[i].gereserveerdeBelasting = 0;
		}
	}
	
	void toonInnenGeschiedenis() {
		if(innenGeschiedenis.size() != 0) {
			System.out.println("Bezoekgeschiedenis belastingdienst:");
			for(int j = 0; j < innenGeschiedenis.size(); j++) {
				System.out.printf("Bezoek " + (j + 1) + ": €" + "%.2f",innenGeschiedenis.get(j));
				System.out.println();
			}
		}
	}
}
