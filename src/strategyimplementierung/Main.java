package strategyimplementierung;

import strategyobjects.BubbleSort;
import strategyobjects.SelectionSort;
import strategyobjects.SortingAlgorithm;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] unsorted = createRandomUnsortedArray(20, 1, 100);

		int[] sortedBySelectonSort = sort(unsorted, new SelectionSort());
		int[] sortedByBubbleSort = sort(unsorted, new BubbleSort());

		System.out.println("Unsorted:      " + Arrays.toString(unsorted));
		System.out.println("SelectionSort: " + Arrays.toString(sortedBySelectonSort));
		System.out.println("BubbleSort:    " + Arrays.toString(sortedByBubbleSort));
	}

	private static int[] createRandomUnsortedArray(int length, int min, int max) {
		int range = max - min + 1;
		int[] newArray = new int[length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (int) (Math.random() * range) + min;
		}
		return newArray;
	}

	private static int[] sort(int[] unsorted, SortingAlgorithm strategy) {
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