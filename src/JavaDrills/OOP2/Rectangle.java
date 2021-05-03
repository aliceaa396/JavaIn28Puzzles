package JavaDrills.OOP2;

//1. Create a Runner class and an object class
//-Rectangle Runner and Rectangle
//2. Create the main method in your runner class and create a new class object
//- Rectangle rectangle = new Rectangle
//3. Create your initial state
//-A rectangle will have a length and width memeber varibale
//4. Create your class constructor
//-public Rectangle(int length, int width)
//5. Create your operations

public class Rectangle {
    //State/ Member Vars.
    private int length;
    private int width;

    //Creation/Constructor
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    //Operations
    public int getWidth(){
        return width;
    }

    public int getLength(int length){
        return length;
    }

    public void setWidth(int width){
        this.width =   width;
    }

    public void setLength(){
        this.length = length;
    }

    public int area() {
        return length * width;
    }

    public int perimeter(){
        return 2 * (length + width);
    }

    public String toString(){
        return String.format("Length: %d, Width: %d, Area: %d, Perimeter: %d,", length, width, perimeter(),area());
    }


}

