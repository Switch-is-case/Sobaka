package Assignment4.StrategyPattern;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 2, 8, 1);

        // Using BubbleSortStrategy
        Sorter sorter = new Sorter(new BubbleSortStrategy());
        System.out.println("Before Bubble Sort: " + numbers);
        sorter.sortNumbers(numbers);
        System.out.println("After Bubble Sort: " + numbers);

        // Switch to QuickSortStrategy
        sorter.setStrategy(new QuickSortStrategy());
        System.out.println("\nBefore Quick Sort: " + numbers);
        sorter.sortNumbers(numbers);
        System.out.println("After Quick Sort: " + numbers);
    }
}