
public class Strings {
	/**
	 * 
	 * @param str1
	 * @param str2
	 * @return true if str2 is an anagram of str1
	 * complexity O[N] two passes
	 * 1. the same length
	 * 2. the same symbols just in different order
	 */
public static boolean isAnagram(String str1, String str2) {
	boolean res = false;
	if (str1.length()==str2.length()) {
	char[] yellowAr = str1.toCharArray();
	char[] anagramAr = str2.toCharArray();	
	//int tempArr[] = new int[sum];
	for (int i = 0; i < array.length; i++) {
		int serchedNumber = sum - array[i];
		tempArr[array[i]] = tempArr[array[i]] + 3;
		tempArr[serchedNumber] = tempArr[serchedNumber] + 3;	
		if (tempArr[i] == 6 && tempArr[serchedNumber] == 6) {
			res = true;
	
	}
	
	
	
		}
	}
	return res;
}
}
