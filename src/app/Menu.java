package app;

public enum Menu {

	ADD_PRODUCT_TO_BASE_STATE("1 - Dodaj produkt do stanu bazowego"),
	DELETE_PRODUCT_FROM_BASE_STATE("2 - Usuñ produkt ze stanu bazowego"),
	SHOW_BASE_STATE("3 - Poka¿ stan bazowy"),
	ADD_PRODUCT_TO_FRIDGE("4 - Dodaj produkt do magazynu"),
	DELETE_PRODUCT_FROM_FRIDGE("5 - Usuñ produkt z magazynu"),
	SHOW_FRIDGE("6 - Poka¿ lodówkê"),
	ADD_PRODUCT_TO_SHOPPING_LIST("7 - Dodaj produkt do listy zakupów"),
	DELETE_PRODUCT_FROM_SHOPPING_LIST("8 - Usuñ produkt z listy zakupów"),
	SHOW_SHOPPING_LIST("9 - Poka¿ listê zakupów"),
	EXIT("0 - Wyjdz");
	
	private String description;

	public String getDescription() {
		return description;
	}
	
	Menu (String description){
		
		this.description=description;
	}
	

	
}
