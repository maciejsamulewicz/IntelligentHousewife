package stock;

public class Dairy extends Product {

	private String type;

	
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
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Dairy(String name, String producer, String type, String dateOfPurchase, String dateOfExpiration) {
		super(name, producer, dateOfPurchase, dateOfExpiration);
		this.type = type;

	}

	
}
