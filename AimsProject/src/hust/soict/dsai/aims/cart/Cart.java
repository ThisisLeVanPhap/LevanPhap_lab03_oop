package hust.soict.dsai.aims.cart;
import java.util.*;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            System.out.println(item.getTitle() + " already existed");
        } else {
            itemsOrdered.add(item);
            System.out.println("done");
        }
    }

    public void removeMedia(Media item) {
        if (itemsOrdered.remove(item)) {
            System.out.println("The media has been removed.");
        } else {
            System.out.println("The media is not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0.0f;
        for (Media item : itemsOrdered) {
            total += item.getCost();
        }
        return total;
    }
    
    public void printAll() {
        StringBuilder output = new StringBuilder("***********************CART***********************\n")
                .append("Ordered Items:\n");
        if(itemsOrdered.isEmpty()) {
            output.append("No time\n");
        } else {
            int i = 1;
            for (Media item : itemsOrdered) {
                output.append(i + ".[" + item.getTitle() + "] - [" + item.getCategory() + "] - "
                        + item.getCost() + " $\n");
                i++;
            }
        }
    output.append("Total cost: ").append(totalCost()).append(" $\n")
        .append("***************************************************\n");
    System.out.println(output);
    }
    
    // Tìm media theo tiêu đề
    public Media findMediaByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }

    public void filterBy(String filterType) {
        if (filterType.equalsIgnoreCase("id")) {
            System.out.println("Filtered by ID:");
            for (Media media : itemsOrdered) {
                System.out.println("ID: " + media.getId() + " - " + media.getTitle());
            }
        } else if (filterType.equalsIgnoreCase("title")) {
            System.out.println("Filtered by Title:");
            for (Media media : itemsOrdered) {
                System.out.println("Title: " + media.getTitle());
            }
        } else {
            System.out.println("Invalid filter type.");
        }
    }

    public void sortBy(java.util.Comparator<Media> comparator) {
        Collections.sort(itemsOrdered, comparator);
        System.out.println("Cart has been sorted.");
    }

    public void print() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in cart:");
            for (Media media : itemsOrdered) {
                System.out.println(media.toString());
            }
        }
    }

    public void placeOrder() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("Your cart is empty. Cannot place an order.");
        } else {
            System.out.println("Order placed successfully!");
            itemsOrdered.clear();
        }
    }
}