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
		return "Pieczywo:  typ: " + typ + ", nazwa: " + getName() + ", producent: " + getProducer()
				+ ", data zakupu: " + getDateOfPurchase() + ", data wa¿noœci: " + getDateOfExpiration();
	}
}
