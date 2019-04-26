import java.time.LocalTime;
import java.util.Random;

public class testApp {
    private void printHeapContents(Heap... heaps) {
        for (Heap heap : heaps) {
            System.out.println(heap.getCurrentType());
            System.out.println("Min: " + heap.getMin().toString());
            System.out.println("Max: " + heap.getMax().toString());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        testApp app = new testApp();

        int N = 5;
        Random rnd = new Random();

        Heap<Integer> intHeap = new Heap<>(4);
        Heap<LocalTime> timeHeap = new Heap<>(LocalTime.now());
        Heap<LongHolder> holderHeap = new Heap<>(new LongHolder());

        for (int i = 0; i < N; i++) {
            intHeap.add(rnd.nextInt(100));
            timeHeap.add(LocalTime.now().plusMinutes(rnd.nextInt(55)));
            holderHeap.add(new LongHolder());
        }
        intHeap.printContents();
        timeHeap.printContents();
        holderHeap.printContents();
        System.out.println("Min and Max values will be displayed below");
        System.out.println();

        app.printHeapContents(intHeap, timeHeap, holderHeap);


    }


}
