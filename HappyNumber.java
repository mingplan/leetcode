package leetcode;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

	public static void main(String[] args){
		HappyNumber number = new HappyNumber();
		number.isHappy(13);
	}
	
	public boolean isHappy(int n) {

		List<Integer> list = new ArrayList<Integer>();
		int num = number(n);
		while(!list.contains(num)){
			list.add(num);
			num = number(num);
			if(num == 1){
				return true;
			}
		}
		
		return false;
	}
	
	public int number(int a){
		int result = 0;
		while(a>0){
			result += (a%10)*(a%10);
			a=a/10;
		}
		return result;
	}
}
