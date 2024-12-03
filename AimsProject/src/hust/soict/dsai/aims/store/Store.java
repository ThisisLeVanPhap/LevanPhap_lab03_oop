package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.*;
import java.util.LinkedList;
public class Store {
    private LinkedList<Media> itemsInStore = new LinkedList<Media>();

    private boolean checkMedia(Media disc) {
        for (Media item : itemsInStore) {
            if (item.equals(disc)) {
                return true;
            }
        }
        return false;
    }

    public Media findMedia(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

	public LinkedList<Media> getItemsInStore() {
		return itemsInStore;
	}

    public void addMedia(Media disc) {
        if(!checkMedia(disc)) {
            itemsInStore.add(disc);
            System.out.println( disc.getTitle() + " 've been added to the store !");
        } else {
            System.out.println( disc.getTitle() + " 'already exists in the store !");
        }
    }

    public void removeMedia(Media disc) {
        if(checkMedia(disc)) {
            itemsInStore.remove(disc);
            System.out.println( disc.getTitle() + " 've been deleted from the store !");
        } else {
            System.out.println("There is no "+ disc.getTitle() + " in the store !");
        }
    }

    public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }

    public void print() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Items in store:");
            for (Media media : itemsInStore) {
                System.out.println(media.toString());
            }
        }
    }
}