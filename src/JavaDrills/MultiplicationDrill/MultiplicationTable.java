package JavaDrills.MultiplicationDrill;

public class MultiplicationTable {
    //This prints 5 * 1-10
    void printTable() {
        //Refactored Solution
        printBigTable(5);

        //Original Solution
        //for(int i = 1; i <=10; i++) {
        //System.out.printf("%d * %d = %d", i,5, 5 * i).println();
        //}
    }

    //Prints the 1-10 multiplication table for what ever number is passed
    void printBigTable(int num) {
        //Refactored Solution
        printBigTable(num, 1, 10);
        //Legacy Code/Original Solution
        //for(int i = 1; i <=10; i++){
        // System.out.printf("%d * %d = %d", num, i, num * i).println();
        //}
    }

    //
    void printBigTable(int num, int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.printf("%d * %d = %d", num, i, num * i).println();
        }
    }

}
