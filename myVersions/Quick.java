package myVersions;

public class Quick {

    public static void sort(Integer[] array, int low, int high) {

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

                sort(array, low, higher);
                
            }

            if (high > lower) {

                sort(array, lower, high);
                
            }
            
        }
        
    }

    private static void swap(Object array[], int arg1, int arg2) {

        Object placeHolder = array[arg1];
        array[arg1] = array[arg2];
        array[arg2] = placeHolder;
    }

}
