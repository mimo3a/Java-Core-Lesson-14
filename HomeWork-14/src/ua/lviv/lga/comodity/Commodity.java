package ua.lviv.lga.comodity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;

public class Commodity {

	List<Produkt> myList = new ArrayList<>();

	public void firstMeinung() {
		myList.add(new Produkt("donna", 2000, 200, 45));
		myList.add(new Produkt("wanna", 2200, 150, 50));
		myList.add(new Produkt("foma", 200, 100, 4));
		myList.add(new Produkt("afifa", 1758, 540, 150));
		myList.add(new Produkt("barka", 345, 235, 65));
		myList.add(new Produkt("vovka", 329, 10, 330));

	};

	public void addProduct() {

		System.out.println("Enter the name");
		Scanner sc1 = new Scanner(System.in);
		String entName = sc1.next();

		System.out.println("Enter the length");
		Scanner sc2 = new Scanner(System.in);
		int entLength = sc2.nextInt();

		System.out.println("Enter the bright");
		Scanner sc3 = new Scanner(System.in);
		int entBright = sc3.nextInt();

		System.out.println("Enter the weght");
		Scanner sc4 = new Scanner(System.in);
		int entWeght = sc4.nextInt();

		Produkt newProduct = new Produkt(entName, entLength, entBright, entWeght);

		myList.add(newProduct);

	}

	public void deleteProduct() {
		System.out.println("Enter the name of deleted product");
		Scanner sc = new Scanner(System.in);
		String entName = sc.next();
		Iterator<Produkt> iterator = myList.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getName().equalsIgnoreCase(entName)) {
				iterator.remove();
			}
		}		
	}

	public void changeProduct() {
		System.out.println("Enter the name of changed product");
		Scanner sc = new Scanner(System.in);
		String entName = sc.next();
		
		ListIterator<Produkt> iterator = myList.listIterator();
		while(iterator.hasNext()) {
			if(iterator.next().getName().equalsIgnoreCase(entName)) {
				int myIndex = iterator.previousIndex();
				
				System.out.println();
				
				System.out.println("Enter the name");
				Scanner sc1 = new Scanner(System.in);
				String name = sc1.next();

				System.out.println("Enter the length");
				Scanner sc2 = new Scanner(System.in);
				int entLength = sc2.nextInt();

				System.out.println("Enter the bright");
				Scanner sc3 = new Scanner(System.in);
				int entBright = sc3.nextInt();

				System.out.println("Enter the weght");
				Scanner sc4 = new Scanner(System.in);
				int entWeght = sc4.nextInt();
				
				Produkt newProduct = new Produkt(name, entLength, entBright, entWeght);
				myList.set(myIndex, newProduct);
								
			}
		}
	}
	public void enterList () {
		Iterator <Produkt> iterator = myList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public void compareToName () {
		Collections.sort(myList, new  Namecomparator());
	}
	public void compareToLength() {
		Collections.sort(myList, new LengthComparator());
	}
	public void compareToWeght() {
		Collections.sort(myList, new WeghtComparator());
	}
	public void compareToBright() {
		Collections.sort(myList, new BrightCompare());
	}
	public void showElement() {
		System.out.println("Enter the number of the element");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int lang = myList.size();
		if(number >= lang) {
			System.out.println("Have not faund");
		} else {
			for(int i = 0; i < lang ; i++) {
				if(i == number) {
					System.out.println(myList.get(i));
					System.out.println();
				}
			}
		}
		
//		тут итератор почему-то зацикливается
		
//		ListIterator<Produkt> listIterator = myList.listIterator();
//		
//		while(listIterator.hasNext()) {
//			System.out.println(listIterator.previousIndex() + 1);
//		}
	}
}
