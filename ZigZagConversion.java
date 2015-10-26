package leetcode;

public class ZigZagConversion {
	public static void main(String[] args){
		String str = "PAYPALISHIRING";
		ZigZagConversion conversion = new ZigZagConversion();
		conversion.convert(str, 2);
	}
	public String convert(String s, int numRows) {
		if(numRows==1)return s;
		boolean dire = true;//trueÎªÕýÏò
		StringBuffer[] str = new StringBuffer[numRows];
		for(int i=0;i<numRows;i++){
			str[i]=new StringBuffer(" ");
		}
		
		int j=0;
		for(int i=0;i<s.length();i++){
			
			if(dire){
				str[j].append(s.charAt(i));
				j++;
				if(j==numRows-1){
					dire=false;
					continue;
				}
			}
			if(!dire){
				str[j].append(s.charAt(i));
				j--;
				if(j==0){
					dire = true;
				}
			}
			
			
		}
		
		String st = "";
		for(int i=0;i<numRows;i++){
			st+=str[i].substring(1);
		}
		return st;
	}
}
