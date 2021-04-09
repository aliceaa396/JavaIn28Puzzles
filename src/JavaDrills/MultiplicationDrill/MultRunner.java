package JavaDrills.MultiplicationDrill;

import JavaDrills.MultiplicationDrill.MultiplicationTable;

public class MultRunner {
    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        table.printTable();

        MultiplicationTable bigTable = new MultiplicationTable();
        bigTable.printBigTable(18);
    }

}
