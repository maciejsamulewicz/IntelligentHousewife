package stock;

public class Bread extends Product {

	private BreadType typ;

	public BreadType getTyp() {
		return typ;
	}

	public void setTyp(BreadType typ) {
		this.typ = typ;
	}

	public Bread(String name, String producer, BreadType typ, String dateOfPurchase, String dateOfExpiration) {
		super(name, producer, dateOfPurchase, dateOfExpiration);
		this.typ = typ;
	}

	@Override
	public String toString() {
		return "Pieczywo:  typ: " + typ + ", nazwa: " + getName() + ", producent: " + getProducer() + ", data zakupu: "
				+ getDateOfPurchase() + ", data wa¿noœci: " + getDateOfExpiration();
	}

	@Override
	public void addProductToBaseState() {
		System.out.println();
		
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
