package leetcode;

public class ReverseInteger {
	public static void main(String[] args) {

		System.out.println(reverse(-123000100));
	}

	public static int reverse(int x) {
		long l = 0l;
		if (x == 0) {
			return 0;
		}
		int temp = 0;
		while (x != 0) {
			temp = 0;
			temp = x % 10;
			x = x / 10;
			l = l * 10 + temp;

		}

		if (l > Integer.MAX_VALUE||l<Integer.MIN_VALUE) {
			return 0;
		} else {
			return (int)l;
		}

	}

}
