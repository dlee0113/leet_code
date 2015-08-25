package valid_number;

public class Solution {
	public static boolean isNumber(String s) {
		int i = 0, n = s.length();
		
		while (i < n && Character.isWhitespace(s.charAt(i))) {
			i++;
		}
		
		if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
			i++;
		}
			
		boolean isNumeric = false;
		
		while (i < n && Character.isDigit(s.charAt(i))) {
			i++;
			isNumeric = true;
		}
		
		if (i < n && s.charAt(i) == '.') {
			i++;
			
			while (i < n && Character.isDigit(s.charAt(i))) {
				i++;
				isNumeric = true;
			}
		}
		
		while (i < n && Character.isWhitespace(s.charAt(i))) {
			i++;
		}
		
		return isNumeric && (i == n);
	}
	
	public static void main(String[] args) {
		System.out.println(isNumber("1a"));
//		System.out.println(isNumber("12"));
//		System.out.println(isNumber("1.2"));
//		System.out.println(isNumber("1."));
//		System.out.println(isNumber(".2"));
	}
}
