package stock;

public class Dairy extends Product {
	
	
	
	private String type;
	
	
	
	public String getType() {
		return type;
	}



	public void setType() {
		
		
		this.type = DairyType.valueOf();
	}



	public Dairy(String name, String producer, String type, String dateOfPurchase, String dateOfExpiration) {
		super(name, producer, dateOfPurchase, dateOfExpiration);
	
		
	}
	
	
	
	

}
