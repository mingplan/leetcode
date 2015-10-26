package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public static void main(String[] args){
		List<Integer> r = getRow(5);
		System.out.println(r);
		
	}
	
	 public static List<Integer> getRow(int rowIndex) {
	    
		 rowIndex++;
		 int a[] = new int[]{1};
		 int b[] = new int[]{1,1};
		 int temp[];
		 ArrayList<int[]> list = new ArrayList<int[]>();
		 list.add(a);
		 list.add(b);
		 int last[];
		 for(int i=2;i<rowIndex;i++){
			 last = list.get(i-1);
			 temp = new int[i+1];
			 for(int j=1;j<i;j++)
				 {
				 	temp[j]=last[j-1]+last[j];
				 	System.out.println("被加的数是"+last[j-1]+"  "+last[j]);
				 	System.out.println(temp[j]);
				 }
			 temp[0]=1;
			 temp[i]=1;
			 list.add(temp);
			 
		 }
		List<Integer> result = new ArrayList<Integer>();
		
		temp = list.get(rowIndex-1);
		for(int i=0;i<rowIndex;i++)
			result.add(temp[i]);
		return result;
		
		
	 }
}
