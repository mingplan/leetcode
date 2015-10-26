package leetcode;

public class ReverseBits {
	public static void main(String[] args) {
		System.out.println(reverseBits(2147483648l+34543l));
	}

	public static int reverseBits(long n) {

		int a[] = new int[4];
		int b[] = new int[4];
		for (int i = 0; i < 4; i++) {
			a[i] = (int) (n % 256);
			n = n / 256;
			int result = 0;
			int k = a[i];
			int count = 0;
			while (count < 8) {
				int temp = 0;
				temp = k % 2;
				k = k / 2;
				result = result * 2 + temp;
				count++;
			}
			b[i] = result;
		}

		int ans = 0;
		for (int i = 0; i < 4; i++) {
			ans = ans * 256 + b[i];
		}
		return ans;

	}

}
