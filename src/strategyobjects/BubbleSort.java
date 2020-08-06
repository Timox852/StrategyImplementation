package strategyobjects;

public class BubbleSort implements SortingAlgorithm
{
    public int[] sort(int toSort[])
    {
        int n = toSort.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (toSort[j] > toSort[j + 1])
                {
                    int temp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = temp;
                }
        return toSort;
    }
}