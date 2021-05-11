package JavaDrills.AbstractInterfaceDrill;

interface Flyable{
    void fly();
}

class Bird implements Flyable{
    public void fly(){
        System.out.println("With Wings");
    }
}

class Airplane implements Flyable{
    public void fly(){
        System.out.println("With Fuel");
    }
}

public class DrillRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Airplane()};
        for(Flyable object : flyingObjects){
            object.fly();
        }
    }
}
