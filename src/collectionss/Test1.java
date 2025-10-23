package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test1 {
    static void main(String[] args) {
        List<String> list = new ArrayList<>(); //10 //amortise //1.5
        list.add("Mars");
        list.add("Mars");
        list.add("Yupiter");
        list.add("Sun");
        list.add("Venera");
        System.out.println(list.get(3));


       /* System.out.println(list.get(0));
        for(String s: list) {
            System.out.println(s);
        }*/

       /* Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

    }
}
