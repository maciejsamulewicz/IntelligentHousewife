package stock;

public abstract class Product {

	private String name;
	private String producer;
	private String dateOfPurchase;
	private String dateOfExpiration;

	public Product(String name, String producer, String dateOfPurchase, String dateOfExpiration) {

		setName(name);
		setProducer(producer);
		setDateOfPurchase(dateOfPurchase);
		setDateOfExpiration(dateOfExpiration);

	}

	public abstract void addProductToBaseState();

	public abstract void addProductToStore();

	

	public abstract void addProductToShoppingList();

	public abstract void deleteProductFromBaseState();

	public abstract void deleteProductFromStore();

	public abstract void deleteProductFromShoppingList();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getDateOfExpiration() {
		return dateOfExpiration;
	}

	public void setDateOfExpiration(String dateOfExpiration) {
		this.dateOfExpiration = dateOfExpiration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfExpiration == null) ? 0 : dateOfExpiration.hashCode());
		result = prime * result + ((dateOfPurchase == null) ? 0 : dateOfPurchase.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (dateOfExpiration == null) {
			if (other.dateOfExpiration != null)
				return false;
		} else if (!dateOfExpiration.equals(other.dateOfExpiration))
			return false;
		if (dateOfPurchase == null) {
			if (other.dateOfPurchase != null)
				return false;
		} else if (!dateOfPurchase.equals(other.dateOfPurchase))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		return true;
	}

}
