package leetcode;

public class AddDigits {
	
	public int addDigits(int num) {

		while(num>=10){
			num = number(num);
		}
		return num;
	}
	
	public int number(int a){
		int result =0;
		while(a>0){
			result += a%10;
			a=a/10;
		}
		return result;
	}
}
