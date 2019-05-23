package myVersions;

public class Algorithms {
///////////////////////////////Bubble////////////////////////////////////////////////////////
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void Bubble(Object[] array, int fromIndex, int toIndex){
		Object myArray;
		for (int to = toIndex - 1; to>fromIndex; to--){
			boolean sorted = true;

			for(int from = fromIndex; from < to; from++){

				if( ( (Comparable) array[from]).compareTo(array[from+1]) > 0){

					sorted = false;
					myArray = array[from + 1];
					array[from + 1] = array[from];
					array[from] = myArray;

				}
			}
			if(sorted){
				break;
			}
		}
	}

	////////////////////////////////////Insert////////////////////////////////////////////////////////////////////////
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void Insert(Object[] array, int fromIndex, int toIndex) {

        Object myArray;

        for(int from = fromIndex + 1; from < toIndex; from++){

            myArray = array[from];
            int newFrom = from;

            while (newFrom > fromIndex && ((Comparable) array[newFrom -1]).compareTo(myArray) > 0) {

                array[newFrom] = array[newFrom -1];
                newFrom--;
                
            }

            array[newFrom] = myArray;
        }
	}

	//////////////////////////////////////Merge//////////////////////////////////////////////////////////////////////////
	
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
    
    ///////////////////////////////////Quick//////////////////////////////////////////////////

    public static void Quick(Integer[] array, int low, int high) {

        // Check for empty array
        if (array == null || array.length == 0) {

            return;
            
        }
        
        if (low >= high) {

            return;
            
        }

        //Get pivot point element from middle of list
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        //make left< and right> pivot
        int lower = low;
        int higher = high;

        while (lower <= higher) {

            //Check all values on left side of array are lower than pivot
            while (array[lower] < pivot) {

                lower++;
                
            }

            //Check until all values on left side are greater than pivot
            while (array[higher] > pivot) {

                higher--;
                
            }

            //Compare values on each side to check if swap is needed
            if (lower <= higher) {

                //If swap happens move iterators
                swap(array, lower, higher);
                lower++;
                higher--;
                
            }

            //Perform recursive operation to sort 2 sub arrays
            if (low < higher) {

                Quick(array, low, higher);
                
            }

            if (high > lower) {

                Quick(array, lower, high);
                
            }
            
        }
        
    }

    private static void swap(Object array[], int arg1, int arg2) {

        Object placeHolder = array[arg1];
        array[arg1] = array[arg2];
        array[arg2] = placeHolder;
    }

    ///////////////////////////////////////////Select/////////////////////////////////////////////////////////////////

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void Select(Object[] array, int fromIndex, int toIndex) {

        Object myArray;
        
        for (int currentIndex = fromIndex; currentIndex < toIndex; currentIndex++) {

            int indexToMove = currentIndex;

            for (int tempLoopIndex = currentIndex; tempLoopIndex < toIndex; tempLoopIndex++) {

                if (((Comparable) array[indexToMove]).compareTo(array[tempLoopIndex]) > 0) {

                    //Perform swap
                    indexToMove = tempLoopIndex;
                    
                }
                
            }

            myArray = array[currentIndex];
            array[currentIndex] = array[indexToMove];
            array[indexToMove] = myArray;
            
        }
        
    }
}
