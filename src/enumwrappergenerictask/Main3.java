package enumwrappergenerictask;

public class Main3 {
    static void main(String[] args) {
        Storage storage = new Storage<>("hello"); //raw
        storage.setItem(3);
        storage.setItem('v');
        storage.setItem(5.5);


        Storage<String> storage2 = new Storage<>("hello");
        storage2.setItem("world");
        storage2.method(5);

      //?--wildcard
        Storage<?> storage3 = new Storage<>(5.5);

    }
}
