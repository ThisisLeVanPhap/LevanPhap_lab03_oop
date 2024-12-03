package hust.soict.dsai.test.polymorphism;
import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
public class TestPolymorphism {
	public static void main(String[] args) {
		ArrayList<Media> mediaList = new ArrayList<>();
		mediaList.add(new Book(1, "Book Title", "Fiction", 10.5f, new ArrayList<>()));
		mediaList.add(new DigitalVideoDisc(2, "DVD Title", "Action", 15.0f, "Director", 120));

		for (Media media : mediaList) {
		    System.out.println(media.toString());
		}
	}
}
