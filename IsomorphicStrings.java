package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	public static void main(String[] args){
		IsomorphicStrings sr = new IsomorphicStrings();
		String s = "foo";
		String t = "bar";
		sr.isIsomorphic(s, t);
	}

	public boolean isIsomorphic(String s, String t) {
		char[] ch = new char[257];
		for(int i=0;i<257;i++){
			ch[i]='\n';
		}
		boolean flag = true;
		for(int i=0;i<s.length();i++){
			if(ch[s.charAt(i)]!='\n'){//已经存有值了
				if(ch[s.charAt(i)]!=t.charAt(i)){
					flag = false;
					return false;
				}
			}else{
				ch[s.charAt(i)]=t.charAt(i);
			}
		}
		
		for(int i=0;i<t.length();i++){
			int count =0;
			for(int j=0;j<257;j++){
				if(ch[j]==t.charAt(i)){
					count++;
				}
			}
			if(count>=2){
				return false;
			}
		}
		return true;
	}
}
