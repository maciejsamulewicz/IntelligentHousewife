package stock;

public class Meat extends Product {

	private MeatType type;
	private boolean frozen;
	private boolean sliced;

	public Meat(String name, String producer, MeatType type, String dateOfPurchase, String dateOfExpiration) {
		super(name, producer, dateOfPurchase, dateOfExpiration);
		this.type = type;
	}
	
	public void addMeat(Meat meat){
		
		
		if (frozen == true ) {
			
			//jeœli produkt jest zamro¿ony umieœæ go w zamra¿arce i nadaj termin wa¿noœci z metody
			
		}
		
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

	
	

}
