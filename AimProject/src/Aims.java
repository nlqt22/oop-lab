import java.util.ArrayList;
import java.util.List;

public class Aims {
    public static List<DigitalVideoDisc> itemsInStore() {
        List<DigitalVideoDisc> store = new ArrayList<>();
        store.add(new DigitalVideoDisc("Lion King", "Animation", "Roger Allers", 87, 19.95f));
        store.add(new DigitalVideoDisc("Star Wars", "Science Fiction", "87", 87, 24.95f));
        store.add(new DigitalVideoDisc("Aladin", "Animation",19.95f));

        return store;
    }

    public static void showItemsInStore(List<DigitalVideoDisc> store) {
        System.out.println("Available in Ti-do:");
        int index = 0;
        for(DigitalVideoDisc disc : store) {
            System.out.println((++index) + "." + disc.getTitle() + "\t\t" + disc.getCost() + "$");
        }
    }

    public static void showTotalCost(Cart cart) {
        System.out.print("Total : " + cart.totalCost() + "$");
    }

    public static void main(String[] args) {
        List<DigitalVideoDisc> store = itemsInStore();
        showItemsInStore(store);
        Cart yourCart = new Cart();
        yourCart.removeDigitalVideoDisc(store.get(1));

        showTotalCost(yourCart);
    }
}
