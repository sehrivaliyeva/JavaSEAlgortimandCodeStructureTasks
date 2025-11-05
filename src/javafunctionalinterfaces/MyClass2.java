package javafunctionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass2 {
    static void main() {
        List<Integer> list = List.of(8, 12, 16, 20, 5, 16, 5, 19);

        List<Integer> filteredList;

        boolean deyer = list.stream()
                .filter(x -> x > 5)
                .map(x -> x * 2)
                .distinct()
                .sorted()
                //.limit(3)
                .skip(2)
                .anyMatch(x -> x > 32);
        //.allMatch(x->x>50);

        //.collect(Collectors.toList());
        // .count();

        System.out.println(deyer);


        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        System.out.println(numbers);

       List<Integer>newList= numbers.parallelStream()
                .flatMap(x->x.stream())
                .collect(Collectors.toList());
        System.out.println(newList);


    }
}
