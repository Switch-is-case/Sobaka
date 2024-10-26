package Assignment4.StrategyPattern;

import java.util.List;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> numbers) {
        if (numbers == null || numbers.size() == 0) {
            return;
        }

        int n = numbers.size();
        boolean swapped;

        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                    swapped = true;
                }
            }
            // If no two elements were swapped, the list is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
