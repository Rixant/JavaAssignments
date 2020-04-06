package Cards;

public class Algorithms <T extends Comparable<T>>
{
    int N=15;

    public Algorithms()
    {
    }

    // Partition using Hoare's Partitioning scheme
    public static <T extends Comparable<T>> int Partition(T []a, int low, int high)
    {
        T pivotElement=a[low];
        int i=low-1;
        int j=high+1;

        while (true)
        {
            do
            {
                i++;
            } while (a[i].compareTo(pivotElement)<0);

            do
            {
                j--;
            } while (a[j].compareTo(pivotElement)>0);

            if (i >= j)
                return j;

            //swap(a[i], a[j]);
            Swap(a, i, j);
        }
    }

    public static <T extends Comparable<T>> void Swap(T []a, int i, int j)
    {
        T temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    // Quicksort routine
    public static <T extends Comparable<T>> void QuickSort(T []a, int low, int high)
    {
        //base condition
        if (low>=high)
            return;

        //rearrange the elements across pivot
        int pivotIndex=Partition(a, low, high);

        //recurse on sub-array containing elements that are less than pivot
        QuickSort(a, low, pivotIndex);

        //recurse on sub-array containing elements that are more than pivot
        QuickSort(a, pivotIndex+1, high);
    }

    // Function to check if arr is sorted in ascending order or not
    public static <T extends Comparable<T>> boolean isSorted(T []arr)
    {
        T prev=arr[0];
        for (int i=1 ; i<arr.length; i++)
        {
            if (prev.compareTo(arr[i])>0)
            {
                System.out.println("QuickSort Failed!");
                return false;
            }
            prev=arr[i];
        }
        return true;
    }

    public static <T extends Comparable<T>> void Print(T []arr)
    {
        for (int i=1; i<arr.length; i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }

    // main function
    public static void main(String []args)
    {
        Integer []intArray={3, 5, 2, 6, 9, 0, 1};
        Print(intArray);

        //QuickSort(intArray, 0, intArray.length-1);
        QuickSort(intArray, 0, 6);

        if (isSorted(intArray))
        {
            for (int i=0 ; i<6; i++)
                System.out.print(intArray[i]+" ");
        }
        System.out.println();
    }
}
