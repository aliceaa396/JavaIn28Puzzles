package JavaDrills.FunctionalProgramming;

import java.util.List;
import java.util.function.Predicate;


public class MethodReferencesRunner {
    public static void print(Integer number) {
        System.out.println(number);
    }

    public static boolean isEven(Integer num){
        return num % 2 ==0;
    }

    public static void main(String[] args) {
        List.of("Ant", "Bat", "Cat", "Elephant").stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s));
        //Below is a short cut for the reference method above
        //.forEach(System.out::println);

        List.of("Ant", "Bat", "Cat", "Elephant").stream()
                .map(String::length)
                .forEach(System.out::print);

        Integer max = List.of(23,45,67,34).stream()
                .filter(MethodReferencesRunner::isEven)
                .max(Integer::compare)
                .orElse(0);
        System.out.println(max);
    }

}
