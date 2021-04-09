package JavaDrills.Conditionals;

public class SwitchRunner {
    public static void main(String[] args) {
        puzzle1();
        puzzle2();
        puzzle3();
        puzzle4();
        //puzzle5();
        //puzzle6();
    }

    private static void puzzle1() {
        //The Switch statement below outputs 12-16, this is because k starts at 2 so the switch starts at case 2
        int k = 2;
        switch (k) {
            case 1:
                System.out.println(11);
            case 2:
                System.out.println(12);
            case 3:
                System.out.println(13);
            case 4:
                System.out.println(14);
            case 5:
                System.out.println(15);
            case 6:
                System.out.println(16);
            default:
                System.out.println("Default Action PUZZLE 1");
        }
    }

    private static void puzzle2() {
        int num = 2;
        switch (num) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                //Fall through--starts executing code in next case
            case 3:
                System.out.println("Number is 2 or 3");
                break;
            default:
                System.out.println("Default Action PUZZLE 2");
        }
    }

    private static void puzzle3() {
        //Output would be the default case bc there is no case 10
        int num = 10;
        switch (num) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Default Action PUZZLE 3");
        }
    }

    private static void puzzle4() {
        //In switch the default condition can be anywhere unlike an else statement
        int num = 10;
        switch (num) {
            default:
                System.out.println("Default Action PUZZLE 4");
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
        }
    }
}
//    private static void puzzle5(){
//        //CANT switch on long, float, boolean, or double
//        //CAN switch on char, string, int, enum variables, byte or short
//        long l = 15;
//        switch (num) {
//            default:
//                System.out.println("Default Action PUZZLE 4");
//                break;
//            case 1 :
//                System.out.println(1);
//                break;
//            case 2 :
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//        }
//    }
//    private static void puzzle6(){
//        //invalid case of code, you cannot have a condition inside a case
//        int num = 10;
//        int i = num * 2;
//        switch (num) {
//            case num > 5:
//                System.out.println("num > 5");
//        }
//    }
//}
