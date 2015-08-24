package stringToInteger;

public class Solution2 {
	// http://www.programcreek.com/2012/12/leetcode-string-to-integer-atoi/
	public static int atoi(String str) {
		if (str == null || str.length() < 1) {
			return 0;
		}
			
		// trim white spaces
		str = str.trim();

		char flag = '+';

		// check negative or positive
		int i = 0;
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		
		// use double to store result
		double result = 0;

		// calculate value
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			// if a character is subtracted by char '0', the ASCII value needs not to be known.
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}

		if (flag == '-')
			result = -result;

		// handle max and min
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		return (int) result;
	}

	public static void main(String[] args) {
		System.out.println(atoi("123"));
//		System.out.println(atoi("abc"));
//		System.out.println(atoi("+1"));
//		System.out.println(atoi("-1"));
	}
}
