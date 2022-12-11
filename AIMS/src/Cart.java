import media.Media;

import java.util.ArrayList;

public class Cart {
    private final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered;
    private ArrayList<Media> itemsOrdered;

    public Cart() {
        qtyOrdered = 0;
        itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);
    }

    public void viewCart() {
        for(Media media : this.itemsOrdered) {
            System.out.println(media.toString());
        }
    }

    // 0-OK, 1-FULL, 2-ALREADYIN
    public int addMedia(Media media) {
        if(this.qtyOrdered > 20) {
            System.err.println("[ERROR]Your cart is full (20)");
            return 1;
        } else {
            if(this.itemsOrdered.contains(media)) {
                System.err.println("[ERROR]This media has already in your cart");
                return 2;
            } else {
                this.itemsOrdered.add(media);
                ++this.qtyOrdered;
            }
        }
        return 0;
    }

}
