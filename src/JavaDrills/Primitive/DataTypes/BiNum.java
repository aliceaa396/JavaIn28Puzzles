package JavaDrills.Primitive.DataTypes;

public class BiNum {
    private int number1;
    private int number2;

    //Constructor Function
    public BiNum(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public int addNums(){
       return number1 + number2;
    }

    public int multiplyNums() {
        return number1 * number2;
    }

    int getNum1() {
        return this.number1 = number1;
    }
    int getNum2() {
        return this.number2 = number2;
    }

    public void doubleNums() {
        this.number1 = number1 * 2;
        this.number2 = number2 * 2;
    }
}
