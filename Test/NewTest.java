package Test;

import java.util.Arrays;

import myVersions.Bubble;
import myVersions.Insert;
import myVersions.Merge;
import myVersions.Quick;
import myVersions.Select;

public class NewTest {
	public static void main(String[] args){
        
        // This is unsorted array
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
        
        // Let's sort using bubble sort
        Bubble.sort(array, 0, array.length);

        // Verify sorted array
        System.out.println(Arrays.toString(array));

        //This is unsorted array
        Integer[] array1 = new Integer[] {12,13,24,10,3,6,90,70};

        //Let's sort using insertion sort
        Insert.sort(array1, 0, array1.length);

        //Verify sorted array
        System.out.println(Arrays.toString(array));

        //Unsorted array
        Integer[] a = { 2, 6, 3, 5, 1 };

        //Call merge sort
        Merge.MergeSort(a);

        //Check the output which is sorted array
        System.out.println(Arrays.toString(a));
        
     // This is unsorted array
        Integer[] array3 = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };

        // Let's sort using quick sort
        Quick.sort( array, 0, array.length - 1 );

        // Verify sorted array
        System.out.println(Arrays.toString(array));

        // This is unsorted array
        Integer[] array4 = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };

        // Let's sort using selection sort
        Select.sort(array, 0, array.length);

        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }
}
