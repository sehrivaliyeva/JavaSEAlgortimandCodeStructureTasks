package enumwrappergenerictask;

public class Storage<T> {
    T item;

    public Storage(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public <B> void method(B item) {
        System.out.println(item);
    }
}
