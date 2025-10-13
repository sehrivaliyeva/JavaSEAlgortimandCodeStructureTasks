package tekrar;

public class Stack<T> {
    T[] stack;
    int size = 0;
    int capacity = 0;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];
        this.size = -1;
    }

    //LIFO //10
    public void set(T element) {
        if (capacity > size && capacity > 0) {
            stack[capacity - 1] = element;
            size++;
        }
    }

    public T get() {
        return stack[capacity - 1];
    }

    static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>(10);
        stack1.set(1);
        stack1.set(2);
        stack1.set(3);
        for (int i = 0; i < stack1.size; i++) {
            System.out.println((stack1.stack[i]));

        }
    }

}
