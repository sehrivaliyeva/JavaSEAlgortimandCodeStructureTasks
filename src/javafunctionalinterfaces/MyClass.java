package javafunctionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyClass {
    static void main() {
        // Predicate-> boolean test(T t)
        Predicate<Integer> p = (x) -> x > 5;
        boolean result = p.test(2);
        System.out.println(result);

        //Function-> R apply(T t)
        Function<String, Integer> f = (x) -> x.length();
        int a = f.apply("salam");
        System.out.println(a);

        //Consumer-> void accept(T t)
        Consumer<Integer> c = (x) -> System.out.println(x + 5);
        c.accept(5);


        //Supplier-> T get()
        Supplier<String> s = () -> "salam necesen";
        System.out.println(s.get());
    }
}
