package leetcode;

public class Numberof1Bits {
	public static void main(String[] args) {

		System.out.println(hammingWeight(101));
	}

	public static int hammingWeight(int n) {

		int i = 0;
		int count = 0;
		while (i < 32) {
			int a = 1;
			int temp = a & n;
			n = n >>> 1;
			i++;
			if (temp == 1)
				count++;

		}

		return count;
	}

}
