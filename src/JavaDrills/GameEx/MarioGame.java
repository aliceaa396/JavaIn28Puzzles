package JavaDrills.GameEx;

public class MarioGame implements GamingConsole {


    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Went into hole");
    }

    @Override
    public void left() {
        System.out.printf("Moves back");
    }

    @Override
    public void right() {
        System.out.println("Moves forward");
    }
}
