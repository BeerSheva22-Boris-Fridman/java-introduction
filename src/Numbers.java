
public class Numbers {
static public int getNdigits(long number) {
	int res = 0;
	do {
		number /= 10;
		res++;
	} while(number !=0);
	return res;
}

/**
 * 
 * @param number
 * @return true only if number comprises of 6 digits
 * and summ of first 3 digits equals the sum of last 3 digits
 */



static public boolean isHappyNumber(int number) {
	int firstThree = 0;
	int secondThree = 0;
	int length = 0;
	long temp = 1;
	while (temp <= number) {
		length++;
		temp *= 10;
	}
	if (length > 6 || length < 6) {
		return false;
	}
	int half = length/2; //to find half length of the number to sum first and last digits seperately.
		
	for(int i=0; i<half && number>0; i++){ //to sum last digits
			secondThree = secondThree + number%10;
	    number = number/10;
	}
		for(int i=0; i<half && number>0; i++){ //to sum first digits
		firstThree = firstThree + number%10;
	    number = number/10;
		}

	if (secondThree == firstThree) {
		return true; 
	}
	return false;
	}
	}
	
