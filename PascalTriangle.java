package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	public static void main(String[] args){
		PascalTriangle p = new PascalTriangle();
		p.generate(3);
	}

	public List<List<Integer>> generate(int numRows) {

		List<Integer> a0 = new ArrayList<Integer>();
		Integer one = new Integer(1);
	
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		a0.add(one);
		result.add(a0);
		for(int i=1;i<numRows;i++){
			List<Integer> a = new ArrayList<Integer>();
			a.add(one);
			List<Integer> last = result.get(i-1);
			for(int j=1;j<=i;j++){
				if(j==i){
					a.add(one);
				}else{
					a.add(last.get(j)+last.get(j-1));
				}
				
			}
			result.add(a);	
		}
		
		return result;
	}
}
