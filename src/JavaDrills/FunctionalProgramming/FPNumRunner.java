package JavaDrills.FunctionalProgramming;

import java.util.List;

public class FPNumRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,4,6,8,10,12,13,17);
        numbers.stream().forEach(element -> System.out.println(element));
        //How can we get the sum for all numbers
        int sum = numbers.stream().reduce(0,(number1, number2) -> number1 + number2);
        System.out.println("The sum of all the numnbers is: " + sum);

        int oddNums = numbers.stream().filter(element -> element % 2 == 1)
                .reduce(0,(element1, element2) -> element1 + element2);
                System.out.println("The odd numbers summed up are: " + oddNums);
    }


}
