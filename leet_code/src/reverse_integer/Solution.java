package reverse_integer;

public class Solution {
	public static int reverse(int x) {
		int ret = 0;
		
		while (x != 0) {
			// handle overflow/underflow
			if (Math.abs(ret) > 214748364) {
				return 0;
			}
			
			ret = ret * 10 + x % 10;
			x /= 10;
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
		System.out.println(reverse(100));
		System.out.println(reverse(1000000003));
	}
}
