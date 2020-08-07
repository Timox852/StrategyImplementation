package strategyimplementierung_sorting;

import java.util.Arrays;

import strategyobjects_sorting.BubbleSort;
import strategyobjects_sorting.SelectionSort;
import strategyobjects_sorting.ShuffleSort;
import strategyobjects_sorting.SortingAlgorithm;

public class Main
{

	/**
	 * Entry point
	 * 
	 * @param args unused
	 */
	public static void main(String[] args)
	{
		int[] unsorted = createRandomUnsortedArray(10, 1, 100);
		System.out.println("Unsorted: " + Arrays.toString(unsorted));

		long bubbleDur = countSortDuration(unsorted, new BubbleSort());
		System.out.println("Sorted with BubbleSort in " + bubbleDur + " Nanoseconds");

		long selectionDur = countSortDuration(unsorted, new SelectionSort());
		System.out.println("Sorted with SelectionSort in " + selectionDur + " Nanoseconds");

		long shuffleDur = countSortDuration(unsorted, new ShuffleSort());
		System.out.println("Sorted with SelectionSort in " + shuffleDur + " Nanoseconds");
	}

	/**
	 * Creates an integer array with random numbers under the given conditions
	 * 
	 * @param length lengths of the array
	 * @param min    smallest possible number (negative is possible)
	 * @param max    biggest possible numbers
	 * @return integer array with random numbers
	 */
	private static int[] createRandomUnsortedArray(int length, int min, int max)
	{
		int range = max - min + 1;
		int[] newArray = new int[length];
		for (int i = 0; i < newArray.length; i++)
		{
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
	private static int[] sort(int[] unsorted, SortingAlgorithm strategy)
	{
		// Deep copy of unsorted array to differentiate between sorted and unsorted
		// array
		int[] toBeSorted = new int[unsorted.length];
		for (int i = 0; i < unsorted.length; i++)
		{
			toBeSorted[i] = unsorted[i];
		}

		IntArray strategyArray = new IntArray(toBeSorted);

		strategyArray.setSortingAlgorithm(strategy);
		strategyArray.sort();
		return toBeSorted;
	}

	/**
	 * Counts the duration of a sorting process in nanoseconds
	 * 
	 * @param unsorted unsorted array to sort
	 * @param strategy sorting algorithm
	 * @return duration of sorting process in nano seconds
	 */
	private static long countSortDuration(int[] unsorted, SortingAlgorithm strategy)
	{
		long startTime = System.nanoTime();
		sort(unsorted, strategy);
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
}