package JavaDrills.OOP3;

import java.util.ArrayList;

public class Book {
    private int id;
    private String bookName;
    private String author;
    private ArrayList <Review> reviews = new ArrayList<>();

    public Book(int id, String bookName, String author){
        this.id = id;
        this.bookName = bookName;
        this.author = author;
    }

    public void addReview(Review review){
        this.reviews.add(review);
    }

    public String toString(){
        return String.format("id: %d Book Name: %s author: %s Reviews: [%s]", id,bookName,author,reviews);
    }

}
