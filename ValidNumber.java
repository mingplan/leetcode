package leetcode;

public class ValidNumber {
	public static void main(String[] args) {
		ValidNumber number = new ValidNumber();
		System.out.print(number.isNumber("  -."));
	}

	public boolean isNumber(String s) {
		s = s.trim();
		if(s.length()==0)return false;
		String[] str = s.split("e");
		boolean flag = false;
		if(str.length == 0){// 不含字母e
			flag = isDouble(s,true,false);
		}else if (str.length == 1) {// 不含字母e
			flag = isDouble(s,true,false);
		} else if (str.length == 2) {// 含有一个e
			flag = isDouble(str[0],true,true)&&isInteger(str[1],false);
		} else {// 含有多个e
			flag = false;
		}
		return flag;
	}

	//pos表示位置，true表示小数点前，false表示小数点后
	public boolean isDouble(String s,boolean pos,boolean e) {
		// 如果含有小数点
		if(s.length()==0){
			if(pos){
				if(e){
					return false;
				}else{
					return true;
				}
				
			}else{
				return false;
			}
		}
			
		int time =0;
		for(int i =0;i<s.length();i++){
			if(s.charAt(i)=='.'){
				time++;
			}
		}
		if(time>1)return false;
		String[] dotS = s.split("\\.");
		boolean flag = false;
		if(dotS.length == 0){// 不含有小数点
			if(s==""){
				flag = false;
			}else{
				flag = isInteger(s,true);
			}
			
		}else if (dotS.length == 1) {// 不含有小数点
			if(dotS[0].length()+1==s.length()){
				flag = isInteger(dotS[0],true);
			}else{
				flag = isInteger(s,true);
			}
			
		} else if (dotS.length == 2) {// 含有一个小数点
			if(dotS[0].length()==0&&dotS[1].length()!=0){
				flag = isInteger(dotS[1],false);
			}else if(dotS[0].length()!=0&&dotS[1].length()!=0){
				flag = isInteger(dotS[0],true) && isInteger(dotS[1],false);
			}
			
			if(dotS[1].length()==0&&dotS[0].length()!=0){
				flag = isInteger(dotS[0],true);
			}else if(dotS[0].length()!=0&&dotS[1].length()!=0){
				flag = isInteger(dotS[0],true) && isInteger(dotS[1],false);
			}
			
			if(dotS[0].length()==0&&dotS[1].length()==0){
				flag = false;
			}
		} else {// 含有多个小数点
			flag = false;
		}
		return flag;
	}

	// 正整数
	public boolean isPInteger(String s) {
		if(s.length()==0)return false;
		if(s.length()==1&&s.charAt(0)=='+')return false;
		boolean flag = true;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				flag = false;
			}
		}
		if (flag) {
			if (s.charAt(0) == '+'
					|| (s.charAt(0) >= '0' && s
							.charAt(0) <= '9')) {

			} else {
				flag = false;
			}
		}
		return flag;
	}

	// 全数字
	public boolean isAllInteger(String s) {
		boolean flag = true;
		for (int i = 0; i < s.length() ; i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				flag = false;
			}
		}
		
		return flag;
	}
	
	//pos表示位置，true表示小数点前，false表示小数点后
	public boolean isInteger(String s,boolean pos) {
		boolean flag = true;
		if(s.length()==0) flag=  false;
		if(s.length()==1&&s.charAt(0)=='-') flag = false;
		if(s.length()==1&&s.charAt(0)=='+') flag = false;
		
		if(flag ==false){
			if(pos){
				return true;
			}else{
				return false;
			}
			
		}
			
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
				flag = false;
			}
		}
		if (flag) {
			if(s.charAt(0) == '-'
					|| s.charAt(0) == '+'){
				if(pos){
					flag = true;
				}else{
					flag = false;
				}
			}else if( (s.charAt(0) >= '0' && s
					.charAt(0) <= '9')){
				flag = true;
			}else{
				flag = false;
			}
			
		}
		return flag;
	}
}
