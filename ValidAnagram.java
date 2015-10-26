package leetcode;

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		int len = 256;
		int[] ints = new int[len];
		int[] intt = new int[len];
		if(s.length()!=t.length()){
			return false;
		}
		for(int i=0;i<len;i++){
			ints[i]=0;
			intt[i]=0;
		}
		for(int i=0;i<t.length();i++){
			ints[s.charAt(i)]++;
			intt[t.charAt(i)]++;
		}
		boolean flag = true;
		for(int i=0;i<len;i++){
			if(ints[i]!=intt[i]){
				flag = false;
				break;
			}
		}
		return flag;
	}
}
