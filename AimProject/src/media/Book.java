package media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();
    public Book() {
        super();
    }

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        if(!authors.contains(authorName)) authors.add(authorName);
        else System.err.println("Tac gia da ton tai trong danh sach");

    }

    public void removeAuthor(String authorName) {
        if(authors.contains(authorName)) authors.remove(authorName);
        else System.err.println("Tac gia khong ton tai trong danh sach");
    }

    public void showListAuthors() {
        for(String authorName : this.authors) {
            System.out.println("Tac gia: " + authorName);
        }
    }
}
