package JavaDrills.OOP;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("GE", 03.4567, "Green,");
        System.out.println("================================MADE FAN====================================");
        System.out.println(fan);


        System.out.println("==================================TURNED FAN ON==================================");
        fan.switchOn();
        System.out.println(fan);



        System.out.println("===================================CHANGE FAN SPEED=================================");
        fan.setSpeed((byte)10);
        System.out.println(fan);

        System.out.println("===================================TURN FAN OFF=================================");
        fan.switchOff();
        System.out.println(fan);


    }

}
