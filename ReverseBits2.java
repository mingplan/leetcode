package leetcode;

public class ReverseBits2 {
	
	public static void main(String[] args) {
		
		System.out.println(reverseBits(964176192));
	}

	public static int reverseBits(int n) {

		int t=1;
		int count=0;
		int an=0;
		int result=0;
		while(count<32){
			an=t&n;
			n=n>>>1;
			int temp= result<<1;
			result=an|temp;
			count++;
		}
		
		return result;
		
		
	}


}
