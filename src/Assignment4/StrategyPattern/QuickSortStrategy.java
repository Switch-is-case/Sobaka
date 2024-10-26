package Assignment4.StrategyPattern;

import java.util.List;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> numbers) {
        if (numbers == null || numbers.size() == 0) {
            return;
        }
        quickSort(numbers, 0, numbers.size() - 1);
    }

    private void quickSort(List<Integer> numbers, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(numbers, low, high);
            quickSort(numbers, low, pivotIndex - 1);  // Sort elements before pivot
            quickSort(numbers, pivotIndex + 1, high); // Sort elements after pivot
        }
    }

    private int partition(List<Integer> numbers, int low, int high) {
        int pivot = numbers.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (numbers.get(j) <= pivot) {
                i++;
                // Swap numbers[i] with numbers[j]
                int temp = numbers.get(i);
                numbers.set(i, numbers.get(j));
                numbers.set(j, temp);
            }
        }
        // Swap numbers[i+1] with numbers[high] (or pivot)
        int temp = numbers.get(i + 1);
        numbers.set(i + 1, numbers.get(high));
        numbers.set(high, temp);

        return i + 1;
    }
}