package coursetask;

import java.util.Objects;

public class Manager  {
    int age;
    String name;

    public Manager(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Manager manager = (Manager) o;
        return age == manager.age && Objects.equals(name, manager.name);
    }*/

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Manager manager)){
            return false;}
        return age == manager.age && Objects.equals(name, manager.name);
    }

}
