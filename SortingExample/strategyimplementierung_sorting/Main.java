package strategyimplementierung_sorting;

import java.util.Arrays;

import strategyobjects_sorting.BubbleSort;
import strategyobjects_sorting.SelectionSort;
import strategyobjects_sorting.SortingAlgorithm;

public class Main {

	/**
	 * Entry point
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		int[] unsorted = createRandomUnsortedArray(20, 1, 100);

		int[] sortedBySelectonSort = sort(unsorted, new SelectionSort());
		int[] sortedByBubbleSort = sort(unsorted, new BubbleSort());

		System.out.println("Unsorted:      " + Arrays.toString(unsorted));
		System.out.println("SelectionSort: " + Arrays.toString(sortedBySelectonSort));
		System.out.println("BubbleSort:    " + Arrays.toString(sortedByBubbleSort));
	}

	/**
	 * Creates an integer array with random numbers under the given conditions
	 * 
	 * @param length lengths of the array
	 * @param min    smallest possible number (negative is possible)
	 * @param max    biggest possible numbers
	 * @return integer array with random numbers
	 */
	private static int[] createRandomUnsortedArray(int length, int min, int max) {
		int range = max - min + 1;
		int[] newArray = new int[length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (int) (Math.random() * range) + min;
		}
		return newArray;
	}

	/**
	 * Sorts an integer array with implementation of the strategy design pattern
	 * 
	 * @param unsorted unsorted integer array
	 * @param strategy sorting class
	 * @return sorted integer array
	 */
	private static int[] sort(int[] unsorted, SortingAlgorithm strategy) {
		// Deep copy of unsorted array to differentiate between sorted and unsorted
		// array
		int[] toBeSorted = new int[unsorted.length];
		for (int i = 0; i < unsorted.length; i++) {
			toBeSorted[i] = unsorted[i];
		}

		IntArray strategyArray = new IntArray(toBeSorted);

		strategyArray.setSortingAlgorithm(strategy);
		strategyArray.sort();
		return toBeSorted;
	}
}