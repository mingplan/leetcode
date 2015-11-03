package leetcode;

public class CountAndSay {
	public static void main(String[] args){
		int n=3;
		System.out.println(countAndSay(n));
		
	}
    @SuppressWarnings("null")
	public static String countAndSay(int n) {
        String str[]=new String[n+1] ;
        str[0]="1";
        str[1]="11";
        for(int i=2;i<n;i++){
        	String temp = str[i-1];
        	int j=0;
        	StringBuilder sb =new StringBuilder();
        	while(j<temp.length()){
        		char a=temp.charAt(j);
        		int count=1;
        		while((j+1)<temp.length()&&temp.charAt(j)==temp.charAt(j+1)){
        			count++;
        			j++;
        		}
        		j++;
        		sb.append(count);
        		sb.append(a);
        		
        	}
        	str[i]= new String(sb);
        	
        }
        return str[n-1];
    }

}
