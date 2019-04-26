public class MinMaxer<T extends Comparable<T>> {

    public T getMax(T firstElem, T secondElem) {
        if (firstElem.compareTo(secondElem) >=0)
            return firstElem;
        else
            return secondElem;
    }

    public T getMin(T firstElem, T secondElem){
        if (firstElem.compareTo(secondElem) <=0)
            return firstElem;
        else
            return secondElem;
    }

}
