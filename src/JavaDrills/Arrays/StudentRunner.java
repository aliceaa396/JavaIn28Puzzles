package JavaDrills.Arrays;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        int [] marks = {97,100,98};

        Student student = new Student("Angel", marks );
        int number = student.getNumOfMarks();
        System.out.println("Number of Grades: " + number);

        int sum = student.getSumOfMarks();
        System.out.println("Grades total sum: " + sum);

        int maxMark = student.getMaxMark();
        System.out.println("Your highest grade was: " + maxMark);

        int minMark = student.getMinMark();
        System.out.println("Your lowest grade was: " + minMark);

        BigDecimal average = student.getAvgMarks();
        System.out.println("Your average grade was: " + average);

        System.out.println(student);

        student.addNewMark(85);
        System.out.println(student);

        student.removeMarkAtIndex(1);
        System.out.println(student);


    }

}
