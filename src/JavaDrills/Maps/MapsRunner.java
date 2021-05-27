package JavaDrills.Maps;
import java.util.Map;
import java.util.HashMap;

public class MapsRunner {
    public static void main(String[] args) {
        String str = "This is an awesome occasion. This has never happened before.";
        //Now we want to count how many times a char appears...We shall use map

        Map<Character, Integer> occurrences = new HashMap<>();


        //We are looking for characters so we will create a character array and loop through it
        char[] characters = str.toCharArray();

        for(char character:characters) {
            //Get char
            //If its there we increment the count
            //If not, initialize to 1
            Integer integer = occurrences.get(character);
            if(integer == null) {
                //If its not there the character value would be one
                occurrences.put(character,1);
            } else {
                occurrences.put(character, integer +1);
            }
        }
        System.out.println(occurrences);

        //Get how many times a word appears
        Map<String, Integer> wordOccurences = new HashMap<>();
        //We will split by space into a local array
        String[] words = str.split(" ");

        for(String word:words){
            //get the words through a loop
            Integer integer = wordOccurences.get(word);
            //Checking if the word is there, if it isnt put it w the value 1 if not we increment the value
            if(integer == null){
                wordOccurences.put(word,1);
            } else {
                wordOccurences.put(word, integer + 1);
            }
        }
        System.out.println(wordOccurences);
    }
}
