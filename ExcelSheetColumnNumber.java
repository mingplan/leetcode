package leetcode;

/**
 * @description: TODO(描述这个类的作用)
 * @author ming
 * @date 2015年7月8日
 */

public class ExcelSheetColumnNumber {
	
	public int titleToNumber(String s) {

		int ans = 0;
		int count = 1;
		for(int i=s.length()-1;i>=0;i--){
			ans+=(s.charAt(i)-'A'+1)*count;
			count*=26;
		}
		return ans;
	}
}
