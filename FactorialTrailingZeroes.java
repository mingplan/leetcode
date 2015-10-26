package leetcode;

public class FactorialTrailingZeroes {
	public static void main(String[] args) {

		System.out.println(trailingZeroes(2147483647));
	}

	public static int trailingZeroes(int n) {
		
		int count=0;
		int num=5;
		while(num<=n){
			int temp = n/num;
			num=num*5;
			count+=temp;
			if(temp<5)
				break;
		}
		return count;

	}
}
