package practise1;

public class Library {
    static {
        System.out.println("Kitabxanaya xosh gelmisiz !!");
    }

    int id;
    String name;
    String category;
    int hallCount;
    int totalCapacity;
    Book[] books;
    Address address;

    public Library(int id, String name, String category, int hallCount, int totalCapacity, Book[] books, Address address) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.hallCount = hallCount;
        this.totalCapacity = totalCapacity;
        this.books = books;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("id " + this.id);
        System.out.println("name " + this.name);
        System.out.println("category " + this.category);
        System.out.println("hallCount " + this.hallCount);
        System.out.println("totalCapacity " + this.totalCapacity);
        address.displayInfo();

        for (Book book : this.books) {
            book.displayInfo();
        }
    }

    public void addBook(Book book) {
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        newBooks[books.length] = book;
        books = newBooks;
    }

}
