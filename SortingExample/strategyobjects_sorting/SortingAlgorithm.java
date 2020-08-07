package strategyobjects_sorting;

/**
 * Interface for different sorting algorithms.
 * 
 * @author marzok_t
 *
 */
public interface SortingAlgorithm {

	/**
	 * Sorts the provided integer array
	 * 
	 * @param toSort unsorted integer array (call by reference)
	 */
	void sort(int[] toSort);
}
