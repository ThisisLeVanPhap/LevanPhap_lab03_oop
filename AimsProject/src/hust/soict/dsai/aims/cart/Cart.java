package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    private static final int maxCapacity = 20;
    private DigitalVideoDisc[] pickedDVD = new DigitalVideoDisc[maxCapacity];
    
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < maxCapacity) {
        	pickedDVD[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (pickedDVD[i] == disc) {
            	pickedDVD[i] = pickedDVD[qtyOrdered - 1];
            	pickedDVD[qtyOrdered - 1] = null;
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0.00f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += pickedDVD[i].getCost();
        }
        return total;
    }
    
    //add
    public int addDigitalVideoDisc1(DigitalVideoDisc [] dvdList) {
    	int addedCount = 0;
    	for (DigitalVideoDisc disc : dvdList) {
    		if (qtyOrdered == maxCapacity) {
    			System.out.println("Full");
    			break;
    		}else {
    			pickedDVD[qtyOrdered] = disc;
    			qtyOrdered++;
    			System.out.println("Added successfully");
    			addedCount++;
    		}
    	}
    	return addedCount;
    }
    
    //addDigitalVideoDisc 
    public int addDigitalVideoDisc(DigitalVideoDisc...dvdArray) {
    	int addcount=0;
    	for(DigitalVideoDisc disc : dvdArray) {
    		if (qtyOrdered == maxCapacity) {
    			System.out.println("Full");
    			break;
    		}else {
    			pickedDVD[qtyOrdered] = disc;
    			qtyOrdered++;
    			System.out.println("Added successfully");
    			addcount++;
    		}
    	}
    	return addcount;
    }
    
    //addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
    public int addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
    	if (qtyOrdered + 1 >= maxCapacity) {
    		System.out.println("Full");
    		return 0;
    	} else {
    		pickedDVD[qtyOrdered] = dvd1;
    		qtyOrdered++;
    		System.out.println("Added successfully");
    		
    		pickedDVD[qtyOrdered] = dvd2;
    		qtyOrdered++;
    		System.out.println("Added successfully");
    		
    		return 2;
    	}
    }
    
    //Part6
    public void print() {
    	StringBuilder output = new StringBuilder("***********************CART***********************\r\n"
    			+ "Ordered Items:\r\n"
    			+ "");
    	for (int i=0; i< qtyOrdered;i++) {
    		output.append(i+1 + 
    				". DVD - [" + pickedDVD[i].getTitle() + "] - " + 
    				"[" + pickedDVD[i].getCategory() + "] - " + 
    				"[" + pickedDVD[i].getDirector() + "] - " + 
    				"[" + pickedDVD[i].getLength() + "]: " + 
    				"[" + pickedDVD[i].getCost() + "] $\n");
    	}
    	output.append("Total cost: ").append(totalCost()).append(" $\n");
    	output.append("***************************************************\n");
    	System.out.println(output);
    }
}
