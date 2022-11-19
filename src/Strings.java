
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
	if (str1.length() != str2.length()) {
        return res;
    }
    char[] yellowAr = str1.toCharArray();
	char[] anagramAr = str2.toCharArray();	
    int helper1[] = new int[Character.MAX_VALUE];
	int helper2[] = new int[Character.MAX_VALUE];
    	for (int i = 0; i < yellowAr.length-1; i++) {
    		helper1[(int) yellowAr[i]]++;
    		helper2[(int) anagramAr[i]]++;
    		if (helper1 == helper2) {
    			return res = true;
    		}else {
    				return res = false;
    			}
    }
    
}
	
	
//	boolean res = false;
//	if (str1.length()==str2.length()) {
//	char[] yellowAr = str1.toCharArray();
//	char[] anagramAr = str2.toCharArray();	
//	int tempArr[] = new int[Character.MAX_VALUE];
//		for (int i = 0; i < yellowAr.length; i++) {
//			int searchedLetter = yellowAr[i];
//			helperArr[array[i]] = helperArr[array[i]] + 3;
//			helperArr[serchedNumber] = helperArr[serchedNumber] + 3;	
//			if (helperArr[i] == 6 && helperArr[serchedNumber] == 6) {
//			res = true;
//	}
//	}
//	return res;
}
//		static public boolean isSum2(short array[], short sum) {
//			boolean res = false;
//			int tempArr[] = new int[sum];
//			for (int i = 0; i < array.length; i++) {
//				int serchedNumber = sum - array[i];
//				tempArr[array[i]] = tempArr[array[i]] + 3;
//				tempArr[serchedNumber] = tempArr[serchedNumber] + 3;	
//				if (tempArr[i] == 6 && tempArr[serchedNumber] == 6) {
//					res = true;
//				}
//			}
//			return res;
//}
}
