package practise;

public class Person {
    // fieldler yaradin  4 dene
    //constuctor overloading temin edin
    // bir eded void method yaradin
    // bir eded return type olan method yaradin
    // 1 eded static kod bloku yaradin
    // Person classindan 1 eded object yaradin
    // deyisenlere deyer menimsedin
    //methodlari cagirin

    String name;
    String surame;
    int age;
    int a = 70;

    static {
        int a = 70;
        System.out.println("static blok");
    }

    {
        System.out.println("object blok");
    }

    /*public Person() {

    }*/

    //this  // this()
    public Person(String name, String surname, int age) {
        this(name);
        this.name = name;
        this.surame = surname;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public void myMethod(int age) {
    }

    public String myMethod() {
        return "hello";
    }

    public static void main(String[] args) {
        Person person = new Person("Ali", "Nuriyev", 33);
        person.myMethod();
        person.myMethod(3);
    }
//Stack yaddas LIFO ile isleyir
}

