package JavaDrills.MotorBikeDrill;

//Objects have both State and Behavior
public class MotorBike {

    //State of Bike Ex.:
    private int speed;
    //Speed is an instance variable and can only be used on instances of the class
    //Now the issue we have now posed is one of encapsulation. Only the class where the instance variable is created should access its internal variables
    //--> The Runner class should not be setting the speed
    //Encapsulation refers to the concept that classes cant manipulate the data of other classes
    //Private keyword makes it so you cant access the variable from outside the class
    //int speed -----> private int speed;

    void start() {
        System.out.println("Start.....ROOOOM");
    }

    //input - int speed
    //output - void
    // name - setSpeed

    void setSpeed(int speed){ //local variable
        //condition to make sure the speed is over 0
        if (speed > 0 ) {
            this.speed = speed;
        }
    }


    //How do we access the speed? With a getter method

    int getSpeed(){
        return speed;
    }

    public void increaseSpeed(int howMuch) {

        this.speed = this.speed + howMuch;

        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        //Ensures that we cant decrease speed from 0
        if (this.speed - howMuch > 0 ) {
            this.speed = this.speed - howMuch;
        }
        //a bit repetitive though bc the setSpeed method checks if its 0, instead:
        setSpeed(this.speed - howMuch);
    }

}
