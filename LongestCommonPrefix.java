package leetcode;

public class LongestCommonPrefix {
	
	public static void main(String[] args){
		String[] s={"aa","aa"};
		LongestCommonPrefix pre = new LongestCommonPrefix();
		pre.longestCommonPrefix(s);
	}

	public String longestCommonPrefix(String[] strs) {
		int count = Integer.MAX_VALUE;
		int icou = 0;
		if(strs.length==0)return "";
		if(strs.length==1)return strs[0];
		for(int i=0;i<strs.length;i++){
			if(strs[i]==null) return "";
			if(strs[i].length()==0)return "";
			if(strs[i].length()<count){
				count = strs[i].length();
				icou=i;
			}
		}
		int i=0;
		for(;i<count;i++){
			char ch = strs[icou].charAt(i);
			boolean flag = true;
			for(int j=0;j<strs.length;j++){
				if(ch!=strs[j].charAt(i)){
					flag = false;
					break;
				}
			}
			if(!flag){
				break;
			}
		}
		if(i==0)
			return "";
		
		return strs[icou].substring(0, i);
	}

}
