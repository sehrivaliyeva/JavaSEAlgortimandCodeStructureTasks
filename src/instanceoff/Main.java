package instanceoff;

public class Main {
    public static void main(String[] args) {
        // upcasting
        Parent p = new Child();
        Parent p2 = new Child2();

        //downcasting
        if (p instanceof Parent) {
            Child c = (Child) p;
            System.out.println("downcasting");
        }

    }
}
