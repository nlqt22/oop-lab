import media.Book;
import media.DigitalVideoDisc;
import media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> store = new ArrayList<Media>();

    public ArrayList<Media> getStore() {
        return store;
    }

    public void seeAllMediaDetails() {
        for(Media media: store) {
            System.out.println(media.toTitleString());
        }
    }

    public void setDvdsToStore() {
        String category = "DVD";
        String[] titles = {"Wonder Woman 1984", "The Croods: A New Age", "F9: The Fast Saga"};
        float[] costs = {99.98f, 15,55f, 22.22f};
        int[] length = {120, 0, 180};
        for(int id = 0; id < 3; ++id) {
            this.store.add(new DigitalVideoDisc(id+1, titles[id], category, costs[id], length[id]));
        }
    }

    public void setBooksToStore() {
        String category = "Book";
        String[] titles = {"It Ends with Us: A Novel", "Where the Crawdads Sing",
                "It Starts with Us: A Novel (It Ends with Us)", "Verity",
                "Reminders of Him: A Novel"};
        float[] costs = {9.99f, 9.98f, 15.22f, 50.00f, 5,99f};
        for(int id = 0; id < 5; ++id) {
            Media book = new Book(id+1, titles[id], category, costs[id]);
            this.store.add(book);
        }
    }
}
