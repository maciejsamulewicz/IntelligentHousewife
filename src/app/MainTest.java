package app;

import stock.*;


public class MainTest {

	public static void main(String[] args) {

	Product mleko = new Dairy("T�uste", "Ko�cian", DairyType.MILK, "11/11/2016", "12/12/2020");
	Product bulka = new Bread("kajzerka", "kiwaj�o", BreadType.ROLL, "23/11/2016", "26/11/2016");
	
	
		
		System.out.println(mleko.toString());
		System.out.println(bulka.toString());
		
}
	

}


