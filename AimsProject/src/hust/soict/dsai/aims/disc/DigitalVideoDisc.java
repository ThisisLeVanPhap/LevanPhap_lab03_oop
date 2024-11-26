package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0; //class attribute
	private int id;//instance attribute
	
	private String title;
	private String category;
	private String director;
	private double cost;
	private int length;
	
	//constructor method
	public DigitalVideoDisc(String title) {
		super();
	    this.title = title;
	    this.id =  ++nbDigitalVideoDiscs; //update c.a and assign id
	}

	public DigitalVideoDisc(String title, String category, double cost) {
	    this.title = title;
	    this.category = category;
	    this.cost = cost;
	    this.id =  ++nbDigitalVideoDiscs; //update c.a and assign id
	}

	public DigitalVideoDisc(String title, String category, String director, double cost) {
	    this.title = title;
	    this.category = category;
	    this.director = director;
	    this.cost = cost;
	    this.id =  ++nbDigitalVideoDiscs; //update c.a and assign id
	}

	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
	    this.title = title;
	    this.category = category;
	    this.director = director;
	    this.length = length;
	    this.cost = cost;
	    this.id =  ++nbDigitalVideoDiscs; //update c.a and assign id
	}
	
	// getter
	public String getTitle() {
	    return title;
	}

	public String getCategory() {
	    return category;
	}

	public String getDirector() {
	    return director;
	}

	public int getLength() {
	    return length;
	}

	public double getCost() {
	    return cost;
	}
	//setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
}
