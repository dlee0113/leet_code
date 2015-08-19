package implement_strstr;

// http://algs4.cs.princeton.edu/lectures/53SubstringSearch.pdf
public class BruteForceSolution {
	public static int search(String pat, String txt) {
		int M = pat.length();
		int N = txt.length();
		
		// check each character in txt
		for (int i = 0; i <= N - M; i++) {
			int j;
			
			// match each character in pat against each character in txt
			for (j = 0; j < M; j++) {
				// check for non-matching character
				if (txt.charAt(i + j) != pat.charAt(j)) {
					break; // move onto matching next character in txt
				}
			}
			
			// pat is found in txt
			if (j == M) {
				return i;
			}
				
		}
		
		return N;
	}
}
