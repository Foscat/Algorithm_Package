package myVersions;

public class Merge {

    @SuppressWarnings("rawtypes")
	public static Comparable[] MergeSort(Comparable[] list) {

        //If list is empty do nothing;
        if (list.length <=1) {
            return list;
        }

        //Split the array in half making 1 array into 2
        Comparable[] firstHalf = new Comparable[list.length / 2];
        Comparable[] secondHalf = new Comparable[list.length - firstHalf.length];
        System.arraycopy(list, 0, firstHalf, 0, firstHalf.length);
        System.arraycopy(list, firstHalf.length, secondHalf, 0, secondHalf.length);

        //Sort each half recursively
        MergeSort(firstHalf);
        MergeSort(secondHalf);

        //Merge the 2 arrays together and overwrite old array
        merger(firstHalf, secondHalf, list);

        return list;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	private static void merger(Comparable[] firstHalf, Comparable[] secondHalf, Comparable[] result) {

        //Index position in firstHalf needs to start at 0
        int firstHalfIndex = 0;

        //Index position in secondHalf needs to start at 0
        int secondHalfIndex = 0;

        //Index position in mergedArray needs to start at 0
        int mergedArrayIndex = 0;

        //Compare elements at firstHalfIndex and secondHalfIndex and move smaller into mergedArrayIndex

        while (firstHalfIndex < firstHalf.length && secondHalfIndex < secondHalf.length) {

            if (firstHalf[firstHalfIndex].compareTo(secondHalf[secondHalfIndex]) < 0) {

                result[mergedArrayIndex] = firstHalf[firstHalfIndex];
                firstHalfIndex++;
                
            }else{
                result[mergedArrayIndex] = secondHalf[secondHalfIndex];
                secondHalfIndex++;
            }

            mergedArrayIndex++;
            
        }

        System.arraycopy(firstHalf, firstHalfIndex, result, mergedArrayIndex, firstHalf.length - firstHalfIndex);
        System.arraycopy(secondHalf, secondHalfIndex, result, mergedArrayIndex, secondHalf.length - secondHalfIndex);
    }
}
