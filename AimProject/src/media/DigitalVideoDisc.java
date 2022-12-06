package media;

public class DigitalVideoDisc extends Media{
    private String director;
    private int length;
    private String addDate;

    public DigitalVideoDisc() {
        super();
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

//    public DigitalVideoDisc(String title, String category, float cost) {
//        this.title = title;
//        this.category = category;
//        this.cost = cost;
//    }
//
//    public DigitalVideoDisc(String title, String category, String director, float cost) {
//        this.title = title;
//        this.category = category;
//        this.director = director;
//        this.cost = cost;
//    }
//
//    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
//        this.title = title;
//        this.category = category;
//        this.director = director;
//        this.length = length;
//        this.cost = cost;
//    }
}
