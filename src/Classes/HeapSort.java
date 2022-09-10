package Classes;

import java.util.ArrayList;

public class HeapSort {
    private static int heapSize;

    public void sort(ArrayList<Integer> list) {
        buildHeap(list);
        while (heapSize > 1) {
            changeElements(list, 0, heapSize - 1);
            heapSize--;
            prepareHeap(list, 0);
        }
    }

    private void buildHeap(ArrayList<Integer> list) {

        heapSize = list.size();
        for (int i = list.size() / 2; i >= 0; i--) {
            prepareHeap(list, i);
        }
    }

    private void prepareHeap(ArrayList<Integer> list, int i) {
        int lIndex = leftIndex(i);
        int rIndex = rightIndex(i);
        int largest = i;
        if (lIndex < heapSize && list.get(i) < list.get(lIndex)) {
            largest = lIndex;
        }
        if (rIndex < heapSize && list.get(largest) < list.get(rIndex)) {
            largest = rIndex;
        }
        if (i != largest) {
            changeElements(list, i, largest);
            prepareHeap(list, largest);
        }
    }

    private int rightIndex(int i) {
        return 2 * i + 2;
    }

    private int leftIndex(int i) {
        return 2 * i + 1;
    }

    private void changeElements(ArrayList<Integer> list, int i, int large) {
        int temp = list.get(i);
        list.set(i, list.get(large));
        list.set(large, temp);
    }

    public void printArray(ArrayList<Integer> list, String text){
        System.out.println(text);
        for(Integer i: list){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
