package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        // Add sample items to store for testing
        store.addMedia(new Book(1, "Book A", "Fiction", 10.5f, new ArrayList<>()));
        store.addMedia(new DigitalVideoDisc(2, "DVD A", "Action", 15.0f, "Director 1", 120));
        store.addMedia(new DigitalVideoDisc(3, "DVD B", "Action", 12.0f, "Director 2", 90));
        store.addMedia(new Book(4, "Book B", "Science", 8.0f, new ArrayList<>()));

        int choice;

        while (true) {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    handleViewStore(store, cart, scanner);
                    break;
                case 2:
                    handleUpdateStore(store, scanner);
                    break;
                case 3:
                    handleSeeCart(cart, scanner);
                    break;
                case 0:
                    System.out.println("Exiting AIMS. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    private static void handleViewStore(Store store, Cart cart, Scanner scanner) {
        System.out.println("\nStore Items:");
        store.print();
        int choice;
        do {
            storeMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter media title: ");
                    String title = scanner.nextLine();
                    Media media = store.findMediaByTitle(title);
                    if (media != null) {
                        System.out.println(media.toString());
                        if (media instanceof Playable) {
                            System.out.println("1. Add to cart\n2. Play\n0. Back");
                            int option = scanner.nextInt();
                            scanner.nextLine();
                            if (option == 1) {
                                cart.addMedia(media);
                            } else if (option == 2) {
                                ((Playable) media).play();
                            }
                        } else {
                            System.out.println("1. Add to cart\n0. Back");
                            int option = scanner.nextInt();
                            scanner.nextLine();
                            if (option == 1) {
                                cart.addMedia(media);
                            }
                        }
                    } else {
                        System.out.println("Media not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter media title to add to cart: ");
                    title = scanner.nextLine();
                    media = store.findMediaByTitle(title);
                    if (media != null) {
                        cart.addMedia(media);
                    } else {
                        System.out.println("Media not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter media title to play: ");
                    title = scanner.nextLine();
                    media = store.findMediaByTitle(title);
                    if (media instanceof Playable) {
                        ((Playable) media).play();
                    } else {
                        System.out.println("Media cannot be played.");
                    }
                    break;
                case 4:
                    handleSeeCart(cart, scanner);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    private static void handleUpdateStore(Store store, Scanner scanner) {
        System.out.println("1. Add media\n2. Remove media\n0. Back");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            System.out.println("Adding a new media is currently not implemented.");
        } else if (choice == 2) {
            System.out.print("Enter media title to remove: ");
            String title = scanner.nextLine();
            Media media = store.findMediaByTitle(title);
            if (media != null) {
                store.removeMedia(media);
                System.out.println("Media removed from store.");
            } else {
                System.out.println("Media not found.");
            }
        }
    }

    private static void handleSeeCart(Cart cart, Scanner scanner) {
        cart.printAll();
        int choice;
        do {
            cartMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Filter by ID or Title?");
                    String filterType = scanner.nextLine();
                    cart.filterBy(filterType);
                    break;
                case 2:
                    System.out.println("Sort by title or cost?");
                    String sortType = scanner.nextLine();
                    if (sortType.equalsIgnoreCase("title")) {
                        cart.sortBy(Media.COMPARE_BY_TITLE_COST);
                    } else if (sortType.equalsIgnoreCase("cost")) {
                        cart.sortBy(Media.COMPARE_BY_COST_TITLE);
                    }
                    break;
                case 3:
                    System.out.print("Enter media title to remove: ");
                    String title = scanner.nextLine();
                    Media media = cart.findMediaByTitle(title);
                    if (media != null) {
                        cart.removeMedia(media);
                    } else {
                        System.out.println("Media not found in cart.");
                    }
                    break;
                case 4:
                    System.out.print("Enter media title to play: ");
                    title = scanner.nextLine();
                    Media media1 = cart.findMediaByTitle(title);
                    if (media1 instanceof Playable) {
                        ((Playable) media1).play();
                    } else {
                        System.out.println("Media cannot be played.");
                    }
                    break;
                case 5:
                    cart.placeOrder();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
