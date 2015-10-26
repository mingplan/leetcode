package leetcode;

public class Sqrt {

	public static void main(String[] args){
		Sqrt s = new Sqrt();
		System.out.println(s.mySqrt(1));
	}
	public int mySqrt(int x) {
		if(x == 0)return 0;
		double cur = 1;
		double pre;
		
		do{
			pre = cur;
			cur = x/(2*pre)+pre/2.0;
		}while(Math.abs(cur-pre)>0.00001);
		
		return (int)cur;
	}
}
