package JavaDrills.OOP2;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 23);

        System.out.println(rectangle);
        rectangle.setWidth(25);
        System.out.println("==================================WIDTH WAS CHANGED==================================");

        System.out.println(rectangle);
    }
}
