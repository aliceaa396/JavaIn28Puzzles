package JavaDrills.OOP;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("GE", 03.4567, "Green");

        fan.isOn(false);

        System.out.println(fan);
    }

}
