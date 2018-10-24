package weekopdrachtKermis;

public class Kassa {
	private double totaleOmzet, totaleBelasting;
	
	double getTotaalOmzet() {
		return totaleOmzet;
	}
	
	public void setTotaalOmzet(double totaleOmzet) {
		this.totaleOmzet = totaleOmzet;
	}
	
	double getTotaalBelasting() {
		totaleBelasting = 0;
		for(int i = 0; i < Kermis.attracties.length; i++) {
			totaleBelasting += Kermis.attracties[i].gereserveerdeBelasting;
		}
		return totaleBelasting;
	}
	
	public void setTotaalBelasting(double totaleBelasting) {
		this.totaleBelasting = totaleBelasting;
	}
}
