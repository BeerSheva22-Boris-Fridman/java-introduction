//
//public class SportLotoAppl {
//
//  /**
//  * Application displays out 6 random numbers from 1 to 49 inclusive
//  * numbers can not be repeated in a sequence of 6 random numbers
//  * no additional collections / arrows
//  * using variables and loop "Do while"
//  */
//	public static void main(String[] args) {
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		int e = 0;
//		int f = 0;
//		a = (getRandomInt(1, 49)); 
//		do b = (getRandomInt(1, 49)); 
//			while (b == a);
//		do c = (getRandomInt(1, 49)); 
//			while (c == a || c == b);
//		do d = (getRandomInt(1, 49)); 
//		 	while (d == a || d == b || d == c);
//		do e = (getRandomInt(1, 49)); 
//		 	while (e == a || e == b || e == c || e == d);
//		do f = (getRandomInt(1, 49)); 
//		 	while (f == a || f == b || f == c || f == d || f == e); 
//			
//		System.out.print(a + " " + b + " " + c + " " + d + " " + e + " " + f);
//		//for (int i = 0; i < 6; i++) {
//		//System.out.print(getRandomInt(1,49) + " ");
//			
//		}
//
//	public static int getRandomInt(int min, int max) {
//		return (int) (min + Math.random() * (max - min + 1));
//	}
//
//}

public class SportLotoAppl {
 /**
 * Application displays out 6 random numbers from 1 to 49 inclusive
 * numbers can not be repeated in a sequence of 6 random numbers
 * no additional collections / arrows
 * using bit operations
*  */	
	public static void main(String[] args) {
		long usedNumbers = 0;
		for (int i = 0; i < 6; i++) {
			int tempNumber = getRandomInt(1, 49);
			if (BitOperations.getBitValue(usedNumbers, tempNumber) == 0) {
				usedNumbers = BitOperations.invertBitValue(usedNumbers, tempNumber);
				System.out.print(tempNumber + " ");
			}
		   }
	      }

	public static int getRandomInt(int min, int max) {
		return (int)(min + Math.random() * (max - min + 1));
	        }
}
