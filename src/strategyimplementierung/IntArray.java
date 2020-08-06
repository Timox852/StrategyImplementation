package strategyimplementierung;

import strategyobjects.SortingAlgorithm;

public class IntArray {

	private SortingAlgorithm algorithm = null;
	private int[] intArray = null;

	public IntArray(int[] array) {
		intArray = array;
	}

	public void setSortingAlgorithm(SortingAlgorithm algo) {
		algorithm = algo;
	}

	public void sort() {
		if (algorithm != null && intArray != null) {
			algorithm.sort(intArray);
		}
	}
}