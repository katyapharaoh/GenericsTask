import java.lang.reflect.Array;
import java.util.Arrays;

public class Heap<T extends Comparable<T>> {
    private T[] list;
    private MinMaxer<T> minMaxer = new MinMaxer<>();
    private String currentType;

    @SuppressWarnings("unchecked")
    public Heap(T firstElem) {
        this.list = (T[]) Array.newInstance(firstElem.getClass(), 1);
        this.list[0] = firstElem;
        this.currentType=firstElem.getClass().getName();
    }

    public void add(T val) {
        list = Arrays.copyOf(list, list.length + 1);
        list[list.length - 1] = val;
    }

    public T getMin() {
        T minValue = list[0];
        for (int i = 1; i < list.length; i++) {
            minValue = minMaxer.getMin(minValue, list[i]);
        }
        return minValue;
    }

    public T getMax() {
        T maxValue = list[0];
        for (int i = 1; i < list.length; i++) {
            maxValue = minMaxer.getMax(maxValue, list[i]);
        }
        return maxValue;
    }

    public MyHolder<T> setMin(MyHolder<T> holder){
        holder.put(getMin());
        return holder;
    }

    public void printContents(){
        for(T elem:list)
            System.out.println(elem +" is in the array");
        System.out.println();
    }

    public String getCurrentType(){
        return currentType;
    }
}
