package JavaDrills.Queue;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class StringLengthComp implements Comparator <String> {

    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(), value2.length());
        //to reverse the order switch value 1 with value 2
    }
}
public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue =  new PriorityQueue<>(new StringLengthComp());
        queue.addAll(List.of("Zebra", "Cat", "Monkey"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
