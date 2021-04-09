package JavaDrills.MenuDrill;
import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        //Type obj name = new Type(arguement);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Num 1:");
        int num1 = scanner.nextInt() ;
        System.out.println("Your first num is: " + num1);

        System.out.println("Enter Num 2:");
        int num2 = scanner.nextInt();
        System.out.println("Your Second Num is:" + num2);

        System.out.println("===============================================================================");
        System.out.println("===============================================================================");

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Divide");
        System.out.println("4. Multiply");
        System.out.println("===============================================================================");
        System.out.println("Enter a Choice:");

        int choice = scanner.nextInt();
        System.out.println("Your Choices are");
        System.out.println("Num 1" + num1);
        System.out.println("Num 2" + num2);
        System.out.println("Choice " + choice);

        //noneSwitchSolution(num1, num2, choice);
    }

//    private static void noneSwitchSolution(int num1, int num2, int choice) {
//        //Nested if/else...better choice would be a switch statement
//        if(choice == 1){
//            System.out.println("Result " + (num1 + num2));
//        } else if(choice == 2){
//            System.out.println("Result " + (num1 - num2));
//        } else if(choice == 3){
//            System.out.println("Result " + (num1 / num2));
//        } else if(choice == 4){
//            System.out.println("Result " + (num1 * num2));
//        } else {
//            System.out.println("ERROR:Choose a valid option");
//        }
//    }

    private static void switchSolution(int num1, int num2, int choice) {
        //Switch statement
        switch(choice){
            case 1:
                System.out.println("Result " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result " + (num1 / num2));
                break;
            case 4:
                System.out.println("Result " + (num1 * num2));
                break;
            default:
                System.out.println("Invalid Choice");
        }

        if(choice == 1){
            System.out.println("Result " + (num1 + num2));
        } else if(choice == 2){
            System.out.println("Result " + (num1 - num2));
        } else if(choice == 3){
            System.out.println("Result " + (num1 / num2));
        } else if(choice == 4){
            System.out.println("Result " + (num1 * num2));
        } else {
            System.out.println("ERROR:Choose a valid option");
        }
    }


}
