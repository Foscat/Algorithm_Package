package myVersions;

public class Select {

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sort(Object[] array, int fromIndex, int toIndex) {

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
