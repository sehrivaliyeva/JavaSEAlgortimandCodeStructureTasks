package xxxxx;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Main33 {
    static void main() {
        Set<Person> set = new HashSet<>();
        Person p1 = new Person(1, "Sh"); //111
        Person p2 = new Person(1, "Sh");//222


        String soz1 = "hello";
        String soz2 = "salam";

        Queue<String> queue = new ArrayDeque<>();
        queue.add(soz1);
        queue.offer(soz1);
        queue.peek();
        queue.poll();
        queue.element();
        queue.remove(soz1);
        System.out.println(queue);

        //Iterator  iterator()  Iterable
        //ListIterator
        //Comparator
        //Comparable
        //Map --> Entry
    }
}
