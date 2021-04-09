package JavaDrills.ForLoopDrills;

public class MyNumberRunner {


    public static void main(String[] args) {
        MyNumber num = new MyNumber(5);

        boolean isPrime = num.isPrime();
        System.out.println("Is Prime " + num.isPrime());

        int sum = num.sumUpToN();
        System.out.println("Sum Up To N: " + num.sumUpToN());

        int sumOfDivisors = num.sumOfDivisors();
        System.out.println("Sum Of Divisors " + num.sumOfDivisors());

       num.printANumTriangle();

    }
}
