package telran.text;

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
public static String javaNameExp( ) {
	
	return "[a-zA-Z$][\\w$]*|_[\\w$]+";
}


public static String ipV4Octet() {
	 
	return "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
}
public static String ipV4() {
		
	String octetExp = ipV4Octet();
	return String.format("(%1$s\\.){3}%1$s", octetExp);
	
//return "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//           "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//          "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//           "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
}



public static String arithmeticExpression() {
	String operatorExp = operator();
	String operandExp = operand();
	String openBrace = "\\(";
	String closeBrace = "\\)";
	String operandWithBraces = String.format("%1$s*%2$s%3$s*", openBrace, operandExp, closeBrace);
	return String.format("%1$s(%2$s%1$s)*", operandWithBraces, operatorExp);
	
}

private static String operand() {
	String operand = "(\\d+\\.?\\d*|\\.\\d+)";
	String javaVar = javaNameExp();
	return String.format("(%1$s|%2$s)", operand, javaVar);
}

private static String operator() {
	
	return "([-+*/])";
}
public static boolean isArithmeticExpression(String expression) {
	expression = expression.replaceAll("\\s+", ""); 
	return expression.matches(arithmeticExpression());
}
/**
 * 
 * @param expression
 * @param values
 * @param namesSorted - variable names sorted
 * @return computed value of a given expression or Double.NaN
 */
public static Double computeArithmeticExpression(String expression, double values[], String names[]) {
	//10 (* 2)
	//10 * 2(())
	Double res = Double.NaN;
	if (isArithmeticExpression(expression) && checkBraces(expression)) {
	expression = expression.replaceAll("[\\s()]+", "");
	String operands[] = expression.split(operator());
	String operators[] = expression.split(operand());
	res = getOperandValue(operands[0], values, names);
	int index = 1;
	while (index < operands.length && !res.isNaN()) {
		double operandValue = getOperandValue(operands[index], values, names);
		res = computeOperation(res, operandValue, operators[index]);
		index++;
	}
	}
	return res;
	
}

private static Double computeOperation(Double operand1, double operand2, String operator) {
	Double res = Double.NaN;
	if(!Double.isNaN(operand2)) {
		switch(operator) {
		case "+": res = operand1 + operand2; break;
		case "-": res = operand1 - operand2; break;
		case "*": res = operand1 * operand2; break;
		case "/": res = operand1 / operand2; break;
		default: res = Double.NaN;
		}
	}
	return res;
}

public static Double getOperandValue(String operand, double[] values, String[] names) {
	Double res = Double.NaN; 
	 	if (operand.matches("(\\d+\\.?\\d*|\\.\\d+)")) {
		res = Double.parseDouble(operand);
		return res;
		}
	 		if (names.length == values.length) {
	 			if (operand.matches(javaNameExp())) {
					int index = 0;
						while (index < names.length && res.isNaN()) {
								if (names[index].equals(operand)) {
									res = values[index];										
								}index++;
						}					
	 			}	
	 		}
	return res;
	
}

public static boolean checkBraces(String expression) {
	char [] exp = expression.toCharArray();
	boolean res= false;
	int index = 0;
	int count = 0;
		while (index < exp.length && count > -1) {
			if (exp[index] == '(' ) {
				count++;
			}
				if (exp[index] == ')' ) {
				count--;
				}
			index++;			
		}
					if (count == 0) {
						res = true;
					} 
	return res; 
}
}

