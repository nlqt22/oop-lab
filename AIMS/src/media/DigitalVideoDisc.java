package media;

public class DigitalVideoDisc extends Media{
    private String director;
    private int length;
    private String addDate;

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public DigitalVideoDisc() {
        super();
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public String toTitleString() {
        return "{"+ this.getCategory() + "} " + this.getTitle();
    }

    @Override
    public String toDetailString() {
        return    "Title: " + this.getTitle() + "\n"
                + "Category: " + this.getCategory() + "\n"
                + "Cost: " + this.getCost() + "$\n"
                + "Length: " + this.getLength() + " min\n"
                + "Director: " + this.getDirector() + "\n"
                + "Add date " + this.getAddDate();
    }

    public DigitalVideoDisc(int id, String title, String category, float cost,int length) {
        super(id, title, category, cost);
        this.length = length;
    }

    public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length, String date) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
        this.addDate = date;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

}
