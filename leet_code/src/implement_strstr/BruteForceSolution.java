package implement_strstr;

// http://algs4.cs.princeton.edu/lectures/53SubstringSearch.pdf
public class BruteForceSolution {
	public static int search(String pat, String txt) {
		int M = pat.length();
		int N = txt.length();
		
		// shift starting point of matching in txt
		for (int i = 0; i <= N - M; i++) {
			int j;
			
			// match each character in pat against each character in txt
			for (j = 0; j < M; j++) {
				// i + j index represents index of a character in txt 
				// that is matched against a character at index j in pat
				// if characters do not match, move onto matching next character in txt
				if (txt.charAt(i + j) != pat.charAt(j)) {
					break;
				}
			}
			
			// pat is found in txt
			if (j == M) {
				return i;
			}
				
		}
		
		// not found
		return -1;
	}
}
