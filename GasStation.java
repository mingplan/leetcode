package leetcode;

public class GasStation {

	public static void main(String[] args){
		int[] a = {2,4};
		int[] b = {3,4};
		GasStation gas = new GasStation();
		gas.canCompleteCircuit(a, b);
	}
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int sum =0;
		int ans =-1;
		for(int i=0;i<gas.length;i++){
			sum =0;
			int count =0;
			int j = i;
			boolean flag = true;
			while(count<gas.length){
				count++;
				sum+=gas[j];
				if(sum<cost[j]){
					flag = false;
					break;
				}
				sum-=cost[j];
				j++;
				j=j%gas.length;
			}
			if(flag&&count==gas.length){
				ans = i;
				break;
			}else{
				continue;
			}
		}
		return ans==-1?-1:ans; 
	}
}
