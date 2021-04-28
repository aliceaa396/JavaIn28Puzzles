package JavaDrills.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


public class Student {
    private String name;
    //private int [] marks
    //below is how you initiate an array list and restrict any type other than Integer
    private ArrayList<Integer>  marks = new ArrayList<Integer>();



    public Student(String name,int... marks){
        this.name = name;
        //this.mark = mark;

        for(int mark : marks) {
            //adds each mark element to array list
            this.marks.add(mark);
        }

    }

    public int getMinMark() {
        //Collections.min(marks);
        int min = Integer.MAX_VALUE; //98,99,100
        for(int mark:marks){
            if(mark < min){
                min = mark;
            }
        }
        return min;
    }

    public int getMaxMark() {
        //return Collections.max(marks);

       int max = Integer.MIN_VALUE; //98,99,100
        for(int mark:marks){
            if(mark > max){
                max = mark;
            }
        }
        return max;
    }

    public int getSumOfMarks() {
          int sum = 0;
        for(int mark:marks){
            sum += mark;
        }
        return sum;
    }

    public int getNumOfMarks() {
        //return marks.length
        //Must use size because .length will not work on Array Lists
        return marks.size();
    }

    public BigDecimal getAvgMarks() {
        int sum = getSumOfMarks();
        int number = getNumOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP);
    }

    public String toString(){
        return name + marks;
    }

    public void addNewMark(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }
}
