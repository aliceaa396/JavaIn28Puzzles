package JavaDrills.MotorBikeDrill;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike harley = new MotorBike();
        MotorBike honda = new MotorBike();

        //Can Do:
        harley.start();
        honda.start();

        System.out.println("===============================================================================");
        System.out.println("===============================================================================");

        harley.setSpeed(100);
        honda.setSpeed(50);
        //Can't Do:
        //MotorBike.start(); OR MotorBike.speed = 100;
        //WHY?? Bc. you can only preform methods on an instance, and you can only pass and instance to an instance of a class

        System.out.println("The Harley is going " + harley.getSpeed() + " MPH!");
        System.out.println("The Honda is going " + honda.getSpeed() + " MPH!");

        System.out.println("===============================================================================");
        System.out.println("===============================================================================");

        harley.increaseSpeed(100);
        honda.increaseSpeed(25);

        System.out.println("The harley is now going " + harley.getSpeed() + " MPH!!!");
        System.out.println("The honda is now going " + honda.getSpeed() + " MPH!!!");

        System.out.println("===============================================================================");
        System.out.println("===============================================================================");

        harley.decreaseSpeed(175);
        honda.decreaseSpeed(10);

        System.out.println("WOOOP WOOOP WOOP WOOP");
        System.out.println("WOOOP WOOOP WOOP WOOP");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("The Harley was just pulled going over 170MPH above the speed limit! The Harleys now going " + harley.getSpeed() + " MPH...WOMP WOMP");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println("The Honda was told to keep driving safe and is now going " + honda.getSpeed() + " MPH...");


    }


}
