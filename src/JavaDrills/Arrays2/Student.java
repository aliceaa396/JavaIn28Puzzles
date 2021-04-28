package JavaDrills.Arrays2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private String name;
    private int [] marks; //int array

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    public int getNumOfMarks(){
        return marks.length;
    }

    public int getSumOfMarks() {
        int sum = 0;
        for(int mark:marks){
            sum += mark;
        }
        return sum;
    }

    public int getMaxMark() {
        int max = Integer.MIN_VALUE;

        for(int mark:marks) {
            if(mark > max){
                max = mark;
            }
        }
        return max;
    }

    public int getMinMark() {
        int min = Integer.MAX_VALUE;
        for(int mark:marks){
            if(mark < min) {
                min = mark;
            }
        }
        return min;
    }

    public BigDecimal getAvgMarks() {
        int sum = getSumOfMarks();
        int num = getNumOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(num), 3, RoundingMode.UP);
    }
}
