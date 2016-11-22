package stock;

public enum DairyType {

	CHEESE("Ser zolty"), 
	COTTAGE_CHEESE("Ser bialy"), 
	MILK("Mleko"), 
	CREAM("Smietana");

	private String description;
	
	DairyType(String description) {
			this.description=description;
	
	}

	public String getDescription() {
		return description;
	}
	
	
}
