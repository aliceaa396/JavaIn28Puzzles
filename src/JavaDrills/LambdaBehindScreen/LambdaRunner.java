package JavaDrills.LambdaBehindScreen;
import java.util.List;
import java.util.function.Predicate;

class EvenNumPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer number){
        return number%2==0;
    }
}
public class LambdaRunner {
    public static void main(String[] args) {
        List.of(23,43,34,44).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));

        //Both lines of code above and below achieve the same result
        List.of(23,43,34,44).stream().filter(new EvenNumPredicate()).forEach(e -> System.out.println(e));

        //Stream<T> filter(Predicate <? super T> predicate);
        //boolean test(T t)
    }
}
