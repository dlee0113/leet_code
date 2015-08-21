package reverse_words_in_a_string;

public class Solution {
	public static String reverseWords(String s) {
		StringBuilder reversed = new StringBuilder();
		int j = s.length();
		
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				j = i;
			} 
			else if (i == 0 || s.charAt(i - 1) == ' ') {
				if (reversed.length() != 0) {
					reversed.append(' ');
				}
				
				reversed.append(s.substring(i, j));
			}
		}
		
		return reversed.toString();
	}
	
	public static String reverseWordsTwoPasses(String s) {
		StringBuilder reversed = new StringBuilder();
		String[] words = s.split(" ");
		
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			reversed.append(" ");
		}
		
		return reversed.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverseWords("the sky is blue"));
		System.out.println(reverseWordsTwoPasses("the sky is blue"));
	}
}
