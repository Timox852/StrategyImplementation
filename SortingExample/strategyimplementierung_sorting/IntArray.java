package strategyimplementierung_sorting;

import strategyobjects_sorting.SortingAlgorithm;

/**
 * Implementation of strategy design pattern. Different sorting algorithms can
 * be used to sort an integer array.
 * 
 * @author marzok_t
 *
 */
public class IntArray {

	private SortingAlgorithm algorithm = null;
	private int[] intArray = null;

	/**
	 * Constructor
	 * 
	 * @param array unsorted integer array
	 */
	public IntArray(int[] array) {
		intArray = array;
	}

	/**
	 * Constructor
	 * 
	 * @param array     unsorted integer array
	 * @param algorithm specific sorting algorithm
	 */
	public IntArray(int[] array, SortingAlgorithm algorithm) {
		intArray = array;
		this.algorithm = algorithm;
	}

	/**
	 * Sets sortingAlgorithm
	 * 
	 * @param algorithm SorthingAlgorithm to set
	 */
	public void setSortingAlgorithm(SortingAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	/**
	 * Calls the implementation of the current sorting algorithm and sorts the
	 * integer array.
	 */
	public void sort() {
		if (algorithm != null && intArray != null) {
			algorithm.sort(intArray);
		}
	}
}