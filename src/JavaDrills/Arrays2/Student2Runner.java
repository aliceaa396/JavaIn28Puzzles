package JavaDrills.Arrays2;

import java.math.BigDecimal;
import java.util.Arrays;

public class Student2Runner {
    public static void main(String[] args) {
        int [] marks = {100,98,96,94,92,90};

        Student student = new Student("Angel", marks);

        int number = student.getNumOfMarks();
        System.out.println("Total number of Grades: " + number);

        int sum = student.getSumOfMarks();
        System.out.println("Sum of Grades: " + sum);

        int maxMark = student.getMaxMark();
        System.out.println("Your highest grade was:" + maxMark);

        int minMark = student.getMinMark();
        System.out.println("Your lowest grade was:" + minMark);

        BigDecimal avg = student.getAvgMarks();
        System.out.println("Your GPA AVG this Semester was: " + avg);

    }

}
