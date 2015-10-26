package leetcode;

import java.util.Arrays;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddBinary bin = new AddBinary();
		
		String a = "111101";
		String b = "0110";
		System.out.print(bin.addBinary(a, b));
	}

	public String addBinary(String a, String b) {

		
			int l1 = a.length();
			int l2 = b.length();
			String re = null;
			if(l1<l2){
				
				StringBuffer sb = new StringBuffer(a);
				for(int i=0;i<l2-l1;i++){
					sb.insert(0, '0');
				}
				String at = new String(sb);
				re =  add(at,b);
			}else if(l1>l2){
				StringBuffer sb = new StringBuffer(b);
				for(int i=0;i<l1-l2;i++){
					sb.insert(0, '0');
				}
				String bt = new String(sb);
				re = add(a,bt);
			}else{
				re = add(a,b);
			}	
			return re;
		}
	
	public String add(String a,String b){
			int carry = 0;
			byte m = 0;
			byte n = 0;
			int l1 = a.length()-1;
			int l2 = b.length()-1;
			int len = a.length()+1;
			char[] result = new char[len];
			len--;
			while (l1 >= 0 && l2 >= 0) {
				m=0;
				n=0;
				if (a.charAt(l1) == '1') {
					m = 1;
				}
				if (b.charAt(l2) == '1') {
					n = 1;
				}
	
				int index = m + n + carry;
				switch (index) {
				case 0: {
					result[len--] = '0';
					carry = 0;
					break;
				}
				case 1: {
					result[len--] = '1';
					carry = 0;
					break;
				}
				case 2: {
					result[len--] = '0';
					carry = 1;
					break;
				}
				case 3: {
					result[len--] = '1';
					carry = 1;
					break;
				}
				default:
					break;
				}
				l1--;
				l2--;
				
			}
			String ans = null;
			if(carry ==1){
				result[0]='1';
				ans = new String(result);
			}else{
				ans = new String(Arrays.copyOfRange(result, 1, result.length));
			}
			return ans;
	}
		
	

}
