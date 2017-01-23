package app;

public enum Menu {

	ADD_PRODUCT_TO_BASE_STATE("1 - Dodaj produkt do stanu bazowego"),
	DELETE_PRODUCT_FROM_BASE_STATE("2 - Usu� produkt ze stanu bazowego"),
	SHOW_BASE_STATE("3 - Poka� stan bazowy"),
	ADD_PRODUCT_TO_FRIDGE("4 - Dodaj produkt do magazynu"),
	DELETE_PRODUCT_FROM_FRIDGE("5 - Usu� produkt z magazynu"),
	SHOW_FRIDGE("6 - Poka� lod�wk�"),
	ADD_PRODUCT_TO_SHOPPING_LIST("7 - Dodaj produkt do listy zakup�w"),
	DELETE_PRODUCT_FROM_SHOPPING_LIST("8 - Usu� produkt z listy zakup�w"),
	SHOW_SHOPPING_LIST("9 - Poka� list� zakup�w"),
	EXIT("0 - Wyjdz");
	
	private String description;

	public String getDescription() {
		return description;
	}
	
	Menu (String description){
		
		this.description=description;
	}
	

	
}
