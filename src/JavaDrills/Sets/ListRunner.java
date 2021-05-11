package JavaDrills.Sets;
import java.util.*;

public class ListRunner {
    public static void main(String[] args) {
        //Unique-Set
        //Tree
        //Hash
        //LinkedHash

        List<Character> characters = List.of('A','X', 'B', 'F', 'Z');
        System.out.println("List of: " + characters);

        //If you care about sorting order
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("Tree Set: " + treeSet);

        //If you care about insertion order utilize a Tree Set
        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println("Linked HashSet: " + linkedHashSet);

        //If you dont care about insertion or sorted order a Hash Set works well
        //Hash Set is the most efficient
        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println("Hash Set: " + hashSet);
    }
}
