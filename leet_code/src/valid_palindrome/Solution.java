package valid_palindrome;

public class Solution {
	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			// skip non-alphanumeric characters
			while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			}
			// skip non-alphanumeric characters
			while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			}
			
			if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome("abcba"));
	}
}
