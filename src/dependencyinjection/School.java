package dependencyinjection;

public class School {
    String name;
    Teacher teacher;

    public School(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}
