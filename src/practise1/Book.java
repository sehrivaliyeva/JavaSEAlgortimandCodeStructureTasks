package practise1;

public class Book {
    int id;
    String name;
    String author;
    int pageCount;
    int count; //20
    int price;

    public Book(int id, String name, String author, int pageCount, int count, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
        this.count = count;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("ID: " + this.id
                + " Name: " + this.name
                + " Author: " + this.author
                + " Pages: " + this.pageCount
                + " Count: " + this.count
                + " Price: " + this.price);
    }

    public boolean isExpensive() {
        if (price > 100) {
            System.out.println("isExpensive");
            return true;
        } else {
            System.out.println("isCheap");
            return false;
        }
    }

    public boolean isThickBook() {
        if (pageCount != 0 && pageCount > 2000) {
            return true;
        } else {
            return false;
        }
    }

    int calculatePrice(int amount ) {
        return price * amount;
    }

}
