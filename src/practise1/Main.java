package practise1;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Xetai", "Baku", "Azerb", 111);
        System.out.println(address.isValidPostalCode());
        Book book1 = new Book(1, "Xemese", "Nizami", 200, 5, 50);
        Book book2 = new Book(2, "Cinayet ve Ceza", "Dostayevski", 2500, 10, 100);
        Book book3 = new Book(3, "Leyli ve Mecnun", "Fizuli", 170, 25, 70);
        int a=book3.calculatePrice(2);
        System.out.println(book3.isExpensive());
        System.out.println(a);
        Book[] book = {book1, book2};
        Library kitabxana = new Library(1, "Axundov", "Boyukler ucun", 10, 100, book, address);
        kitabxana.addBook(book3);
        kitabxana.displayInfo();

    }
}
