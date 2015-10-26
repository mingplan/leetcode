package leetcode;

public class UglyNumber {

	
	public boolean isUgly(int num) {

		if(num==1)return true;
		int[] prime = {2,3,5};
		for(int i=0;i<prime.length;i++){
			while(num>0&&(num%prime[i]==0)){
				num=num/prime[i];
			}
		}
		if(num==1){
			return true;
		}else{
			return false;
		}
		
	}
}
