package genericandannotation;

public class Mentor<T> {

    private T deyisen;

    public Mentor(T deyisen) {
        this.deyisen = deyisen;
    }

    public T getDeyisen() {
        return deyisen;
    }

    public void setDeyisen(T deyisen) {
        this.deyisen = deyisen;
    }

    //type eraser
    public void myMethod(Mentor<? super Integer> mentor) {

    }

    public void myMethod2(Mentor<? extends Number> mentor) {

    }
}
