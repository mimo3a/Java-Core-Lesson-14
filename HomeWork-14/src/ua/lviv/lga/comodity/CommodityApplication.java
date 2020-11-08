package ua.lviv.lga.comodity;

import java.util.Collections;
import java.util.Scanner;

public class CommodityApplication {
	public static void main(String[] args) {
		
		Commodity com1= new Commodity();
		com1.firstMeinung();
		
		while(true) {
			com1.enterList();
			menu();
			Scanner sc = new Scanner(System.in);
			String menuNumber = sc.next();
			switch (menuNumber) {
			case "1" : com1.addProduct();
			break;
			case "2" : com1.deleteProduct();
			break;			
			case "3" : com1.changeProduct();
			break;
			case "4" : com1.compareToName();
			break;
			case "5" : com1.compareToLength();
			break;
			case "6" : com1.compareToBright();
			break;
			case "7" : com1.compareToWeght();
			break;
			case "8" : com1.showElement();			
			break;
			case "9" : System.out.println("Exit from programm");
			System.exit(0);
			break;
			default : System.out.println("Not found");
			break;
			}			
		}
	}
	


public static void menu () {
	System.out.println(" Введіть 1 щоб Додати товар");
	System.out.println(" Введіть 2 щоб Видалити товар");
	System.out.println(" Введіть 3 щоб Замінити товар");
	System.out.println(" Введіть 4 щоб Сортувати за назвоню");
	System.out.println(" Введіть 5 щоб Сортувати за довжиною");
	System.out.println(" Введіть 6 щоб Сортувати за шириною");
	System.out.println(" Введіть 7 щоб Сортувати за вагою");
	System.out.println(" Введіть 8 щоб Вивести і-тий елемент колекції");
	System.out.println(" Введіть 9 щоб Вийти з програми");
	
	
}
}
