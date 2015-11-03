package leetcode;

import java.util.Map;
import java.util.HashMap;

/**
 * @description: TODO(描述这个类的作用)
 * @author ming
 * @date 2015年7月18日
 */

public class RomantoInteger {

	/**
	 * @description: TODO(描述这个方法的作用)
	 * @author: ming
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put('I' - 'A', 1);
		map.put('V' - 'A', 5);
		map.put('X' - 'A', 10);
		map.put('L' - 'A', 50);
		map.put('C' - 'A', 100);
		map.put('D' - 'A', 500);
		map.put('M' - 'A', 1000);

		s = s.trim().toUpperCase();
		if (s == null)
			return 0;
		if (s.length() == 1)
			return map.get(str.charAt(0) - 'A');
		if (s.charAt(0) == s.charAt(1)) {// 第一情况前面是二个或者三个一样的
			if (s.charAt(1) == s.charAt(2)) {
				return map.get(s.charAt(0) - 'A') * 3
						+ romanToInt(s.substring(3));
			} else {
				return map.get(s.charAt(0) - 'A') * 2
						+ romanToInt(s.substring(2));
			}
		} else {// 第二情况 前面是一个
			int k = 0;
			int max = 0;
			for (int i = 0; i < s.length(); i++) {
				int temp = map.get(s.charAt(i) - 'A');
				if (max < temp) {
					max = temp;
					k = i;
				}
			}
			return max + romanToInt(s.substring(k + 1, s.length()))
					- romanToInt(s.substring(0, k));
		}

		/*
		 * int roman(String str){ if(str == null) return 0; if(str.length()==1)
		 * return map.get(str.charAt(0)-'A'); int k = 0; int max = 0; for(int
		 * i=0;i<str.length();i++){ int temp = map.get(str.charAt(i)-'A');
		 * if(max < temp){ max = temp; k = i; } }
		 * 
		 * return max + roman(str.substring(k+1,
		 * str.length()))-roman(str.substring(0, k)); }
		 */

	}
}
