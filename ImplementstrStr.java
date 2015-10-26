package leetcode;

public class ImplementstrStr {
	public static void main(String[] args){
		String s = "mississippi";
		String t = "pi";
		ImplementstrStr str = new ImplementstrStr();
		str.strStr(s, t);
				
	}
	 public int strStr(String haystack, String needle) {
	        int i=0;
	        if(needle==null)return -1;
	        //if(needle=="")return -1;
	        if(needle.length()==haystack.length()&&needle.length()==0)return 0;
	        if(haystack.length()>0&&needle.length()==0)return 0;
	        if(needle.length()==0)return -1;
	        if(needle.length()>haystack.length())return -1;
	        if(haystack.equals(needle))return 0;
	        while(i<haystack.length()){
	        	if(haystack.charAt(i)==needle.charAt(0)){
	        		boolean flag =true;
	        		int k=i;
	        		for(;k<i+needle.length();k++){
	        			if(k==haystack.length())return -1;
	        			if(haystack.charAt(k)!=needle.charAt(k-i)){
	        				flag = false;
	        				i++;
	        				break;
	        			}
	        		}
	        		if(flag){
	        			return i;
	        		}
	        	}else{
	        		i++;
	        	}
	        }
	        return -1;
	    }
}
