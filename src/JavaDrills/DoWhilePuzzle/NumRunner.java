package JavaDrills.DoWhilePuzzle;
import java.util.Scanner;
//Enter a num and return its cube
//Need scanner class to take input




public class NumRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =-1;
        do {
            if(num != -1) {
                System.out.println(num + " cubed is: " + (num * num * num ));
            }
            System.out.println("Enter a Number to Cube: ");
            num = scanner.nextInt();

        } while(num >= 0);
        System.out.println("Thank you come again");
    }
}
