package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	
	public Book(int id, String title, String category, float cost, List<String> authors) {
		// TODO Auto-generated constructor stub
		super(id, title, category, cost);

    }
	
    public void addAuthor(String authorName) {
        if(authors.contains(authorName)) {
            System.out.println("already existed");
        } else {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if(authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println(authorName + " not found");
        }
    }
    
    public void listAuthors() {
        if (authors.isEmpty()) {
            System.out.println("No authors available.");
        } else {
            System.out.println("Authors: " + String.join(", ", authors));
        }
    }
    
    @Override
    public String toString() {
        return "Book [Title=" + getTitle() + ", Category=" + getCategory() + ", Cost=" + getCost() + "]";
    }

}
