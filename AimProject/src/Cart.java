import media.DigitalVideoDisc;
import media.Media;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered;
    private ArrayList<Media> itemsOrdered;

    public Cart() {
        qtyOrdered = 0;
        itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);
    }

    public void addMedia(Media media) {
        if(qtyOrdered > 20) {
            System.err.println("Limited Cart");
        } else {
            if(itemsOrdered.contains(media)) {
                System.err.println("This media has already in your cart");
                return ;
            } else {
                itemsOrdered.add(media);
                qtyOrdered++;
            }
        }
        return ;
    }

}
