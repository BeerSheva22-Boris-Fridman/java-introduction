import java.util.Arrays;

public class MyArrays {
	
	public static void main(String[] args) {
		removeNumber(new int[] {1, 2, 3, 4, 5}, 2);
	}
/**
 * 
 * @param array
 * @param number
 * @return new array with added at end a given number
 */
	public static int[] addsNumber(int[] array, int number) {
	int newArray[] = Arrays.copyOf(array, array.length+1);
	newArray[array.length]=number;
					//use standart class Arrays, method copyOf
		return newArray;
}
/**
 *
 * @param array
 * @param index
 * @return new arry with no number at a given index in a given array
 * if index does not exist in a given array it returns the same array
 */
	//use standart class System, method arrycopy
	
	public static int[] removeNumber(int[] array, int index) {
		int newArray[] = new int [array.length - 1];		
		
		if(array.length > index && index > 0) {
			System.arraycopy(array, 0, newArray, 0, index);
			System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
		} else { return array; }
		System.out.print(Arrays.toString(newArray));
		return newArray;
	}
/**
 * 
 * @param arraySorted - sorted array
 * @param number
 * @return new array with inserted number at an index for keeping array sorted
 * 
 */
	public static int[] insertSorted(int arraySorted[], int number) {
		//TODO
		// use the method binerySerch of the standart class Arrays
		// use the method arraycopy of the standart class System
		return null; 
	}
}
