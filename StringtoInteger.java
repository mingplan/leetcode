package leetcode;

public class StringtoInteger {
	
	public static void main(String[] args){
		System.out.println(myAtoi("9223372036854775809"));
	}
	
	public static int myAtoi(String str) {
        str=str.trim();
        long ans =0L;
        char ch[] = str.toCharArray();
        boolean flag=true;
        boolean haveNum=false;
        int start=0;
        if(str.isEmpty())
        	return 0;
        if(ch[0]=='-'){
        	flag=false;
        	start=1;
        }
        else if(ch[0]=='+'){
        	flag=true;
        	start =1;
        }
        
        for(int i=start;i<ch.length;i++){
        	if(ch[i]>='0'&&ch[i]<='9'){
        		ans=ans*10+ch[i]-'0';
        		if(i==start)
        			haveNum=true;
        		if(ans>Integer.MAX_VALUE){
        			if(flag)
        				return Integer.MAX_VALUE;
        			else
        				return Integer.MIN_VALUE;
        		}
        			
        	}else{
        		//exit=true;
        		break;
        	}
        	
        }
        if(flag){
        	if(!haveNum){
        		return 0;
        	}else if(ans>Integer.MAX_VALUE){
        		return Integer.MAX_VALUE;
        	}
        	return (int)ans;
        }else{
        	if(!haveNum){
        		return 0;
        	}else if(ans>Integer.MAX_VALUE){
        		return Integer.MIN_VALUE;
        	}
        	ans=-ans;
        	return (int)ans;
        }
    }

}
