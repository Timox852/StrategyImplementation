package strategyimplementierung;

import strategyobjects.SortingAlgorithm;

public class IntArray
{

    private SortingAlgorithm algorithm = null;
    private int[] intArray = null;

    public IntArray(int[] array)
    {
        intArray = array;
    }

   
    public void setSortingAlgorith(SortingAlgorithm algo)
    {
        algorithm = algo;
    }

  
    public String getSortingAlgorithm()
    {
        return algorithm.toString();
    }

    
    public int[] go()
    {
        if (algorithm != null && intArray != null)
        {
            int[] sorted = algorithm.sort(intArray);
            return sorted;
        }
        return null;
    }
}