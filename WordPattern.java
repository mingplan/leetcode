package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordPattern {
	public static void main(String[] args){
		WordPattern word = new WordPattern();
		String p = "abba";
		String str = "dog dog dog dog";
		word.wordPattern(p, str);
	}

	public boolean wordPattern(String pattern, String str) {
		Map map =new HashMap<Character,String>();
		String[] list = str.split(" ");
		if(list.length!=pattern.length())
			return false;
		boolean flag = true;
		for(int i=0;i<pattern.length();i++){
			if(map.get(pattern.charAt(i))!=null){
				
				if(!list[i].equals(map.get(pattern.charAt(i)).toString()))
					flag = false;
			}else{
				map.put(new Character(pattern.charAt(i)) , new String(list[i]));
			}
			
		}
		boolean f = true;
		for(int i=0;i<pattern.length()-1;i++){
			for(int j=i+1;j<pattern.length();j++){
				if(pattern.charAt(i)!=pattern.charAt(j)&&map.get(pattern.charAt(i)).equals(map.get(pattern.charAt(j)))){
					f = false;
				}
			}
		}
		
		return flag&&f ;
	}
}
