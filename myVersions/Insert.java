package myVersions;

public class Insert {

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sort(Object[] array, int fromIndex, int toIndex) {

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
}
