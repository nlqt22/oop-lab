import media.Book;
import media.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;

public class Aims {
    public static void main(String[] args) {
        DigitalVideoDisc dvd = new DigitalVideoDisc(2, "Lion King", "DVD-MOVIE", 180.45f,
                                            "Thomas", 90, "2022-02-22");
        Book book = new Book(1, "Qua tang cuoc song", "SACH", 25.55f);
        book.addAuthor("Nguyen Van A");
        book.addAuthor("Nguyen Van A");
        book.addAuthor("Nguyen Van B");
        book.showListAuthors();
        book.removeAuthor("Nguyen Van A");
    }
}