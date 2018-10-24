package weekopdrachtKermis;

public interface GokAttractie {
	
	public default void kansSpelBelastingBetalen(Attractie attractie) {
		attractie.gereserveerdeBelasting += (attractie.attractiePrijs * 0.3);
	}
}
