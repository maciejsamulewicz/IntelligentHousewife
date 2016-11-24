package stock;

public enum MeatType {

	PORK("Wieprzowina"), BEEF("Wo³owina"), VEAL("Cielêcina"), POULTRY("Drób"), MUTTON("Baranina"), LAMB(
			"Jagniêcina"), HORSEMEAT("Konina"), VENISON("Dziczyzna"), RABBIT("Królik");

	private String description;

	private MeatType(String description) {

		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {

		return description;
	}
}
