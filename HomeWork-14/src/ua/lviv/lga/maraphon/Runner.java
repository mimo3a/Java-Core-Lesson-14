package ua.lviv.lga.maraphon;

public class Runner implements Comparable <Runner>{
	private String name;
	private int time;
	
	public Runner(String name, int time) {
		super();
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public int getTime() {
		return time;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Runner [name=" + name + ", time=" + time + "]";
	}

	@Override
	public int compareTo(Runner r) {
		if(this.time > r.getTime()) {
			return 1;
		} else if (this.time < r.getTime()) {
			return -1;
		} else {
			return 0;
		}
		
	}
	
	

}
