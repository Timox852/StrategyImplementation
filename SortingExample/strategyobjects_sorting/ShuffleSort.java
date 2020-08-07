package strategyobjects_sorting;

/**
 * Sorts an integer array by shuffling all positions randomly until they are in
 * order
 * 
 * @author marzok_t
 *
 */
public class ShuffleSort implements SortingAlgorithm
{
	@Override
	/**
	 * Sorts an array by the ShuffleSort Algorithm
	 */
	public void sort(int[] toSort)
	{
		while (!isSorted(toSort))
		{
			shuffle(toSort);
		}
	}

	/**
	 * Shuffles an integer array randomly
	 * 
	 * @param i array to shuffle
	 */
	private void shuffle(int[] i)
	{
		for (int x = 0; x < i.length; ++x)
		{
			int index1 = (int) (Math.random() * i.length);
			int index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}

	/**
	 * Checks if an integer array is sorted ascending
	 * 
	 * @param i integer array to check
	 * @return true if sorted ascending else false
	 */
	private boolean isSorted(int[] i)
	{
		for (int x = 0; x < i.length - 1; ++x)
		{
			if (i[x] > i[x + 1])
			{
				return false;
			}
		}
		return true;
	}
}
