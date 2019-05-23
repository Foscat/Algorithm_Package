package myVersions;

public class Bubble {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sort(Object[] array, int fromIndex, int toIndex){
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
