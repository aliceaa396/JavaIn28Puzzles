package JavaDrills.Primitive.DataTypes;

public class BiNumRunner {
    public static void main(String[] args) {
        BiNum numbers = new BiNum(2,3);
        System.out.println(numbers.addNums());
        System.out.println(numbers.multiplyNums());
        numbers.doubleNums();
        System.out.println(numbers.getNum1());
        System.out.println(numbers.getNum2());
    }
}
