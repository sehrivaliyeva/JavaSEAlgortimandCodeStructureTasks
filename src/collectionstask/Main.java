package collectionstask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {
        List<Student>students = new ArrayList<>();
        students.add(new Student("Cavid", 102));
        students.add(new Student("Ali", 25));
        students.add(new Student("Zorxan", 100));
        students.add(new Student("Sadatxan", 85));
        students.add(new Student("Agalar", 12));

       /* Collections.sort(students, new StudentAgeComparator());
        for(Student s:students) {
            System.out.println(s);
        }*/
        Collections.sort(students, new StudentNameComparator());
        for(Student s:students) {
            System.out.println(s);
        }



    }
}
