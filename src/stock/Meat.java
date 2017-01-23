package stock;

public class Meat extends Product implements Freezing{

	private MeatType type;
	private boolean frozen;
	private boolean sliced;

	public Meat(String name, String producer, MeatType type, String dateOfPurchase, String dateOfExpiration) {
		super(name, producer, dateOfPurchase, dateOfExpiration);
		this.type = type;
	}

	
	public MeatType getType() {
		return type;
	}

	public void setType(MeatType type) {
		this.type = type;
	}

	public boolean isFrozen() {
		return frozen;
	}

	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}

	public boolean isSliced() {
		return sliced;
	}

	public void setSliced(boolean sliced) {
		this.sliced = sliced;
	}

	
	@Override
	public void addProductToBaseState() {
		if (frozen == true ) {
			
			//je�li produkt jest zamro�ony umie�� go w zamra�arce i nadaj termin wa�no�ci z metody
			
		}
		
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


	@Override
	public void addProductToFreezer() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteProductFromFreezer() {
		// TODO Auto-generated method stub
		
	}

	
	

}
