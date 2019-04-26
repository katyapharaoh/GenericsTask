import java.util.Random;

public class LongHolder extends MyHolder<Long> implements Comparable<LongHolder> {
    private Random rnd = new Random();

    public LongHolder() {
        this.put((long)(rnd.nextDouble()*1000));
    }

    @Override
    public int compareTo(LongHolder o) {
        return (int)(this.get()-o.get());
    }

    public String toString(){
        return this.get().toString();
    }
}
