package stock;

public enum BreadType {

	BREAD("Chleb"),
	ROLL("Bu³ka"),
	BAGUETTE("Bagietka");
	
	private String description;
	
	private BreadType(String description) {
		
		this.description=description;
	
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		
		return description;
	}
	
}


