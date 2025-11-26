package dependencyinjection;

public class Main {
    static void main() {

        School school = new School("Egitim", new KimyaTeacher());
        School school2 = new School("Egitim2", new MathTeacher());
    }
}
