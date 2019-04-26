public class MyHolder<T> {

    private T val;

    protected void put(T t) {
        this.val = t;
    }

    protected T get() {
        return val;
    }


}
