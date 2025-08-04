package coursetask;

public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager(20, "Aygun");//11111
        Manager manager2 = new Manager(20, "Aygun");//12221

        System.out.println(manager1.equals(manager2));
        System.out.println(manager1 == manager2);

    }
}
