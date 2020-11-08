package ua.lviv.lga.comodity;

import java.util.Comparator;

public class WeghtComparator implements Comparator<Produkt>{
	
	public int compare(Produkt p1, Produkt p2) {
		if(p1.getWeght()>p2.getWeght()) {
			return 1;
		} else if (p1.getWeght()<p2.getWeght()) {
			return -1;
		} else {
			return 0;
		}
	}

	
	
}
