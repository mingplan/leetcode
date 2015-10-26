package leetcode;

public class ValidPalindrome {

	public static void main(String[] args){
		ValidPalindrome ab = new ValidPalindrome();
		String str = "1a3";
		ab.isPalindrome(str);
	}
	public boolean isPalindrome(String s) {

		char[] ch = s.toCharArray();
		int i=0;
		int j = ch.length - 1;
		boolean flag = true;
		while(i<j){
			while((i<ch.length)&&(ch[i]<'0'||ch[i]>'9'&&ch[i]<'A'||ch[i]>'Z'&&ch[i]<'a'||ch[i]>'z')){
				i++;
			}
			if(i==ch.length){
				break;
			}
			while((j>=0)&&(ch[j]<'0'||ch[j]>'9'&&ch[j]<'A'||ch[j]>'Z'&&ch[j]<'a'||ch[j]>'z')){
				j--;
			}
			if(j==-1){
				break;
			}
			if(Math.abs(ch[i]-ch[j])==0||Math.abs(ch[i]-ch[j])=='a'-'A'){
				i++;
				j--;
			}else{
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}
