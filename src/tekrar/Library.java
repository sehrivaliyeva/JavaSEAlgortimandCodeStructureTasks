package tekrar;

public class Library {
    Book[] books;

    public Library() {
        this.books = new Book[10];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
            }
        }
    }
}
