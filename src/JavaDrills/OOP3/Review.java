package JavaDrills.OOP3;

public class Review {
    private int id;
    private String desc;
    private int rating;

    public Review(int id, String desc, int rating){
        this.id = id;
        this.desc = desc;
        this.rating = rating;
    }

    public String toString(){
        return id + "" + desc + "" + rating;
    }
}
