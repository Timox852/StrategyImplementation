package strategyobjects_sorting;

/**
 * Sorts an integer array by comparing two sequenced numbers and moving the
 * bigger one behind.
 * 
 * @author marzok_t
 *
 */
public class BubbleSort implements SortingAlgorithm {

	/**
	 * Sorts an integer array by the bubbleSort algorithm
	 */
	@Override
	public void sort(int toSort[]) {
		int n = toSort.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (toSort[j] > toSort[j + 1]) {
					int temp = toSort[j];
					toSort[j] = toSort[j + 1];
					toSort[j + 1] = temp;
				}
	}
}