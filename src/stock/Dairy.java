package stock;

public class Dairy extends Product {

	private DairyType type;

	public DairyType getType() {
		return type;
	}

	public void setType(DairyType type) {
		this.type = type;
	}

	public Dairy(String name, String producer, DairyType typ, String dateOfPurchase, String dateOfExpiration) {
		super(name, producer, dateOfPurchase, dateOfExpiration);
		this.type = typ;

	}

	@Override
	public String toString() {
		return "Nabia�:  typ: " + type + ", nazwa: " + getName() + ", producent: " + getProducer()
				+ ", data zakupu: " + getDateOfPurchase() + ", data wa�no�ci: " + getDateOfExpiration();
	}

	@Override
	public void addProductToBaseState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProductToStore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProductToShoppingList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProductFromBaseState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProductFromStore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProductFromShoppingList() {
		// TODO Auto-generated method stub
		
	}
	
	

}
