package JavaDrills.OOP3;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(1, "Everything is F*cked a Book about Hope", "Mark Manson");
        Review review = new Review(1, "Great Read, Would recommend", 10);

        book.addReview(new Review(1, "Amazing book",10));
        book.addReview(new Review(2, "Ehh book",6));

        System.out.println(book);
    }
}
