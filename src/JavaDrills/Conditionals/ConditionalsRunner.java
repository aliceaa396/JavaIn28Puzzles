package JavaDrills.Conditionals;

public class ConditionalsRunner {
    public static void main(String[] args) {
       puzzle1();
       puzzle2();
       puzzle3();
       puzzle4();
       puzzle5();
    }
    private static void puzzle1() {
        int k = 2;
        //k is less than 20, so it goes to the next case to check, once the condition matches none of the other statements are checked
        if (k > 20) {
            System.out.println(1);
        } else if (k > 10) {
            System.out.println(2);
        } else if (k < 20) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }


    private static void puzzle2(){
        int l=15;
        if(l < 20){
            System.out.println("L < 20");//EXECUTED
        }
        if(1 >20){
            System.out.println(" L > 20");
        } else {
            System.out.println("Who am I??");//EXECUTED
        }
        //The first statement gets evaluated then the else statement does because its in a different block
    }
    private static void puzzle3(){
        int m = 15;
        if(m >20){
            if(m <20){
                System.out.println("m >20");
            }
        } else {
            System.out.println("Who am i");
        }
        //Without the curly braces the statement would not execute, with them the out put is who am i
    }
    private static void puzzle4(){
        //CANT USE INT AS CONDITION
        //if(i){
            //System.out.println("Im I");
        //}
        //CANT WRITE I=1 BC THATS AN ASSIGNMENT NEED ==
        int i = 4;
        if(i == 1){
            System.out.println("Correct I");
        }
    }
    private static void puzzle5(){
        int num = 5;
        if(num < 0) {
            num = num + 10;
        }else{
            num++;
            System.out.println(num);
        }
    }
}
