package JavaDrills.FunctionalProgramming;

import java.util.List;

public class FPRunner {
    public static void main(String[] args) {
        List <String> list = List.of("Apple", "Bat", "Cat", "Hat" );
        for(String string:list){
            System.out.println(string);
        }

    }
    private static void printBasic(List<String> list){
        for (String string:list){
            System.out.println(string);
        }
    }
    private static void printWithFP(List <String> list){
        list.stream().forEach(element -> System.out.println(element));
        //-> is a lambda expression
        //for each logic in the list print out a sys out
        //instead of looping through we are creating a stream to go through
        //We are sending a function to execute the string
    }

    private static void printFiltering(List <String> list){
        for(String string:list){
            if(string.endsWith("at")){
                System.out.println("This is the basic filter " + string);
            }
        }
    }

    private static void printFilteringWithFp(List<String> list){
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println(element));
    }
}
