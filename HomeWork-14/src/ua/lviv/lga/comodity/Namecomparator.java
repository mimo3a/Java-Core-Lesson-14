package ua.lviv.lga.comodity;

import java.util.Comparator;

public class Namecomparator implements Comparator<Produkt>{

	public int compare(Produkt p1, Produkt p2) {
		
		return p1.getName().compareTo(p2.getName());
	}

}
