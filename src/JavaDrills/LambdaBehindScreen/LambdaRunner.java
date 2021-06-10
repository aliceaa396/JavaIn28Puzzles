package JavaDrills.LambdaBehindScreen;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumPredicate implements Predicate<Integer> {
    //Stream<T> filter(Predicate <? super T> predicate);
    //boolean test(T t)
    @Override
    public boolean test(Integer number) {
        return number % 2 == 0;
    }
}
class NumSquareWrapper implements Function<Integer, Integer> {
    //.map(n -> n * n)
    //<R> Stream <R> map(Function<? super T, ? extends R> mapper);
    // R apply(T t)
    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}

class SysOutConsumer implements Consumer<Integer> {
    //.forEach(n- >system.out.println(); is a consumer
    //Consumer<? super  T> action
    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }
}


public class LambdaRunner {
    public static void main(String[] args) {
        List.of(23,43,34,36,48).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));

        List.of(23,43,34,44).stream().filter(new EvenNumPredicate()).forEach(e -> System.out.println(e));

        List.of(23,43,34,44).stream().filter(new EvenNumPredicate()).forEach(new SysOutConsumer());

        List.of(23,43,34,36,48).stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(e -> System.out.println(e));

        List.of(23,43,34,44).stream().filter(new EvenNumPredicate()).map(new NumSquareWrapper()).forEach(new SysOutConsumer());



    }
}
