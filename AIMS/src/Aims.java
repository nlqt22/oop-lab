import media.DigitalVideoDisc;
import media.Media;
import utils.Display;
import utils.User;

public class Aims {
    private static void setMediaToStore(Store store) {
        store.setBooksToStore(); store.setDvdsToStore();
    }

    /**
     * @function: ':q' - quit function
     * @function: ':ls' - show list media in store
     * @return null: if user type ':q'
     * */
    private static Media findByTitle(Store store) {
        boolean found = false;
        int quitEnterTitle = 0;
        do {
            System.out.print("[See a media's details]");
            String title = User.enterString("Enter title (use ':q' to quit, ':ls' to show list medias)");
            // System.out.println("Your input :" + title);
            if(title.equals(":q")) quitEnterTitle = 1;
            if(title.equals(":ls")) store.seeAllMediaDetails();
            for(Media media : store.getStore()) {
                if(media.getTitle().equals(title)) {
                    System.out.println(media.toDetailString());
                    return media;
                }
            }
            if(quitEnterTitle == 0) System.out.println("Your title is not found in store!");
        } while(quitEnterTitle == 0);
        if(quitEnterTitle == 2) System.out.println("Quit");
        return null;
    }

    private static void seeMediaDetails(Store store, Cart cart) {
        boolean run = true;
        Media media = findByTitle(store);
        if(media.equals(null)) run = false;
        while(run) {
            Display.mediaDetailsMenu();
            int option = User.enterNumber("Choose option:");
            switch (option) {
                case 1:
                    System.out.println("Add to cart");
                    addToCart(media, cart);
                    break;
                case 2:
                    System.out.println("Play");
                    break;
                case 0:
                    System.out.println("Back");
                    run = false;
                    break;
                default:
                    System.out.println("Please choose a number: 0-1-2");
            }
        }
    }

    private static void addMediaToCart(Store store, Cart yourCart) {
        String SUCCESS = "Add item to your cart successfully";
        Media media = findByTitle(store);
        if(media == null) return;
        char yesNo = User.enterChar("Do you want to add "+ media.getTitle() + " to your cart ?(Y/N)");
        if(yesNo == '0') System.out.println("Error");
        if(yesNo == 'Y' || yesNo == 'y')
        {
            yourCart.addMedia(media);
            System.out.println(SUCCESS);
        } else {
            System.out.println("Cancel");
        }
    }

    private static void addToCart(Media media, Cart yourCart) {
        String SUCCESS = "Add item to your cart successfully";
        char yesNo = User.enterChar("Do you want to add "+ media.getTitle() + " to your cart ?(Y/N)");
        if(yesNo == '0') System.out.println("Error");
        if(yesNo == 'Y' || yesNo == 'y')
        {
            yourCart.addMedia(media);
            System.out.println(SUCCESS);
        } else {
            System.out.println("Cancel");
        }
    }

    private static void playMedia(Media media) {
        DigitalVideoDisc dvd = new DigitalVideoDisc();
        if(media.getClass().equals(dvd.getClass())) {

        }
    }

    private static void viewStore(Store store, Cart cart) {
        Display.viewStore();

        boolean run = true;
        while(run) {
            System.out.print("[View store]");
            int option = User.enterNumber("Choose option:");
            switch (option) {
                case 1:
                    System.out.println("See a media's details");
                    seeMediaDetails(store, cart);
                    break;
                case 2:
                    System.out.println("Add a media to cart");
                    addMediaToCart(store, cart);
                    break;
                case 3:
                    System.out.println("Play a media");
                    break;
                case 4:
                    System.out.println("See current cart");
                    seeCurrentCart(cart);
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    System.out.println("Please choose a number: 0-1-2-3-4");
                    break;
            }
        }
        System.out.println("Out");
    }

    public static void seeCurrentCart(Cart cart) {
        cart.viewCart();
    }


    public static void userHandlin() {
        Store store = new Store();
        store.setDvdsToStore(); store.setBooksToStore();
        Cart cart = new Cart();

        boolean run = true;
        Display.showMenu();
        while(run) {
            System.out.print("[AIMS]");
            int option = User.enterNumber("Choose option:");
            switch (option) {
                case 1:
                    System.out.println("View store");
                    viewStore(store, cart);
                    break;
                case 2:
                    System.out.println("Update store");
                    //addToCart(store, cart);
                    break;
                case 3:
                    System.out.println("See current cart");
                    seeCurrentCart(cart);
                    break;
                case 0:
                    System.out.println("Exit");
                    run = false;
                    break;
                default:
                    System.out.println("Please choose a number: 0-1-2-3");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        userHandlin();
    }
}