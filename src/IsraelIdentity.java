
public class IsraelIdentity {
	static public final int ID_NUMBER_DIGITS = 9;

	/**
	 * 
	 * 
	 * @param id
	 * @return true for right id otherwise false control sum should be multiple of
	 *         10 with no remainder ( sum % 10 == 0) for even indexes (0, 2, 4, 6,
	 *         8) digits as is for odd indexes (1, 3, 5, 9) digit = digit * 2, if >
	 *         9 the sum of inner digits is taken example, 1 2 3 4 5 6 7 8 2 =>
	 *         1+4(2*2) + 3 + 8(4*2) + 5 + 3 (6 * 2 = 12 => 1+2) +7 7 (8 * 2=16 =>
	 *         1+6) + 2
	 */

/*	public static void main(String[] args) {
		IsraelIdVerification(346847874);
		generateRandomID();
	}*/

	public static boolean IsraelIdVerification(int id) {
		int[] IdNumber = Numbers.getDigits(id);
		boolean res = false;
		int sum = 0;
		for (int i = 0; i < ID_NUMBER_DIGITS; i += 2) {
			sum = sum + IdNumber[i];
		}
		for (int i = 1; i < ID_NUMBER_DIGITS; i += 2) {
			if (IdNumber[i] * 2 > 9) {
				sum = sum + Numbers.getSumDigits(IdNumber[i] * 2);
			} else {
				sum = sum + IdNumber[i] * 2;
			}
			if (sum % 10 == 0) {
				res = true;
			}
		}

		return res;
	}

	/**
	 * 
	 * @return random number of 9 digits matching right Israel id cycle not more
	 *         than 9 iterations
	 */

	public static int generateRandomID() {
		int generatedId = SportLotoAppl.getRandomInt(100000000, 999999999);
		int res = 0;
		int number = 2;//index of chenging number
		if (IsraelIdVerification(generatedId)) {
			res = generatedId;
		} else {
			int[] IdNumber = Numbers.getDigits(generatedId);
			int sum = 0;
			for (int i = 0; i < ID_NUMBER_DIGITS; i += 2) {
				sum = sum + IdNumber[i];
			}
			for (int i = 1; i < ID_NUMBER_DIGITS; i += 2) {
				if (IdNumber[i] * 2 > 9) {
					sum = sum + Numbers.getSumDigits(IdNumber[i] * 2);
				} else {
					sum = sum + IdNumber[i] * 2;
				}

			}
			int newSum=sum-IdNumber[number];
			if(newSum%10==0) {
				IdNumber[number]=0;
				res=Numbers.getNumberFromDigits(IdNumber);
			}else {
				int dex=(newSum-newSum%10)+10;
				int newNumber=dex-newSum;
				IdNumber[number]=newNumber;
				res=Numbers.getNumberFromDigits(IdNumber);
				
			}

		}
		/*
		 * int[] IdNumber = new int [ID_NUMBER_DIGITS]; int controlDigit = 0; do {
		 * IdNumber[0] = generateRandomID(); } while (IdNumber[0] == 0);
		 * 
		 * for (int i = 1; i < ID_NUMBER_DIGITS-1; i++) { IdNumber[i] =
		 * generateRandomID(); }
		 */
		return res;
	}

}
