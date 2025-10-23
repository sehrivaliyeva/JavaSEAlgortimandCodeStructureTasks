package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task {
    static void main() {
        ArrayList<String> list = new ArrayList<>(List.of("sun", "venera", "saturn",
                "pluton", "earth"));
        System.out.println(list);
        System.out.println("-----------------");
        //Collections.shuffle(list);
        System.out.println(list);
        list.ensureCapacity(25);
        // Collections.reverse(list);
        Collections.swap(list, 0, 3);
        System.out.println(list
        );
        //  list.clear();
        list.set(0, "moon");
        System.out.println(list);
        ArrayList<String> copied = new ArrayList<>(list);



    }
}
