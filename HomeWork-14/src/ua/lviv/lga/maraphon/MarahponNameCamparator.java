package ua.lviv.lga.maraphon;

import java.util.Comparator;

public class MarahponNameCamparator implements Comparator <Runner>{

	@Override
	public int compare(Runner r1, Runner r2) {
		if (r1.getName().compareTo(r2.getName()) > 0) {
			return 1;
		} else if (r1.getName().compareTo(r2.getName()) < 0) {
			return -1;
		} else {
			return 0;
		}
		
	}

}
