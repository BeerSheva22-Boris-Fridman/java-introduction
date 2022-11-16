import java.util.Arrays;

public class MyArrays_BF {
	/**
	 * 
	 * @param array
	 * @param number
	 * @return new array with added at end a given number
	 */
	public static int[] addsNumber(int[] array, int number) {
		// use standard class Arrays, method copyOf
		int res[] = Arrays.copyOf(array, array.length + 1);
		res[array.length] = number;
		return res;
	}
	/**
	 * 
	 * @param array
	 * @param index
	 * @return new array with no number at a given index in a given array
	 * if index doesn't exist in a given array it returns the same array
	 */
	public static int[] removeNumber(int array[], int index) {
		// use standard class System, method arraycopy
		
		int res[] = array;
		if (index > -1 && index < array.length) {
			res = new int[array.length - 1];
			System.arraycopy(array, 0, res, 0, index);
			System.arraycopy(array, index + 1, res, index, res.length - index);
		}
		
		return res;
	}
	/**
	 * 
	 * @param arraySorted - sorted array
	 * @param number
	 * @return new array with inserted number at an index for keeping array sorted
	 */
	public static int[] insertSorted(int arraySorted[], int number) {
		// use the method binarySearch of the standard class Arrays
		// use the method arraycopy of the standard class System
		int index = Arrays.binarySearch(arraySorted, number);
		if (index < 0) {
			index = -(index + 1);
		}
		return insertAtIndex(arraySorted, number, index);
		
	}
	private static int[] insertAtIndex(int[] array, int number, int index) {
		int res[] = new int[array.length + 1];
		System.arraycopy(array, 0, res, 0, index);
		res[index] = number;
		System.arraycopy(array, index, res, index + 1, array.length - index);
		return res;
	}
  
	/**
	 * 
	 * @param arraySorted
	 * @param number
	 * @return index value if number exists otherwise -1
	 * O[N] - search number in unsorted array
	 * O[LogN] - search number in sorted (binary search)
	 */
	
	public static void main(String[] args){
        int[] array = {2, 3, 4, 5, 9, 9, 9, 9, 9, 9};
        int target = 9;
 
        int index = binarySearch(array, target);
 
        if (index != -1)
        {
            System.out.println("The first occurrence of element " + target +
                            " is located at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
	public static int binarySearch(int arraySorted[], int number) {
		int startIndex = 0;
		int endIndex = arraySorted.length - 1;
		int result = -1;
		while(startIndex <= endIndex) {
			int middle = (startIndex + endIndex / 2);
			if (number == arraySorted[middle]) {
	     	    result = middle;
	            endIndex = middle - 1;		
	            }
			else if (number < arraySorted[middle]) {
				endIndex = middle - 1;
			    } 
	            else {
				startIndex = middle + 1; 
			}					
		}
		return result;		
	}
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }
    /**
     * 
     * @param array of short positive numbers
     * @param sum
     * @return true if array contains two numbers sum of which equals a given sum
     */
     static public boolean isSum2(short array[], short sum) {
    	 return false;
     }
    
    
    
    
}