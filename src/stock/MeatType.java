package stock;

public enum MeatType {

	PORK("Wieprzowina"), BEEF("Wo�owina"), VEAL("Ciel�cina"), POULTRY("Dr�b"), MUTTON("Baranina"), LAMB(
			"Jagni�cina"), HORSEMEAT("Konina"), VENISON("Dziczyzna"), RABBIT("Kr�lik");

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
