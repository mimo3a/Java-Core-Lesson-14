package ua.lviv.lga.maraphon;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class MaraphonApplication {
	public static void main(String[] args) {
		
		Set <Runner> table = new HashSet<> ();
		table.add(new Runner("Liam", 185));
		table.add(new Runner("Jonas", 165));
		table.add(new Runner("Valentina", 256));
		table.add(new Runner("Alex", 128));
		table.add(new Runner("Jun", 124));
		table.add(new Runner("Rudi", 324));
		table.add(new Runner("Kristian", 118));
		
		Iterator<Runner> iterator = table.iterator();
		while(iterator.hasNext() ) {
			System.out.println(iterator.next());
		}
		System.out.println();
		
		
		TreeSet <Runner> table1 = new TreeSet<> ();
		table1.add(new Runner("Liam", 185));
		table1.add(new Runner("Jonas", 165));
		table1.add(new Runner("Valentina", 256));
		table1.add(new Runner("Alex", 128));
		table1.add(new Runner("Jun", 124));
		table1.add(new Runner("Rudi", 324));
		table1.add(new Runner("Kristian", 118));
		
		
		Iterator<Runner> iterator1 = table1.iterator();
		while(iterator1.hasNext() ) {
			System.out.println(iterator1.next());
		}
		System.out.println();
		
		TreeSet<Runner> table2 = new TreeSet<> (new MarahponNameCamparator());
		
		table2.add(new Runner("Liam", 185));
		table2.add(new Runner("Jonas", 165));
		table2.add(new Runner("Valentina", 256));
		table2.add(new Runner("Alex", 128));
		table2.add(new Runner("Jun", 124));
		table2.add(new Runner("Rudi", 324));
		table2.add(new Runner("Kristian", 118));
		
		Iterator<Runner> iterator2 = table2.iterator();
		while(iterator2.hasNext() ) {
			System.out.println(iterator2.next());
		}
	}

}
