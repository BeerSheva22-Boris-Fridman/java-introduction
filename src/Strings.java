

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
    if (str1.length() != str2.length()) {
        return false;
    }
    char[] yellowAr = str1.toCharArray();
	char[] anagramAr = str2.toCharArray();	
    int helper1[] = new int[Character.MAX_VALUE];
	int helper2[] = new int[Character.MAX_VALUE];
    	for (int i = 0; i < str1.length(); i++) {
    		helper1[(int) yellowAr[i]] = 1;
    		helper2[(int) anagramAr[i]] = 1;
    		}
    			for (int j=0; j<Character.MAX_VALUE; j++) { // compare array values
    				if (helper1[j] != helper2[j]) {
    					return false;
    	}
      }
				return true;
}

public static void sortStringNumbers () {
	String numArr[] = new String[] {"-100", "10","1","25","-16","87","-17","6","6","6","1"};
	int finalArr[] = new int[numArr.length];
		for (int i = 0; i < numArr.length; i++) {
			finalArr[i] = Integer.parseInt(numArr[i]);
		}
		int helper[] = new int[256];
		for (int i = 0; i<finalArr.length; i++) {
			helper[finalArr[i] + 128] += 1;
		}
		int help = 0;
			for (int i = 0; i < helper.length; i++) {
				if (helper[i] != 0) {
					while (helper[i] > 0) {
						helper[i] --;
						finalArr[help] = i - 128;
						help++;
						
				}
			}
		}
	}
}

