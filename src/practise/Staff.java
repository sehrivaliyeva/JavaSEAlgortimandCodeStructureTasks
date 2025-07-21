package practise;

public class Staff {

    static {
        System.out.println("static blok ishe dushdu");
    }

    {
        System.out.println("object blok ishe dushdu");
    }

    public static void main(String[] args) {
        Staff staff = new Staff();
        Staff staff2 = new Staff();
    }
}
