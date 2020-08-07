package strategyobjects_sorting;

/**
 * Sorts an integer array by finding the lowest number and switching it to the
 * front.
 * 
 * @author marzok_t
 *
 */
public class SelectionSort implements SortingAlgorithm {

	/**
	 * Sorts an array by the SelectionSort algorithm
	 */
	@Override
	public void sort(int[] toSort) {
		for (int i = 0; i < toSort.length - 1; i++) {
			for (int j = i + 1; j < toSort.length; j++) {
				if (toSort[i] > toSort[j]) {
					int temp = toSort[i];
					toSort[i] = toSort[j];
					toSort[j] = temp;
				}
			}
		}
	}
}
