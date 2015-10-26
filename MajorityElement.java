package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {

	public static void main(String[] args) {

		int[] a = new int[]{8,8,7,7,7};
		System.out.println(majorityElement(a));
	}

	@SuppressWarnings("unchecked")
	public static int majorityElement(int[] num) {

		Map map = new HashMap();
		
		map.put(num[0], 1);
		int k=0;
		int m=num.length/2;
		for(int i=1;i<num.length;i++){
			if(map.containsKey(num[i])==true){
				int temp = (int)map.get(num[i]);
				map.replace(num[i], temp,temp+1 );
				/*if(temp+1>=m){
					k=i;
					break;
				}*/
			}else{
				map.put(num[i], 1);
			}
		}
		Set set = map.keySet();
		
		if(set.size()==2){
			int[] p=new int[2];
			int[] an=new int[2];
			int l=0;
			for(Object i:set){
				int j=(int)i;
				p[l]=(int)map.get(j);
				an[l]=j;
				l++;
			}
			if(p[0]>p[1])
				k=an[0];
			else
				k=an[1];
		}else{
			for(Object i:set){
				int j=(int)i;
				if((int)map.get(j)>=m)
					k=j;
			}
		}
		return k;
		
	}

}
