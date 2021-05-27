package JavaDrills.StreamOps;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExerRunner {
    public static void main(String[] args) {
        //Print squares of first 10 nums
        IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.println(e));
        System.out.println("======================================================");
        //Map all to lower case and print them
        List<String> strings = List.of("Apple", "Ant", "Bat");
       strings.stream().map(String::toLowerCase).forEach(e -> System.out.println(e));
        strings.stream().map(s -> s.toLowerCase()).forEach(p -> System.out.println(p));
        System.out.println("======================================================");
        //Print length of each element
        strings.stream().map(s -> s.length()).forEach(p -> System.out.println(p));
        System.out.println("======================================================");
        //Put even nums into a list
        List.of(10,11,12,13,14,15,16,17,18).stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        //Create a list of the squares of first 10 integers
        IntStream.range(1,11).map(e -> e * e).boxed().collect(Collectors.toList());

    }
}
