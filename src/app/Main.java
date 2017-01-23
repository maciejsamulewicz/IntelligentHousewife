package app;

import java.util.ArrayList;
import java.util.Scanner;

import stock.Bread;
import stock.BreadType;
import stock.Product;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		ArrayList<Product> baseState = new ArrayList<>();

		System.out.println("******************************************");
		System.out.println("Witaj w systemie Intelligent Housewife");
		System.out.println("******************************************");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		int option = 100;

		while (option != 0) {

			main.printOptions();
			option = sc.nextInt();

			switch (option) {

			case 1:

				System.out.println("Podaj nazwê produktu: ");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.println("Podaj nazwê producenta: ");
				String producer = sc.nextLine();
				BreadType typ = BreadType.BREAD;
				System.out.println("Podaj datê zakupu w formacie DD/MM/YYYY");
				String dateOfPurchase = sc.nextLine();
				System.out.println("Podaj datê wa¿noœci w formacie DD/MM/YYYY");
				String dateOfExpiration = sc.nextLine();
				baseState.add(new Bread(name, producer, typ, dateOfPurchase, dateOfExpiration));
				break;

			case 2:

				break;

			case 3:

				System.out.println(baseState);
				break;

			case 4:

				break;

			case 5:

				break;

			case 6:

				break;

			case 7:

				break;

			case 8:

				break;

			case 9:

				break;

			case 0:

				System.out.println("Do zobaczenia!");
				return;

			default:
				break;
			}

		}
		sc.close();
	}

	public void printOptions() {

		for (Menu m : Menu.values()) {

			System.out.println(m.getDescription());

		}
	}
}
