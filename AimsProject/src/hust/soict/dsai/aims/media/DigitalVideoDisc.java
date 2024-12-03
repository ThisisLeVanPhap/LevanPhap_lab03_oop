package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	
    public DigitalVideoDisc(int id, String title, String category, float cost, String director, float length) {
        super(id, title, category, cost, director, length);
    }
	
    public void play() {
    	System.out.println("Playing DVD: " + this.getTitle());
    	System.out.println("DVD length: " + this.getLength());
    	}
    
    @Override
    public String toString() {
        return "DVD [Title=" + getTitle() + ", Category=" + getCategory() + 
               ", Cost=" + getCost() + ", Director=" + getDirector() + 
               ", Length=" + getLength() + "]";
    }

}