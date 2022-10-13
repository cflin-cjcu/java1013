public class Box<T> {
    private T t;

    public void add(T a) {
        this.t = a;
    }

    public T get() {
        return this.t;
    }
}
