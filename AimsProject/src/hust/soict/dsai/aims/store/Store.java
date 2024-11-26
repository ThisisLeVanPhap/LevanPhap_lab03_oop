package hust.soict.dsai.aims.store;

import java.util.LinkedList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private LinkedList<DigitalVideoDisc> itemsInStore = new LinkedList<>();

    private boolean checkDVD(DigitalVideoDisc disc) {
        for (DigitalVideoDisc digitalVideoDisc : itemsInStore) {
            if (digitalVideoDisc.equals(disc)) {
                return true;
            }
        }
        return false;
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (!checkDVD(disc)) {
            itemsInStore.add(disc);
            System.out.println(disc.getTitle() + " has been added to the store!");
        } else {
            System.out.println(disc.getTitle() + " already exists in the store!");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (checkDVD(disc)) {
            itemsInStore.remove(disc);
            System.out.println(disc.getTitle() + " has been deleted from the store!");
        } else {
            System.out.println("There is no " + disc.getTitle() + " in the store!");
        }
    }

    public String toString() {
        StringBuilder string = new StringBuilder("****************STORE****************\nItems in the store:\n");
        if (itemsInStore.isEmpty()) {
            string.append("There is no DVD in the store!\n");
        } else {
            for (DigitalVideoDisc dvd : itemsInStore) {
                string.append(dvd.getTitle())
                      .append(" - ")
                      .append(dvd.getCost())
                      .append(" $\n");
            }
        }
        string.append("***************************************");
        return string.toString();
    }
}
